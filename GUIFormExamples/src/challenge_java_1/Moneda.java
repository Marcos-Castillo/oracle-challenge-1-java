package challenge_java_1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
  
public class Moneda {
    
    public static void main(String[] args) {
        
        
        String conversores[] = {
        "Conversor de Moneda",
        "Conversor de temperatura"
        };
        
        Object msg1 = JOptionPane.showInputDialog(
                 new JFrame(), 
                "Selecciona el tipo de conversion", 
                "Conversor", 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                conversores, 
                "Titan"
        );
       
        System.out.println(msg1);
        
    String bigList[] = {
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
        String valor = JOptionPane.showInputDialog(null, "Introduce el monto a convertir");
        
        Object msg = JOptionPane.showInputDialog(
                new JFrame(), 
                "Selecciona la moneda en la que deseas convertir tu dinero",
                "Conversor de Moneda", 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                bigList, 
                "Titan"
        );
        String calculoMoneda = "55.55";
          
	JOptionPane.showMessageDialog(null, valor+" "+msg+" "+ calculoMoneda);
        
        
           int ventanaYesNotCancel = JOptionPane.showConfirmDialog
        (
                null, 
                "¿Deseas continuar?", 
                "titulo ventana", 
                JOptionPane.YES_OPTION, 
                JOptionPane.WARNING_MESSAGE
        );
        System.out.println(ventanaYesNotCancel);
        
        
        
        
        
        
        
        /*
        String msg = JOptionPane.showInputDialog(null, "Introduce un mensaje");
	JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, "Mensaje sin icono PLAIN_MESSAGE o -1", "Javadesde0.com", -1);
        JOptionPane.showMessageDialog(null, "Mensaje con ERROR_MESSAGE o 0", "Javadesde0.com", 0);
        JOptionPane.showMessageDialog(null, "Mensaje con INFORMATION_MESSAGE o 1", "Javadesde0.com", 1);
        JOptionPane.showMessageDialog(null, "Mensaje con WARNING_MESSAGE o 2", "Javadesde0.com", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje con QUESTION_MESSAGE o 3", "Javadesde0.com", JOptionPane.QUESTION_MESSAGE);
               
        int ventanaYesNotCancel = JOptionPane.showConfirmDialog
        (
                null, 
                "¿Quieres salir del programa?", 
                "titulo ventana", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE
        );
        System.out.println(ventanaYesNotCancel);
        //0=yes, 1=no, 2=cancel
        
        String[] botones = {"Boton A", "Boton B", "Boton C", "Boton D"};
		int ventana = JOptionPane.showOptionDialog(null, 
						"Pulsa un boton:", 
						"Javadesde0.com", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, 
						botones, botones[0]);
		      System.out.println(ventana);
       */
        
        	
                
          
        }



}