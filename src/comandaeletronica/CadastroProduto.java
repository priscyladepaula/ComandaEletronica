/*
 * A classe gera o cadastro dos produtos com o código, descrição, preço, também registra a quantidade de 
 * vezes que o produto foi consumido na comanda.
 */
package comandaeletronica;

/**
 *
 * @author priscyla.poliveira
 */
public class CadastroProduto {
    
    private int codigo, qtd, comanda;
    private float preco;
    private String descricao;

    
    public CadastroProduto(int codigo, float preco, int qtd, String descricao){
        this.qtd = qtd;
        this.preco = preco;
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    //método para múltiplicar o preço com a quantidade de vezes que comprou
    public float conta(float preco, int qtd){
        float conta = preco * qtd;
        return conta;
    }
    
    public String mostrarCompra(){
        return "Código: " + getCodigo() + "\nNome do Produto: " 
                + getDescricao() + "\nPreço: R$" + getPreco() 
                + "\nQuantidade: " + getQtd() + "\nTotal: R$"+ conta(getPreco(), getQtd()) + "\n";
    }
    
    //getters e setters
    public int getCodigo(){
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the comanda
     */
    public int getComanda() {
        return comanda;
    }

    /**
     * @param comanda the comanda to set
     */
    public void setComanda(int comanda) {
        this.comanda = comanda;
    }
}
