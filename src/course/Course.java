package course;

import lesson.Lesson;

public class Course {
    private int id, numLessons;
    private String name, difficulty, description;
    private Lesson lesson[];

    public Course(int id, int numLessons, String name, String difficulty, String description, Lesson[] lesson) {
        this.id = id;
        this.numLessons = numLessons;
        this.name = name;
        this.difficulty = difficulty;
        this.description = description;
        this.lesson = lesson;
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
    
    public int getnumLessons() {
        return numLessons;
    }
    
    public void setnumLessons(int numLessons) {
        this.numLessons = numLessons;
    }
    
    public String getDifficulty() {
        return difficulty;
    }
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    public Lesson[] getLesson() {
        return lesson;
    }

    public void setLesson(Lesson[] lesson) {
        this.lesson = lesson;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }   
    
}
