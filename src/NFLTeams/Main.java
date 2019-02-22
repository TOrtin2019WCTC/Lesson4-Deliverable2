package NFLTeams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite team in the NFC North");
        String team = input.nextLine().toLowerCase();//.substring(0,3);

        team = team.length() > 2 ? team.substring(0,3) : "not a valid entry";

        if (!team.equals("not a valid entry")) {

            for (NFL_Teams n : NFL_Teams.values()) {

                if (n.getTeamName().toLowerCase().contains(team) || n.getCity().toLowerCase().contains(team)) {
                    System.out.println(n.toString());
                }
            }

        } else {
            System.out.println(team);
        }
    }
}
