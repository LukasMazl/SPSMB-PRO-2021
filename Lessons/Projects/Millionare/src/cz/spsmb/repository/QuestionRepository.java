package cz.spsmb.repository;

import cz.spsmb.model.Question;

public interface QuestionRepository {

    /**
     * Returns only a one question
     *
     * @return question
     */
    Question getOneQuestion();


    boolean hasNextQuestion();
}
