package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @Test
    void nothing() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = answers.play(new Ball(1, 4));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = answers.play(new Ball(1, 3));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = answers.play(new Ball(2, 2));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }
}
