package com.app.firm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        ApplicationContext bookContext = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println();
        Book bookDet1 = (Book) bookContext.getBean("book1");
        bookDet1.displayBookDetails();
        System.out.println();
        Book bookDet2 = (Book) bookContext.getBean("book2");
        bookDet2.displayBookDetails();
        System.out.println();
        Book bookDet3 = (Book) bookContext.getBean("book3");
        bookDet3.displayBookDetails();
    }
}
