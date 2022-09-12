package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball computer;

    @BeforeEach
    void comSetup() {
        computer = new Ball(3, 8);
    }

    @Test
    void strike() {
        BallStatus status = computer.play(new Ball(3, 8));
         assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        BallStatus status = computer.play(new Ball(1, 8));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void noting() {
        BallStatus status = computer.play(new Ball(2, 3));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

}
