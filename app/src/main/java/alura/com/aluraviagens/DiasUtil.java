package alura.com.aluraviagens;

import android.support.annotation.NonNull;

public class DiasUtil {

    @NonNull
    public static String formataEmTexto(int quantidadeDeDias) {

        if(quantidadeDeDias > 1){
            return quantidadeDeDias + " dias";
        }
        return quantidadeDeDias + " dia";
    }


}
