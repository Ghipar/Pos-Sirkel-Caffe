
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.util.Duration.millis;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author REHAN
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

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
        usernameField = new TextField()
        ;
        userlogo = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        minbtn = new javax.swing.JLabel();
        lginbtn = new javax.swing.JLabel();
        passField = new PasswordField()
        ;
        showbtn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                usernameFieldComponentAdded(evt);
            }
        });
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                usernameFieldInputMethodTextChanged(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 247, 57));

        userlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/UserLogo.png"))); // NOI18N
        jPanel1.add(userlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 76, 227, 204));

        closebtn.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        closebtn.setForeground(new java.awt.Color(153, 153, 153));
        closebtn.setText("X");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 10, -1, -1));

        minbtn.setFont(new java.awt.Font("Nirmala UI", 0, 80)); // NOI18N
        minbtn.setForeground(new java.awt.Color(153, 153, 153));
        minbtn.setText("-");
        minbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minbtnMouseExited(evt);
            }
        });
        jPanel1.add(minbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 10, -1, 40));

        lginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/logina 70% (1).png"))); // NOI18N
        lginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lginbtnMouseExited(evt);
            }
        });
        jPanel1.add(lginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 170, 160));

        passField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 250, 60));

        showbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/tutu2.png"))); // NOI18N
        showbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showbtnMousePressed(evt);
            }
        });
        jPanel1.add(showbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 50, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("NO E-KTP");
        jPasswordField1.setEchoChar('\u0000');
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
        // TODO add your handling code here:
        closebtn.setForeground(Color.red);
    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
        // TODO add your handling code here:
        closebtn.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_closebtnMouseExited

    private void minbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minbtnMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minbtnMouseClicked

    private void minbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minbtnMouseEntered
        // TODO add your handling code here:
        minbtn.setForeground(Color.red);
    }//GEN-LAST:event_minbtnMouseEntered

    private void minbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minbtnMouseExited
        // TODO add your handling code here:
        minbtn.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_minbtnMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void lginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lginbtnMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        String Username = usernameField.getText();
        String password = passField.getText();

        try {
            String sql = "select * from kasir where Username = '" + Username + "'";
            Connection connection = Config.configDB();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            //String url = "src\\\\sound\\\\Project1.mp3";
            //player = new MP3Player(new File(url));

            if (rs.next()) {

                if (Username.equals(rs.getString("username"))
                        && password.equals(rs.getString("password"))) {

                    this.setVisible(false);
                    new uwuu().setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(this, "Username dan password tidak sesuai!!", "Error", JOptionPane.WARNING_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(this, "Username dan password tidak sesuai!!", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_lginbtnMouseClicked

    private void lginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lginbtnMouseEntered
        // TODO add your handling code here:
        lginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/login a100%.png")));
    }//GEN-LAST:event_lginbtnMouseEntered

    private void lginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lginbtnMouseExited
        // TODO add your handling code here:
        lginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/logina 70% (1).png")));
    }//GEN-LAST:event_lginbtnMouseExited

    private void showbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbtnMouseClicked
        // TODO add your handling code here:
        passField.setEchoChar('*');

    }//GEN-LAST:event_showbtnMouseClicked

    private void showbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbtnMousePressed
        // TODO add your handling code here:
        passField.setEchoChar((char) 0);
    }//GEN-LAST:event_showbtnMousePressed

    private void showbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbtnMouseEntered
        // TODO add your handling code here:
        showbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/cxz.png")));
    }//GEN-LAST:event_showbtnMouseEntered

    private void showbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showbtnMouseExited
        // TODO add your handling code here:
        showbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/tutu2.png")));
    }//GEN-LAST:event_showbtnMouseExited

    private void usernameFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_usernameFieldInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameFieldInputMethodTextChanged

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_usernameFieldFocusLost

    private void usernameFieldComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_usernameFieldComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameFieldComponentAdded

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        // TODO add your handling code here:
//        jLabel1.requestFocus();
//        jButton1.doClick();

    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        // TODO add your handling code here:
//        passField.requestFocus();
//        jButton1.doClick();
    }//GEN-LAST:event_passFieldFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Username = usernameField.getText();
        String password = passField.getText();
        String noKtp = jPasswordField1.getText();

        try {
            String sql = "select * from kasir where Username = '" + Username + "'";
            Connection connection = Config.configDB();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            //String url = "src\\\\sound\\\\Project1.mp3";
            //player = new MP3Player(new File(url));

            if (rs.next()) {

                if (Username.equals(rs.getString("username"))
                        && password.equals(rs.getString("password")) && noKtp.equals(rs.getString("No_Ktp"))) {
                    this.setVisible(false);
                    new uwuu().setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(this, "Username dan password tidak sesuai!!", "Error", JOptionPane.WARNING_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(this, "Username dan password tidak sesuai!!", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        String Username = usernameField.getText();
        String password = passField.getText();
        String noKtp = jPasswordField1.getText();

        try {
            String sql = "select * from kasir where No_Ktp = '" + noKtp + "'";
            Connection connection = Config.configDB();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            //String url = "src\\\\sound\\\\Project1.mp3";
            //player = new MP3Player(new File(url));

            if (rs.next()) {

                if (noKtp.equals(rs.getString("No_Ktp"))) {
                    usernameField.setText(rs.getString("Username"));
                    passField.setText(rs.getString("password"));
//                    if (Username.equals(rs.getString("username"))
//                            && password.equals(rs.getString("password")) && noKtp.equals(rs.getString("No_Ktp"))) {
//                        this.setVisible(false);

//                        new uwuu().setVisible(true);
//                    }
                    jButton1.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "NO E-KTP salah!!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
           
        }

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
         if ( jPasswordField1.getText().equals("NO E-KTP")) {
            jPasswordField1.setText("");
            jPasswordField1.setEchoChar('*');
        }
        
        
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
         if (jPasswordField1.getText().equals("")) {
            jPasswordField1.setText("NO E-KTP");
            jPasswordField1.setEchoChar((char) 0);
        }
       
         
         
    }//GEN-LAST:event_jPasswordField1FocusLost

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new FormLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lginbtn;
    private javax.swing.JLabel minbtn;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel showbtn;
    private javax.swing.JLabel userlogo;
    public static javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}