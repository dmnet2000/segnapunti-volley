package volley.polisportivamogliano.it.segnapunti.model;

public class Punteggio {
    private int teamAScore;
    private int teamBScore;
    private int setB;
    private int setA;
    private String teamAName;
    private String teamBName;

    public Punteggio() {
        this.teamAScore = 0;
        this.teamBScore = 0;
        this.setA = 0;
        this.setB = 0;
        this.setTeamAName(null);
        this.setTeamBName(null);
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public int getSetA() {
        return setA;
    }

    public void setSetA(int setA) {
        this.setA = setA;
    }

    public int getSetB() {
        return setB;
    }

    public void setSetB(int setB) {
        this.setB = setB;
    }

    public String getTeamAName() {
        return teamAName;
    }

    public void setTeamAName(String teamAName) {
        this.teamAName = teamAName;
    }

    public String getTeamBName() {
        return teamBName;
    }

    public void setTeamBName(String teamBName) {
        this.teamBName = teamBName;
    }
}