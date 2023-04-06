package thus_06_04_2023;

import wed_05_04_2023.GetDisplayDetailsCricketT20.CricketScores;

public class GetCricketOneDayScore {

	public static String getDisplayDetails(int runs, float overs) {
        int remainingRuns = runs;
        float remainingOvers = overs;
        String format;
        if (runs < 100 || (int) (overs * 10) % 10 == 0) {
            remainingRuns = Math.round(overs * 6) * 2 + runs % 2;
            remainingOvers = (float) Math.ceil((float) runs / 2 / 6 * 10) / 10;
            format = "%d runs in %d balls @ %.2f runs per ball";
        } else {
            remainingOvers = (float) (Math.floor(overs) + (overs % 1) * 10 / 6);
            format = "%d runs in %.1f Overs @ %.2f runs per over";
        }
        
        float requiredRate = (float) runs / (overs - remainingOvers);
        
        return String.format(format, runs, remainingRuns, requiredRate);
    }


public static void main(String[] args) {
    int runs = 21;
    float overs = 3.2f;
    String displayDetails = CricketScores.getDisplayDetails(runs, overs);
    System.out.println(displayDetails);
}
}
