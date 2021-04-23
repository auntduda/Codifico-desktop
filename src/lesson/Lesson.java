package lesson;

public class Lesson {
    private int id, numLessons;
    private String theme, discription, problems, example;

    public Lesson(int id, int numLessons, String theme, String discription, String problems, String example) {
        this.id = id;
        this.numLessons = numLessons;
        this.theme = theme;
        this.discription = discription;
        this.problems = problems;
        this.example = example;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getNumLessons() {
        return numLessons;
    }
    
    public void setNumLessons(int numLessons) {
        this.numLessons = numLessons;
    }

    public String getTheme() {
        return theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDiscription() {
        return discription;
    }
    
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getProblems() {
        return problems;
    }
    
    public void setProblems(String problems) {
        this.problems = problems;
    }
    
//    public void randomProblems(String problems) {
//        this.problems = problems;
//    }

    public String getExample() {
        return example;
    }
    
    public void setExample(String example) {
        this.example = example;
    }
    
}
