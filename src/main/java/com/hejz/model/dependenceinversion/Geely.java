package com.hejz.model.dependenceinversion;

/**
 * create by hejz on 2019/5/24
 **/
public class Geely {
    private ICourse course;

    public Geely() {
    }

//    public Geely(ICourse course) {
//        this.course = course;
//    }


    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyCourse() {
        course.studyCourse();
    }
}
