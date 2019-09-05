package com.hejz.model.liskovSubstitution.MethodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/12 8:32
 */
public class Child extends Base {

//    @Override
//    public void create(HashMap hashMap) {
//        super.create(hashMap);
//    }

    public void create(Map map) {
        System.out.println("子类方法");
    }
}
