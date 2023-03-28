package exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String caracters = leitor.next();
        String novoCaracters = "";

        for (int i = caracters.length() - 1; i >= 0; i--){
            novoCaracters = novoCaracters + Character.toString(caracters.charAt(i));
        }

        System.out.println(novoCaracters);

        /* usando a função rever
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println(fraseInvertida);*/
    }
}
