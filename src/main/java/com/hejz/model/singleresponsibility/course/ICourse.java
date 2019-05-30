package com.hejz.model.singleresponsibility.course;

/**
 * create by hejz on 2019/5/30
 **/
public interface ICourse {
    //课程内容——职责一
    String getCourseName();
    Byte[] getCourseVideo();
    //课程管理——职责二
    void studyCourse();
    void refundCourse();
}
