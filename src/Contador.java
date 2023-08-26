import Exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int primeiroNumero = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int segundoNumero = terminal.nextInt();

            contar(primeiroNumero, segundoNumero);
        }
        catch (InputMismatchException e){
            System.out.println("Valor de entrada deve ser um número inteiro!");
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }
    static void contar(int primeiroNumero, int segundoNumero ) throws DomainException {

        if (primeiroNumero >= segundoNumero) throw DomainException.parametrosInvalidos();

        int contagem = segundoNumero - primeiroNumero;

        for (int i = 1; i <= contagem; i++) System.out.println("Imprimindo o número " + i);
    }

}
