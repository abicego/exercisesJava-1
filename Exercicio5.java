// Read the dimensions of a rectangle (base and height), calculate and write the rectangle area

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args){
    
    String baseT, alturaT;
    double baseN, alturaN, area;

    // Digitar Dimensões 
    baseT = JOptionPane.showInputDialog("Digite a base do retângulo:");
    alturaT = JOptionPane.showInputDialog("Digite a altura do retângulo:");
    
    //Salvar os dados
    baseN = Double.parseDouble(baseT);
    alturaN = Double.parseDouble(alturaT);

    // Fazer o Calculo
    area = (baseN * alturaN);

    // Mostrar o resultado
    System.out.println(area);

    }
}
