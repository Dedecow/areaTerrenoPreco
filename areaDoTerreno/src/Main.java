import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double lateralTerreno, frenteTerreno, areaTerreno, valorMetro2, valorTerreno;
// alguns programadores podem declarar a variável e receber o valor ao mesmo tempo,
// ficaria por exemplo Double larguraTerreno = sc.nextDouble().

        System.out.println("Vou precisar de três informações: ");
        System.out.printf("Qual a largura do terreno (lateral)? ");
        lateralTerreno = sc.nextDouble();
        System.out.printf("Qual o comprimento do terreno (frente)? ");
        frenteTerreno = sc.nextDouble();
        System.out.printf("Qual o valor do metro quadrado na região? ");
        valorMetro2 = sc.nextDouble();
        // tive problema com a fórmula, embora seja bem clara e simples, quando
        // aceitei o autocompletar acabei colocando uma variável errada, observei pelo valor da saída que era estranho.
        // também achei estranha a saída do valor do terreno, neste caso estava certa,
        //  coloquei as variaveis frente e lado no valor unitário. A conta bateu =)
        areaTerreno = lateralTerreno * frenteTerreno;
        valorTerreno = areaTerreno * valorMetro2;

        System.out.printf("A área encontrada foi de = %.2f ", areaTerreno);
        System.out.print("metros quadrados ");
        System.out.printf("e o terreno pode ser comprado até o valor de = %.2f ", valorTerreno);
        System.out.print("reais ");
// tive um erro aqui que foi esquecer de trocar o + pela vírgula ao concatenar, resolvi olhando codigos anteriores

        sc.close();

    }
}