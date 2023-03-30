package com.vti.frontend;

public class DemoGeneric {
    public static void main(String[] args) {
        DemoGeneric demoGeneric = new DemoGeneric();
    }

}
 class Test<T>{
    private T id;
    private String name;
    public T getId(){
        return id;
    }
 }