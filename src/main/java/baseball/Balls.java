package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> answers) {
        this.balls = getBalls(answers);
    }

    private List<Ball> getBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 1; i <= answers.size(); i++) {
            balls.add(new Ball(i, answers.get(i - 1)));
        }
        return balls;
    }

    public BallStatus play(Ball ball) {
        return balls.stream()
                .map(answer -> answer.play(ball))
                .filter(status -> status != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

}
