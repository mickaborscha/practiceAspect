package com.mickaborscha.interfaces;

/**
 * Created by Oleg on 2/24/2017.
 */
public interface AspectInvoker {

    void testData();
    String testDataReturnValue();
    void testDataExeption() throws Exception;
    void testDataAround(String data);

}
