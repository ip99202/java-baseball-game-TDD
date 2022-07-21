package baseball;

import java.util.*;

public class PlayGame {

    private static HashSet<Integer> ANSWER = new HashSet<>();
    private static boolean gameEndFlag = false;
    private static Scanner sc = new Scanner(System.in);

    public void makeRandomNumber() {
        Random random = new Random();
        HashSet<Integer> randomNumberSet = new HashSet<>();
        while (randomNumberSet.size() < 3) {
            int num = random.nextInt(9) + 1;
            randomNumberSet.add(num);
        }
        ANSWER = randomNumberSet;
    }

    public void calculateScore(int inputNumber) {
        List<Integer> numberList = new ArrayList<>();
        int strikeScore = 0, ballScore = 0;
        for (int i = 0; i < 3; i++) {
            numberList.add(inputNumber % 10);
            inputNumber = inputNumber / 10;
        }
        for (int i = 0; i < 3; i++) {
            ballScore += calculateBall(numberList.get(i));
        }
        Object[] answerList = ANSWER.toArray();
        for (int i = 0; i < 3; i++) {
            strikeScore += calculateStrike(answerList[i], numberList.get(i));
        }
        ballScore -= strikeScore;

        printScore(strikeScore, ballScore);
        if (strikeScore == 3) {
            gameEndFlag = true;
        }
    }

    private int calculateStrike(Object o, Integer num) {
        if ((int) o == num) {
            return 1;
        }
        return 0;
    }

    public int calculateBall(int num) {
        if (ANSWER.contains(num)) {
            return 1;
        }
        return 0;
    }

    public void printScore(int strikeScore, int ballScore) {
        if (strikeScore == 0 && ballScore == 0) {
            System.out.println("noting");
            return;
        }
        if (strikeScore == 0) {
            System.out.println(ballScore + " 볼");
            return;
        }
        if (ballScore == 0 || strikeScore == 3) {
            System.out.println(strikeScore + " 스트라이크");
            return;
        }
        if (ballScore > 0 && strikeScore > 0) {
            System.out.println(ballScore + " 볼 " + strikeScore + " 스트라이크");
        }
    }

    public void endGameFunction() {
        if (gameEndFlag) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = sc.nextLine();
            if (input.equals("1")) {
                gameEndFlag = false;
                makeRandomNumber();
            }
        }
    }

    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        playGame.makeRandomNumber();
        while (!gameEndFlag) {
            System.out.println("숫자를 입력해 주세요 : ");
            String input = sc.nextLine();
            playGame.calculateScore(Integer.parseInt(input));
            playGame.endGameFunction();
        }
        System.out.println("게임 종료");
    }
}