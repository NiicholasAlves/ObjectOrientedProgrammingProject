/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.climateapp;

/**
 *
 * @author ivanr
 */
public class ClimateData {
    // Attributes
    private String region;
    private int year;
    private int month;
    private int day;
    private float temperature;
    private float humidity;
    private float rainfall;
    private float carbonDioxideLevel;

    // Constructor that accepts parameters
    public ClimateData(String region, int year, int month, int day, float temperature, float humidity, float rainfall, float carbonDioxideLevel) {
        this.region = region;
        this.year = year;
        this.month = month;
        this.day = day;
        this.temperature = temperature;
        this.humidity = humidity;
        this.rainfall = rainfall;
        this.carbonDioxideLevel = carbonDioxideLevel;
    }

    // Getters for the attributes
    public String getRegion() {
        return region;
    }
    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getRainfall() {
        return rainfall;
    }

    public float getCarbonDioxideLevel() {
        return carbonDioxideLevel;
    }

    // Setters for the attributes
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setRainfall(float rainfall) {
        this.rainfall = rainfall;
    }

    public void setCarbonDioxideLevel(float carbonDioxideLevel) {
        this.carbonDioxideLevel = carbonDioxideLevel;
    }

    public void analyzeData(float averageTemperature, float averageHumidity, float averageRainfall, float averageCO2Level) {
        float tempDeviation = this.temperature - averageTemperature;
        float humidityDeviation = this.humidity - averageHumidity;
        float rainfallDeviation = this.rainfall - averageRainfall;
        float co2Deviation = this.carbonDioxideLevel - averageCO2Level;

        System.out.println("Analysis of Climate Data:");
        System.out.printf("Temperature is %.2f°C %s than the average.\n", Math.abs(tempDeviation), (tempDeviation > 0) ? "higher" : "lower");
        System.out.printf("Humidity is %.2f%% %s than the average.\n", Math.abs(humidityDeviation), (humidityDeviation > 0) ? "higher" : "lower");
        System.out.printf("Rainfall is %.2fmm %s than the average.\n", Math.abs(rainfallDeviation), (rainfallDeviation > 0) ? "higher" : "lower");
        System.out.printf("CO2 levels are %.2fppm %s than the average.\n", Math.abs(co2Deviation), (co2Deviation > 0) ? "higher" : "lower");
    }
}