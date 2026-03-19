package poo.etiqueta.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){}
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" $ ").append(getPrice());
        return sb.toString();
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
