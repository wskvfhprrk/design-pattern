package com.hejz.model.singleresponsibility;

/**
 * create by hejz on 2019/5/30
 **/
public class Bird {
    public void mainMoveModel(String birdName) {
        if ("驼鸟".equals(birdName)) {
            System.out.println("用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
