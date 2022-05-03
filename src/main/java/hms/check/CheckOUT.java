package hms.check;

import hms.management.Report;
import hms.reservation.GuestInfo;
import hms.source.FReport;
import hms.source.HotelCharge;
import hms.source.RoomServicePriceInfo;
import hms.source.RestaurantPriceInfo;
import hms.source.Restaurantmoney;
import hms.source.SFR200;
import hms.source.SFR300;
import hms.source.SFR400;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckOUT extends javax.swing.JFrame {

    private ArrayList<GuestInfo> guestInfo = new ArrayList<>();
    private ArrayList<ChargeInfo> chargeInfo = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    private ArrayList<CheckOutInfo> checkoutInfo = new ArrayList<>();
    private ArrayList<HotelServicePrice> hprice = new ArrayList<>();
    private ArrayList<RestaurantServicePrice> rprice = new ArrayList<>();

    public CheckOUT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextcheckout = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        COUT_TABLE = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RoomCharge = new javax.swing.JLabel();
        extraCharge = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ServiceMoney = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Payment_Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CFeedBack = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cardPay = new javax.swing.JRadioButton();
        cashPay = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RestMoney = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sumCharge = new javax.swing.JLabel();
        BACK_BUTTON = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DATA_TABLE = new javax.swing.JTable();
        CHECKOUT_BUTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SEARCH_BUTTON = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NAME_Field = new javax.swing.JTextField();
        ROOM_Field = new javax.swing.JTextField();

        nextcheckout.setBounds(new java.awt.Rectangle(200, 200, 600, 500));
        nextcheckout.setMinimumSize(new java.awt.Dimension(600, 600));

        COUT_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "방 호수", "인원수", "체크아웃유무", "예상체크아웃시간", "실제체크아웃시간"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(COUT_TABLE);

        jLabel4.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        jLabel4.setText("숙박 요금");

        jLabel5.setText("호텔 서비스");

        jLabel6.setText("+추가 숙박 요금");

        RoomCharge.setText("0");

        extraCharge.setText("0");
        extraCharge.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                extraChargeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ServiceMoney.setText("0");

        jLabel10.setText("요금 합계");

        Payment_Button.setText("결제완료");
        Payment_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_ButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "고객 피드백", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("굴림", 1, 12))); // NOI18N

        CFeedBack.setColumns(20);
        CFeedBack.setRows(5);
        jScrollPane3.setViewportView(CFeedBack);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "결제 방법", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("굴림", 1, 12))); // NOI18N

        cardPay.setText("카드");

        cashPay.setText("현금");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardPay, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cardPay)
                .addGap(18, 18, 18)
                .addComponent(cashPay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("레스토랑");

        RestMoney.setText("0");

        jLabel7.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel7.setText("결제");

        sumCharge.setText("0");
        sumCharge.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        sumCharge.setName(""); // NOI18N

        javax.swing.GroupLayout nextcheckoutLayout = new javax.swing.GroupLayout(nextcheckout.getContentPane());
        nextcheckout.getContentPane().setLayout(nextcheckoutLayout);
        nextcheckoutLayout.setHorizontalGroup(
            nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextcheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                        .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(extraCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(nextcheckoutLayout.createSequentialGroup()
                        .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(nextcheckoutLayout.createSequentialGroup()
                                        .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(nextcheckoutLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel5))
                                        .addGap(378, 378, 378))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(30, 30, 30)))
                                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sumCharge)
                                    .addComponent(ServiceMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RestMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(nextcheckoutLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(nextcheckoutLayout.createSequentialGroup()
                                        .addGap(238, 238, 238)
                                        .addComponent(Payment_Button))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextcheckoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        nextcheckoutLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel12, jLabel4, jLabel5, jLabel6});

        nextcheckoutLayout.setVerticalGroup(
            nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextcheckoutLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RoomCharge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(extraCharge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServiceMoney)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(RestMoney)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumCharge)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nextcheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Payment_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nextcheckoutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel12, jLabel4, jLabel5, jLabel6});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        DATA_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "고객 이름", "호실", "인원 수", "체크아웃유무", "예상 체크 아웃시간"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DATA_TABLE);
        if (DATA_TABLE.getColumnModel().getColumnCount() > 0) {
            DATA_TABLE.getColumnModel().getColumn(0).setMinWidth(90);
            DATA_TABLE.getColumnModel().getColumn(0).setPreferredWidth(90);
            DATA_TABLE.getColumnModel().getColumn(0).setMaxWidth(90);
            DATA_TABLE.getColumnModel().getColumn(1).setMinWidth(70);
            DATA_TABLE.getColumnModel().getColumn(1).setPreferredWidth(70);
            DATA_TABLE.getColumnModel().getColumn(1).setMaxWidth(70);
            DATA_TABLE.getColumnModel().getColumn(3).setMinWidth(100);
            DATA_TABLE.getColumnModel().getColumn(3).setPreferredWidth(100);
            DATA_TABLE.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        CHECKOUT_BUTTON.setText("체크아웃");
        CHECKOUT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKOUT_BUTTONActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel1.setText("체크 아웃 정보");

        SEARCH_BUTTON.setText("검색");
        SEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BUTTONActionPerformed(evt);
            }
        });

        jLabel2.setText("고객 이름");

        jLabel3.setText("호실");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CHECKOUT_BUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BACK_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 339, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SEARCH_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCH_BUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BACK_BUTTON)
                    .addComponent(CHECKOUT_BUTTON))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        CheckMenu next = new CheckMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void CHECKOUT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKOUT_BUTTONActionPerformed
        DefaultTableModel Amodel = (DefaultTableModel) DATA_TABLE.getModel();
        SFR400 sr = new SFR400();
        sr.FRead();
        sr.Split();
        ButtonGroup check = new ButtonGroup();
        check.add(cardPay);
        check.add(cashPay);

        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        String Atime = ft.format(System.currentTimeMillis());

        int nRow = -1;
        int nCol = -1;
        String f = "full";

        nRow = DATA_TABLE.getSelectedRow();
        nCol = DATA_TABLE.getSelectedColumn();

        String time = (String) Amodel.getValueAt(nRow, 4);
        String state = (String) Amodel.getValueAt(nRow, 3);
        String num = (String) Amodel.getValueAt(nRow, 2);
        String room = (String) Amodel.getValueAt(nRow, 1);
        String name = (String) Amodel.getValueAt(nRow, 0);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        String current = date.format(cal.getTime());

        if (Amodel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "검색된 값이 없습니다.");
        } else if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            File file = new File("C:\\DB\\checkout.txt");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                FileWriter fw = new FileWriter("C:\\DB\\checkout.txt", true);
                fw.write(name + " " + room + " " + num + " " + state + " " + time + " " + Atime + " " + current + "\r\n");
                fw.close();
                br.close();

                Report report = new Report();
                report.AdditionalGuest();
                try {
                    DefaultTableModel in = (DefaultTableModel) COUT_TABLE.getModel();
                    in.insertRow(in.getRowCount(), new Object[]{
                        name, room, num, state, time, Atime
                    });
                    Restaurantmoney a = new Restaurantmoney();
                    a.FRead();
                    a.Split();
                    chargeInfo = a.returnRe();

                    RestaurantPriceInfo r = new RestaurantPriceInfo();
                    r.FRead();
                    r.Split();
                    rprice = r.returnRTServiceInfo();
                    int money;
                    int sum = 0;
                    String m;

                    for (int i = 0; i < chargeInfo.size(); i++) {
                        if (chargeInfo.get(i).getName().equals(name) && chargeInfo.get(i).getRoom().equals(room)) {
                            for (int j = 0; j < rprice.size(); j++) {
                                if (rprice.get(j).getService().equals(chargeInfo.get(i).getService())) {
                                    money = Integer.parseInt(rprice.get(j).getPrice());
                                    sum += money;
                                }
                            }
                        }
                        if (i == chargeInfo.size() - 1) {
                            m = Integer.toString(sum);
                            RestMoney.setText(m);
                        }
                    }
                    sum = 0;
                    HotelCharge c = new HotelCharge();
                    c.FRead();
                    c.Split();

                    RoomServicePriceInfo h = new RoomServicePriceInfo();
                    h.FRead();
                    h.Split();
                    hprice = h.returnRSServiceInfo();

                    try {
                        chargeInfo = c.returnGuestInfo();
                        for (int i = 0; i < chargeInfo.size(); i++) {
                            if (chargeInfo.get(i).getName().equals(name) && chargeInfo.get(i).getRoom().equals(room)) {
                                for (int j = 0; j < hprice.size(); j++) {
                                    if (hprice.get(j).getService().equals(chargeInfo.get(i).getService())) {
                                        money = Integer.parseInt(hprice.get(j).getPrice());
                                        sum += money;
                                    }
                                }
                            }
                            if (i == chargeInfo.size() - 1) {
                                m = Integer.toString(sum);
                                ServiceMoney.setText(m);
                            }
                        }
                    } catch (IOException ex) {
                    }
                } catch (Exception ex) {
                }
            } catch (Exception e) {
            }
        }
        SimpleDateFormat hour = new SimpleDateFormat("HH");
        String checkhour = hour.format(cal.getTime());

        if (Integer.parseInt(checkhour) >= 11) {
            FReport exceptions = new FReport();
            String in = null;
            int a = (Integer.parseInt(checkhour) - 11) * 10000;
            if (a == 0) {
                String money = "10000";
                in = "객실 " + room + "호" + " 추가요금" + " +10000";
                extraCharge.setText(money);
            } else if (a >= 1) {
                String money = Integer.toString(a);
                extraCharge.setText(money);
                in = "객실 " + room + "호" + " 추가요금" + " +" + money;
            }
            try {
                if (in != null) {
                    exceptions.FWrite(in);
                }
            } catch (IOException ex) {
                Logger.getLogger(CheckOUT.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        SFR200 b = new SFR200();
        b.FRead();
        b.Split();
        try {
            guestInfo = b.returnGuestInfo();
        } catch (IOException ex) {
        }
        for (int i = 0; i < guestInfo.size(); i++) {
            if (guestInfo.get(i).getRoomnum().equals(room) && guestInfo.get(i).getName().equals(name)) {
                RoomCharge.setText(guestInfo.get(i).getMoney());
            }
        }
        int sum = Integer.parseInt(RoomCharge.getText()) + Integer.parseInt(extraCharge.getText())
                + Integer.parseInt(ServiceMoney.getText()) + Integer.parseInt(RestMoney.getText());
        sumCharge.setText(Integer.toString(sum));

        SFR300 a = new SFR300();
        a.FRead();
        try {
            a.Split();
            roomstate = a.returnRoomState();
        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < roomstate.size(); i++) {
            if (roomstate.get(i).getRoomNum().equals(room) && roomstate.get(i).getRoomState().equals(f)) {
                RoomEmpty save = new RoomEmpty();
                try {
                    save.Inguest(roomstate.get(i).getRoomNum(), roomstate.get(i).getIndex());
                    JOptionPane.showMessageDialog(null, Atime + " 체크아웃.");
                    nextcheckout.setVisible(true);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_CHECKOUT_BUTTONActionPerformed

    private void SEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BUTTONActionPerformed
        try {
            SFR400 sr = new SFR400();
            sr.FRead();
            sr.Split();
            checkoutInfo = sr.returnCheckOutInfo();
            String name = NAME_Field.getText();
            String room = ROOM_Field.getText();
            DefaultTableModel search;
            search = (DefaultTableModel) DATA_TABLE.getModel();
            for (int i = 0; i < checkoutInfo.size(); i++) {
                if (checkoutInfo.get(i).getName().equals(name) || checkoutInfo.get(i).getRoom().equals(room)) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        checkoutInfo.get(i).getName(),
                        checkoutInfo.get(i).getRoom(),
                        checkoutInfo.get(i).getGuestnum(),
                        checkoutInfo.get(i).getState(),
                        checkoutInfo.get(i).getCheckouttime()
                    });
                }
            }
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_SEARCH_BUTTONActionPerformed

    private void Payment_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_ButtonActionPerformed
        DefaultTableModel Amodel1 = (DefaultTableModel) COUT_TABLE.getModel();
        int nRow = -1;
        int nCol = -1;
        int cnt = 0;
        String f = "full";

        nRow = DATA_TABLE.getSelectedRow();
        nCol = DATA_TABLE.getSelectedColumn();

        String Rtime = (String) Amodel1.getValueAt(nRow, 5);
        String time = (String) Amodel1.getValueAt(nRow, 4);
        String state = (String) Amodel1.getValueAt(nRow, 3);
        String num = (String) Amodel1.getValueAt(nRow, 2);
        String room = (String) Amodel1.getValueAt(nRow, 1);
        String name = (String) Amodel1.getValueAt(nRow, 0);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        String current = date.format(cal.getTime());
        File c = new File("C:\\DB\\hotelmoney.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(c)));
            FileWriter fw = new FileWriter("C:\\DB\\hotelmoney.txt", true);
            if (cardPay.isSelected()) {
                fw.write(name + " " + room + " " + num + " " + state + " " + sumCharge.getText() + " " + current + " " + time + " " + Rtime + " " + "카드" + " " + "\n");
                cnt = 1;
            } else if (cashPay.isSelected()) {
                fw.write(name + " " + room + " " + num + " " + state + " " + sumCharge.getText() + " " + current + " " + time + " " + Rtime + " " + "현금" + " " + "\n");
                cnt = 1;
            } else {
                JOptionPane.showMessageDialog(null, "결제 방식을 선택해주세요");
            }
            fw.close();
            br.close();
            if (cnt == 1) {
                File file = new File("C:\\DB\\feedback.txt");
                BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                FileWriter fw1 = new FileWriter("C:\\DB\\feedback.txt", true);
                fw1.write(CFeedBack.getText() + "\r\n");
                fw1.close();
                br1.close();
                JOptionPane.showMessageDialog(null, "♥결제 완료 및 피드백 감사합니다.♥");
                nextcheckout.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Payment_ButtonActionPerformed

    private void extraChargeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_extraChargeAncestorAdded

    }//GEN-LAST:event_extraChargeAncestorAdded

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JTextArea CFeedBack;
    private javax.swing.JButton CHECKOUT_BUTTON;
    private javax.swing.JTable COUT_TABLE;
    private javax.swing.JTable DATA_TABLE;
    private javax.swing.JTextField NAME_Field;
    private javax.swing.JButton Payment_Button;
    private javax.swing.JTextField ROOM_Field;
    private javax.swing.JLabel RestMoney;
    private javax.swing.JLabel RoomCharge;
    private javax.swing.JButton SEARCH_BUTTON;
    private javax.swing.JLabel ServiceMoney;
    private javax.swing.JRadioButton cardPay;
    private javax.swing.JRadioButton cashPay;
    private javax.swing.JLabel extraCharge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JDialog nextcheckout;
    private javax.swing.JLabel sumCharge;
    // End of variables declaration//GEN-END:variables
}
