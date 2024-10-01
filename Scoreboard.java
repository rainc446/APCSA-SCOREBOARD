public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

    Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        if (score == 0)
        {
            if(activeTeam.equals(teamOne))
            {
                teamOneScore += score;
                activeTeam = teamTwo;
            }
            else if (activeTeam.equals(teamTwo))
            {
                teamTwoScore += score;
                activeTeam = teamOne;
                score;
            }
        }
    }
}
