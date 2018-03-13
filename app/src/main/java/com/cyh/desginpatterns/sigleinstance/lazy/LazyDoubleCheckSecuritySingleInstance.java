package com.cyh.desginpatterns.sigleinstance.lazy;

/**
 * Created by yh on 18-3-13.
 */
public class LazyDoubleCheckSecuritySingleInstance {

    /*
     * NOTE: volatile
     */
    private static volatile LazyDoubleCheckSecuritySingleInstance mInstances;

    private LazyDoubleCheckSecuritySingleInstance() {
    }

    public static LazyDoubleCheckSecuritySingleInstance getInstance() {
        if (null == mInstances) {
            synchronized (LazyDoubleCheckSecuritySingleInstance.class) {
                if (null == mInstances) {
                    mInstances = new LazyDoubleCheckSecuritySingleInstance();
                }
            }
        }
        return mInstances;
    }

}
