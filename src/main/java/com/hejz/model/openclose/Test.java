package com.hejz.model.openclose;

/**
 * create by hejz on 2019/5/24
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(1, "java从0到企业级开发", 348d);
        System.out.println("课程Id:" + course.getId() + ",课程名称：" + course.getName() + ",课程价格："
                + course.getPrice() + "元，原价格：" + ((JavaDiscountCourse) course).getOriginPrice() + "元");
    }
}
