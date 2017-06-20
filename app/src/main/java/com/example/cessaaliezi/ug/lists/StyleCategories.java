package com.example.cessaaliezi.ug.lists;

/**
 * Created by Cessa Aliezi on 18/06/2017.
 */

public class StyleCategories {

    private String StyleName;
    private String Measurement;
    private int Style_pic;

    public StyleCategories(String styleName, String measurement, int style_pic) {
        StyleName = styleName;
        Measurement = measurement;
        Style_pic = style_pic;
    }

    public String getStyleName() {
        return StyleName;
    }

    public String getMeasurement() {
        return Measurement;
    }

    public int getStyle_pic() {
        return Style_pic;
    }
}
