package com.pluralsight;

public class Products {
private String sku;
private String productName;
private double Price;
private String department;
private String reset = "\u001B[0m";
private String red = "\u001B[0;31m";
private String green = "\u001B[0;32m";
private String blue = "\u001B[0;34m";

    public Products(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        Price = price;
        this.department = department;
        this.reset = reset;
        this.green = green;
        this.red = red;
        this.blue = blue;
    }


    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format(green + "SKU: %-7s" +reset + green + "Productname: %-35s" + green + "Price: $%-7.2f" + reset + green + "Department: %s" + reset, getSku(), getProductName(), getPrice(), getDepartment());
//        return "com.pluralsight.Products{" +
//                "sku='" + sku + '\'' +
//                ", productName='" + productName + '\'' +
//                ", Price=" + Price +
//                ", department='" + department + '\'' +
//                '}';
    }
}
