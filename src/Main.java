import br.com.lucianoneves.calcularetencoes.colaborador.Colaborador;
import br.com.lucianoneves.calcularetencoes.retencoes.Inss;
import br.com.lucianoneves.calcularetencoes.retencoes.Irrf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();
        Inss inss = new Inss();
        Irrf irrf = new Irrf();

        System.out.println("\n#############################################################\n");
        System.out.println("Digite o nome do colaborador: ");
        colaborador.setNomeDoColaborador(leitura.nextLine());
        System.out.println("Digite o salário bruto do colaborador: ");
        colaborador.setSalarioBruto(leitura.nextFloat());
        System.out.println("\n#############################################################\n");
        System.out.println("Olá, " + colaborador.getNomeDoColaborador() + ", seguem dados solicitados: \n");
        System.out.println("Salário Bruto: %.2f".formatted(colaborador.getSalarioBruto()));
        inss.setBaseDeCalculoInss(colaborador.getSalarioBruto());
        System.out.println("(-) INSS: %.2f".formatted(inss.valorInssRetido()));
        inss.calculaInss();
        irrf.setBaseDeCalculoIrrf(inss.getBaseDeCalculoInss());
        System.out.println("(-) IRRF: %.2f".formatted(irrf.valorIrrfRetido()));
        irrf.calculaIrrf();
        System.out.println("Salário Líquido: %.2f".formatted(irrf.getBaseDeCalculoIrrf()));
        System.out.println("\n#############################################################\n");
    }
}
