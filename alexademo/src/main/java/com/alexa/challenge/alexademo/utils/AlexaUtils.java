package com.alexa.challenge.alexademo.utils;

import com.alexa.challenge.alexademo.model.Request;
import com.alexa.challenge.alexademo.model.Slots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AlexaUtils {

    public static boolean isEmpty(String value) {
        return  value == null || value.equalsIgnoreCase("");
    }

    public static String getIntentName(Request request){
        return request != null && request.getIntent() != null && !isEmpty(request.getIntent().getName()) ? request.getIntent().getName() : "";

    }

    public static Slots getSlots(Request request){
        return request != null && request.getIntent() != null && request.getIntent().getSlots() != null ? request.getIntent().getSlots() : null;

    }
    public static void main(String[] args){
        List<String> stringList =  new ArrayList<>();
        stringList = Arrays.asList("alpha","baby","attention","dummy");
        Predicate<String> p = s -> s.startsWith("a");
        for (String list : stringList)
            if(p.test(list))
                System.out.println(list);

        stringList.parallelStream().forEach(System.out::println);
    }
}
