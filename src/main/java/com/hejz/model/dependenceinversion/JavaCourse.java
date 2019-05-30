package com.hejz.model.dependenceinversion;

/**
 * create by hejz on 2019/5/24
 **/
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}
