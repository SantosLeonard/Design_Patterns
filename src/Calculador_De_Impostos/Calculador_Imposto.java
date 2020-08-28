package Calculador_De_Impostos;

public class Calculador_Imposto {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer){
        double icms = impostoQualquer.calcula(orcamento);
        System.out.println(icms);
    }
}
