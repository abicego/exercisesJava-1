// A used car dealership pays its sales employees a fixed salary
// per month, plus a fixed commission for each car sold plus 5% of the value
// of the sales made by him. Read the number of cars sold by him, the total value of
// his sales, his fixed salary and the amount he receives per car sold. calculate and display
// the seller's final salary.

import javax.swing.JOptionPane;

public class Exercicio11{
    public static void main(String[] args) {
    
    // Fazer os componentes do salário final

    int numeroCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos: "));
    double precoCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto custa cada carro: "));
    double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto ganha na venda de cada carro: "));
    double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário Fixo: "));

    double comissao = (numeroCarros* valorCarro) + ((numeroCarros * precoCarro) * 0.05);
    double salarioFinal = salarioFixo + comissao;


    // Somar Componentes do Salário Final   

    String msg= String.format("%.1f", salarioFinal);
    
    System.out.print("O salário final é de: R$" + msg);


    }

}