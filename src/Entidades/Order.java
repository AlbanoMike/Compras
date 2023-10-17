package Entidades;

public class Order {

    private OrdemIntem order = new OrdemIntem();


    public Order() {
    }


    public OrdemIntem getOrder() {
        return order;
    }

    public void setOrder(OrdemIntem order) {
        this.order = order;
    }


    @Override
    public String toString() {
        return  " Produto: " +order.getProduto().getName()+" Valor R$: "+order.getProduto().getPrice()+" Quantidade: "
                +order.getQuantity();
    }

    public double Total(Integer quantidade){
        Double total =0.0;
        for (int i = 0; i < quantidade; i++) {
            total += this.order.getProduto().DoubleSubTotal(this.order.getProduto().getPrice(), this.order.getQuantity());
        }
        return total;
    };
}
