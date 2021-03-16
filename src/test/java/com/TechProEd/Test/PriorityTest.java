package com.TechProEd.Test;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test (priority = 0)
    public void priority1() {
        System.out.println("google");
    }
    @Test(priority = -1)
    public void priority2(){
        System.out.println("amazon");







    }


}
