
import java.util.ArrayList;


/**
 *
 * @author Nykyt
 */

public class QuestionsList {
    
    private ArrayList<Question> questions;

    private QuestionsList(){
        questions = new ArrayList<>();
    }

    private static QuestionsList INSTANCE = new QuestionsList();

    public static QuestionsList getINSTANCE(){
        return INSTANCE;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public Question getRandom(){

        if(questions.isEmpty()){
            return null;
        }

        return questions.get((int)Math.floor(Math.random()*questions.size()));
    }

    public void removeQuestion(Question question){
        questions.remove(question);
    }
    
    public boolean isEmpty(){
        return questions.isEmpty();
    }
    
}
