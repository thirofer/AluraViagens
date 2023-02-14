package alura.com.aluraviagens;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static String formataParaBrasileiro(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat
                .getCurrencyInstance(
                        new Locale("pt", "br"));
        String moedaBrasileira = formatoBrasileiro
                .format(valor)
                .replace("R$", "R$ ");
        return moedaBrasileira;
    }

}
