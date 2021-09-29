// The cost of a new car to the consumer is the sum of the factory cost and the
// percentage of distributor and taxes (applied to factory cost). supposing
// that the distributor percentage is 28% and taxes 45%, read the cost of
// factory of a car, calculate and write the final cost to the consumer.

import javax.swing.JOptionPane;

public class Exercicio10 {
   public static void main(String[] args) {
    String custoFabricaT;
    double custoFabricaN, carroNovo;

    // Ler Custo da Fábrica
    custoFabricaT=JOptionPane.showInputDialog("Digite o valor do custo da Fábrica:");
    custoFabricaN=Double.parseDouble(custoFabricaT);

    // Calcular preço do Carro Novo
    carroNovo = (custoFabricaN + (0.28 * custoFabricaN) + (0.45 * custoFabricaN));

    // Mostrar Resultado          
    System.out.println(carroNovo)    ;

    }  
}
