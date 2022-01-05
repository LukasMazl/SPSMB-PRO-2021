package cz.spsmb;

import cz.spsmb.repository.FileQuestionRepository;
import cz.spsmb.ui.GameUi;

import java.io.File;

public class Application {

    public static final String QUESTION_FILE_PATH = "./questions.csv";

    public static void main(String[] arg) throws Exception {
        GameUi gameUi = new GameUi(new FileQuestionRepository(new File(QUESTION_FILE_PATH)));
        gameUi.startGame();
    }
}
