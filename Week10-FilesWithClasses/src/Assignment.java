public class Assignment {
    private String name;
    private double maxScore;
    private double score;

    public Assignment(String name, double maxScore, double score) {
        this.name = name;
        this.maxScore = maxScore;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getStringForFile(){
        return name + "|" + maxScore + "|" + score;
    }
}
