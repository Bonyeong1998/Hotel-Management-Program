package hms.management;

import hms.reservation.GuestInfo;
import hms.search.SearchMenu;
import hms.source.SFR200;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AppointPeriod extends javax.swing.JFrame {

    public AppointPeriod() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INYearBox = new javax.swing.JComboBox<>();
        INMonthBox = new javax.swing.JComboBox<>();
        INDayBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfitTable = new javax.swing.JTable();
        OUTYearBox = new javax.swing.JComboBox<>();
        OUTMonthBox = new javax.swing.JComboBox<>();
        OUTDayBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        INSERT_BUTTON = new javax.swing.JButton();
        BACK_BUTTON = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        INYearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        INMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        INDayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel1.setText("기간");

        ProfitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "날짜", "점유율", "이윤"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProfitTable);
        if (ProfitTable.getColumnModel().getColumnCount() > 0) {
            ProfitTable.getColumnModel().getColumn(0).setMinWidth(180);
            ProfitTable.getColumnModel().getColumn(0).setMaxWidth(180);
            ProfitTable.getColumnModel().getColumn(1).setMinWidth(95);
            ProfitTable.getColumnModel().getColumn(1).setMaxWidth(95);
            ProfitTable.getColumnModel().getColumn(2).setMinWidth(100);
            ProfitTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        OUTYearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        OUTMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        OUTDayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("~");

        INSERT_BUTTON.setText("입력");
        INSERT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_BUTTONActionPerformed(evt);
            }
        });

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel3.setText("지정기간 점유율");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(INYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(INMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(INDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OUTYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BACK_BUTTON, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INSERT_BUTTON, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(INYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUTYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUTMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUTDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(INSERT_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BACK_BUTTON)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        ManagementMainMenu next = new ManagementMainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void INSERT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_BUTTONActionPerformed
        try {
            SFR200 sr = new SFR200();
            sr.FRead();
            sr.Split();

            ArrayList<GuestInfo> guestInfo = sr.returnGuestInfo();
            String year = INYearBox.getSelectedItem().toString();
            String month = INMonthBox.getSelectedItem().toString();
            String day = INDayBox.getSelectedItem().toString();
            String year1 = OUTYearBox.getSelectedItem().toString();
            String month1 = OUTMonthBox.getSelectedItem().toString();
            String day1 = OUTDayBox.getSelectedItem().toString();

            DefaultTableModel search;
            search = (DefaultTableModel) ProfitTable.getModel();
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy|mm|dd");
                String Indate = year + "|" + month + "|" + day;
                String Indate1 = year1 + "|" + month1 + "|" + day1;
                String ogg = year + "." + month + "." + day + "~" + year1 + "." + month1 + "." + day1;
                int compare = 0;
                int compare1 = 0;
                float count = 0;
                int fee = 0;
                int checkyear = Integer.parseInt(INYearBox.getSelectedItem().toString());
                int checkyear1 = Integer.parseInt(OUTYearBox.getSelectedItem().toString());
                int checkmonth = Integer.parseInt(INMonthBox.getSelectedItem().toString());
                int checkmonth1 = Integer.parseInt(OUTMonthBox.getSelectedItem().toString());
                int checkday = Integer.parseInt(INDayBox.getSelectedItem().toString());
                int checkday1 = Integer.parseInt(OUTDayBox.getSelectedItem().toString());
                for (int i = 0; i < guestInfo.size(); i++) {
                    String guestDate = guestInfo.get(i).getInYear() + "|" + guestInfo.get(i).getInMonth() + "|" + guestInfo.get(i).getInDay();
                    Date guestdate = format.parse(guestDate);
                    compare = Indate.compareTo(guestDate);
                    compare1 = Indate1.compareTo(guestDate);
                    if (compare <= 0 && compare1 >= 0) {
                        String pay = guestInfo.get(i).getMoney();
                        int money = Integer.parseInt(pay);
                        count += 1.0;
                        fee += money;
                    }
                }
                if (checkyear1 < checkyear) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                } else if (checkyear1 == checkyear && checkmonth1 < checkmonth) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                } else if (checkyear1 == checkyear && checkmonth1 == checkmonth && checkday1 < checkday) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                }
                if (count != 0) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        ogg,
                        count / 100,
                        fee
                    });
                }
            } catch (ParseException e) {
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_INSERT_BUTTONActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppointPeriod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JComboBox<String> INDayBox;
    private javax.swing.JComboBox<String> INMonthBox;
    private javax.swing.JButton INSERT_BUTTON;
    private javax.swing.JComboBox<String> INYearBox;
    private javax.swing.JComboBox<String> OUTDayBox;
    private javax.swing.JComboBox<String> OUTMonthBox;
    private javax.swing.JComboBox<String> OUTYearBox;
    private javax.swing.JTable ProfitTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
