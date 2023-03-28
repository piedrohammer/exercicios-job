package exercicios;


import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String produto = "";
        Scanner scanproduto = new Scanner(System.in);
        int quant_produto = 0;
        double totalProd = 0;
        double precoUn = 0;
        double totalV = 0;

        System.out.print("CONTROLE DE VENDAS DE UMA LOJA DE ELETRODOMÉSTICOS\n");
        System.out.print("--------------------------------------------\n\n");

        System.out.println(" Digite Fim para terminar o lançamento.");

        while (!produto.equals("Fim")) {

            System.out.print("Digite o nome do produto: ");
            produto = scanproduto.nextLine();

            System.out.print("Informe o preço unitario:");
            precoUn = input.nextDouble();

            System.out.print("Informe a quantidade de produtos vendidos:");
            quant_produto = input.nextInt();

            System.out.println("Produto:" + produto);
            System.out.println("Preço unitário:" + precoUn);
            System.out.println("Quantidade vendida:" + quant_produto);
            totalProd = (quant_produto * precoUn);
            System.out.println("Valor total do produto:" + totalProd);

            // aqui falto somar o total
            totalV = totalV + totalProd;
        }


        System.out.println("R$ " + totalV);

        if (totalV <= 10000) {
            System.out.println("FATURAMENTO BAIXO");
        } else {
            System.out.println("FATURAMENTO ÓTIMO");
        }
    }
}