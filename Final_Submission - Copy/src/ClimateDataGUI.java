/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanr
 */
public class ClimateDataGUI extends javax.swing.JFrame {
    private DataHandler dataHandler;
    /**
     * Creates new form ClimateDataGUI
     */
    public ClimateDataGUI() {
        dataHandler = new DataHandlerImp();
        initComponents();
        
    calculateButton.addActionListener(new java.awt.event.ActionListener(){
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt){
            calculateButtonActionPerformed(evt);
        }
    });

}
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt){
        String selectContinent = (String) continentComboBox.getSelectedItem();
        String selectedRegion = (String) regionComboBox.getSelectedItem();
        String yearString = yearTextField.getText();
        try{
            int year = Integer.parseInt(yearString);
            if(year < 1900 || year > Calendar.getInstance().get(Calendar.YEAR)){
                JOptionPane.showMessageDialog(this, "Year must be between 2019 and the current year.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
            ClimateData data = dataHandler.retrieveData(selectContinent, selectedRegion, new Date(year - 1900, 0, 1));
            
            if(data != null){
                resultsTextPane.setText(formatClimateData(data));
                writeToTextFile(data);
            } else{
                resultsTextPane.setText("No climate data available for the selected options.");
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Please enter a valid year.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void writeToTextFile(ClimateData data) {
    try (PrintWriter writer = new PrintWriter(new FileOutputStream("ClimateDataResults.txt", true))) { // true for append mode
        writer.println("Results for " + data.getRegion() + " on " + data.getYear() + "-" + data.getMonth() + "-" + data.getDay() + ":");
        writer.println("Temperature: " + data.getTemperature() + "°C");
        writer.println("Humidity: " + data.getHumidity() + "%");
        writer.println("Rainfall: " + data.getRainfall() + "mm");
        writer.println("CO2 Levels: " + data.getCarbonDioxideLevel() + "ppm");
        writer.println("------------------------------------------------");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

    
    private String formatClimateData(ClimateData data){
    // Format the climate data for display
    String climateInfo = String.format("Year: %d\nTemperature: %.2f°C\nHumidity: %.2f%%\nRainfall: %.2f mm\nCO2 Levels: %.2f ppm",
            data.getYear(),
            data.getTemperature(),
            data.getHumidity(),
            data.getRainfall(),
            data.getCarbonDioxideLevel());
    return climateInfo;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        sltContinent = new javax.swing.JLabel();
        continentComboBox = new javax.swing.JComboBox<>();
        sltRegion = new javax.swing.JLabel();
        regionComboBox = new javax.swing.JComboBox<>();
        sltYear = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        availableContinents = new javax.swing.JLabel();
        yearRule = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        skipButton = new javax.swing.JButton();
        skipComment = new javax.swing.JLabel();
        listContinents = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTextPane = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        linkToArticle = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sltContinent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sltContinent.setText("Select Continent");
        sltContinent.setToolTipText("");

        continentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North America", "South America", "Europe", "Asia", "Africa", "Australia" }));

        sltRegion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sltRegion.setText("Select Region");

        regionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "West", "East", "South", "North" }));

        sltYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sltYear.setText("Select Year:");
        sltYear.setMaximumSize(new java.awt.Dimension(71, 16));
        sltYear.setMinimumSize(new java.awt.Dimension(71, 16));
        sltYear.setPreferredSize(new java.awt.Dimension(71, 16));

        availableContinents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        availableContinents.setText("Worldwide Climate Calculator");
        availableContinents.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        yearRule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearRule.setText("From 2019 to 2023");
        yearRule.setMaximumSize(new java.awt.Dimension(71, 16));
        yearRule.setMinimumSize(new java.awt.Dimension(71, 16));
        yearRule.setPreferredSize(new java.awt.Dimension(71, 16));

        calculateButton.setText("Calculate");

        skipButton.setText("Skip");
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });

        skipComment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skipComment.setText("Move to next section");
        skipComment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        skipComment.setMaximumSize(new java.awt.Dimension(71, 16));
        skipComment.setMinimumSize(new java.awt.Dimension(71, 16));
        skipComment.setPreferredSize(new java.awt.Dimension(71, 16));

        listContinents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listContinents.setText("Retrieve data about climate change in the world in seconds");
        listContinents.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setViewportView(resultsTextPane);
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        resultsTextPane.setFont(font);

        jScrollPane1.setViewportView(linkToArticle);
        linkToArticle.setContentType("text/html");
        linkToArticle.setEditable(false);

        String htmlContent = "For more information, visit: link " +
        "Take a quiz to learn more: link";

        linkToArticle.setText(htmlContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearRule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sltYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sltRegion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(continentComboBox, 0, 0, Short.MAX_VALUE)
                    .addComponent(sltContinent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(skipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(skipComment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(listContinents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(availableContinents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(availableContinents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listContinents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(sltContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(continentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sltRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sltYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearRule, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skipComment, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(skipButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        yearRule.getAccessibleContext().setAccessibleName("From 2019 to 202X");
        jScrollPane2.getAccessibleContext().setAccessibleName("resultsTextPane");
        jScrollPane2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
            // TODO add your handling code here:
/*   - Version 1
QuestionsGUI questions = null;
        try {
            questions = new QuestionsGUI();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClimateDataGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            questions.show();
        
            dispose();
*/

        // Version 2
            QuestionsGUI questions = null;
            CarbonCalculatorGUI calculator = null;
        try {
            QuestionsFactory.loadQuestions();
            if(!QuestionsFactory.noQuestions()){//Try to open Question section if there is no issue with questions being added
                questions = new QuestionsGUI();
            } else {
                try{
                    calculator = new CarbonCalculatorGUI();
                    calculator.setVisible(true);
                    dispose();
                } catch(java.lang.RuntimeException e){
                    System.out.println("Carbon Calculator file not found!");
                    JOptionPane.showMessageDialog(this,"Carbon Calculator file not found");
                }      
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClimateDataGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            questions.show();
        
            dispose();
    }//GEN-LAST:event_skipButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClimateDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClimateDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClimateDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClimateDataGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClimateDataGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableContinents;
    private javax.swing.JButton calculateButton;
    private javax.swing.JComboBox<String> continentComboBox;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane linkToArticle;
    private javax.swing.JLabel listContinents;
    private javax.swing.JComboBox<String> regionComboBox;
    private javax.swing.JTextPane resultsTextPane;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel skipComment;
    private javax.swing.JLabel sltContinent;
    private javax.swing.JLabel sltRegion;
    private javax.swing.JLabel sltYear;
    private javax.swing.JLabel yearRule;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
