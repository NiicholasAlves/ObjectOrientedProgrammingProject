
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuestionsGUI extends javax.swing.JFrame {
    
    private final CorrectAndWrong correct;
    private final QuestionsList questions;
    private Question question;
    
    private boolean correctAnswer;
    private boolean selectAnswer;
    private int questionCount;
    


    public QuestionsGUI() throws FileNotFoundException {
        generateQuestions();
        initComponents();
        questions = QuestionsList.getINSTANCE();
        question = questions.getRandom();
        correct = new CorrectAndWrong();
        correctAnswer = question.getAnswer();
        selectAnswer = false;
        questionCount = 5;
        setQuestion();
        
    }
    
    private void generateQuestions() throws FileNotFoundException{
        try{
            QuestionsFactory.loadQuestions();
        } catch (FileNotFoundException e){
            System.out.print("File not found!");
        }
    }
    
    private void setQuestion(){
        
        lblQuestion.setText(question.getQuestion());
        btnAnswer1.setText("True");
        btnAnswer2.setText("False");
        correctAnswer = question.getAnswer();
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnAnswer2 = new javax.swing.JRadioButton();
        btnAnswer1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(250, 246, 246));

        lblQuestion.setBackground(new java.awt.Color(255, 255, 255));
        lblQuestion.setFont(lblQuestion.getFont().deriveFont(lblQuestion.getFont().getSize()+3f));
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question");
        lblQuestion.setAlignmentX(0.5F);
        lblQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblQuestion.setPreferredSize(new java.awt.Dimension(47, 20));
        lblQuestion.setVerifyInputWhenFocusTarget(false);

        jButton2.setForeground(new java.awt.Color(255, 51, 102));
        jButton2.setText("<- *Back to Start*");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setText("Next Question");
        btnNext.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnNext.setContentAreaFilled(false);
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNext.setFocusPainted(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnAnswer2);
        btnAnswer2.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        btnAnswer2.setText("Answer 2");
        btnAnswer2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnswer2.setFocusPainted(false);
        btnAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswer2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnAnswer1);
        btnAnswer1.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        btnAnswer1.setText("Answer 1");
        btnAnswer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnswer1.setFocusPainted(false);
        btnAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswer1ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setText("*To Nicholas Section*->");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(72, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(72, 23));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        FactGUI f = new FactGUI();
        
        if(!btnAnswer1.isSelected() && !btnAnswer2.isSelected()){       
            System.out.println("Please select an answer!");
            return;
        }
        
        if(correctAnswer == selectAnswer){
            
            //Add 1 to Correct
            correct.addCorrect();
            questionCount--;
            
            // Creates new Fact window           
            f.setFact(question.getFact());
            f.setName("You are Correct!");
            System.out.println(questionCount + " " + questions.isEmpty());
            f.setVisible(true);
            
            
        } else {
            
            //Add 1 to Wrong
            correct.addWrong();
            questionCount--;
            
            //Creates a new Fact window
            f.setFact(question.getFact());
            f.setName("Wrong Answer!");
            f.setVisible(true);
            
        }
        
        //Remove the question from the array list
        questions.removeQuestion(question);
        f.setLastFact(questionCount,questions.isEmpty(),correct.getCorrect(),correct.getWrong());

        
        if (questionCount == 0 || questions.isEmpty()){
           
            dispose();
            
        }
        
        try{
            question = questions.getRandom();
            setQuestion();
        } catch (java.lang.NullPointerException e) {
            System.out.println("No more questions!");
        }
        
    }//GEN-LAST:event_btnNextActionPerformed
    
    private void btnAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswer2ActionPerformed
        // TODO add your handling code here:
        selectAnswer = Boolean.parseBoolean(btnAnswer2.getText());
//                btnAnswer2.getName();
    }//GEN-LAST:event_btnAnswer2ActionPerformed

    private void btnAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswer1ActionPerformed
        // TODO add your handling code here:
        selectAnswer = Boolean.parseBoolean(btnAnswer1.getText());
    }//GEN-LAST:event_btnAnswer1ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(QuestionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new QuestionsGUI().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(QuestionsGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAnswer1;
    private javax.swing.JRadioButton btnAnswer2;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblQuestion;
    // End of variables declaration//GEN-END:variables
}
