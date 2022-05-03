package hms.management;

import hms.reservation.GuestInfo;
import hms.search.SearchMenu;
import hms.source.SFR200;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CertainPeriod extends javax.swing.JFrame {

    public CertainPeriod() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INYearBox1 = new javax.swing.JComboBox<>();
        INMonthBox1 = new javax.swing.JComboBox<>();
        INDayBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfitTable = new javax.swing.JTable();
        OUTMonthBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BACK_BUTTON = new javax.swing.JButton();
        INSERTBOTTON = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        INYearBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        INMonthBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        INDayBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel1.setText("기간");

        ProfitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "날짜", "점유율", "이윤"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProfitTable);

        OUTMonthBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "3", "6" }));

        jLabel2.setText("개월 선택");

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        INSERTBOTTON.setText("입력");
        INSERTBOTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTBOTTONActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel3.setText("일정기간 점유율");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BACK_BUTTON))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INSERTBOTTON)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(INYearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(INMonthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(INDayBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(OUTMonthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3))))))
                        .addGap(0, 8, Short.MAX_VALUE)))
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
                    .addComponent(INYearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INMonthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INDayBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUTMonthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addComponent(INSERTBOTTON)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BACK_BUTTON)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        ManagementMainMenu next = new ManagementMainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void INSERTBOTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTBOTTONActionPerformed
        try {
            SFR200 sr = new SFR200();
            sr.FRead();
            sr.Split();

            ArrayList<GuestInfo> guestInfo = sr.returnGuestInfo();

            String year = INYearBox1.getSelectedItem().toString();
            String month = INMonthBox1.getSelectedItem().toString();
            String day = INDayBox1.getSelectedItem().toString();

            String nextyear = INYearBox1.getSelectedItem().toString();
            String nextmonth = INMonthBox1.getSelectedItem().toString();
            String nextday = INDayBox1.getSelectedItem().toString();
            String month1 = OUTMonthBox1.getSelectedItem().toString();

            DefaultTableModel search;
            search = (DefaultTableModel) ProfitTable.getModel();
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy|MM|dd");
                String Indate = year + "|" + month + "|" + day;
                String Indate1 = nextyear + "|" + nextmonth + "|" + nextday;

                int m = Integer.parseInt(month) + Integer.parseInt(month1);
                int y = Integer.parseInt(year);

                if (m > 12) {
                    m -= 12;
                    y++;
                }

                Indate1 = Integer.toString(y) + "|" + Integer.toString(m) + "|" + nextday;
                String ogg = year + "." + month + "." + day + "~" + y + "." + m + "." + nextday;
                Date date = format.parse(Indate);  // 날짜 더한 값
                Date date1 = format.parse(Indate1);

                Calendar cal = Calendar.getInstance();
                float count = 0;
                int fee = 0;
                int compare = 0;
                int compare1 = 0;

                for (int i = 0; i < guestInfo.size(); i++) {
                    String guestDate = guestInfo.get(i).getInYear() + "|" + guestInfo.get(i).getInMonth() + "|" + guestInfo.get(i).getInDay();
                    Date date2 = format.parse(guestDate);
                    compare = date.compareTo(date2);
                    compare1 = date1.compareTo(date2);
                    if (compare <= 0 && compare1 >= 0) {
                        String pay = guestInfo.get(i).getMoney();
                        int money = Integer.parseInt(pay);
                        count += 1.0;
                        fee += money;
                    }
                }
                if (count != 0) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        ogg,
                        count / 100,
                        fee
                    });
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_INSERTBOTTONActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CertainPeriod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JComboBox<String> INDayBox1;
    private javax.swing.JComboBox<String> INMonthBox1;
    private javax.swing.JButton INSERTBOTTON;
    private javax.swing.JComboBox<String> INYearBox1;
    private javax.swing.JComboBox<String> OUTMonthBox1;
    private javax.swing.JTable ProfitTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
