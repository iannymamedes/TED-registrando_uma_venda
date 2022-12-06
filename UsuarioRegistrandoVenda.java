import java.util.InputMismatchException;
import java.util.Scanner;


public class UsuarioRegistrandoVenda {

    public static void menu() {
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println(">           MENU                   <");
        System.out.println("> [1] CADASTRAR UM VENDEDOR        <");
        System.out.println("> [2] REGISTRAR UMA VENDA          <");
        System.out.println("> [3] EXIBIR RESUMO DE UMA VENDA   <");
        System.out.println("> [4] PARA FINALIZAR O PROGRAMA    <");
        System.out.println("><><><><><><><><><><><><><><><><><><\n");
    }



    public static void main(String[] args) {
        int option = 0;
        Scanner leitor = new Scanner(System.in);
        Vendedor vendedor = new Vendedor("", 0, 0f, "");
        Produto produto = new Produto(0, "", 0f, 0f, false);
        Venda venda = new Venda();

        do {
            menu();
            try {
                option = leitor.nextInt();
                if (option == 1){
                    Scanner Cadastro = new Scanner(System.in);
                    String nome;
                    int codigo;
                    String endereco;

                    System.out.println("Nome do venderdor: ");
                    nome = Cadastro.nextLine();
                    nome = nome.toUpperCase();
                    System.out.println();

                    System.out.println("Código do vendedor: ");
                    codigo = Cadastro.nextInt();
                    System.out.println();


                    System.out.println("Endereço do vendedor: ");
                    endereco = Cadastro.nextLine();
                    endereco = endereco.toUpperCase();
                    System.out.println();

                    vendedor.setNome(nome);
                    vendedor.setCodigo(codigo);
                    vendedor.setEndereco(endereco);

                } else if (option == 2) {

                    Scanner Venda = new Scanner(System.in);
                    int codigo;
                    String descricao = null;
                    int qtdItens = 0;
                    float desconto = 0;
                    float valorVenda = 0;
                    float valorCusto = 0;
                    boolean promocao = false;
                    String aux;

                    System.out.println("Código do produto: ");
                    codigo = Venda.nextInt();
                    System.out.println();

                    System.out.println("Descrição do produto: ");
                    descricao = descricao.toUpperCase();
                    System.out.println();

                    System.out.println("Valor de venda do produto R$");
                    valorVenda = Venda.nextFloat();

                    System.out.println("Valor de custo do produto R$");
                    valorCusto = Venda.nextFloat();

                    System.out.println("O produto está em promoção? [S para SIM / N para NÃO]: "); // 20%
                    aux = Venda.next();
                    if (aux.equalsIgnoreCase("S")) {
                        desconto = valorVenda - ((valorVenda * 20) / 100);
                        promocao = true;
                    } else if (aux.equalsIgnoreCase("N")) {
                        promocao = false;
                    }
                    System.out.println();

                    System.out.println("Quantidade de itens: ");
                    qtdItens = Venda.nextInt();

                    produto.setCodigo(codigo);
                    produto.setDescricao(descricao);
                    produto.setValorVenda(valorVenda);
                    produto.setValorCusto(valorCusto);
                    produto.setPromocao(promocao);

                    venda.setVendedor(vendedor);
                    venda.setProduto(produto);
                    venda.setQuantidadeItens(qtdItens);
                    venda.setDesconto(desconto);

                } else if (option == 3) {
                    venda.calcularValor();
                    venda.imprimir();
                    System.out.println();

                } else if (option == 4) {
                    System.out.println("Finalizando...");

                } else {
                    System.out.println("Ecolha uma opção válida!");

                }
            }catch (InputMismatchException e){
                System.out.println("Atenção!!! Digite somente números");
                leitor.next();
            }catch (NullPointerException e){
                System.out.println("ATENÇÃO!!!\nErro na identificação dos dados da venda do produto.\nTente novamente em [2] REGISTRAR UMA VENDA");
            }catch (Exception e){
                System.out.println("ERRO");
            }


        }while (option != 4);
    }
}