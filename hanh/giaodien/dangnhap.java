/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nganhang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import DBCN.DB_tknv;
import DBCN.ConectDB;
import nganhang.taikhoannhanvien;

/**
 *
 * @author Adminpc
 */
public class dangnhap extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form dangnhap
     */
    public dangnhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hệ thống quản lý Ngân hàng HNC");

        btnDangnhap.addActionListener(this);

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
        txtTaikhoan = new javax.swing.JTextField();
        btnDangnhap = new javax.swing.JButton();
        txtMatkhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tài khoản");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Mật khẩu");

        txtTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaikhoanActionPerformed(evt);
            }
        });

        btnDangnhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDangnhap)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtMatkhau))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaikhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaikhoanActionPerformed

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO aur handling code here:

    }//GEN-LAST:event_btnDangnhapActionPerformed

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
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTaikhoan;
    // End of variables declaration//GEN-END:variables
    String tk ="";
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int xet=0; 
        //taikhoannhanvien t = new taikhoannhanvien();
        DB_tknv t2 = new DB_tknv();

        tk = txtTaikhoan.getText();
        String mk = new String(txtMatkhau.getPassword());
        
        for (taikhoannhanvien t : t2.laytaikhoan()) {
              
                if ((t.getTknv().equals(tk)) && (t.getMknv().equals(mk))) {
                    
                    java.awt.EventQueue.invokeLater(new Runnable() {

                        public void run() {
                            
                            new frmHNC().setVisible(true);
                            
                        }
                       
                    });

                    setVisible(false);
                    dispose();
                    xet=1;
                    taikhoannhanvien.nhanvien = tk;
                       
                } 
                    
        }
        if (xet==0) JOptionPane.showMessageDialog(rootPane, "Nhập sai tài khoản hoặc mật khẩu!!!");
 
    }
}