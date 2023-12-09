
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Nykyt
 */
public class QuestionsFactory {

    private static boolean questionsError;
    
    private QuestionsFactory(){
        questionsError = false;
    }
    
    public static void loadQuestions() throws FileNotFoundException{

          QuestionsList questions = QuestionsList.getINSTANCE();
          
          //Generate a new instance of a file with a pathname to "Question.txt" 
          File f = new File("Questions.txt");
          Scanner s = new Scanner(f); // Scanner to read the files
          
          //Read each line in the file
          while(s.hasNextLine()){
              try{
                //Create a String that takes every line from a file
                String lineFile = s.nextLine();
                //Split the line into sections based on semi-colon symbol appearance and then add them to an array
                String[] section = lineFile.split(";"); //used mdn web docs to understand how split works, but coded myself
                //Then add values to question, answer and fact variables based on their determined positions in the array
                String question = section[0];
                boolean answer = Boolean.parseBoolean(section[1]);
                String fact = section[2];

                //Create an instance of a Question and variables question, answer, and fact as parameters
                Question q = new Question(question,answer,fact);
                //Adds Question to an Array List QuestionsList.
                questions.addQuestion(q);
              } catch (java.lang.ArrayIndexOutOfBoundsException e){
                  System.out.println("Issue uploading quetions");
                  questionsError = true;
              }
          }

    }
    
    public static boolean noQuestions(){
        return questionsError;
    }
}
