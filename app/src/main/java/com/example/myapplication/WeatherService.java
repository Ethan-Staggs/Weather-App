package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("/VisualCrossingWebServices/rest/services/timeline/{postalCode}?key=JHDAQK67K6C6BU34QS2JHKQ6T")
    Call<WeatherResponse> getWeather(@Path("postalCode") String postalCode);
}
