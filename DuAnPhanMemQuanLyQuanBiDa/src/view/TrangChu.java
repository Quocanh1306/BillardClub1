package view;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form MainTest
     */
    public TrangChu() {
        initComponents();
//        this.setSize(1650,1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int x = 0;
    int a = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(255, 153, 51));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quản lý bàn chơi");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_bida8.png"))); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, -1));

        panelMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 40));

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trang chủ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        panelMenu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 70));

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dịch vụ");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dichvu.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 40));

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quản lý nhân viên");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_nhanvien.png"))); // NOI18N
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 40));

        jPanel8.setBackground(new java.awt.Color(54, 70, 78));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Collections");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        panelMenu.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 40));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FPT Polytechnic");
        panelMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 160, 20));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("@nhom1dangcap");
        panelMenu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 160, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản lý khách hàng");
        jLabel2.setPreferredSize(new java.awt.Dimension(66, 18));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_khachhang.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 40));

        jPanel9.setBackground(new java.awt.Color(255, 204, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quản lý khuyến mãi");
        jLabel4.setPreferredSize(new java.awt.Dimension(66, 18));
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 152, 28));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_khuyenmai.png"))); // NOI18N
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 40));

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));
        jPanel10.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thống kê doanh thu");
        jLabel6.setPreferredSize(new java.awt.Dimension(66, 18));
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 6, 153, 28));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_doanhthu.png"))); // NOI18N
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 40));

        jPanel11.setBackground(new java.awt.Color(255, 204, 102));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thống kê hóa đơn");
        jLabel8.setPreferredSize(new java.awt.Dimension(66, 18));
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 6, 155, 28));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_hoadon.png"))); // NOI18N
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 40));

        jPanel12.setBackground(new java.awt.Color(255, 204, 102));
        jPanel12.setForeground(new java.awt.Color(255, 204, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quản lý cơ sở vật chất");
        jLabel10.setPreferredSize(new java.awt.Dimension(66, 18));
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 6, 154, 28));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_bida.png"))); // NOI18N
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        panelMenu.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 220, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menu-30_.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        panelMenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jPanel1.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 650));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menu-30.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("Phần mềm quản lý quán Bida");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 30, 340, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anhBac.jpg"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 310));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Học tập gương rèn luyện thân thể của Bác Hồ: \"Có sức khỏe là có tất cả\"");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        panelMenu.setSize(220,650);

            if ( x==220  ) {
            panelMenu.setSize(0, 650);
            Thread th = new Thread() {
                @Override
                public void run(){
                    try {
                        
                        for ( int i = 0; i <= 220; i++){
                            Thread.sleep(1);
                            panelMenu.setSize(i, 650);
                            
                            a++;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
//        panelMenu.setSize(0,650);
if ( x ==0 ) {
            panelMenu.setSize(220, 650);
            Thread th = new Thread() {
                @Override
                public void run(){
                    try {
                        
                        for ( int i = 220; i >= 0; i--){
                            Thread.sleep(1);
                            panelMenu.setSize(i, 650);
                            
                            a--;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=220;
        }
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}