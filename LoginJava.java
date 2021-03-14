package guisglloginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginJava extends javax.swing.JFrame {

     
    public LoginJava() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        btnLogin.setText("login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUsername.setText("username");

        lblPassword.setText("password");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(username))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(jButton1))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        
       try{
          // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          
           /*  String sql = "select * from users where username = ? and password = ?";
           PreparedStatement pst = con.prepareStatement(sql);
         pst.setString(1, username.getText());
           
           pst.setString(2, password.getText());
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "username and password matches");
           }
           else{
               JOptionPane.showMessageDialog(null, "username and password are not matches");
               username.setText("");
               password.setText("");
           }
           */
           String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM users";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
           while(rs.next()) {
               String name = rs.getString("username"); 
               if( name.equals("ahmet     ")){ 
                   System.out.println(rs.getString("password")); 
                   break; 
               }
               else
                   System.out.println("error baby");
               //System.out.println(rs.getString("username")+"-"+ rs.getString("password"));
           } 
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          
           /*  String sql = "select * from users where username = ? and password = ?";
           PreparedStatement pst = con.prepareStatement(sql);
         pst.setString(1, username.getText());
           
           pst.setString(2, password.getText());
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "username and password matches");
           }
           else{
               JOptionPane.showMessageDialog(null, "username and password are not matches");
               username.setText("");
               password.setText("");
           }
           */
           String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb; user = sa; password = 123";
           Connection con = DriverManager.getConnection(url);
           /* String sql = "SELECT * FROM users";
            String sql2 = "insert into users values(?,?,?)";
            
            String sql3 = "UPDATE users SET  password=? WHERE username=?";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            //pst3.setInt(1, 1);
            pst3.setString(1, "ceyda     ");
            pst3.setString(2, "11111");
           int rowsUpdated = pst3.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully");

            }
            else 
                System.out.println("error baby");
            
            
            */
           /*String sql = "DELETE FROM users WHERE username=?";
 
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "ceyda");
 
            int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                           System.out.println("A user was deleted successfully!");
                }
           */
           String sql = "UPDATE users SET password=? WHERE username=?";
 
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 123456);
            statement.setString(2, "ahmet");

 
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing user was updated successfully!");
}
            

            
            //ResultSet rs= pst2.executeQuery();
           
           /*while(rs.next()) {
               String name = rs.getString("username"); 
               if( name.equals("ceyda     ")){ 
                   System.out.println(rs.getString("password")); 
                   break; 
               }
               else
                   System.out.println("error baby");
               //System.out.println(rs.getString("username")+"-"+ rs.getString("password"));
           } */
           
           con.close();
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
