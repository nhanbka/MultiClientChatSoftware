/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiclientchat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nhanbka99
 */
public class ServerGUI extends javax.swing.JFrame {
    
    ServerSocket socket;
    
    /**
     * Creates new form ServerGUI
     */
    public ServerGUI() {
        initComponents();
        try{
            txtFieldIP.setText(InetAddress.getLocalHost().getHostAddress());
        } catch(UnknownHostException u){
            u.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlPanel = new javax.swing.JSplitPane();
        serverInfoPanel = new javax.swing.JPanel();
        portLabel = new javax.swing.JLabel();
        txtFieldPort = new javax.swing.JTextField();
        ipLabel = new javax.swing.JLabel();
        txtFieldIP = new javax.swing.JTextField();
        serverStatePanel = new javax.swing.JSplitPane();
        btnConnect = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        clientListScrollPanel = new javax.swing.JScrollPane();
        txtAreaClientList = new javax.swing.JTextArea();
        clientListLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 275));
        setMinimumSize(new java.awt.Dimension(500, 275));
        setResizable(false);

        controlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        portLabel.setLabelFor(txtFieldPort);
        portLabel.setText("Port:");
        portLabel.setToolTipText("");

        txtFieldPort.setMaximumSize(new java.awt.Dimension(110, 25));
        txtFieldPort.setMinimumSize(new java.awt.Dimension(110, 25));
        txtFieldPort.setPreferredSize(new java.awt.Dimension(110, 25));

        ipLabel.setLabelFor(txtFieldIP);
        ipLabel.setText("IP address:");

        txtFieldIP.setEditable(false);
        txtFieldIP.setEnabled(false);
        txtFieldIP.setMaximumSize(new java.awt.Dimension(110, 25));
        txtFieldIP.setMinimumSize(new java.awt.Dimension(110, 25));
        txtFieldIP.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout serverInfoPanelLayout = new javax.swing.GroupLayout(serverInfoPanel);
        serverInfoPanel.setLayout(serverInfoPanelLayout);
        serverInfoPanelLayout.setHorizontalGroup(
            serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ipLabel)
                .addGap(0, 0, 0)
                .addComponent(txtFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(portLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        serverInfoPanelLayout.setVerticalGroup(
            serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverInfoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(serverInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ipLabel)
                        .addComponent(txtFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        controlPanel.setLeftComponent(serverInfoPanel);

        serverStatePanel.setDividerLocation(35);
        serverStatePanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnConnect.setText("Start Server");
        serverStatePanel.setTopComponent(btnConnect);

        btnClose.setText("Close Server");
        serverStatePanel.setRightComponent(btnClose);

        controlPanel.setRightComponent(serverStatePanel);

        txtAreaClientList.setColumns(20);
        txtAreaClientList.setRows(5);
        clientListScrollPanel.setViewportView(txtAreaClientList);

        clientListLabel.setLabelFor(txtAreaClientList);
        clientListLabel.setText("Client List:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientListLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(clientListScrollPanel)
                        .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(clientListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConnect;
    private javax.swing.JLabel clientListLabel;
    private javax.swing.JScrollPane clientListScrollPanel;
    private javax.swing.JSplitPane controlPanel;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JLabel portLabel;
    private javax.swing.JPanel serverInfoPanel;
    private javax.swing.JSplitPane serverStatePanel;
    private javax.swing.JTextArea txtAreaClientList;
    private javax.swing.JTextField txtFieldIP;
    private javax.swing.JTextField txtFieldPort;
    // End of variables declaration//GEN-END:variables

    private class ButtonConnectAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int port = 18999;           // default port
            try {
                port = Integer.parseInt(txtFieldPort.getText());
            } catch(Exception exception){
                exception.printStackTrace();
            }
            try {
                socket = new ServerSocket(port);
                JOptionPane.showMessageDialog(txtAreaClientList, "Server is running at port: " + port, "Started server",
			                JOptionPane.INFORMATION_MESSAGE);
            } catch(BindException b){
                JOptionPane.showMessageDialog(txtAreaClientList, "Port has been used");
            } catch (IOException ex) {
                Logger.getLogger(ServerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // Start Server
            Thread t = new Thread(thisServer);
            t.start();
        }
        
    }
    
    private static class thisServer implements Runnable {

        @Override
        public void run() {
            
        }
        
    }
}
