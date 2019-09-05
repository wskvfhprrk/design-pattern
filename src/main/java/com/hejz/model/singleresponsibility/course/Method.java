package com.hejz.model.singleresponsibility.course;

/**
 * create by hejz on 2019/5/30
 **/
public class Method {

    public void updateUserInfo(String username, String address) {
        // TODO: 2019/5/30 更新username
        //TODO 更新address
        //不符合单一职责，应改为如下方式
    }

    public void updateUsername(String username) {
        // TODO: 2019/5/30 更新username
    }

    public void updateAddress(String address) {
        // TODO: 2019/5/30 更新address
    }

    public void todo(Boolean b) {
        //违反了单一职责原则
        if (b) {
            // TODO: 2019/5/30 一件事
        } else {
            // TODO: 2019/5/30 另一件事
        }
    }
}
