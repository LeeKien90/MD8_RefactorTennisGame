public class TennisGame {
    public static final int BASESCORE = 0;
    public static final int FIRSTSCORE = 1;
    public static final int SECONDSCORE = 2;
    public static final int THIRDSCORE = 3;
    public static String getScore(String player1Name, String player2Name, int first_score, int second_score) {
        String score = "";
        int tempScore=0;
        if (first_score==second_score)
        {
            switch (first_score)
            {
                case BASESCORE:
                    score = "Love-All";
                    break;
                case FIRSTSCORE:
                    score = "Fifteen-All";
                    break;
                case SECONDSCORE:
                    score = "Thirty-All";
                    break;
                case THIRDSCORE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        else if (first_score>=4 || second_score>=4)
        {
            int minusResult = first_score-second_score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = first_score;
                else { score+="-"; tempScore = second_score;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
