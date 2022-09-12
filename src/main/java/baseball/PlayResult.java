package baseball;

import java.util.Random;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getBall() {
        return this.ball;
    }

    public int getStrike() {
        return this.strike;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            strike += 1;
        }
        if (status.isBall()) {
            ball += 1;
        }
    }

    public boolean isGameEnd() {
        return strike == 3;
    }
}
