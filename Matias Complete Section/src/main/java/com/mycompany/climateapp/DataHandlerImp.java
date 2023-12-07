/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.climateapp;
import java.util.*;
/**
 *
 * @author ivanr
 */
// Simulates a database with in-memory data
public class DataHandlerImp implements DataHandler {
    private Map<String, List<ClimateData>> climateDataMap;

    public DataHandlerImp() {
        climateDataMap = new HashMap<>();
        // Pre-load some data into the map
        loadSampleData();
    }

    private void loadSampleData() {
    // Load sample data into the map
    climateDataMap.put("North America", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, -3.0f, 35.0f, 12f, 415.0f),
        new ClimateData("West", 2020, 1, 25, -4.0f, 32.0f, 15f, 418.0f),
        new ClimateData("West", 2021, 1, 25, -2.0f, 33.0f, 10f, 420.0f),
        new ClimateData("West", 2022, 1, 25, -1.0f, 34.0f, 8f, 422.0f),
        new ClimateData("West", 2023, 1, 25, -5.0f, 30.0f, 10f, 420.0f),
        
        // East region data for different years
        new ClimateData("East", 2019, 1, 25, 2.0f, 40.0f, 20f, 410.0f),
        new ClimateData("East", 2020, 1, 25, 1.0f, 42.0f, 18f, 412.0f),
        new ClimateData("East", 2021, 1, 25, 0.0f, 43.0f, 22f, 414.0f),
        new ClimateData("East", 2022, 1, 25, -1.0f, 41.0f, 19f, 416.0f),
        new ClimateData("East", 2023, 1, 25, 1.5f, 39.0f, 21f, 413.0f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 10.0f, 50.0f, 30f, 405.0f),
        new ClimateData("South", 2020, 1, 25, 9.0f, 52.0f, 28f, 407.0f),
        new ClimateData("South", 2021, 1, 25, 11.0f, 51.0f, 32f, 406.0f),
        new ClimateData("South", 2022, 1, 25, 12.0f, 53.0f, 31f, 408.0f),
        new ClimateData("South", 2023, 1, 25, 10.5f, 49.0f, 33f, 404.0f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, -10.0f, 60.0f, 40f, 395.0f),
        new ClimateData("North", 2020, 1, 25, -9.0f, 62.0f, 38f, 397.0f),
        new ClimateData("North", 2021, 1, 25, -8.0f, 61.0f, 42f, 399.0f),
        new ClimateData("North", 2022, 1, 25, -7.0f, 63.0f, 41f, 401.0f),
        new ClimateData("North", 2023, 1, 25, -10.5f, 59.0f, 43f, 396.0f)
            
    ));
    
    climateDataMap.put("Europe", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, 3.0f, 80.0f, 60f, 398.0f),
        new ClimateData("West", 2020, 1, 25, 2.5f, 78.0f, 58f, 400.0f),
        new ClimateData("West", 2021, 1, 25, 3.5f, 79.0f, 55f, 402.0f),
        new ClimateData("West", 2022, 1, 25, 4.0f, 77.0f, 57f, 403.0f),
        new ClimateData("West", 2023, 1, 25, 2.0f, 81.0f, 59f, 398.0f),

        // East region data for different years
        new ClimateData("East", 2019, 1, 25, -1.0f, 85.0f, 70f, 395.0f),
        new ClimateData("East", 2020, 1, 25, -1.5f, 83.0f, 68f, 397.0f),
        new ClimateData("East", 2021, 1, 25, -0.5f, 84.0f, 71f, 396.0f),
        new ClimateData("East", 2022, 1, 25, 0.0f, 82.0f, 69f, 398.0f),
        new ClimateData("East", 2023, 1, 25, -2.0f, 86.0f, 72f, 395.0f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 10.0f, 65.0f, 40f, 390.0f),
        new ClimateData("South", 2020, 1, 25, 11.0f, 64.0f, 42f, 392.0f),
        new ClimateData("South", 2021, 1, 25, 9.5f, 66.0f, 43f, 391.0f),
        new ClimateData("South", 2022, 1, 25, 12.0f, 63.0f, 41f, 393.0f),
        new ClimateData("South", 2023, 1, 25, 10.5f, 67.0f, 44f, 390.0f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, -5.0f, 90.0f, 80f, 385.0f),
        new ClimateData("North", 2020, 1, 25, -4.5f, 88.0f, 78f, 387.0f),
        new ClimateData("North", 2021, 1, 25, -6.0f, 91.0f, 81f, 384.0f),
        new ClimateData("North", 2022, 1, 25, -5.5f, 89.0f, 79f, 386.0f),
        new ClimateData("North", 2023, 1, 25, -7.0f, 92.0f, 82f, 385.0f)
            
    ));

    climateDataMap.put("Asia", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, 5.0f, 20.0f, 5f, 450.0f),
        new ClimateData("West", 2020, 1, 25, 6.0f, 22.0f, 6f, 452.0f),
        new ClimateData("West", 2021, 1, 25, 7.0f, 25.0f, 4f, 455.0f),
        new ClimateData("West", 2022, 1, 25, 8.0f, 23.0f, 5f, 453.0f),
        new ClimateData("West", 2023, 1, 25, 9.0f, 21.0f, 6f, 451.0f),

        // East region data for different years
        new ClimateData("East", 2019, 1, 25, 15.0f, 30.0f, 10f, 460.0f),
        new ClimateData("East", 2020, 1, 25, 14.0f, 32.0f, 12f, 462.0f),
        new ClimateData("East", 2021, 1, 25, 13.0f, 28.0f, 11f, 459.0f),
        new ClimateData("East", 2022, 1, 25, 16.0f, 31.0f, 9f, 461.0f),
        new ClimateData("East", 2023, 1, 25, 17.0f, 29.0f, 10f, 463.0f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 25.0f, 80.0f, 200f, 455.0f),
        new ClimateData("South", 2020, 1, 25, 26.0f, 78.0f, 195f, 458.0f),
        new ClimateData("South", 2021, 1, 25, 27.0f, 79.0f, 198f, 457.0f),
        new ClimateData("South", 2022, 1, 25, 28.0f, 77.0f, 196f, 456.0f),
        new ClimateData("South", 2023, 1, 25, 29.0f, 76.0f, 199f, 459.0f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, 10.0f, 50.0f, 25f, 440.0f),
        new ClimateData("North", 2020, 1, 25, 9.0f, 55.0f, 26f, 442.0f),
        new ClimateData("North", 2021, 1, 25, 11.0f, 52.0f, 24f, 443.0f),
        new ClimateData("North", 2022, 1, 25, 12.0f, 53.0f, 23f, 441.0f),
        new ClimateData("North", 2023, 1, 25, 13.0f, 51.0f, 22f, 444.0f)
            
    ));

    climateDataMap.put("Africa", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, 33.0f, 15.0f, 2f, 419.0f),
        new ClimateData("West", 2020, 1, 25, 34.0f, 16.0f, 3f, 420.0f),
        new ClimateData("West", 2021, 1, 25, 32.0f, 14.0f, 1f, 418.0f),
        new ClimateData("West", 2022, 1, 25, 35.0f, 17.0f, 2.5f, 421.0f),
        new ClimateData("West", 2023, 1, 25, 33.5f, 15.5f, 2f, 419.5f),

        // East region data for different years
        new ClimateData("East", 2019, 1, 25, 28.0f, 25.0f, 10f, 415.0f),
        new ClimateData("East", 2020, 1, 25, 29.0f, 27.0f, 12f, 416.0f),
        new ClimateData("East", 2021, 1, 25, 27.0f, 23.0f, 8f, 414.0f),
        new ClimateData("East", 2022, 1, 25, 30.0f, 26.0f, 11f, 417.0f),
        new ClimateData("East", 2023, 1, 25, 28.5f, 24.5f, 9f, 415.5f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 35.0f, 45.0f, 20f, 410.0f),
        new ClimateData("South", 2020, 1, 25, 36.0f, 43.0f, 19f, 411.0f),
        new ClimateData("South", 2021, 1, 25, 34.0f, 44.0f, 18f, 409.0f),
        new ClimateData("South", 2022, 1, 25, 37.0f, 42.0f, 21f, 412.0f),
        new ClimateData("South", 2023, 1, 25, 35.5f, 46.0f, 22f, 410.5f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, 20.0f, 55.0f, 30f, 405.0f),
        new ClimateData("North", 2020, 1, 25, 21.0f, 53.0f, 29f, 406.0f),
        new ClimateData("North", 2021, 1, 25, 19.0f, 54.0f, 28f, 404.0f),
        new ClimateData("North", 2022, 1, 25, 22.0f, 52.0f, 31f, 407.0f),
        new ClimateData("North", 2023, 1, 25, 20.5f, 56.0f, 32f, 405.5f)
            
    ));

    climateDataMap.put("Australia", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, 29.0f, 40.0f, 10f, 400.0f),
        new ClimateData("West", 2020, 1, 25, 28.0f, 42.0f, 12f, 402.0f),
        new ClimateData("West", 2021, 1, 25, 27.0f, 43.0f, 15f, 404.0f),
        new ClimateData("West", 2022, 1, 25, 26.0f, 41.0f, 11f, 401.0f),
        new ClimateData("West", 2023, 1, 25, 30.0f, 39.0f, 9f, 403.0f),

        // East region data for different years
        new ClimateData("East", 2019, 1, 25, 22.0f, 60.0f, 50f, 410.0f),
        new ClimateData("East", 2020, 1, 25, 23.0f, 58.0f, 45f, 412.0f),
        new ClimateData("East", 2021, 1, 25, 21.0f, 57.0f, 55f, 413.0f),
        new ClimateData("East", 2022, 1, 25, 24.0f, 59.0f, 47f, 411.0f),
        new ClimateData("East", 2023, 1, 25, 25.0f, 55.0f, 52f, 414.0f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 16.0f, 70.0f, 75f, 405.0f),
        new ClimateData("South", 2020, 1, 25, 15.0f, 71.0f, 80f, 406.0f),
        new ClimateData("South", 2021, 1, 25, 17.0f, 69.0f, 70f, 404.0f),
        new ClimateData("South", 2022, 1, 25, 18.0f, 68.0f, 78f, 407.0f),
        new ClimateData("South", 2023, 1, 25, 19.0f, 67.0f, 76f, 408.0f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, 31.0f, 50.0f, 100f, 420.0f),
        new ClimateData("North", 2020, 1, 25, 32.0f, 52.0f, 105f, 421.0f),
        new ClimateData("North", 2021, 1, 25, 30.0f, 51.0f, 95f, 419.0f),
        new ClimateData("North", 2022, 1, 25, 33.0f, 53.0f, 110f, 422.0f),
        new ClimateData("North", 2023, 1, 25, 34.0f, 49.0f, 90f, 423.0f)

    ));

    climateDataMap.put("South America", Arrays.asList(
        new ClimateData("West", 2019, 1, 25, 22.0f, 85.0f, 150f, 399.0f),
        new ClimateData("West", 2020, 1, 25, 23.0f, 83.0f, 155f, 400.0f),
        new ClimateData("West", 2021, 1, 25, 21.0f, 86.0f, 145f, 401.0f),
        new ClimateData("West", 2022, 1, 25, 24.0f, 84.0f, 160f, 398.0f),
        new ClimateData("West", 2023, 1, 25, 25.0f, 82.0f, 158f, 397.0f),

        // East region data for different years
        new ClimateData("East", 2019, 1, 25, 26.0f, 80.0f, 300f, 402.0f),
        new ClimateData("East", 2020, 1, 25, 27.0f, 79.0f, 310f, 403.0f),
        new ClimateData("East", 2021, 1, 25, 25.0f, 81.0f, 290f, 404.0f),
        new ClimateData("East", 2022, 1, 25, 28.0f, 78.0f, 320f, 401.0f),
        new ClimateData("East", 2023, 1, 25, 29.0f, 77.0f, 315f, 405.0f),

        // South region data for different years
        new ClimateData("South", 2019, 1, 25, 20.0f, 70.0f, 200f, 406.0f),
        new ClimateData("South", 2020, 1, 25, 21.0f, 68.0f, 210f, 407.0f),
        new ClimateData("South", 2021, 1, 25, 19.0f, 72.0f, 190f, 405.0f),
        new ClimateData("South", 2022, 1, 25, 22.0f, 69.0f, 220f, 408.0f),
        new ClimateData("South", 2023, 1, 25, 23.0f, 67.0f, 215f, 409.0f),

        // North region data for different years
        new ClimateData("North", 2019, 1, 25, 28.0f, 85.0f, 250f, 410.0f),
        new ClimateData("North", 2020, 1, 25, 29.0f, 83.0f, 255f, 411.0f),
        new ClimateData("North", 2021, 1, 25, 27.0f, 86.0f, 245f, 409.0f),
        new ClimateData("North", 2022, 1, 25, 30.0f, 84.0f, 260f, 412.0f),
        new ClimateData("North", 2023, 1, 25, 31.0f, 82.0f, 258f, 413.0f)
            
    ));
}


    @Override
    public void connectToDatabase() {
        // Since we're not using an actual database, this method can be empty
    }

    @Override
    public ClimateData retrieveData(String continent, String region, Date date) {
    List<ClimateData> dataList = climateDataMap.getOrDefault(continent, new ArrayList<>());
    for (ClimateData data : dataList) {
        if (data.getRegion().equalsIgnoreCase(region) && data.getYear() == date.getYear() + 1900 && data.getRegion().equalsIgnoreCase(region)) {
            return data;
        }
    }
    return null;
}
    
    @Override
    public List<String> getAvailableContinents() {
        return Arrays.asList("North America", "South America", "Europe", "Asia", "Africa", "Australia");
    }
}