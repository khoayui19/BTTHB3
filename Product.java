/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Product {
    private String description;
    private String productID;
    private double price;
    public Product() {
    }
    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public String getProductID() {
        return productID;
    }
    public double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", productID='" + productID + '\'' +
                ", price=" + price +
                '}';
    }
}
