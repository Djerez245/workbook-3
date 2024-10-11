package com.pluralsight;

public class Products {
String sku;
String productName;
double Price;
String department;

    public Products(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        Price = price;
        this.department = department;
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
        return String.format("SKU: %-7s  Productname: %-35s   Price: $%-7.2f    Department: %s", getSku(), getProductName(), getPrice(), getDepartment());
//        return "com.pluralsight.Products{" +
//                "sku='" + sku + '\'' +
//                ", productName='" + productName + '\'' +
//                ", Price=" + Price +
//                ", department='" + department + '\'' +
//                '}';
    }
}
