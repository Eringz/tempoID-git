
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-rinGZ
 */
 
public class adminLogIN extends javax.swing.JFrame {

    /**
     * Creates new form adminLogIN
     */
        Connection myConnection = null;
        Statement myStatement= null;
        ResultSet myResult =null;
    public adminLogIN() {
        initComponents();
        connect();
        jPanel2.setFocusable(true);
        close.setBackground(new Color(0,0,0,0));
    }
  public void connect(){
        try{
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/temporaryid", "root", "");
            myStatement = myConnection.createStatement();
            myResult =myStatement.executeQuery("SELECT * FROM administrator");
        }catch(SQLException e){
            e.printStackTrace();
        }
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pa = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        passtext = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226, 242, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pa.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        pa.setForeground(new java.awt.Color(204, 204, 204));
        pa.setText("   PASSWORD");
        jPanel2.add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 400, 50));

        em.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        em.setForeground(new java.awt.Color(204, 204, 204));
        em.setText("   EMAIL ADDRESS");
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 400, 50));

        usertext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usertext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usertextFocusGained(evt);
            }
        });
        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextActionPerformed(evt);
            }
        });
        jPanel2.add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 440, 50));

        passtext.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        passtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passtextFocusGained(evt);
            }
        });
        passtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtextActionPerformed(evt);
            }
        });
        passtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passtextKeyPressed(evt);
            }
        });
        jPanel2.add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 440, 50));

        login.setBackground(new java.awt.Color(61, 83, 244));
        login.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 440, 50));

        register.setBackground(new java.awt.Color(26, 117, 44));
        register.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel2.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 400, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TEMPORARY ID SYSTEM");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 460, 80));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 500, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/1x/1x/close50pxAsset 4.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 80, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/green1kAsset 1.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 20, 43), 3, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Sigurado ka ba sa pinasok mo?", "SIGURADUHING MAIIGI", JOptionPane.YES_NO_OPTION);
        if(answer == 0){
        this.dispose();
        new adminRegister().setVisible(true);  
        }
        
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // Log in with username and password in database
        String username = usertext.getText();
        String password = passtext.getText();
        System.out.println(password);
        String sql = "select * from administrator where email='"+username+"' and password='"+password+"'";
            try {
                ResultSet result =  myStatement.executeQuery(sql);
                
                if(result.next()){
                String person = result.getString(1);
                System.out.println(person);
                JOptionPane.showMessageDialog(null, "LOG IN SUCCESSFULLY!!");
                frontPage input = new frontPage();
                input.idn.setText(person);
                this.dispose();
                new frontPage(person).show();
                }else{
                JOptionPane.showMessageDialog(null, "PLEASE RETRY!!");
            }} catch (SQLException ex) {
                Logger.getLogger(adminLogIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_loginActionPerformed

    private void passtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtextActionPerformed

    private void usertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextActionPerformed

    private void usertextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usertextFocusGained
        String ln = usertext.getText();
        if(ln.contains(ln)){
            em.show();
                if(ln.contains("")){
                    em.hide();
                }
        }
    }//GEN-LAST:event_usertextFocusGained

    private void passtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtextFocusGained
         String p = passtext.getText();
        if(p.contains(p)){
            pa.show();
                if(p.contains("")){
                    pa.hide();
                }
        }
    }//GEN-LAST:event_passtextFocusGained

    private void passtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = usertext.getText();
        String password = passtext.getText();
        System.out.println(password);
        String sql = "select * from administrator where email='"+username+"' and password='"+password+"'";
            try {
                ResultSet result =  myStatement.executeQuery(sql);
                
                if(result.next()){
                String person = result.getString(1);
                System.out.println(person);
                JOptionPane.showMessageDialog(null, "LOG IN SUCCESSFULLY!!");
                frontPage input = new frontPage();
                input.idn.setText(person);
                this.dispose();
                new frontPage(person).show();
                }else{
                JOptionPane.showMessageDialog(null, "PLEASE RETRY!!");
            }} catch (SQLException ex) {
                Logger.getLogger(adminLogIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_passtextKeyPressed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(Color.red);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to retreat?", "CONFIRMATION", JOptionPane.YES_NO_OPTION);
        if(answer == 0){   
        System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "Piniling Manatili");
        }
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(adminLogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel em;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JLabel pa;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JButton register;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables
}
