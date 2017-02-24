package com.mickaborscha.interfaces.Impl;

import com.mickaborscha.interfaces.AspectInvoker;

/**
 * Created by Oleg on 2/24/2017.
 */

public class AspectInvokerImpl implements AspectInvoker {

    public void testData() {
        System.out.println("Invoke testData() method");
    }

    public String testDataReturnValue() {
        System.out.println("Invoke testDataReturnValue method");
        return "return value";
    }

    public void testDataExeption() throws Exception{

        System.out.println("Invoke testDataExeprion method");
        throw new Exception("throwing Exeption");
    }

    public void testDataAround(String data) {
        System.out.println("Invoke testDataAround method with argument " + data);
    }
}
