package cz.spsmb.repository;

import cz.spsmb.model.Question;

import java.util.*;

public class MockQuestionRepository implements QuestionRepository {

    private static final List<Question> QUESTIONS = new LinkedList<>();

    static {
        QUESTIONS.add(new Question("Kolik je 1 + 1?", Arrays.asList("1", "2", "4", "10", "11", "55"), "2"));
        QUESTIONS.add(new Question("Kolik je 2 + 2?", Arrays.asList("1", "2", "4", "10"), "4"));
        QUESTIONS.add(new Question("Kolik je 5 + 5?", Arrays.asList("1", "2", "4", "10"), "10"));
    }

    private Set<String> usedQuestions;

    public MockQuestionRepository() {
        this.usedQuestions = new HashSet<>();
    }

    @Override
    public Question getOneQuestion() {
        Question question;
        boolean containsQuestion;
        do {
            question = QUESTIONS.get(getRandomIndex());
            containsQuestion = usedQuestions.contains(question.getQuestion());
        } while (containsQuestion);

        usedQuestions.add(question.getQuestion());

        return question;
    }

    @Override
    public boolean hasNextQuestion() {
        return usedQuestions.size() != QUESTIONS.size();
    }

    private int getRandomIndex() {
        return (int) (Math.random() * QUESTIONS.size());
    }
}
