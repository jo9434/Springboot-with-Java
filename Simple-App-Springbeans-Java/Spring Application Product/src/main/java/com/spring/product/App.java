// This file is created by default.. and the other to class files are created by me. I will be uploading the video and create the same project and upload it here soon...

package com.spring.product;

/**
 * Hello world!
 *
 */

/*
**    After adding these import statements, you need to add and download these maven dependencies by right clicking on spring framework and click add maven dependency...
**
**    Note: 
**    When you create your first project, the IntelliJ App automatically intalls maven dependencies so when this appears always select always download maven dependencies
**    for the first time...
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ApplicationContext prodContext = new ClassPathXmlApplicationContext("Springbeans.xml"); // checkout the folder resources/Springbeans.xml

        Product prod1 = (Product) prodContext.getBean("product1");
        prod1.addProduct(prod1.getProductId(), prod1.getProductName(), prod1.getProductPrice());

        Product prod2 = (Product) prodContext.getBean("product2");
        prod2.addProduct(prod2.getProductId(), prod2.getProductName(), prod2.getProductPrice());

        Product prod3 = (Product) prodContext.getBean("product3");
        prod3.addProduct(prod3.getProductId(), prod3.getProductName(), prod3.getProductPrice());
    }


}
