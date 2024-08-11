import java.util.Scanner;

public class QuestionService {

    Question [] questions= new Question[4];

    String selection[]= new String[4];

    public QuestionService(){

        questions[0] = new Question(1, "Q:1", "Java", "Pyhton","Csharp","C++", "java");
        questions[1] = new Question(2, "Q:2", "Java", "Pyhton","Csharp","C++", "Python");
        questions[2] = new Question(3, "Q:3", "Java", "Pyhton","Csharp","C++", "C++");
        questions[3] = new Question(4, "Q:4", "Java", "Pyhton","C#","C++", "C#");
    }

    public  void playQuiz()
    {
        int i=0;
        for(Question q: questions){

            if (q != null) { // Ensure no null values are printed
                System.out.println("S.No: " + q.getId());
                System.out.println(q.getQuestion());
                System.out.println(q.getOpt1());
                System.out.println(q.getOpt2());
                System.out.println(q.getOpt3());
                System.out.println(q.getOpt4());

                Scanner sc= new Scanner(System.in);

                selection[i]= sc.nextLine();
                i++;
            }
            for (String s: selection){
                System.out.println(s);
            }

        }
    }

    public void printScore(){
        int score=0;
        for(int i=0; i<questions.length; i++){
            Question que= questions[i];
            String actualAnswer= que.getAnswer();

            String userAnswer =selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score is: " + score);
    }

}