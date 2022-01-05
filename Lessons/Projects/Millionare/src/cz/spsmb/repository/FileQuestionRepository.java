package cz.spsmb.repository;

import cz.spsmb.model.Question;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileQuestionRepository implements QuestionRepository {

    private File file;
    private Scanner scanner;
    private List<Question> list;

    public FileQuestionRepository(File file) throws FileNotFoundException {
        this.file = file;
        this.scanner = new Scanner(new FileInputStream(file));

        loadQuestions();
    }

    private void loadQuestions() {
        this.list = new LinkedList<>();
        System.out.println(scanner.nextLine());
        String line = scanner.nextLine();
        System.out.println(line.split(";")[2]);
    }

    @Override
    public Question getOneQuestion() {

        return null;
    }

    @Override
    public boolean hasNextQuestion() {
        return false;
    }
}
