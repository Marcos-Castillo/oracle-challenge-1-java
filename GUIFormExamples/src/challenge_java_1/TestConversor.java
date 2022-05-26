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
        int yn = 0;
    
       while(yn==0){
    
        String msg = c.selectInput(
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
            double valor = 0;
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el monto a convertir"));
            valor = c.conversor(valor, msg);

            JOptionPane.showMessageDialog(null, "El monto final es de " + valor);

        } else if (msg == conversores[1]) {
            System.out.println(msg + "2");
        }

        yn = c.ventanaYesNot();
          
        
       }
    
}
}

