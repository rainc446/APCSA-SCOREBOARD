public class Main {

    public static void main(String[] args){
        String info;
        Scoreboard game = new Scoreboard("Red", "blue");
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(1);
        System.out.println(info);
        game.recordPlay();
    }
}
