/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author KIRAN
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        passwordPF = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel1.setText("Admin Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        usernameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 187, 173, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 332, 97, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 332, 88, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("User Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 393, 350, -1));

        passwordPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordPFKeyPressed(evt);
            }
        });
        getContentPane().add(passwordPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 254, 173, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 332, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\KIRAN\\Downloads\\bus\\shutterstock_361517306.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void infoMessage(String message,String title)
    {
        JOptionPane.showMessageDialog(null, message, title,JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        UserLogin ul = new UserLogin();
        ul.setLocationRelativeTo(null);
        ul.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = usernameTF.getText();
        String password = passwordPF.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_db","root","");
            System.out.println("Connection Established...");
            
            String selectQuery = "select * from admin_details where username='"+username+"' and password='"+password+"'";
            Statement stat = con.createStatement();
            ResultSet rs=stat.executeQuery(selectQuery);
            if(rs.next())
            {
                infoMessage("You Succesfully Log In.....", "Welcome...");
                dispose();
                AdminControlPanel acp = new AdminControlPanel(username);
                acp.setLocationRelativeTo(null);
                acp.setVisible(true);
            }
            else
            {
                infoMessage("Wrong Username or Password Try Againt..!", "Error!");
                usernameTF.setText("");
                passwordPF.setText("");
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            usernameTF.setText("");
            passwordPF.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        MainScreen mr=new MainScreen();
        mr.setLocationRelativeTo(null);
        mr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void passwordPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordPFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String username = usernameTF.getText();
        String password = passwordPF.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_db","root","");
            System.out.println("Connection Established...");
            
            String selectQuery = "select * from admin_details where username='"+username+"' and password='"+password+"'";
            Statement stat = con.createStatement();
            ResultSet rs=stat.executeQuery(selectQuery);
            if(rs.next())
            {
                infoMessage("You Succesfully Log In.....", "Welcome...");
                dispose();
                AdminControlPanel acp = new AdminControlPanel(username);
                acp.setLocationRelativeTo(null);
                acp.setVisible(true);
            }
            else
            {
                infoMessage("Wrong Username or Password Try Againt..!", "Error!");
                usernameTF.setText("");
                passwordPF.setText("");
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        }
    }//GEN-LAST:event_passwordPFKeyPressed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
