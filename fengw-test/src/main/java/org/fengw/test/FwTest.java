package org.fengw.test;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FwTest {

    public static void main(String[] args) {
        String jsonstr = "[{'day':'2017-2-22','status':'1'},{'day':'2017-2-16','status':'0'},{'day':'2017-2-25','status':'1'}]";
        JSONArray array = JSONArray.fromObject(jsonstr);
        List array2 = (ArrayList) JSONArray.toCollection(array, HashMap.class);
        System.out.println(array2);

        TestBean bean = new TestBean();
        bean.setName("A");
        bean.setAge(7);
        bean.setAa("aa1");
        bean.setBb(null);

        TestBean bean2 = new TestBean();
        bean2.setName("A");
        bean2.setAge(8);
        bean2.setBb("bb1");

        CompareObejct compare = new CompareObejct();
        compare.setCurrent(bean);
        compare.setOriginal(bean2);
        compare.contrastObj(TestBean.class);
        System.out.println(compare.getStatus());

    }
}
