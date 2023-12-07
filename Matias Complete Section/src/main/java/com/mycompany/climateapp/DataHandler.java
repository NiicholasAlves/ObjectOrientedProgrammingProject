/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.climateapp;
import java.util.*;
/**
 *
 * @author ivanr
 */
public interface DataHandler {
    void connectToDatabase();
    ClimateData retrieveData(String Continent, String Region, Date date);
    List<String> getAvailableContinents();
}

