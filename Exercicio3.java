// Calculate the commission payment for parts sellers, taking into account
// that your commission will be 5% of the total sale and that you have the following data:
// unit price of the part and quantity sold.

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args){
        String precoTexto, quantidadeVendidaTexto;
        double precoNumero, quantidadeVendidaNumero, totalVenda, comissao;

        //1o: Ler o preço da peça e a quantidade vendida
        precoTexto = JOptionPane.showInputDialog("Digite o preço unitário da peça: ");
        quantidadeVendidaTexto = JOptionPane.showInputDialog("Digite a quantidade vendida:");

        precoNumero = Double.parseDouble (precoTexto);
        quantidadeVendidaNumero =  Double.parseDouble (quantidadeVendidaTexto);

        //2o: Calcular o total da venda
        totalVenda = (precoNumero * quantidadeVendidaNumero);

        //3o: Calcular a comissão de 5% sobre o total da venda
        comissao = (0.05 * totalVenda);

        //4o: mostrar o resultado
        System.out.println(comissao);
    }   
}
