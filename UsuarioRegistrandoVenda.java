import java.util.Scanner;


public class UsuarioRegistrandoVenda {


    public static void main(String[] args) {
        int numero = 0;
        Vendedor vendedor;
        Produto produto;
        Venda venda;

        Scanner leitor = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("><><><><><><><><><><><><><><><><><><");
                System.out.println(">           MENU                   <");
                System.out.println("> [1] CADASTRAR UM VENDEDOR        <");
                System.out.println("> [2] REGISTRAR UMA VENDA          <");
                System.out.println("> [3] EXIBIR RESUMO DE UMA VENDA   <");
                System.out.println("> [4] PARA FINALIZAR O PROGRAMA    <");
                System.out.println("><><><><><><><><><><><><><><><><><><\n");
                numero = leitor.nextInt();

                if (numero == 1) {
                    vendedor = new Vendedor();
                    System.out.println("Nome do venderdor: ");
                    vendedor.setNome(leitor.nextLine());
                    System.out.println();

                    System.out.println("Código do vendedor: ");
                    vendedor.setCodigo(leitor.nextInt());


                    System.out.println("Endereço do vendedor: ");
                    vendedor.setEndereco(leitor.nextLine());
                    System.out.println();

                } else if (numero == 2) {

                    venda = new Venda();
                    System.out.println("Código do produto: ");
                    produto.setCodigo(leitor.nextInt());

                    System.out.println("Descrição do produto: ");
                    produto.setDescricao(leitor.nextLine());

                    System.out.println("Valor de venda do produto R$");
                    venda.setValor(leitor.nextFloat());

                    System.out.println("Valor de custo do produto R$");
                    produto.setValorCusto(leitor.nextFloat());

                    System.out.println("O produto está em promoção? [S para SIM / N para NÃO]: "); // 20%
                    produto.setPromocao(Boolean.parseBoolean(leitor.nextLine()));

                    String S = null;
                    String N = null;
                    if (S.equalsIgnoreCase("S")) {
                        produto.setValorVenda(produto.getValorVenda() * 20 / 100);
                        produto.setPromocao(true);
                    } else if (N.equalsIgnoreCase("N")) {
                        produto.setPromocao(false);
                    }

                    System.out.println("Quantidade de itens: ");
                    venda.setQuantidadeItens(leitor.nextInt());


                    venda.setVendedor(vendedor);
                    venda.setProduto(produto);
                    venda.efetuarDesconto();
                    venda.calcularComissao();
                    venda.calcularValor();


                } else if (numero == 3) {
                    System.out.println("Resumo de venda: " + venda);

                } else if (numero == 4) {
                    System.out.println("Finalizando...");
                }

            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
            e.printStackTrace();
        }
    }
}