package hms.management;

import hms.check.HotelServicePrice;
import hms.check.RestaurantServicePrice;
import hms.search.SearchMenu;
import hms.source.HotelMoneyData;
import hms.source.HotelMoneyInfo;
import hms.source.RestaurantPriceInfo;
import hms.source.RoomServicePriceInfo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FoodProfit extends javax.swing.JFrame {

    private ArrayList<HotelServicePrice> RSserviceinfo = new ArrayList<>();
    private ArrayList<RestaurantServicePrice> RTserviceinfo = new ArrayList<>();

    public FoodProfit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        INYear = new javax.swing.JComboBox<>();
        INMonth = new javax.swing.JComboBox<>();
        INDay = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RestTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        HotelTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        OUTMonth = new javax.swing.JComboBox<>();
        OUTYear = new javax.swing.JComboBox<>();
        OUTDay = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        BACK_BUTTON = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("기간");

        INYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        INMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        INDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        RestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "기간", "점유율", "이윤"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(RestTable);

        HotelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "기간", "점유율", "이윤"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(HotelTable);

        jLabel1.setText("호텔서비스");

        jLabel2.setText("레스토랑 서비스");

        insert.setText("입력");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        OUTMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        OUTYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021" }));

        OUTDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setText("~");

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel5.setText("호텔,레스토랑 서비스 점유율");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insert))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(INMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BACK_BUTTON)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(INYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(INMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(INDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OUTMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OUTYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OUTDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insert, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BACK_BUTTON)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        ManagementMainMenu next = new ManagementMainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        try {
            HotelMoneyData sr = new HotelMoneyData();
            sr.FRead();
            sr.Split();
            ArrayList<HotelMoneyInfo> hotelmoneyInfo = sr.returnHotelMoneyInfo();
            String year = INYear.getSelectedItem().toString();
            String month = INMonth.getSelectedItem().toString();
            String day = INDay.getSelectedItem().toString();
            String year1 = OUTYear.getSelectedItem().toString();
            String month1 = OUTMonth.getSelectedItem().toString();
            String day1 = OUTDay.getSelectedItem().toString();

            DefaultTableModel hotel;
            hotel = (DefaultTableModel) HotelTable.getModel();
            DefaultTableModel rest;
            rest = (DefaultTableModel) HotelTable.getModel();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            String Indate = year + "-" + month + "-" + day;
            String Indate1 = year1 + "-" + month1 + "-" + day1;
            String ogg = year + "." + month + "." + day + "~" + year1 + "." + month1 + "." + day1;
            int compare = 0;
            int compare1 = 0;
            float count = 0;
            int fee = 0;
            RoomServicePriceInfo RSPrice = new RoomServicePriceInfo();
            RSPrice.FRead();
            RSPrice.Split();
            RSserviceinfo = RSPrice.returnRSServiceInfo();

            for (int i = 0; i < hotelmoneyInfo.size(); i++) {
                String guestDate = hotelmoneyInfo.get(i).getDate();
                compare = Indate.compareTo(guestDate);
                compare1 = Indate1.compareTo(guestDate);
                if (compare <= 0 && compare1 >= 0) {
                    for (int j = 0; j < RSserviceinfo.size(); j++) {
                        if (RSserviceinfo.get(j).getService().equals(hotelmoneyInfo.get(i).getService())) {
                            String pay = hotelmoneyInfo.get(i).getMoney();
                            int money = Integer.parseInt(pay);
                            count += 1.0;
                            fee += money;
                        }
                    }
                }
            }
            if (count != 0) {
                hotel.insertRow(hotel.getRowCount(), new Object[]{
                    ogg,
                    count / 100,
                    fee
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            HotelMoneyData sr = new HotelMoneyData();
            sr.FRead();
            sr.Split();

            ArrayList<HotelMoneyInfo> hotelmoneyInfo = sr.returnHotelMoneyInfo();

            String year = INYear.getSelectedItem().toString();
            String month = INMonth.getSelectedItem().toString();
            String day = INDay.getSelectedItem().toString();
            String year1 = OUTYear.getSelectedItem().toString();
            String month1 = OUTMonth.getSelectedItem().toString();
            String day1 = OUTDay.getSelectedItem().toString();

            DefaultTableModel rest;
            rest = (DefaultTableModel) RestTable.getModel();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            String Indate = year + "-" + month + "-" + day;
            String Indate1 = year1 + "-" + month1 + "-" + day1;
            String ogg = year + "." + month + "." + day + "~" + year1 + "." + month1 + "." + day1;
            int compare = 0;
            int compare1 = 0;
            float count = 0;
            int fee = 0;

            RestaurantPriceInfo RTPrice = new RestaurantPriceInfo();
            RTPrice.FRead();
            RTPrice.Split();
            RTserviceinfo = RTPrice.returnRTServiceInfo();

            for (int i = 0; i < hotelmoneyInfo.size(); i++) {
                String guestDate = hotelmoneyInfo.get(i).getDate();
                compare = Indate.compareTo(guestDate);
                compare1 = Indate1.compareTo(guestDate);
                if (compare <= 0 && compare1 >= 0) {
                    for (int j = 0; j < RTserviceinfo.size(); j++) {
                        if (RTserviceinfo.get(j).getService().equals(hotelmoneyInfo.get(i).getService())) {
                            String pay = hotelmoneyInfo.get(i).getMoney();
                            int money = Integer.parseInt(pay);
                            count += 1.0;
                            fee += money;
                        }
                    }
                }
            }
            if (count != 0) {
                rest.insertRow(rest.getRowCount(), new Object[]{
                    ogg,
                    count / 100,
                    fee
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_insertActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FoodProfit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JTable HotelTable;
    private javax.swing.JComboBox<String> INDay;
    private javax.swing.JComboBox<String> INMonth;
    private javax.swing.JComboBox<String> INYear;
    private javax.swing.JComboBox<String> OUTDay;
    private javax.swing.JComboBox<String> OUTMonth;
    private javax.swing.JComboBox<String> OUTYear;
    private javax.swing.JTable RestTable;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
