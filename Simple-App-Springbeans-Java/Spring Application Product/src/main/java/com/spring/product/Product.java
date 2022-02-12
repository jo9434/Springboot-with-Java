package com.spring.product;

@SuppressWarnings("All") // It helps to suppress any code warnings which occur...
public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    
    public Product() {}
    
    // @SuppressWarnings("All") and can be done in this way also for individual warnings which suppresses the warnings for constructor Product(with variables)...
    public Product(int productId, String productName, double productPrice)
    {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public static void addProduct(int productId, String productName, double productPrice)
    {
        int n = 3;
        int i=0;
        String [] products = new String[n];
        
        for(int j=0; j<n; j++)
        {
            products[j] = productId+" "+productName+" Rs. "+productPrice;
        }

        if(i<n)
        {
            i++;
            System.out.println("\n"+i+" Product Added Successfully!"+"\n\nDisplaying Invoice...\n----------------------\nFinal Bill\n==========\n"+products[i]);
        }
    }
}
