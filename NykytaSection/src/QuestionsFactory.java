
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Nykyt
 */
public class QuestionsFactory {

    
    public static void loadQuestions() throws FileNotFoundException{
        // ENTERING MANUALLY
//        QuestionsList questions = QuestionsList.getINSTANCE();
//
//        Question question1 = new Question("Is C02 a Greenhouse gas?",
//                true,"C02 is one of the gasses that is " +
//                "responsible for Greenhouse effect");
//        questions.addQuestion(question1);
//        Question question2 = new Question("The Earth's climate has always"
//                + "been stable, with little variation", false, "Eart's climate"
//                        + "has experienced periods of both warming"
//                        + "and cooling throughout its history. What's"
//                        + "concerning now is the rapid pace of warming"
//                        + " linked to human activities");
//        questions.addQuestion(question2);
//        Question question3 = new Question("Carbon dioxide (CO2)"
//                + " is the only greenhouse gas responsible"
//                + " for climate change.", false, "While CO2 is a significant"
//                        + "contributor, other greenhouse gases like methane (CH4) and"
//                        + "nitrous oxide (N2O) also play"
//                        + "crucial roles in trapping heat in the atmosphere.");
//        questions.addQuestion(question3);
//        Question question4 = new Question("Climate change only"
//                + "impacts the environment"
//                + " and has no direct effects on human health.",
//                false,
//                "Climate change can affect human"
//                        + "health through various means,"
//                        + "including extreme weather,"
//                        + "changes in disease pattern,"
//                        + "and impacts on food and security.");
//        questions.addQuestion(question4);
//        Question question5 = new Question("The Earth's climate"
//                + "is only warming,"
//                + " and there is no evidence of cooling trends",
//                true,
//                "While localized and temporary cooling events"
//                        + "can occur,"
//                        + "the overall trend globally is one of"
//                        + "warming."
//                        + "The consesus among climate scientists"
//                        + "is that the Earth is experiencing"
//                        + "a net increase in average temperatures.");
//        questions.addQuestion(question5);

          QuestionsList questions = QuestionsList.getINSTANCE();
          
          File f = new File("Questions.txt");
          Scanner s = new Scanner(f);
          
          while(s.hasNextLine()){
              String lineFile = s.nextLine();
              String[] section = lineFile.split(";"); //used mdn web docs to understand how split works, but coded myself
              String question = section[0];
              boolean answer = Boolean.parseBoolean(section[1]);
              String fact = section[2];
              
              Question q = new Question(question,answer,fact);
              questions.addQuestion(q);
          }

    }
}
