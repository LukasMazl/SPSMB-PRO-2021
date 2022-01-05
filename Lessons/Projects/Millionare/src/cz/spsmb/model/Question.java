package cz.spsmb.model;

import java.util.List;

public class Question {

    private String question;
    private List<String> options;
    private String correctAnswer;

    public Question(String question, List<String> options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", options=" + options +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
