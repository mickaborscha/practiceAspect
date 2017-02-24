package com.mickaborscha.Main;

import com.mickaborscha.interfaces.AspectInvoker;
import com.mickaborscha.interfaces.Impl.AspectInvokerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg on 2/24/2017.
 */
public class Main {
    public static void main(String args[]) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AspectInvoker aspectInvoker = (AspectInvoker) context.getBean("invoker");
        aspectInvoker.testData();
          aspectInvoker.testDataAround("test");
         aspectInvoker.testDataReturnValue();

            aspectInvoker.testDataExeption();

    }

    }

