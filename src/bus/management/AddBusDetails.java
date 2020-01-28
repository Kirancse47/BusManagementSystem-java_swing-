/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author KIRAN
 */
public class AddBusDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBusDetails
     */
    public AddBusDetails() {
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
        jLabel4 = new javax.swing.JLabel();
        busnoTF = new javax.swing.JTextField();
        sourceTF = new javax.swing.JTextField();
        destinationTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        moveCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateDP = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        timeTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        seatTF = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Bus Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Bus Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bus No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Destination");

        busnoTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sourceTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        destinationTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Movement");

        moveCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moveCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UP", "DOWN" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Price");

        priceTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date");

        dateDP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Time");

        timeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Seat");

        seatTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(97, 97, 97)
                                .addComponent(dateDP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sourceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(busnoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(priceTF))))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9))
                            .addComponent(jLabel8))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveCB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(moveCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sourceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(destinationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(114, 114, 114)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearFieldValue()
    {
       busnoTF.setText("");
       moveCB.setSelectedItem("UP");
       sourceTF.setText("");
       destinationTF.setText("");
       
       java.util.Date date=null;
       dateDP.setDate(date);
       
       timeTF.setText("");
       priceTF.setText("");
       seatTF.setText("");
    }
    
    public void infoMessage(String message,String title)
    {
        JOptionPane.showMessageDialog(null, message, title,JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       String busno = busnoTF.getText();
       String move = (String)moveCB.getSelectedItem();
       String source = sourceTF.getText();
       String dest = destinationTF.getText();
            java.util.Date date = dateDP.getDate();
            SimpleDateFormat oDateFormat = new SimpleDateFormat("dd-MM-YYYY");
       String departDate = oDateFormat.format(date);
       String time = timeTF.getText();
       String price = priceTF.getText();
       String seat = seatTF.getText();
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_db","root","");
            System.out.println("Connection Established...");
            
            Statement stat = con.createStatement();
            String selectQuery = "select * from bus_details where bus_no='"+busno+"' ";
            ResultSet rs=stat.executeQuery(selectQuery);
            if(rs.next())
            {
                infoMessage("This Bus Already Registered.....", "Welcome !!");
            }
            else
            {
                String insertQuery = "insert into bus_details (bus_no,movement,bus_source,bus_dest,depart_date,depart_time,price,total_seat) values('"+busno+"','"+move+"','"+source+"','"+dest+"','"+departDate+"','"+time+"','"+price+"','"+seat+"')";
            
                stat.executeUpdate(insertQuery);
                infoMessage("Bus Registration Complete.....", "Welcome !!");
            }
            clearFieldValue();
            
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearFieldValue();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busnoTF;
    private org.jdesktop.swingx.JXDatePicker dateDP;
    private javax.swing.JTextField destinationTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> moveCB;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField seatTF;
    private javax.swing.JTextField sourceTF;
    private javax.swing.JTextField timeTF;
    // End of variables declaration//GEN-END:variables
}
