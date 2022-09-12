package baseball;

import java.util.Objects;

public class Ball {

    private final int index;
    private final int ballNum;

    public Ball(int index, int ballNum) {
        this.index = index;
        if (!ValidateUtils.validNum(ballNum)) {
            throw new IllegalArgumentException("숫자의 값은 1부터 9 사이어야 합니다.");
        }
        this.ballNum = ballNum;
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (ball.matchBallNum(ballNum)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNum(int ballNum) {
        return this.ballNum == ballNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index && ballNum == ball.ballNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, ballNum);
    }
}
