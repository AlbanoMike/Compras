package Entidades;

import java.security.PrivateKey;

public class OrdemIntem {

    private Integer Quantity;
    private Produto Produto = new Produto("",0.0);

    public OrdemIntem() {

    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Entidades.Produto getProduto() {
        return Produto;
    }

    public void setProduto(Entidades.Produto produto) {
        this.Produto = produto;
    }

    public Double SubTotal(Integer quantitity, Double price){
        return  this.Produto.getPrice()*this.Quantity;
    }


}
