package com.hejz.model.compositionaggergation;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/13 8:44
 */
public class MysqlConnection extends DbConnection {
    @Override
    public String getConnection() {
        return "mysql数据连接";
    }
}
