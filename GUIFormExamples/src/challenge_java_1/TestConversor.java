package challenge_java_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestConversor {

    public static void main(String[] args) {

        String conversores[] = {
            "Conversor de Moneda",
            "Conversor de temperatura"
        };

        String conversoresMoneda[] = {
            "la moneda de tu país  a Dólar",
            "la moneda de tu país  a Euros",
            "la moneda de tu país  a Libras Esterlinas",
            "la moneda de tu país  a Yen Japonés",
            "la moneda de tu país  a Won sul-coreano",
            "Dólar a la moneda de tu país",
            "Euros a la moneda de tu país",
            "Libras Esterlinas a la moneda de tu país",
            "Yen Japonés a la moneda de tu país",
            "Won sul-coreano a la moneda de tu país"
        };
        Conversor c = new Conversor();
        String msg;
        msg = c.selectInput(
                conversores,
                "Conversor",
                "Selecciona el tipo de conversion"
        );

        if (msg == conversores[0]) {
            msg = c.selectInput(
                conversoresMoneda,
                "Conversor de Moneda", 
                "Selecciona la moneda en la que deseas convertir tu dinero"
        );
            
        }else if(msg == conversores[1]){
         System.out.println(msg+"2");
        } else{
       int ync = c.ventanaYesNotCancel();
        }
    }
}
