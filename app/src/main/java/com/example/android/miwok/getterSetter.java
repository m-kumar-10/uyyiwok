package com.example.android.miwok;

public class getterSetter {
    private String Miwok;
    private String Default;
    private int ImageResID;

    public getterSetter(String miwok, String aDefault) {
        Miwok = miwok;
        Default = aDefault;
    }

    public getterSetter(String miwok, String aDefault, int imageResID) {
        Miwok = miwok;
        Default = aDefault;
        ImageResID = imageResID;
    }

    public String getMiwok() {
        return Miwok;
    }

    public String getDefault() {
        return Default;
    }

    public int getImageResID() {
        return ImageResID;
    }
}

