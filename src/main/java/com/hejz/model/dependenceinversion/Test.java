package com.hejz.model.dependenceinversion;

/**
 * create by hejz on 2019/5/24
 **/
public class Test {
    //    public static void main(String[] args) {
//        Geely geely=new Geely();
//        geely.studyFECourse();
//    }
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());
//        geely.studyCourse(new PythonCourse());
//    }
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setCourse(new JavaCourse());
        geely.studyCourse();
        geely.setCourse(new FECourse());
        geely.studyCourse();
    }

}
