package com.hejz.model.liskovSubstitution.MethodOutput;

import java.util.Map;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/12 8:41
 */
public class Base {

    public Map create() {
        System.out.println("调父类方法");
        return null;
    }

}
