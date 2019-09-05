package com.hejz.model.demeter;

/**
 * create by hejz on 2019/5/31
 **/
public class Boss {
    public void commonCheckNumber(TeamLeader teamLeader) {
        //根据迪米特原则——最少知道原则，Course不在其成员变量中，也不在方法的输入和输出变量中，所以不与boss建立关系
//        List<Course> courses=new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courses.add(new Course());
//        }
//        teamLeader.checkNumberofCourse(courses);
        teamLeader.checkNumberofCourse();
    }
}
