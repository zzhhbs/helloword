package com.banyuan.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("CN","中国");
        map.put("JP","日本");
        map.put("USA","美国");

        System.out.println(map.size());
        String str= (String)map.get("CN");
        System.out.println(str);

        boolean cn = map.containsKey("CN");
        boolean c = map.containsValue("中国1");
        System.out.println(cn+"   "+c);

        map.remove("JP");
        String str1= (String)map.get("JP");
        System.out.println(str1);


        System.out.println("===========");
        Set set = map.keySet();  // 遍历先拿到set
        Iterator it = set.iterator();//   拿到迭代器对象    iterator
        //使用循环  判断是否有下一个值
        while(it.hasNext()){
            String key = (String)it.next();   //拿到key
            String s  = (String)map.get(key);
            System.out.println(s);
        }

        System.out.println("=========");
        Set keys = map.keySet();
        for(Object k:keys){
            String s  = (String)map.get(k);
            System.out.println(s);

        }


    }
}
