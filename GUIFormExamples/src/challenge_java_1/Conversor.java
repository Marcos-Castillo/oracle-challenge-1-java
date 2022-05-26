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

    public int ventanaYesNotCancel() {

        return JOptionPane.showConfirmDialog(
                null,
                "¿Deseas continuar?",
                "titulo ventana",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

}
