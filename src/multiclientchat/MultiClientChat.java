
package multiclientchat;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * @author nhanbka99
 */
public class MultiClientChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ServerGUI server = new ServerGUI();
            server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            server.setVisible(true);
        });
    }
}
