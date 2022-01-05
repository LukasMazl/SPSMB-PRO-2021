package cz.spsmb.ui;

import cz.spsmb.model.Question;
import cz.spsmb.repository.QuestionRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameUi {

    private static final int ADD_MONEY = 1000;
    private static final Map<Integer, Integer> PRICE_MAP;

    static {
        PRICE_MAP = new HashMap<>();
        int round = 0;

        PRICE_MAP.put(round++, 0);
        PRICE_MAP.put(round++, 1_000);
        PRICE_MAP.put(round++, 2_000);
        PRICE_MAP.put(round++, 5_000);
        PRICE_MAP.put(round++, 10_000);
        PRICE_MAP.put(round++, 20_000);
    }

    private final Scanner scanner = new Scanner(System.in);
    private int currentRound;

    private Question currentQuestion;
    private QuestionRepository questionRepository;

    public GameUi(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void startGame() {
        this.currentRound = 0;
        boolean isCorrectAnswer;
        do {
            genNewQuestion();
            showNewQuestion();
            isCorrectAnswer = isCorrectAnswer();
            if(isCorrectAnswer) {
                this.currentRound++;
            }
        } while (isCorrectAnswer && getQuestionRepository().hasNextQuestion());

        System.out.println("Uzivatel vyhral: " + PRICE_MAP.get(this.currentRound));
    }

    private boolean isCorrectAnswer() {
        System.out.print("Zadej odpoved: ");
        String userAnswer = scanner.nextLine();
        return getCurrentQuestion().getCorrectAnswer().compareTo(userAnswer) == 0;
    }

    private void genNewQuestion() {
        this.currentQuestion = getQuestionRepository().getOneQuestion();
    }

    private void showNewQuestion() {
        System.out.println(this.getCurrentQuestion().getQuestion());
        for(int i = 0; i < this.getCurrentQuestion().getOptions().size(); i++) {
            String option = this.getCurrentQuestion().getOptions().get(i);
            System.out.println(i + " - " + option);
        }
    }

    // GETTERS and SETTERS

    public int getCurrentRound() {
        return currentRound;
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public QuestionRepository getQuestionRepository() {
        return questionRepository;
    }

    public void setQuestionRepository(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
}
