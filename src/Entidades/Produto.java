package Entidades;

public class Produto {

    private String Name;
    private Double Price;


    public Produto(String name, Double price) {
        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public double DoubleSubTotal(Double price, Integer quantidade){
        return price*quantidade;
    }


}
