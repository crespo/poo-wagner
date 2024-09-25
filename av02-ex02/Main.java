import models.Contribuinte;
import models.Fisico;

public class Main {
    public static void main(String[] args) {
        Contribuinte raul = new Fisico(123, "702.780.024-12", 100.00, 100.00);

        raul.setNome("raul");
        raul.setRendaBrutaAnual(20000);

        System.out.println(raul.fornecaImposto());
    }
}