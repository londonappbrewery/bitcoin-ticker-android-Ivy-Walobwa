package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherModell {
    private String mBitcoinPrice;



    public static WeatherModell fromJson(JSONObject jsonObject, String code){
        WeatherModell weatherDataModel = new WeatherModell();

        try {
            double price = jsonObject.getJSONObject(code).getDouble("last");
            weatherDataModel.mBitcoinPrice = Double.toString(price);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return weatherDataModel;
    }

    public String getBitcoinPrice() {
        return mBitcoinPrice;
    }
}
