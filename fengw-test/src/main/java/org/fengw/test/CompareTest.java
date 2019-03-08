package org.fengw.test;

import java.util.Date;

public class CompareTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BDCommend obj1 = new BDCommend();
        obj1.setBzjlbh("1111");
        obj1.setHjrq(new Date());

        BDCommend obj2 = new BDCommend();
        obj2.setBzjlbh("1112");

        CompareObejct compare = new CompareObejct();
        compare.setCurrent(obj1);
        compare.setOriginal(obj2);
        compare.contrastObj(BDCommend.class);
        System.out.println(compare.getStatus());
    }
}
