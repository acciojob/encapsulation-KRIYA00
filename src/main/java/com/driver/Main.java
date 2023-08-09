package com.driver;


public class Main {
    public static void main(String[] args)
    {
        RWOnly ob = new RWOnly();
        ob.setVar(9);
        System.out.println(ob.getVar());
    }
  
}