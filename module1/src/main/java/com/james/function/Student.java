package com.james.function;

public class Student {
    private String name;
    private Integer age;
    private String gender;

    public String study(){
        System.out.println("my name is "+name+" , and I am"+age+" years old!");
        return "hello";
    }
}
