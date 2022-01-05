package cz.spsmb.repository;

import cz.spsmb.model.Question;

import java.util.*;

public class MockQuestionRepository implements QuestionRepository {

    private static final List<Question> QUESTION_LIST;

    static {
        QUESTION_LIST = new LinkedList<>();

        QUESTION_LIST.add(new Question("Kolik je 1 + 1?", Arrays.asList("1", "2", "5", "10"), "2"));
        QUESTION_LIST.add(new Question("Kolik je 2 + 2?", Arrays.asList("1", "2", "4", "10"), "4"));
        QUESTION_LIST.add(new Question("Kolik je 3 + 3?", Arrays.asList("1", "2", "6", "10"), "6"));
        QUESTION_LIST.add(new Question("Kolik je 3 + 6?", Arrays.asList("1", "2", "9", "10"), "9"));
    }

    private Set<Question> usedQuestions;

    public MockQuestionRepository() {
        this.usedQuestions = new HashSet<>();
    }

    @Override
    public Question getOneQuestion() {
        Question newQuestion;
        boolean isQuestionUsed;
        do {
            newQuestion = QUESTION_LIST.get(getRandomIndex());
            isQuestionUsed = usedQuestions.contains(newQuestion);
        } while (isQuestionUsed);

        usedQuestions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public boolean hasNextQuestion() {
        return usedQuestions.size() != QUESTION_LIST.size();
    }

    private int getRandomIndex() {
        return (int) (Math.random() * QUESTION_LIST.size());
    }

}
