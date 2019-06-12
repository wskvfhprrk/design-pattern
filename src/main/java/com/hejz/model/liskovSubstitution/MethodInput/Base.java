package com.hejz.model.liskovSubstitution.MethodInput;

import java.util.HashMap;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/12 8:30
 */
public class Base {

    public void create(HashMap hashMap){
        System.out.println("调用父类方法");
    }
}
