package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.List;


public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    List<Day> mWeatherResponseArray;
    Context mContext;

    public WeatherAdapter(List<Day> mWeatherResponseArray, Context mContext) {
        this.mWeatherResponseArray = mWeatherResponseArray;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        String dateInString = mWeatherResponseArray.get(position).getDatetime();
        String icon = mWeatherResponseArray.get(position).getIcon();

        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateInString);
        DateTimeFormatter dateTimeFormatterOut = DateTimeFormat.forPattern("EEEE");

        holder.mDayOfWeek.setText(dateTimeFormatterOut.print(dateTime));
        holder.mTempOfWeek.setText(mWeatherResponseArray.get(position).getTempmax().toString());
        holder.mTempMin.setText(mWeatherResponseArray.get(position).getTempmin().toString());


        switch (icon) {
            case "wind":
                holder.mDayOfWeekImg.setImageResource(R.drawable.wind);
                break;
            case "thunder-rain":
                holder.mDayOfWeekImg.setImageResource(R.drawable.thunderrain);
                break;
            case "snow":
                holder.mDayOfWeekImg.setImageResource(R.drawable.snow);
                break;
            case "showers-night":
                holder.mDayOfWeekImg.setImageResource(R.drawable.showersnight);
                break;
            case "showers-day":
                holder.mDayOfWeekImg.setImageResource(R.drawable.showersday);
                break;
            case "rain":
                holder.mDayOfWeekImg.setImageResource(R.drawable.rain);
                break;
            case "partly-cloudy-night":
                holder.mDayOfWeekImg.setImageResource(R.drawable.partlycloudynight);
                break;
            case "partly-cloudy-day":
                holder.mDayOfWeekImg.setImageResource(R.drawable.partlycloudyday);
                break;
            case "cloudy":
                holder.mDayOfWeekImg.setImageResource(R.drawable.cloudy);
                break;
            case "clear-night":
                holder.mDayOfWeekImg.setImageResource(R.drawable.clearnight);
                break;
            case "clear-day":
                holder.mDayOfWeekImg.setImageResource(R.drawable.clearday);
                break;

        }
    }

    @Override
    public int getItemCount() {
        return mWeatherResponseArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mDayOfWeek, mTempOfWeek, mTempMin;
        ImageView mDayOfWeekImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mDayOfWeek = itemView.findViewById(R.id.day_of_week);
            mTempOfWeek = itemView.findViewById(R.id.temp_day_of_week);
            mDayOfWeekImg = itemView.findViewById(R.id.day_of_week_img);
            mTempMin = itemView.findViewById(R.id.temp_min);
        }
    }
}
