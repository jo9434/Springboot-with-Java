package com.spring.product;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;

    @SuppressWarnings("All")
    public Product() {}

    @SuppressWarnings("All")
    public Product(int productId, String productName, double productPrice)
    {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    @SuppressWarnings("All")
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    @SuppressWarnings("All")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @SuppressWarnings("All")
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @SuppressWarnings("All")
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
