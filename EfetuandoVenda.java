public class EfetuandoVenda {

    public static void main(String[] args) {

        System.out.println(" > VENDA 01 <");
        Produto produtoSemPromocao = new Produto(011, "leite", 7.00f, 3.00f, false);
        Vendedor vendedor01 = new Vendedor("José", 1, 6.00f, "Avenida 27");

        Venda venda01 = new Venda();
        venda01.setProduto(produtoSemPromocao);
        venda01.setVendedor(vendedor01);
        venda01.setQuantidadeItens(2);
        venda01.calcularValor();
        venda01.calcularComissao();
        venda01.imprimir();


        System.out.println(" > VENDA 02 <");
        Produto produtoComPromocao = new Produto(012, "Óculos x", 100.00f, 80.00f, true);
        Vendedor vendedor02 = new Vendedor("Fátima", 2, 10.00f, "Rua 6");

        Venda venda02 = new Venda();
        venda02.setProduto(produtoComPromocao);
        venda02.setVendedor(vendedor02);
        venda02.efetuarDesconto(0.1f);
        venda02.setQuantidadeItens(3);
        venda02.calcularValor();
        venda02.calcularComissao();
        venda02.imprimir();


        System.out.println("> VENDA 03 <");
        Venda venda03 = new Venda();
        venda03.setProduto(produtoComPromocao);
        venda03.setVendedor(vendedor02);
        venda03.efetuarDesconto(0.3f);
        venda03.setQuantidadeItens(2);
        venda03.calcularValor();
        venda03.calcularComissao();
        venda03.imprimir();

    }
}
