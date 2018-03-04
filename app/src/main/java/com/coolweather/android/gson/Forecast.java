package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Carsonlzh on 2018/2/10.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String Max;

        public String Min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
