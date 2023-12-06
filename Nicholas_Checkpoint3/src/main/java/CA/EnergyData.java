/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA;

/**
 *
 * @author nicho
 */
import java.util.Scanner;

public class EnergyData extends CarbonCalculator{
    private double energyUsage;
    private double renewableEnergyUsage;
    public static final double carbonPerKWh = 0.5;
    
    public void setEnergyUsage(double energyUsage){
        this.energyUsage = energyUsage;
    }
    
    public void setRenewableEnergytUsage(double renewableEnergyUsage){
        this.renewableEnergyUsage = renewableEnergyUsage;
    }
    
    public double getEnergyUsage(){
        return energyUsage;
    }
    
    public double getRenewableEnergytUsage(){
        return renewableEnergyUsage;
    }

    public void gatherEnergyData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter energy usage (in kWh): ");
        energyUsage = scanner.nextDouble();

        System.out.print("Enter renewable energy usage (in kWh): ");
        renewableEnergyUsage = scanner.nextDouble();
    }

    @Override
    public void calculateCarbonFootprint() {
        // Calculation logic specific to energy data
        totalCarbonFootprint = (energyUsage - renewableEnergyUsage) * carbonPerKWh;
    }
}

