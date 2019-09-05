package com.hejz.model.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * create by hejz on 2019/5/31
 **/
public class TeamLeader {
    //    public void checkNumberofCourse(List<Course> courseList){
//        System.out.println("在线课程数量："+courseList.size());
//    }
    public void checkNumberofCourse() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程数量：" + courses.size());
    }

}
