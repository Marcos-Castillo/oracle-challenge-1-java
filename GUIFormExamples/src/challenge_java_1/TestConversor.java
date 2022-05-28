package challenge_java_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestConversor {

    public static void main(String[] args) {
        Conversor c = new Conversor();      
        String conversores[] = c.conversores;
        String conversorMoneda[] = c.conversorMoneda;
        String conversorTemperatura[] = c.conversorTemperatura;
        int yn = 0;
    
       while(yn==0){
    
        String msg = c.selectInput(
                conversores,
                "Conversor",
                "Selecciona el tipo de conversion"
        );

        if (msg == conversores[0]) {
            msg = c.selectInput(
                    conversorMoneda,
                    "Conversor de Moneda",
                    "Selecciona la moneda en la que deseas convertir tu dinero"
            );
            double valor = 0;
            try{
                valor += Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el monto a convertir","Conversor de Moneda",JOptionPane.QUESTION_MESSAGE));
                valor = c.conversor(valor, msg);
                JOptionPane.showMessageDialog(null, "El monto final es de " + valor,msg, 1);
            }catch(Exception exe){
                System.out.println("Excepcion "+exe);
                JOptionPane.showMessageDialog(null,"El valor ingresado es invalido", "Error", JOptionPane.WARNING_MESSAGE);
            }
            

        } else if (msg == conversores[1]) {
             msg = c.selectInput(
                    conversorTemperatura,
                    "Conversor de temperatura",
                    "Selecciona unidad de medida en la que deseas convertir"
            );
            double valor = 0;
            try{
            valor += Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la temperatura a convertir","Conversor de temperatura",JOptionPane.QUESTION_MESSAGE));
            valor = c.conversor(valor, msg);
            JOptionPane.showMessageDialog(null, "Temperatura final: " + valor,msg, 1);
            
            }catch(Exception exe){
                System.out.println("Excepcion "+exe);
                JOptionPane.showMessageDialog(null,"El valor ingresado es invalido", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }

        yn = c.ventanaYesNot();
          
        
       }
     System.exit(0);
}
}

