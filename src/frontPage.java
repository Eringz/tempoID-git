
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E-rinGZ
 */

public class frontPage extends javax.swing.JFrame {

    /**
     * Creates new form frontPage
     */
 Connection myConnection = null;
 Statement myStatement = null;
 ResultSet myResult = null;
 
    public frontPage() {
        initComponents();
        //setBackground(new Color(0,0,0,0)); 
        
    }
     public void connect(){
        try{
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/temporaryid", "root", "");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * From administrator");
        }catch (SQLException e){
            e.printStackTrace();
        }
           
          
    }
    public frontPage(String person){
        initComponents();
        connect();
        idn.setText(person);
        admin.setBackground(new Color(0,0,0,0));
        search.setBackground(new Color(0,0,0,0));
        list.setBackground(new Color(0,0,0,0));
        searchtext.setBackground(new Color(0,0,0,0));
        update.setBackground(new Color(0,0,0,0));
        out.setBackground(new Color(0,0,0,0));
        jPanel3.setVisible(false);
        idn.setVisible(false);
        String ako = idn.getText();   
       System.out.println(ako);
       
        try{
            String me = "select * from administrator where id='"+ako+"'";
            Statement add = myConnection.createStatement();
            ResultSet rs = add.executeQuery(me);
            if(rs.next()){
                String name = rs.getString(3);
                String greet = "HELLO, " + name;
                greetings.setText(greet);
                
                
            }
        }catch (SQLException e){
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

        jPanel1 = new javax.swing.JPanel();
        greetings = new javax.swing.JLabel();
        list = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 242, 240));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetings.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        greetings.setForeground(new java.awt.Color(230, 241, 255));
        greetings.setText("fdfsdfsfsdf");
        jPanel1.add(greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 30));

        list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/1x/1x/table50pxAsset 4.png"))); // NOI18N
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listMouseExited(evt);
            }
        });
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel1.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 60));

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/1x/1x/settings70pxAsset 4.png"))); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 60));

        jSeparator2.setBackground(new java.awt.Color(102, 255, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 310, 20));

        jSeparator3.setBackground(new java.awt.Color(102, 255, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, 40));

        jSeparator4.setBackground(new java.awt.Color(153, 255, 0));
        jSeparator4.setForeground(new java.awt.Color(153, 255, 0));
        jSeparator4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 460, 60));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 70, 60));

        create.setBackground(new java.awt.Color(26, 117, 44));
        create.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 260, 40));

        jPanel3.setBackground(new java.awt.Color(243, 247, 252));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        out.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        out.setForeground(new java.awt.Color(4, 54, 87));
        out.setText("LOG OUT");
        out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outMouseExited(evt);
            }
        });
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        jPanel3.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 40));

        update.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(4, 54, 87));
        update.setText("UPDATE ADMIN");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 8, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 170, 130));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 41, 77));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TEMPORARY ID SYSTEM");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 550, 70));

        search.setBackground(new java.awt.Color(59, 88, 8));
        search.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/searchAsset 1.png"))); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 60, 40));

        searchtext.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        searchtext.setForeground(new java.awt.Color(10, 21, 52));
        searchtext.setBorder(null);
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtextKeyPressed(evt);
            }
        });
        jPanel2.add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 430, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/green1kAsset 1.png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -5, 650, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 640, 220));

        idn.setText("jLabel6");
        jPanel1.add(idn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imahe/green1kAsset 1.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setBackground(new Color(204,255,0));
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_adminMouseExited

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setBackground(new Color(204,255,0));
    }//GEN-LAST:event_listMouseEntered

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_listMouseExited

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String person = idn.getText();
        studentReg input = new studentReg();
                input.idnu.setText(person); 
                this.dispose();
                new studentReg(person).show();
     
        
    }//GEN-LAST:event_createActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        String person = idn.getText();
        studentList input = new studentList();
                input.idnumb.setText(person); 
                this.dispose();
                new studentList(person).show();
        
    }//GEN-LAST:event_listActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        
    }//GEN-LAST:event_adminActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
           jPanel3.setVisible(true); 
    }//GEN-LAST:event_adminMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_updateMouseExited

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        
    }//GEN-LAST:event_jPanel3MouseExited

    private void outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseEntered
        out.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_outMouseEntered

    private void outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseExited
        out.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_outMouseExited

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        this.dispose();
        new adminLogIN().show();
    }//GEN-LAST:event_outActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        adminUpdate input = new adminUpdate();
        String son = idn.getText();
        System.out.println("to adminUpdate"+ son);
        input.idnum.setText(son);   
        new adminUpdate(son).show();
        this.dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String hanap = searchtext.getText();
        String ako = idn.getText();
        idOutput input = new idOutput();
        try{
            String me = "select * from student where studentnumber='"+hanap+"'";
            Statement add = myConnection.createStatement();
            ResultSet rs = add.executeQuery(me);
            if(rs.next()){
                input.studentn.setText(hanap);
                this.dispose();
                new idOutput(hanap, ako).show(); 
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void searchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
         String hanap = searchtext.getText();
        String ako = idn.getText();
        idOutput input = new idOutput();
        try{
            String me = "select * from student where studentnumber='"+hanap+"'";
            Statement add = myConnection.createStatement();
            ResultSet rs = add.executeQuery(me);
            if(rs.next()){
                input.studentn.setText(hanap);
                this.dispose();
                new idOutput(hanap, ako).show(); 
            }
        }catch (SQLException e){
            e.printStackTrace();
        }   
       }
    }//GEN-LAST:event_searchtextKeyPressed

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
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton create;
    private javax.swing.JLabel greetings;
    public static javax.swing.JLabel idn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton list;
    private javax.swing.JButton out;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtext;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
