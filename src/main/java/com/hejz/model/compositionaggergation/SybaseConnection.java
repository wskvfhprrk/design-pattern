package com.hejz.model.compositionaggergation;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/13 8:45
 */
public class SybaseConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "sybase数据连接";
    }
}
