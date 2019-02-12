package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    
    public static void main(String... args) {
        List<String> list = Arrays.asList("Albert", "Bobby", "Cloyd");
        Collections.reverse(list);
        
        list.forEach(s -> System.out.println(s));
    }
}
