package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = getBalls(answers);
    }

    private List<Ball> getBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 1; i <= answers.size(); i++) {
            balls.add(new Ball(i, answers.get(i - 1)));
        }
        return balls;
    }

    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball))
                .filter(status -> !status.isNothing())
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBall = new Balls(balls);
        PlayResult playResult = new PlayResult();
        for (Ball answer : answers) {
            BallStatus status = userBall.play(answer);
            playResult.report(status);
        }
        return playResult;
    }
}
