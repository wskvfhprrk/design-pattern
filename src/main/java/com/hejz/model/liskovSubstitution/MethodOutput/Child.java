package com.hejz.model.liskovSubstitution.MethodOutput;

import java.util.HashMap;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/12 8:43
 */
public class Child extends Base {

    public HashMap create(){

        System.out.println("调子类方法");
        return null;
    }
}
