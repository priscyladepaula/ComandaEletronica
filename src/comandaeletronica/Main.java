/*
 * O cliente usa uma comanda eletrônica durante suas compras na padaria. A cada produto consumido, o atendente
 * registra em sua comanda (Que possui uma numeração) o produto e a quantidade.

 * Ao passar no caixa na saída da padaria, o caixa lê os gastos da comanda, finalizando a compra. Na leitura da
 * comanda, verifica-se o valor unitário de cada produto a fim de calcular o valor total da compra.

 * Implemente o sistema de comanda eletrônica com as seguintes funcionalidades:
 * - Cadastrar produto (código, descrição e preço unitário)
 * - Registrar produto na comanda(produto e quantidade)
 * - Finalizar compra (apresentar os dados dos produtos consumidos e o valor total da compra)

 */
package comandaeletronica;

//import java.util.ArrayList;

/**
 *
 * @author priscyla.poliveira
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        AddProduto add = new AddProduto();
        add.addProduto();
        add.mostrarProduto();
        add.totalCompras();
    }
    
}
