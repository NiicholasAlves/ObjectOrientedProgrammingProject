/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author nicho
 */
import java.util.Scanner;
public class TransportationData extends CarbonCalculator{
    private double milesDriven;
    private double publicTransportUsage;
    public static final double carbonPerMile = 0.0003;
    public static final double carbonPerMilePublicTransport = 0.00001;
    
    public void setMilesDriven(double milesDriven){
        this.milesDriven = milesDriven;
    }
    
    public void setPublicTransportUsage(double publicTransportUsage){
        this.publicTransportUsage = publicTransportUsage;
    }
    
    public double getMilesDriven(){
        return milesDriven;
    }
    
    public double getPublicTransportUsage(){
        return publicTransportUsage;
    }    
    
    public void gatherTransportationData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles driven: ");
        milesDriven = scanner.nextDouble();

        System.out.print("Enter public transport usage (in miles): ");
        publicTransportUsage = scanner.nextDouble();
    }

    @Override
    public void calculateCarbonFootprint() {
        // Calculation logic specific to transportation data
        totalCarbonFootprint = (milesDriven * carbonPerMile) + (publicTransportUsage * carbonPerMilePublicTransport);
    }
  
}
