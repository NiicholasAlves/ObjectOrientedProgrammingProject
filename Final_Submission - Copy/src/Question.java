
import java.util.ArrayList;


/**
 *
 * @author Nykyt
 */
public class Question {
    
    private final String question;
    private final boolean correctAnswer;
    private final String fact;

    public Question(String question, boolean correctAnswer, String fact){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.fact = fact;
    }

    public String getQuestion(){
        return question;
    }

    public boolean getAnswer(){
        return correctAnswer;
    }

    public String getFact(){
        return fact;
    }
}
