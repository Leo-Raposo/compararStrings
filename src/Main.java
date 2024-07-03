import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidarLetras validar = new ValidarLetras();
        boolean validarEntrada = false;

        while (!validarEntrada) {
            try {
                System.out.print("Digite a 1ª Palavra: ");
                String palavra1 = sc.nextLine().toUpperCase();

                System.out.print("Digite a 2ª Palavra: ");
                String palavra2 = sc.nextLine().toUpperCase();

                validar.setPalavra1(palavra1);
                validar.setPalavra2(palavra2);

                validarEntrada = validar.compararLetra();

                if (validarEntrada) {
                    System.out.println("As duas letras são iguais");
                } else {
                    System.out.println("As duas letras são diferentes.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
