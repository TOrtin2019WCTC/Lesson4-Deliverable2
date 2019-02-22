package NFLTeams;


public enum NFL_Teams {
    PACKERS("Packers", "Green Bay"),
    BEARS("Bears", "Chicago"),
    VIKINGS("Vikings", "Minnesota"),
    LIONS("Lions", "Detroit");

    private String teamName;
    private String city;

    private NFL_Teams(String teamName, String city) {
        this.teamName = teamName;
        this.city = city;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Your favorite team is the " + this.city + " " + this.teamName;

    }


}

