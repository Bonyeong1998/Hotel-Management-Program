package hms.check;

import hms.mainmenu.MainMenu;

public class CheckMenu extends javax.swing.JFrame {
    public CheckMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CHECK_IN_BUTTON = new javax.swing.JButton();
        CHECK_OUT_BUTTON = new javax.swing.JButton();
        BACK_BOTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CHECK_IN_BUTTON.setText("체크인");
        CHECK_IN_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_IN_BUTTONActionPerformed(evt);
            }
        });

        CHECK_OUT_BUTTON.setText("체크아웃");
        CHECK_OUT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECK_OUT_BUTTONActionPerformed(evt);
            }
        });

        BACK_BOTTON.setText("이전");
        BACK_BOTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BOTTONActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림체", 1, 24)); // NOI18N
        jLabel1.setText("체크인 메뉴");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(CHECK_IN_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addComponent(CHECK_OUT_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BACK_BOTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHECK_IN_BUTTON)
                    .addComponent(CHECK_OUT_BUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(BACK_BOTTON)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHECK_OUT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_OUT_BUTTONActionPerformed
        CheckOUT next = new CheckOUT();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CHECK_OUT_BUTTONActionPerformed

    private void CHECK_IN_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECK_IN_BUTTONActionPerformed
        CheckIN next = new CheckIN();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CHECK_IN_BUTTONActionPerformed

    private void BACK_BOTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BOTTONActionPerformed
        MainMenu next = new MainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BOTTONActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BOTTON;
    private javax.swing.JButton CHECK_IN_BUTTON;
    private javax.swing.JButton CHECK_OUT_BUTTON;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
