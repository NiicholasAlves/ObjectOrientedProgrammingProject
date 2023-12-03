
import java.io.FileNotFoundException;
//import java.util.Scanner;

/**
 *
 * @author Nykyt
 */
public class MainApp {
    
        public static void main(String[] args) throws FileNotFoundException {
        
//        QuestionsFactory.loadQuestions();  - A TEST CODE.           

        QuestionsGUI myGUI = new QuestionsGUI();
        myGUI.setVisible(true);     
                   
//        generateQuestions(); - A test code
         
        }
         
        // TESTING ARRAYLIST.
//       public static void generateQuestions(){
//        
//        QuestionsList questions = QuestionsList.getINSTANCE();
//        
//        int i = 5;
//        Scanner s = new Scanner(System.in);
//        CorrectAndWrong correct = new CorrectAndWrong();
//        
//        while(i > 0){
//            
//            Question randomQuestion = questions.getRandom();
//            System.out.println(randomQuestion.getQuestion());
//            System.out.println("What is your answer?");
//            boolean uChoice = s.nextBoolean();
//            
//            if(uChoice == randomQuestion.getAnswer()){
//                System.out.println("Correct!");
//                questions.removeQuestion
//        (randomQuestion);
//                correct.addCorrect();
//            } else{
//                System.out.println("Wrong choice");
//                System.out.println(randomQuestion.getFact());
//                questions.removeQuestion
//        (randomQuestion);
//                correct.addWrong();
//            }
//            i--;
//       }
//        
//            System.out.println("You got total Correct Answers: " + correct.getCorrect());
//            System.out.println("You got total wrong Answers: " + correct.getWrong());
//
//    }
        
        
    
}
