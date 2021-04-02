package course;

public class Course {
    private int id, numClasses;
    private String name, difficulty, discription;
    private Class lesson[]; //Discutir com o grupo a mudança do palavra reservada 'class' por 'lesson'

    public Course(int id, int numClasses, String name, String difficulty, String discription, Class[] lesson) {
        this.id = id;
        this.numClasses = numClasses;
        this.name = name;
        this.difficulty = difficulty;
        this.discription = discription;
        this.lesson = this.lesson;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumClasses() {
        return numClasses;
    }
    
    public void setNumClasses(int numClasses) {
        this.numClasses = numClasses;
    }
    
    public String getDifficulty() {
        return difficulty;
    }
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    public Class[] getLesson() {
        return lesson;
    }

    public void setLesson(Class[] lesson) {
        this.lesson = lesson;
    }

    public String getDiscription() {
        return discription;
    }
    
    public void setDiscription(String discription) {
        this.discription = discription;
    }   
    
}
