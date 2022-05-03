package hms.mainmenu;

import hms.check.CheckMenu;
import hms.hotelservice.HotelServiceMenu;
import hms.login.Login;
import hms.management.ManagementMainMenu;
import hms.source.SFR600;
import hms.reservation.ReservationMenu;
import hms.search.SearchMenu;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RESERVATION_BOTTON = new javax.swing.JButton();
        CHECK_IN_OUT_BOTTON = new javax.swing.JButton();
        HOTEL_SERVICE_BUTTON = new javax.swing.JButton();
        MANAGEMENT_BUTTON = new javax.swing.JButton();
        SEARCH_BUTTON = new javax.swing.JButton();
        LOGOUT_BUTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RESERVATION_BOTTON.setText("예약");
        RESERVATION_BOTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESERVATION_BOTTONActionPerformed(evt);
            }
        });

        CHECK_IN_OUT_BOTTON.setText("체크인/체크아웃");
        CHECK_IN_OUT_BOTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_IN_OUT_BOTTONActionPerformed(evt);
            }
        });

        HOTEL_SERVICE_BUTTON.setText("호텔서비스");
        HOTEL_SERVICE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOTEL_SERVICE_BUTTONActionPerformed(evt);
            }
        });

        MANAGEMENT_BUTTON.setText("관리");
        MANAGEMENT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MANAGEMENT_BUTTONActionPerformed(evt);
            }
        });

        SEARCH_BUTTON.setText("검색");
        SEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BUTTONActionPerformed(evt);
            }
        });

        LOGOUT_BUTTON.setText("로그아웃");
        LOGOUT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUT_BUTTONActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림체", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("메인 메뉴");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(HOTEL_SERVICE_BUTTON)
                            .addComponent(RESERVATION_BOTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CHECK_IN_OUT_BOTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MANAGEMENT_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SEARCH_BUTTON)
                            .addComponent(jLabel1))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LOGOUT_BUTTON)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(RESERVATION_BOTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEARCH_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CHECK_IN_OUT_BOTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HOTEL_SERVICE_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MANAGEMENT_BUTTON)
                .addGap(12, 12, 12)
                .addComponent(LOGOUT_BUTTON)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHECK_IN_OUT_BOTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_IN_OUT_BOTTONActionPerformed
        CheckMenu next = new CheckMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CHECK_IN_OUT_BOTTONActionPerformed

    private void RESERVATION_BOTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESERVATION_BOTTONActionPerformed
        ReservationMenu next = new ReservationMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_RESERVATION_BOTTONActionPerformed

    private void HOTEL_SERVICE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOTEL_SERVICE_BUTTONActionPerformed
        HotelServiceMenu next = new HotelServiceMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_HOTEL_SERVICE_BUTTONActionPerformed

    private void MANAGEMENT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MANAGEMENT_BUTTONActionPerformed
        SFR600 sr = new SFR600();
        sr.FRead();
        sr.InCode();
        
        if("admin".equals(sr.Check())){
            JOptionPane.showMessageDialog(null, "관리자 권한이 확인되었습니다.");
            ManagementMainMenu next = new ManagementMainMenu();
            next.setVisible(true);
            dispose();
        } else{
            JOptionPane.showMessageDialog(null, "관리자 권한이 존재하지 않습니다.");
        }
    }//GEN-LAST:event_MANAGEMENT_BUTTONActionPerformed

    private void SEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BUTTONActionPerformed
        SearchMenu next = new SearchMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_SEARCH_BUTTONActionPerformed

    private void LOGOUT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUT_BUTTONActionPerformed
        Login next = new Login();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_LOGOUT_BUTTONActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECK_IN_OUT_BOTTON;
    private javax.swing.JButton HOTEL_SERVICE_BUTTON;
    private javax.swing.JButton LOGOUT_BUTTON;
    private javax.swing.JButton MANAGEMENT_BUTTON;
    private javax.swing.JButton RESERVATION_BOTTON;
    private javax.swing.JButton SEARCH_BUTTON;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
