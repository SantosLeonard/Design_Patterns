package Calculador_De_Impostos;

public class Teste_Impostos {
    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        Calculador_Imposto calculador = new Calculador_Imposto();

        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);

    }
}
