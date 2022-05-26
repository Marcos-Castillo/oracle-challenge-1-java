package challenge_java_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Conversor {

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
                "titulo ventana",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

    public double conversor(double valor, String msg) {
        switch(msg)
        {
    case "la moneda de tu país  a Dólar":
        valor *= 1.5;
          break; 
    case "la moneda de tu país  a Euros" :
        valor *= 1.5;
         break; 
    case "la moneda de tu país  a Libras Esterlinas":
        valor *= 1.5;
          break; 
    case "la moneda de tu país  a Yen Japonés" :
        valor *= 1.5;
         break;             
    case "la moneda de tu país  a Won sul-coreano":
        valor *= 1.5;
          break; 
    case "Dólar a la moneda de tu país" :
        valor *= 1.5;
         break; 
    case "Euros a la moneda de tu país":
        valor *= 1.5;
          break; 
    case "Libras Esterlinas a la moneda de tu país":
        valor *= 1.5;
         break;  
    case "Yen Japonés a la moneda de tu país":
        valor *= 1.5;
         break;  
    case "Won sul-coreano a la moneda de tu país":
        valor *= 1.5;
         break;  
    default : 
       
   }

    return valor;
   }
}
