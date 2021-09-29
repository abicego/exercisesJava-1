// Read an employee's current monthly salary and readjustment percentage. 
// Calculate and display the value of the new salary

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
    String salarioT, reajusteT;
    double salarioN, reajusteN, novoSalario;

    //Ler o salário atual / passar para numero
    salarioT = JOptionPane.showInputDialog("Digite aqui o salário: "); 
    salarioN = Double.parseDouble(salarioT); 
    
    // Ler o percentual de reajuste / passar para numero
    reajusteT = JOptionPane.showInputDialog("Digite aqui o reajuste: "); 
    reajusteN = Double.parseDouble(reajusteT); 

    //Calcular novo salário e Exibir
    novoSalario = salarioN + (salarioN * (reajusteN/100));
    System.out.println("O salário final com reaguste é de: " + novoSalario);
        
    }    
}
