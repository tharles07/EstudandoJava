/*Crie uma calculadora  de IMC que mostra em que  classificação a pessoa está:
 * 
 * 
 * Menor que 18,5  -> Magreza
 * Entre 18,5 e 24,9 -> Normal
 * Entre 25 e 29,9 -> SobrePeso
 * Entre 30 e 39,9 -> Obesidade
 * Maior que 40 -> Obesidade Grave
 *  
 * IMC = peso / altura * altura
 */

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // abrir o scanner !!
        Scanner scanner = new Scanner(System.in);

        //oque o usuario vai digitar na tela !
        System.out.println(" Digite seu Peso e Altura:");


        // atribuir as variaveis 
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();


        //fazer o calculo das variaveis 
        double imc = peso / (altura * altura);

        // aplicar as consdiçoes 
        if (imc < 18.5)
            System.out.println("Magreza!");
        else if (imc >= 18.5 && imc <= 24.9)
            System.out.println("Normal! ");
        else if (imc >= 25 && imc <= 29.9)
            System.out.println("SobrePeso!");
        else if (imc >= 30 && imc <= 39.9)
            System.out.println("Obesidade!");
        else
            System.out.println("Obesidade Grave!");

        // nao esquecer de fechar o scanner !    
        scanner.close();

        

    }

}