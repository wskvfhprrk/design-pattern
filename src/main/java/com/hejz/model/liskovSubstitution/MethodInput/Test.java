package com.hejz.model.liskovSubstitution.MethodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/12 8:33
 */
public class Test {
    public static void main(String[] args) {
        Child child=new Child();
        HashMap hashMap=new HashMap();
        child.create(hashMap);
        Map map=new HashMap();
        child.create(map);
    }
}
