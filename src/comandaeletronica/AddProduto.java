/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandaeletronica;

import java.util.ArrayList;

/**
 *
 * @author priscyla.poliveira
 */
public class AddProduto {
    ArrayList<CadastroProduto> listaProdutos = new ArrayList<>();
    
    //método para criar novo cadastro de produtos consumidos
    public void addProduto(){
        listaProdutos.add(new CadastroProduto(6, 3.25f, 5, "Pão francês"));
        listaProdutos.add(new CadastroProduto(3, 4.90f, 2, "Leite"));
        listaProdutos.add(new CadastroProduto(2, 1.20f, 7, "Pão de queijo"));
        listaProdutos.add(new CadastroProduto(5, 27.90f, 1, "Almoço"));
        listaProdutos.add(new CadastroProduto(1, 14.90f, 1, "X-Salada"));
        listaProdutos.add(new CadastroProduto(2, 6.90f, 1, "Suco de Laranja 0,5L"));
        listaProdutos.add(new CadastroProduto(8, 6.90f, 1, "Café médio"));
        listaProdutos.add(new CadastroProduto(9, 4.90f, 1, "Pão na chapa"));
        listaProdutos.add(new CadastroProduto(7, 3.50f, 1, "Coxinha"));
        listaProdutos.add(new CadastroProduto(10, 7.90f, 2, "Croissant"));
    }
    
    //método para mostrar a lista de produtos, quantidade e preços consumidos na comanda
    public void mostrarProduto(){
        listaProdutos.forEach((cad) -> {
            System.out.println(cad.mostrarCompra());
        });
    }
    
    //método a soma do total de todos os produtos consumidos
    public void totalCompras(){
        float soma = 0;
        
        for(CadastroProduto c : listaProdutos){
            soma += c.conta(c.getPreco(), c.getQtd());
        }
        System.out.println("Total a pagar: R$" + soma);
        
    }
}
