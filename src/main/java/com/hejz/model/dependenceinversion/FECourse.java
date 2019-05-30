package com.hejz.model.dependenceinversion;

/**
 * create by hejz on 2019/5/24
 **/
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
