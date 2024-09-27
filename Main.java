public class Main {

    public static void main(String[] args){
        String info;
        Scoreboard game = new ScoreBoard("Red", "blue");
        info = game.getScore();
        System.out.println(info);
    }
}
