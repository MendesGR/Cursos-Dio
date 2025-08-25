import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);;
        String valorCompra = scan.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scan.close();
    }

    public static String calcularDesconto(String valorCompra){
        BigDecimal valor = new BigDecimal(valorCompra);

        BigDecimal limite1 = new BigDecimal("50.00");
        BigDecimal limite2 = new BigDecimal("100.00");

        if (valor.compareTo(limite1) < 0) {
            return "Desconto de 0%";
        } else if (valor.compareTo(limite1) >= 0 && valor.compareTo(limite2) <= 0) {
            return "Desconto de 10%";
        } else {
            return "Desconto de 20%";
        }
    }

}