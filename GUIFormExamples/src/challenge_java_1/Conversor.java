package challenge_java_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Conversor {
        String conversores[] = {
            "Conversor de Moneda",
            "Conversor de temperatura"
        };

        String conversorMoneda[] = {
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
        String conversorTemperatura[] = {
            "Grados Celcius a Grados Farenheit",
            "Grados Celcius a Kelvin",
            "Grados Farenheit a Grados Celcius",
            "Kelvin a Grados Celcius",
            "Kelvin a Grados Farenheit"
        };
    String prueba = conversorMoneda[0];

    public String selectInput(Object msg, String titulo, String descripcion) {

        Object msg1 = JOptionPane.showInputDialog(new JFrame(),
                descripcion,
                titulo,
                JOptionPane.QUESTION_MESSAGE,
                null, (Object[]) msg,
                "Titan"
        );

        return String.valueOf(msg1);
    }

    public int ventanaYesNot() {

        return JOptionPane.showConfirmDialog(
                null,
                "¿Deseas continuar?",
                "Conversor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

    public double conversor(double valor, String msg) {
        switch(msg)
        {
    case "la moneda de tu país  a Dólar":
        valor *= 0.0084;
          break; 
    case "la moneda de tu país  a Euros" :
        valor *= 0.0078;
         break; 
    case "la moneda de tu país  a Libras Esterlinas":
        valor *= 0.0066;
          break; 
    case "la moneda de tu país  a Yen Japonés" :
        valor *= 1.06;
         break;             
    case "la moneda de tu país  a Won sul-coreano":
        valor *= 10.53;
          break; 
    case "Dólar a la moneda de tu país" :
        valor *= 119.48;
         break; 
    case "Euros a la moneda de tu país":
        valor *= 128.23;
          break; 
    case "Libras Esterlinas a la moneda de tu país":
        valor *= 150.90;
         break;  
    case "Yen Japonés a la moneda de tu país":
        valor *= 0.94;
         break;  
    case "Won sul-coreano a la moneda de tu país":
        valor *= 0.095;
         break;  
    case "Grados Celcius a Grados Farenheit":
        valor = (valor * 9/5) + 32 ;
         break;  
    case "Grados Celcius a Kelvin":
        valor += 273.15 ;
         break;       
    case "Grados Farenheit a Grados Celcius":
        valor = (valor - 32)*5/9;
         break;  
    case "Kelvin a Grados Celcius":
        valor -=273.15 ;
         break;       
    case  "Kelvin a Grados Farenheit":
        valor = (valor - 273.15) * 9/5 + 32 ;
         break;  
          
    default : 
       
   }
    return valor;
   }
}
