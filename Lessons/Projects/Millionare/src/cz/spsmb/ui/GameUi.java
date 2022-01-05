package cz.spsmb.ui;

import cz.spsmb.model.Question;
import cz.spsmb.repository.QuestionRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameUi {

    private static Map<Integer, Integer> PRICE_MAP;

    static {
        PRICE_MAP = new HashMap<>();
        int round = 0;

        PRICE_MAP.put(round++, 0);
        PRICE_MAP.put(round++, 100);
        PRICE_MAP.put(round++, 200);
        PRICE_MAP.put(round++, 300);
        PRICE_MAP.put(round++, 500);
        PRICE_MAP.put(round++, 1_000);
    }


    private final Scanner scanner = new Scanner(System.in);

    private Question currentQuestion;
    private int currentRound;
    private QuestionRepository questionRepository;

    public GameUi(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void startGame() {
        this.currentRound = 0;
        boolean isCorrectAnswer;
        do {
            genQuestion();
            showQuestion();
            isCorrectAnswer = checkAnswer();
            if(isCorrectAnswer) {
                currentRound++;
            }
        } while (isCorrectAnswer && getQuestionRepository().hasNextQuestion() && currentRound < PRICE_MAP.size() - 1);

        currentRound = (currentRound < PRICE_MAP.size())? currentRound: currentRound - 1;
        System.out.println("Vyhavas: $" + (PRICE_MAP.get(currentRound)));
    }

    private boolean checkAnswer() {
        System.out.print("Zadej odpoved: ");
        String answer = scanner.nextLine();
        return answer.compareTo(getCurrentQuestion().getCorrectAnswer()) == 0;
    }

    private void showQuestion() {
        System.out.println(getCurrentQuestion().getQuestion());
        for(int i = 0; i < getCurrentQuestion().getOptions().size(); i++) {
            String option = getCurrentQuestion().getOptions().get(i);
            System.out.println(i + " - " + option);
        }
    }

    private void genQuestion() {
        this.currentQuestion = getQuestionRepository().getOneQuestion();
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public QuestionRepository getQuestionRepository() {
        return questionRepository;
    }
}
