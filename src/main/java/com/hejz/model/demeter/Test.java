package com.hejz.model.demeter;

/**
 * create by hejz on 2019/5/31
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commonCheckNumber(teamLeader);
    }
}
