package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class ReportCardClass {
   private double englishGrade;
    private String name;
    private double biologyGrade;
    private double historyGrade;
    private double mathGrade;

    public ReportCardClass(double englishGrade, String name, double biologyGrade, double historyGrade, double mathGrade) {
        this.englishGrade = englishGrade;
        this.name = name;
        this.biologyGrade = biologyGrade;
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
    }
    //Getter Methods.
    public double getEnglishGrade() {
        return englishGrade;
    }

    public String getName() {
        return name;
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }








    //Setter Methods.
    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        String returner= "Name: "+name+
                "\n English: "+englishGrade+
                "\n Biology: "+biologyGrade+
                "\n Math: "+mathGrade+
                "\n History: "+historyGrade;
        return returner;
    }
}
