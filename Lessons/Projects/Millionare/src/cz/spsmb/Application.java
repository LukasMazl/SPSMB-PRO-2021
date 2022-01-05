package cz.spsmb;

import cz.spsmb.repository.MockQuestionRepository;
import cz.spsmb.ui.GameUi;

public class Application {

    public static void main(String[] args) {
        GameUi gameUi = new GameUi(new MockQuestionRepository());
        gameUi.startGame();
    }
}
