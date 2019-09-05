package com.hejz.model.compositionaggergation;

/**
 * @Auther: hejz
 * @Description:
 * @Date: 2019/6/13 8:40
 */
public class Test {
    public static void main(String[] args) {
        ProductionDao productionDao = new ProductionDao();
        productionDao.setDbConnection(new SybaseConnection());
        productionDao.addProcuction();
    }
}
