package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayGameTest {

    @Test
    void makeRandomNumber() {
        PlayGame playGame = new PlayGame();
        playGame.makeRandomNumber();
    }
}