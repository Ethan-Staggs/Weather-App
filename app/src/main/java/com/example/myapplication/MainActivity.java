package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView mTodayTemp, mCityName, mDate, mHumidity, mWind, mUV, mAirPressure;
    EditText mPostalCode;
    RecyclerView recyclerView;
    WeatherAdapter weatherAdapter;
    ImageView mCurrentIconImg;
    String postalCode = "";
    List<Day> listOfDays = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        mTodayTemp = findViewById(R.id.today_temp_tv);
        mCurrentIconImg = findViewById(R.id.current_weather_icon);
        mCityName = findViewById(R.id.city_name);
        mDate = findViewById(R.id.date);
        mHumidity = findViewById(R.id.humidity_tv);
        mWind = findViewById(R.id.wind_tv);
        mUV = findViewById(R.id.uv_tv);
        mAirPressure = findViewById(R.id.air_pressure_tv);
        mPostalCode = findViewById(R.id.postal_code);

        weatherAdapter = new WeatherAdapter(listOfDays, MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(weatherAdapter);

    }

    /**
     * getting response from json file and populating views
     */

    public void getWeather(View view) {

        int length = mPostalCode.getText().length();

        if (length != 5) {
            Toast.makeText(MainActivity.this, "Please Enter Valid Zipcode", Toast.LENGTH_SHORT).show();
            mPostalCode.getText().clear();
        } else {

            postalCode = mPostalCode.getText().toString();
            mPostalCode.getText().clear();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://weather.visualcrossing.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            WeatherService retrofitApi = retrofit.create(WeatherService.class);

            Call<WeatherResponse> call = retrofitApi.getWeather(postalCode);

            call.enqueue(new Callback<WeatherResponse>() {
                @Override
                public void onResponse(@NonNull Call<WeatherResponse> call, @NonNull Response<WeatherResponse> response) {

                    if (response.body() != null) {

                        WeatherResponse weatherResponse = response.body();
                        listOfDays = response.body().getDays();

                        weatherAdapter = new WeatherAdapter(listOfDays, MainActivity.this);
                        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
                        recyclerView.setLayoutManager(manager);
                        recyclerView.setAdapter(weatherAdapter);


                        String icon = weatherResponse.getCurrentConditions().getIcon();
                        String test = weatherResponse.getCurrentConditions().getTemp().toString();
                        double lat = weatherResponse.getLatitude();
                        double lon = weatherResponse.getLongitude();
                        String dateInString = weatherResponse.getDays().get(0).getDatetime();
                        String humidity = weatherResponse.getCurrentConditions().getHumidity().toString();
                        String wind = weatherResponse.getCurrentConditions().getWindspeed().toString();
                        String pressure = weatherResponse.getCurrentConditions().getPressure().toString();
                        String uv = weatherResponse.getCurrentConditions().getUvindex().toString();


                        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
                        DateTime dateTime = dateTimeFormatter.parseDateTime(dateInString);
                        DateTimeFormatter dateTimeFormatterOut = DateTimeFormat.forPattern("EEE, d MMM");

                        mUV.setText(uv);
                        mAirPressure.setText(pressure);
                        mWind.setText(wind);
                        mHumidity.setText(humidity);
                        mDate.setText(dateTimeFormatterOut.print(dateTime));
                        mTodayTemp.setText(test);
                        getIcon(icon);
                        getLocation(lat, lon);

                    } else {
                        Toast.makeText(MainActivity.this, "Zipcode May be Invalid. Try a Different Zipcode", Toast
                                .LENGTH_SHORT).show();
                        mPostalCode.getText().clear();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<WeatherResponse> call, @NonNull Throwable t) {

                }
            });
        }
    }

    /**
     * getting icon for current weather
     */

    private void getIcon(String icon) {

        switch (icon) {
            case "wind":
                mCurrentIconImg.setImageResource(R.drawable.wind);
                break;
            case "thunder-rain":
                mCurrentIconImg.setImageResource(R.drawable.thunderrain);
                break;
            case "snow":
                mCurrentIconImg.setImageResource(R.drawable.snow);
                break;
            case "showers-night":
                mCurrentIconImg.setImageResource(R.drawable.showersnight);
                break;
            case "showers-day":
                mCurrentIconImg.setImageResource(R.drawable.showersday);
                break;
            case "rain":
                mCurrentIconImg.setImageResource(R.drawable.rain);
                break;
            case "partly-cloudy-night":
                mCurrentIconImg.setImageResource(R.drawable.partlycloudynight);
                break;
            case "partly-cloudy-day":
                mCurrentIconImg.setImageResource(R.drawable.partlycloudyday);
                break;
            case "cloudy":
                mCurrentIconImg.setImageResource(R.drawable.cloudy);
                break;
            case "clear-night":
                mCurrentIconImg.setImageResource(R.drawable.clearnight);
                break;
            case "clear-day":
                mCurrentIconImg.setImageResource(R.drawable.clearday);
                break;

        }
    }

    /**
     * passing latitude and longitude values from json to get current city name
     */

    private void getLocation(double lat, double lon) {
        Geocoder geocoder;
        List<Address> addresses = new ArrayList<>();
        geocoder = new Geocoder(MainActivity.this, Locale.getDefault());

        try {
            addresses = geocoder.getFromLocation(lat, lon, 1);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Invalid Zipcode", Toast.LENGTH_SHORT).show();
            mPostalCode.getText().clear();
        }
        String cityName = addresses.get(0).getLocality();
        mCityName.setText(cityName);
    }

}