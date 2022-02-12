package com.spring.product;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ApplicationContext prodContext = new ClassPathXmlApplicationContext("Springbeans.xml");

        Product prod1 = (Product) prodContext.getBean("product1");
        prod1.addProduct(prod1.getProductId(), prod1.getProductName(), prod1.getProductPrice());

        Product prod2 = (Product) prodContext.getBean("product2");
        prod2.addProduct(prod2.getProductId(), prod2.getProductName(), prod2.getProductPrice());

        Product prod3 = (Product) prodContext.getBean("product3");
        prod3.addProduct(prod3.getProductId(), prod3.getProductName(), prod3.getProductPrice());
    }


}
