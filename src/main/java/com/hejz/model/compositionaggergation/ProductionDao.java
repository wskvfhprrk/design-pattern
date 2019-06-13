package com.hejz.model.compositionaggergation;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/13 8:38
 */
public class ProductionDao  {

    private DbConnection dbConnection;

    public void setDbConnection(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProcuction(){
        String conn=dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
