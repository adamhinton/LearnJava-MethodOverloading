public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Adam", 500);
        System.out.println(newScore);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(playerName + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println(score);
        return score * 1000;
    }

}