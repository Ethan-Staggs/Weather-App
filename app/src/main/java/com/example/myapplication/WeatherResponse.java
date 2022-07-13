package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class WeatherResponse {

    @SerializedName("queryCost")
    @Expose
    private Integer queryCost;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("resolvedAddress")
    @Expose
    private String resolvedAddress;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("tzoffset")
    @Expose
    private Double tzoffset;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("days")
    @Expose
    private List<Day> days = null;
    @SerializedName("alerts")
    @Expose
    private List<Object> alerts = null;
    @SerializedName("stations")
    @Expose
    private Stations stations;
    @SerializedName("currentConditions")
    @Expose
    private CurrentConditions currentConditions;

    public Integer getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(Integer queryCost) {
        this.queryCost = queryCost;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(String resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Double getTzoffset() {
        return tzoffset;
    }

    public void setTzoffset(Double tzoffset) {
        this.tzoffset = tzoffset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public List<Object> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Object> alerts) {
        this.alerts = alerts;
    }

    public Stations getStations() {
        return stations;
    }

    public void setStations(Stations stations) {
        this.stations = stations;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

}

class CurrentConditions {

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("datetimeEpoch")
    @Expose
    private Integer datetimeEpoch;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feelslike")
    @Expose
    private Double feelslike;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("dew")
    @Expose
    private Double dew;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("precipprob")
    @Expose
    private Object precipprob;
    @SerializedName("snow")
    @Expose
    private Double snow;
    @SerializedName("snowdepth")
    @Expose
    private Double snowdepth;
    @SerializedName("preciptype")
    @Expose
    private Object preciptype;
    @SerializedName("windgust")
    @Expose
    private Object windgust;
    @SerializedName("windspeed")
    @Expose
    private Double windspeed;
    @SerializedName("winddir")
    @Expose
    private Double winddir;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("cloudcover")
    @Expose
    private Double cloudcover;
    @SerializedName("solarradiation")
    @Expose
    private Double solarradiation;
    @SerializedName("solarenergy")
    @Expose
    private Double solarenergy;
    @SerializedName("uvindex")
    @Expose
    private Double uvindex;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("stations")
    @Expose
    private List<String> stations = null;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunriseEpoch")
    @Expose
    private Integer sunriseEpoch;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("sunsetEpoch")
    @Expose
    private Integer sunsetEpoch;
    @SerializedName("moonphase")
    @Expose
    private Double moonphase;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(Integer datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Object getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(Object precipprob) {
        this.precipprob = precipprob;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
    }

    public Double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Object getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(Object preciptype) {
        this.preciptype = preciptype;
    }

    public Object getWindgust() {
        return windgust;
    }

    public void setWindgust(Object windgust) {
        this.windgust = windgust;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWinddir() {
        return winddir;
    }

    public void setWinddir(Double winddir) {
        this.winddir = winddir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(Double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Double solarenergy) {
        this.solarenergy = solarenergy;
    }

    public Double getUvindex() {
        return uvindex;
    }

    public void setUvindex(Double uvindex) {
        this.uvindex = uvindex;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunriseEpoch() {
        return sunriseEpoch;
    }

    public void setSunriseEpoch(Integer sunriseEpoch) {
        this.sunriseEpoch = sunriseEpoch;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getSunsetEpoch() {
        return sunsetEpoch;
    }

    public void setSunsetEpoch(Integer sunsetEpoch) {
        this.sunsetEpoch = sunsetEpoch;
    }

    public Double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(Double moonphase) {
        this.moonphase = moonphase;
    }

}

class Day {

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("datetimeEpoch")
    @Expose
    private Integer datetimeEpoch;
    @SerializedName("tempmax")
    @Expose
    private Double tempmax;
    @SerializedName("tempmin")
    @Expose
    private Double tempmin;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feelslikemax")
    @Expose
    private Double feelslikemax;
    @SerializedName("feelslikemin")
    @Expose
    private Double feelslikemin;
    @SerializedName("feelslike")
    @Expose
    private Double feelslike;
    @SerializedName("dew")
    @Expose
    private Double dew;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("precipprob")
    @Expose
    private Double precipprob;
    @SerializedName("precipcover")
    @Expose
    private Double precipcover;
    @SerializedName("preciptype")
    @Expose
    private List<String> preciptype = null;
    @SerializedName("snow")
    @Expose
    private Double snow;
    @SerializedName("snowdepth")
    @Expose
    private Double snowdepth;
    @SerializedName("windgust")
    @Expose
    private Double windgust;
    @SerializedName("windspeed")
    @Expose
    private Double windspeed;
    @SerializedName("winddir")
    @Expose
    private Double winddir;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("cloudcover")
    @Expose
    private Double cloudcover;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("solarradiation")
    @Expose
    private Double solarradiation;
    @SerializedName("solarenergy")
    @Expose
    private Double solarenergy;
    @SerializedName("uvindex")
    @Expose
    private Double uvindex;
    @SerializedName("severerisk")
    @Expose
    private Double severerisk;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunriseEpoch")
    @Expose
    private Integer sunriseEpoch;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("sunsetEpoch")
    @Expose
    private Integer sunsetEpoch;
    @SerializedName("moonphase")
    @Expose
    private Double moonphase;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("stations")
    @Expose
    private List<String> stations = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("normal")
    @Expose
    private Normal normal;
    @SerializedName("hours")
    @Expose
    private List<Hour> hours = null;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(Integer datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public Double getTempmax() {
        return tempmax;
    }

    public void setTempmax(Double tempmax) {
        this.tempmax = tempmax;
    }

    public Double getTempmin() {
        return tempmin;
    }

    public void setTempmin(Double tempmin) {
        this.tempmin = tempmin;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslikemax() {
        return feelslikemax;
    }

    public void setFeelslikemax(Double feelslikemax) {
        this.feelslikemax = feelslikemax;
    }

    public Double getFeelslikemin() {
        return feelslikemin;
    }

    public void setFeelslikemin(Double feelslikemin) {
        this.feelslikemin = feelslikemin;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(Double precipprob) {
        this.precipprob = precipprob;
    }

    public Double getPrecipcover() {
        return precipcover;
    }

    public void setPrecipcover(Double precipcover) {
        this.precipcover = precipcover;
    }

    public List<String> getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(List<String> preciptype) {
        this.preciptype = preciptype;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
    }

    public Double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public Double getWindgust() {
        return windgust;
    }

    public void setWindgust(Double windgust) {
        this.windgust = windgust;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWinddir() {
        return winddir;
    }

    public void setWinddir(Double winddir) {
        this.winddir = winddir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(Double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Double solarenergy) {
        this.solarenergy = solarenergy;
    }

    public Double getUvindex() {
        return uvindex;
    }

    public void setUvindex(Double uvindex) {
        this.uvindex = uvindex;
    }

    public Double getSevererisk() {
        return severerisk;
    }

    public void setSevererisk(Double severerisk) {
        this.severerisk = severerisk;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunriseEpoch() {
        return sunriseEpoch;
    }

    public void setSunriseEpoch(Integer sunriseEpoch) {
        this.sunriseEpoch = sunriseEpoch;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getSunsetEpoch() {
        return sunsetEpoch;
    }

    public void setSunsetEpoch(Integer sunsetEpoch) {
        this.sunsetEpoch = sunsetEpoch;
    }

    public Double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(Double moonphase) {
        this.moonphase = moonphase;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    public List<Hour> getHours() {
        return hours;
    }

    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

}

class E2799 {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("useCount")
    @Expose
    private Integer useCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("contribution")
    @Expose
    private Double contribution;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

}

class Hour {

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("datetimeEpoch")
    @Expose
    private Integer datetimeEpoch;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feelslike")
    @Expose
    private Double feelslike;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("dew")
    @Expose
    private Double dew;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("precipprob")
    @Expose
    private Double precipprob;
    @SerializedName("snow")
    @Expose
    private Double snow;
    @SerializedName("snowdepth")
    @Expose
    private Double snowdepth;
    @SerializedName("preciptype")
    @Expose
    private List<String> preciptype = null;
    @SerializedName("windgust")
    @Expose
    private Double windgust;
    @SerializedName("windspeed")
    @Expose
    private Double windspeed;
    @SerializedName("winddir")
    @Expose
    private Double winddir;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("cloudcover")
    @Expose
    private Double cloudcover;
    @SerializedName("solarradiation")
    @Expose
    private Double solarradiation;
    @SerializedName("solarenergy")
    @Expose
    private Double solarenergy;
    @SerializedName("uvindex")
    @Expose
    private Double uvindex;
    @SerializedName("severerisk")
    @Expose
    private Double severerisk;
    @SerializedName("conditions")
    @Expose
    private String conditions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("stations")
    @Expose
    private Object stations;
    @SerializedName("source")
    @Expose
    private String source;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(Integer datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getDew() {
        return dew;
    }

    public void setDew(Double dew) {
        this.dew = dew;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(Double precipprob) {
        this.precipprob = precipprob;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
    }

    public Double getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(Double snowdepth) {
        this.snowdepth = snowdepth;
    }

    public List<String> getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(List<String> preciptype) {
        this.preciptype = preciptype;
    }

    public Double getWindgust() {
        return windgust;
    }

    public void setWindgust(Double windgust) {
        this.windgust = windgust;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getWinddir() {
        return winddir;
    }

    public void setWinddir(Double winddir) {
        this.winddir = winddir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(Double solarradiation) {
        this.solarradiation = solarradiation;
    }

    public Double getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(Double solarenergy) {
        this.solarenergy = solarenergy;
    }

    public Double getUvindex() {
        return uvindex;
    }

    public void setUvindex(Double uvindex) {
        this.uvindex = uvindex;
    }

    public Double getSevererisk() {
        return severerisk;
    }

    public void setSevererisk(Double severerisk) {
        this.severerisk = severerisk;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getStations() {
        return stations;
    }

    public void setStations(Object stations) {
        this.stations = stations;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}

class Kmcn {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("useCount")
    @Expose
    private Integer useCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("contribution")
    @Expose
    private Double contribution;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

}

class Kmlj {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("useCount")
    @Expose
    private Integer useCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("contribution")
    @Expose
    private Double contribution;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

}

class Kpxe {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("useCount")
    @Expose
    private Integer useCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("contribution")
    @Expose
    private Double contribution;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

}

class Kwrb {

    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("useCount")
    @Expose
    private Integer useCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("contribution")
    @Expose
    private Double contribution;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

}

class Normal {

    @SerializedName("tempmax")
    @Expose
    private List<Double> tempmax = null;
    @SerializedName("tempmin")
    @Expose
    private List<Double> tempmin = null;
    @SerializedName("feelslike")
    @Expose
    private List<Double> feelslike = null;
    @SerializedName("precip")
    @Expose
    private List<Double> precip = null;
    @SerializedName("humidity")
    @Expose
    private List<Double> humidity = null;
    @SerializedName("snowdepth")
    @Expose
    private List<Object> snowdepth = null;
    @SerializedName("windspeed")
    @Expose
    private List<Double> windspeed = null;
    @SerializedName("windgust")
    @Expose
    private List<Double> windgust = null;
    @SerializedName("winddir")
    @Expose
    private List<Double> winddir = null;
    @SerializedName("cloudcover")
    @Expose
    private List<Double> cloudcover = null;

    public List<Double> getTempmax() {
        return tempmax;
    }

    public void setTempmax(List<Double> tempmax) {
        this.tempmax = tempmax;
    }

    public List<Double> getTempmin() {
        return tempmin;
    }

    public void setTempmin(List<Double> tempmin) {
        this.tempmin = tempmin;
    }

    public List<Double> getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(List<Double> feelslike) {
        this.feelslike = feelslike;
    }

    public List<Double> getPrecip() {
        return precip;
    }

    public void setPrecip(List<Double> precip) {
        this.precip = precip;
    }

    public List<Double> getHumidity() {
        return humidity;
    }

    public void setHumidity(List<Double> humidity) {
        this.humidity = humidity;
    }

    public List<Object> getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(List<Object> snowdepth) {
        this.snowdepth = snowdepth;
    }

    public List<Double> getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(List<Double> windspeed) {
        this.windspeed = windspeed;
    }

    public List<Double> getWindgust() {
        return windgust;
    }

    public void setWindgust(List<Double> windgust) {
        this.windgust = windgust;
    }

    public List<Double> getWinddir() {
        return winddir;
    }

    public void setWinddir(List<Double> winddir) {
        this.winddir = winddir;
    }

    public List<Double> getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(List<Double> cloudcover) {
        this.cloudcover = cloudcover;
    }

}

class Stations {

    @SerializedName("KPXE")
    @Expose
    private Kpxe kpxe;
    @SerializedName("E2799")
    @Expose
    private E2799 e2799;
    @SerializedName("KMLJ")
    @Expose
    private Kmlj kmlj;
    @SerializedName("KMCN")
    @Expose
    private Kmcn kmcn;
    @SerializedName("KWRB")
    @Expose
    private Kwrb kwrb;

    public Kpxe getKpxe() {
        return kpxe;
    }

    public void setKpxe(Kpxe kpxe) {
        this.kpxe = kpxe;
    }

    public E2799 getE2799() {
        return e2799;
    }

    public void setE2799(E2799 e2799) {
        this.e2799 = e2799;
    }

    public Kmlj getKmlj() {
        return kmlj;
    }

    public void setKmlj(Kmlj kmlj) {
        this.kmlj = kmlj;
    }

    public Kmcn getKmcn() {
        return kmcn;
    }

    public void setKmcn(Kmcn kmcn) {
        this.kmcn = kmcn;
    }

    public Kwrb getKwrb() {
        return kwrb;
    }

    public void setKwrb(Kwrb kwrb) {
        this.kwrb = kwrb;
    }

}