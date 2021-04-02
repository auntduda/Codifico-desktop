package lesson;

public class Lesson {
    private int id, numClasses;
    private String theme, discription, problems, example;

    public Lesson(int id, int numClasses, String theme, String discription, String problems, String example) {
        this.id = id;
        this.numClasses = numClasses;
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

    public int getNumClasses() {
        return numClasses;
    }
    
    public void setNumClasses(int numClasses) {
        this.numClasses = numClasses;
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
