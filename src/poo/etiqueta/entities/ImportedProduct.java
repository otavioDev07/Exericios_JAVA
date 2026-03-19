package poo.etiqueta.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    private Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(" $ ").append(totalPrice()).append(" ");
        sb.append("(Customs fee: $ ").append(getCustomsFee()).append(")\n");

        return sb.toString();
    }
}
