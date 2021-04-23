package ongoingcourses;

import course.Course;
//import java.lang.String;

public class OngoingCourses{
    private Course ongoing;// = new Course(course.getId(), course.getnumLessons(), course.getName(), course.getDifficulty(), course.getDescription(), course.getLesson());
    private int watched, solved, id;
    private String name;

    public OngoingCourses(int iden, String nome, int assistidas, int feito){
        this.id = iden;
        this.name = nome;
        this.watched = assistidas;
        this.solved = feito;
    }

    public void setOngoingCourse(Course indo){
        this.ongoing = indo;
    }

    public Course getOngoingCourse(){
        return ongoing;
    }

    public void oneMoreWatchedLesson(){
        this.watched = this.watched + 1;
    }

    public int getWatchedLessons(){
        return watched;
    }

    public void oneMoreSolvedExercise(){
        this.solved = this.solved + 1;
    }

    public int getSolvedExercises(){
        return solved;
    }
}