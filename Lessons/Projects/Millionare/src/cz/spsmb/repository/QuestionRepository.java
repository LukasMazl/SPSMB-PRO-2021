package cz.spsmb.repository;

import cz.spsmb.model.Question;

public interface QuestionRepository {

    /**
     * Returns random question
     *
     * @return random question
     */
    Question getOneQuestion();

    /**
     *
     *
     * @return
     */
    boolean hasNextQuestion();

}
