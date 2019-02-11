package com.lee;


import org.junit.Test;

public class BuilderTest {

    @Test
    public void test(){
        Human human = new ManBuilder().buildHead().buildBody().buildHand().buildFoot().build();
        System.out.println(human);
    }

}