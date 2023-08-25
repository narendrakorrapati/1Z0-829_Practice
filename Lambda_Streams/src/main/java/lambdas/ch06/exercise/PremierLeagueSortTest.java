package lambdas.ch06.exercise;

import java.util.Comparator;
import java.util.List;

public class PremierLeagueSortTest {

    public static void main(String[] args) {

        sortByPoints();
        sortByPointsAndThenGoals();

    }

    private static void sortByPointsAndThenGoals() {
        List<PremierLeagueTeam> teamList = PremierLeagueComparatorTest.getTeamStats();
        teamList.sort(Comparator.comparingInt(PremierLeagueTeam::getPoints).thenComparingInt(PremierLeagueTeam::getGoalsScored).reversed());
        System.out.println(teamList);
    }

    private static void sortByPoints() {
        List<PremierLeagueTeam> teamList = PremierLeagueComparatorTest.getTeamStats();
        teamList.sort(Comparator.comparingInt(PremierLeagueTeam::getPoints).reversed());

        System.out.println(teamList);
    }
}
