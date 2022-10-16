public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeItens;
    private float valor;


    public void calcularValor() {
        if (produto.getvalorVenda() < produto.getValorCusto()) {
            System.out.println("O valor do produto é maior que o valor de custo.");
        } else {
            valor = produto.getValorVenda() * quantidadeItens;
        }
    }


    public void calcularComissao() {
        if (produto.isPromocao()){
            System.out.println("A comissão do vendedor foi: " + ((valor * vendedor.getComissao() / 100)) / 2);
        } else {
            System.out.println("A comissão do vendedor foi: " + (valor * vendedor.getComissao() / 100));
        }
    }

    private boolean getPromocao() {
        return false;
    }


    public void efetuarDesconto(float desconto) {
        produto.setValorVenda(produto.getValorVenda() * desconto / 100);
    }



    public void imprimir() {
        System.out.println("> VENDEDOR <");
        System.out.println("Código: " + this.vendedor.getCodigo());
        System.out.println("Nome: " + this.vendedor.getNome());


        System.out.println("> PRODUTO <");
        System.out.println("Código: " + this.produto.getCodigo());
        System.out.println("Descrição: " + this.produto.getDescricao());
        System.out.println("Valor da venda: R$" + this.produto.getvalorVenda());
        System.out.println("Produto em promção " + (this.produto.getPromocao() ? "SIM" : "NÃO"));
        System.out.println("Valor do desconto R$" + this.desconto);

        System.out.println("> VENDA <");
        System.out.println("Quantidade de itens vendidos: " + this.quantidadeItens);
        System.out.println("Valor total R$" + this.valor);

    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto =  desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
