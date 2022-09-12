package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @Test
    void play_3strike() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult playResult = answer.play(Arrays.asList(1, 2, 3));
        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
        assertThat(playResult.isGameEnd()).isTrue();
    }

    @Test
    void play_1strike_1ball() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult playResult = answer.play(Arrays.asList(1, 3, 4));
        assertThat(playResult.getStrike()).isEqualTo(1);
        assertThat(playResult.getBall()).isEqualTo(1);
    }

    @Test
    void play_nothing() {
        Balls answer = new Balls(Arrays.asList(1, 2, 3));
        PlayResult playResult = answer.play(Arrays.asList(4, 5, 6));
        assertThat(playResult.getStrike()).isEqualTo(0);
        assertThat(playResult.getBall()).isEqualTo(0);
    }

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
