package com.cyh.desginpatterns.sigleinstance.hunger;

/**
 * Created by yh on 18-3-13.
 */

public class HungerSecuritySingleInstance {

    private static HungerSecuritySingleInstance mInstance = new HungerSecuritySingleInstance();

    private HungerSecuritySingleInstance() {
    }

    public static HungerSecuritySingleInstance getInstance() {
        return mInstance;
    }

}
