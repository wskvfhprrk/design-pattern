package com.hejz.model.singleresponsibility;

/**
 * create by hejz on 2019/5/30
 **/
public class Test {
    public static void main(String[] args) {
//        Bird bird=new Bird();
//        bird.mainMoveModel("大雁");
//        bird.mainMoveModel("驼鸟");
//        //如果再加入其它的鸟类就不行了

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveModel("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveModel("驼鸟");
        walkBird.mainMoveModel("企鹅");
    }
}
