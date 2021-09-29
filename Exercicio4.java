//Read an integer value and display its predecessor

import javax.swing.JOptionPane;

public class Exercicio4{
    public static void main(String[] args) {
    String numeroTexto;
    int numero;
    
    // Digitar Numero Inteiro
    numeroTexto= JOptionPane.showInputDialog("Digite um número inteiro");

    // Armazenar Numero Inteiro

    numero = Integer.parseInt(numeroTexto);

    // Calculo do antecessor

    numero = (numero - 1);

    // Mostrar Resultado
    System.out.println(numero);

    }
}
