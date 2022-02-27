package com.white.mp;

import com.white.mp.domain.Activity;

import java.util.ArrayList;
import java.util.List;

public class ArrTest {

    public static void main(String[] args) {

        List<Activity> list = new ArrayList<>();

        list.add(new Activity() {{
            setId(1l);
            setActivityName("name1");
            setParentId("0");
        }});
        list.add(new Activity() {{
            setId(3l);
            setActivityName("name1");
            setParentId("0");
        }});
        list.add(new Activity() {{
            setId(5l);
            setActivityName("name1");
            setParentId("0");
        }});
        System.out.println(list);
        list.add(1, new Activity() {{
            setActivityName("wangsan");
        }});
        list.indexOf("");
    }
}
