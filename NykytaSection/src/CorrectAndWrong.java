
/**
 *
 * @author Nykyt
 */
public class CorrectAndWrong {
    
    private static int correctAnswers;
    private static int wrongAnswers;

    public CorrectAndWrong(){
        correctAnswers = 0;
        wrongAnswers = 0;
    }

    public void addCorrect(){
        correctAnswers ++;
    }

    public void addWrong(){
        wrongAnswers ++;
    }

    public int getCorrect(){
        return correctAnswers;
    }

    public int getWrong(){
        return wrongAnswers;
    }
}
