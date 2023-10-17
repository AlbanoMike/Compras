package App;

import Entidades.Cliente;
import Entidades.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double total = 0.0;
        List<Order> pedidos = new ArrayList<>();
        Cliente cliente = new Cliente();

        System.out.println("Qual seu nome ?");
        cliente.setName(sc.nextLine());
        System.out.println("Qual seu Email ?");
        cliente.setEmail(sc.nextLine());
        System.out.println("Quantos Produtos você quer cadastrar ?");
        Integer quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            pedidos.add(i,new Order());
            System.out.println("Qual o " + (i+1) + "° Produto ?" );
            String prod = sc.nextLine();
            pedidos.get(i).getOrder().getProduto().setName(prod);
            //sc.nextLine();
            System.out.println("Qual o Preço ?");
            Double prec = sc.nextDouble();
            pedidos.get(i).getOrder().getProduto().setPrice(prec);
            System.out.println("Quantos deles ?");
            Integer quant = sc.nextInt();
            pedidos.get(i).getOrder().setQuantity(quant);
            sc.nextLine();
        }

        System.out.println(cliente.toString());
       for (Order p: pedidos) {
            System.out.println(p +", SubTotal: "+ p.getOrder().SubTotal(p.getOrder()
                    .getQuantity(),p.getOrder().getProduto().getPrice()));
            total +=  p.getOrder().SubTotal(p.getOrder().getQuantity(),p.getOrder().getProduto().getPrice());
       }
        System.out.println(" Total R$: "+ total);

    sc.close();
    }
}