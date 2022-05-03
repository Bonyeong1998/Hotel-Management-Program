package hms.hotelservice;

import hms.check.HotelServicePrice;
import hms.check.RestaurantServicePrice;
import hms.check.RoomState;
import hms.mainmenu.MainMenu;
import hms.search.SearchMenu;
import hms.source.AllServiceBookingData;
import hms.source.AllServiceInfo;
import hms.source.FReport;
import hms.source.RestaurantPriceInfo;
import hms.source.RoomServicePriceInfo;
import hms.source.SFR300;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HotelServiceMenu extends javax.swing.JFrame {

    private ArrayList<RoomState> roomstate = new ArrayList();
    private ArrayList<RestaurantServicePrice> RTserviceinfo = new ArrayList<>();
    private ArrayList<HotelServicePrice> RSserviceinfo = new ArrayList<>();
    private ArrayList<AllServiceInfo> allserviceInfo = new ArrayList<>();

    public HotelServiceMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomserviceInfo = new javax.swing.JDialog();
        RSCLEAR_BUTTON = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RSTABLE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NAME_Field = new javax.swing.JTextField();
        ROOM_Field = new javax.swing.JTextField();
        RSSEARCH_BUTTON = new javax.swing.JButton();
        RSCLOSE_BUTTON = new javax.swing.JButton();
        RSBOOKING_BUTTON = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RSPAY_BUTTON = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        RSKind_Field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RSPrice_Field = new javax.swing.JTextField();
        RSSERVICEMENU_BUTTON = new javax.swing.JButton();
        bookingserviceInfo = new javax.swing.JDialog();
        BCLEAR_BUTTON = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AllServiceTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NAME_Field1 = new javax.swing.JTextField();
        ROOM_Field1 = new javax.swing.JTextField();
        BSEARCH_BUTTON = new javax.swing.JButton();
        closeButton1 = new javax.swing.JButton();
        restaurantInfo = new javax.swing.JDialog();
        RTCLEAR_BUTTON = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        RTTABLE = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RTNAME_Field = new javax.swing.JTextField();
        RTROOM_Field = new javax.swing.JTextField();
        RTSEARCH_BUTTON = new javax.swing.JButton();
        RTCLOSE_BUTTON = new javax.swing.JButton();
        RTBOOKING_BUTTON = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RTPAY_BUTTON = new javax.swing.JButton();
        RTSERVICEMENU_BUTTON = new javax.swing.JButton();
        RTKind_Field = new javax.swing.JTextField();
        RTPrice_Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        restpayment = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        card = new javax.swing.JPanel();
        payLabel = new javax.swing.JLabel();
        ConsentCheck = new javax.swing.JCheckBox();
        endButton = new javax.swing.JButton();
        cardTypeBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        cardnumLabel = new javax.swing.JLabel();
        cardNumField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cardNum2Field = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cardNum4Field = new javax.swing.JTextField();
        cardNum3Field = new javax.swing.JPasswordField();
        expiryBox = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        expriyMMBox = new javax.swing.JComboBox<>();
        expriyYYBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        ConsentLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConsentTexArea = new javax.swing.JTextArea();
        restaurantmenu = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        RTMENU_TABLE = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        RTSELETE_BUTTON = new javax.swing.JButton();
        roomservicemenu = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        RSSELETE_BUTTON = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        RSMENU_TABLE = new javax.swing.JTable();
        roompayment = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        card1 = new javax.swing.JPanel();
        payLabel1 = new javax.swing.JLabel();
        ConsentCheck1 = new javax.swing.JCheckBox();
        endButton1 = new javax.swing.JButton();
        cardTypeBox1 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        cardnumLabel1 = new javax.swing.JLabel();
        cardNumField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cardNum2Field1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cardNum4Field1 = new javax.swing.JTextField();
        cardNum3Field1 = new javax.swing.JPasswordField();
        expiryBox1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        expriyMMBox1 = new javax.swing.JComboBox<>();
        expriyYYBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        ConsentLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ConsentTexArea1 = new javax.swing.JTextArea();
        BACK_BUTTON = new javax.swing.JButton();
        ROOMButton = new javax.swing.JButton();
        APMENUButton = new javax.swing.JButton();
        RESTAURANTjButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        roomserviceInfo.setMinimumSize(new java.awt.Dimension(420, 320));
        roomserviceInfo.setModal(true);

        RSCLEAR_BUTTON.setText("초기화");
        RSCLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSCLEAR_BUTTONActionPerformed(evt);
            }
        });

        RSTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호수", "인원"
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
        jScrollPane3.setViewportView(RSTABLE);

        jLabel1.setText("이름");

        jLabel2.setText("가격");

        ROOM_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_FieldActionPerformed(evt);
            }
        });

        RSSEARCH_BUTTON.setText("검색");
        RSSEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSSEARCH_BUTTONActionPerformed(evt);
            }
        });

        RSCLOSE_BUTTON.setText("닫기");
        RSCLOSE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSCLOSE_BUTTONActionPerformed(evt);
            }
        });

        RSBOOKING_BUTTON.setText("예약");
        RSBOOKING_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSBOOKING_BUTTONActionPerformed(evt);
            }
        });

        jLabel5.setText("룸서비스 종류");

        RSPAY_BUTTON.setText("예약 및 즉시결제");
        RSPAY_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSPAY_BUTTONActionPerformed(evt);
            }
        });

        jLabel11.setText("서비스종류");

        RSKind_Field.setEditable(false);

        jLabel12.setText("호실");

        RSPrice_Field.setEditable(false);

        RSSERVICEMENU_BUTTON.setText("서비스메뉴");
        RSSERVICEMENU_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSSERVICEMENU_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomserviceInfoLayout = new javax.swing.GroupLayout(roomserviceInfo.getContentPane());
        roomserviceInfo.getContentPane().setLayout(roomserviceInfoLayout);
        roomserviceInfoLayout.setHorizontalGroup(
            roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomserviceInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomserviceInfoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(roomserviceInfoLayout.createSequentialGroup()
                        .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomserviceInfoLayout.createSequentialGroup()
                                .addComponent(RSPAY_BUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RSBOOKING_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RSCLOSE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roomserviceInfoLayout.createSequentialGroup()
                                .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(roomserviceInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RSSEARCH_BUTTON)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RSCLEAR_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(roomserviceInfoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RSKind_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RSPrice_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RSSERVICEMENU_BUTTON)))
                        .addContainerGap())))
            .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roomserviceInfoLayout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(jLabel12)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        roomserviceInfoLayout.setVerticalGroup(
            roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomserviceInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RSKind_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(RSPrice_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RSSERVICEMENU_BUTTON))
                .addGap(18, 18, 18)
                .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RSSEARCH_BUTTON)
                    .addComponent(jLabel1)
                    .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RSCLEAR_BUTTON))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RSCLOSE_BUTTON)
                    .addComponent(RSBOOKING_BUTTON)
                    .addComponent(RSPAY_BUTTON))
                .addContainerGap())
            .addGroup(roomserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roomserviceInfoLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jLabel12)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );

        bookingserviceInfo.setMinimumSize(new java.awt.Dimension(580, 265));
        bookingserviceInfo.setModal(true);

        BCLEAR_BUTTON.setText("초기화");
        BCLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCLEAR_BUTTONActionPerformed(evt);
            }
        });

        AllServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호수", "인원", "서비스 종류", "서비스 가격", "예약 날짜", "예약 시간"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(AllServiceTable);

        jLabel3.setText("이름");

        jLabel4.setText("호실");

        BSEARCH_BUTTON.setText("검색");
        BSEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSEARCH_BUTTONActionPerformed(evt);
            }
        });

        closeButton1.setText("닫기");
        closeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookingserviceInfoLayout = new javax.swing.GroupLayout(bookingserviceInfo.getContentPane());
        bookingserviceInfo.getContentPane().setLayout(bookingserviceInfoLayout);
        bookingserviceInfoLayout.setHorizontalGroup(
            bookingserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingserviceInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookingserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingserviceInfoLayout.createSequentialGroup()
                        .addGroup(bookingserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bookingserviceInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NAME_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ROOM_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BSEARCH_BUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BCLEAR_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingserviceInfoLayout.createSequentialGroup()
                        .addGap(0, 477, Short.MAX_VALUE)
                        .addComponent(closeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bookingserviceInfoLayout.setVerticalGroup(
            bookingserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingserviceInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bookingserviceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ROOM_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSEARCH_BUTTON)
                    .addComponent(jLabel3)
                    .addComponent(NAME_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCLEAR_BUTTON))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton1)
                .addContainerGap())
        );

        restaurantInfo.setMinimumSize(new java.awt.Dimension(420, 320));
        restaurantInfo.setModal(true);

        RTCLEAR_BUTTON.setText("초기화");
        RTCLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTCLEAR_BUTTONActionPerformed(evt);
            }
        });

        RTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호수", "인원"
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
        jScrollPane5.setViewportView(RTTABLE);

        jLabel6.setText("이름");

        jLabel7.setText("호실");

        RTSEARCH_BUTTON.setText("검색");
        RTSEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTSEARCH_BUTTONActionPerformed(evt);
            }
        });

        RTCLOSE_BUTTON.setText("닫기");
        RTCLOSE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTCLOSE_BUTTONActionPerformed(evt);
            }
        });

        RTBOOKING_BUTTON.setText("예약");
        RTBOOKING_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTBOOKING_BUTTONActionPerformed(evt);
            }
        });

        jLabel8.setText("레스토랑 서비스");

        RTPAY_BUTTON.setText("예약 및 즉시결제");
        RTPAY_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTPAY_BUTTONActionPerformed(evt);
            }
        });

        RTSERVICEMENU_BUTTON.setText("서비스메뉴");
        RTSERVICEMENU_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTSERVICEMENU_BUTTONActionPerformed(evt);
            }
        });

        RTKind_Field.setEditable(false);

        RTPrice_Field.setEditable(false);

        jLabel9.setText("서비스종류");

        jLabel10.setText("가격");

        javax.swing.GroupLayout restaurantInfoLayout = new javax.swing.GroupLayout(restaurantInfo.getContentPane());
        restaurantInfo.getContentPane().setLayout(restaurantInfoLayout);
        restaurantInfoLayout.setHorizontalGroup(
            restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, restaurantInfoLayout.createSequentialGroup()
                            .addComponent(RTPAY_BUTTON)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTBOOKING_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTCLOSE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, restaurantInfoLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTNAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(RTSEARCH_BUTTON)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTCLEAR_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, restaurantInfoLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTKind_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RTPrice_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTSERVICEMENU_BUTTON)))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restaurantInfoLayout.setVerticalGroup(
            restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RTSERVICEMENU_BUTTON)
                    .addComponent(RTPrice_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTKind_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RTSEARCH_BUTTON)
                    .addComponent(jLabel6)
                    .addComponent(RTNAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(RTROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTCLEAR_BUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(restaurantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RTCLOSE_BUTTON)
                    .addComponent(RTBOOKING_BUTTON)
                    .addComponent(RTPAY_BUTTON))
                .addContainerGap())
        );

        restpayment.setBounds(new java.awt.Rectangle(200, 200, 500, 550));
        restpayment.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        payLabel.setText("결제 안내*");

        ConsentCheck.setText("개인정보 수집 및 이용에 대해 동의합니다.");

        endButton.setText("완료");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        cardTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "현금", "하나 BC", "비씨카드(페이북)", "제주카드", "씨티카드", "신협카드", "현대카드", "하나카드", "KB증권(현대증권)", "전북카드", "카카오뱅크", "KDB산업", "하나(외환)", "광주카드", "케이뱅크", "KB국민", "신한카드", "롯데카드", "NH채움", "우체국카드", "우리카드", "저축은행", "MG새마을", "삼성카드", "수협카드" }));
        cardTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTypeBoxActionPerformed(evt);
            }
        });

        cardnumLabel.setText("카드 번호*");

        cardNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumFieldActionPerformed(evt);
            }
        });
        cardNumField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNumFieldKeyTyped(evt);
            }
        });

        jLabel15.setText("-");

        cardNum2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNum2FieldActionPerformed(evt);
            }
        });
        cardNum2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum2FieldKeyTyped(evt);
            }
        });

        jLabel16.setText("-");

        jLabel17.setText("-");

        cardNum4Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum4Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum4FieldKeyTyped(evt);
            }
        });

        cardNum3Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNum3FieldActionPerformed(evt);
            }
        });
        cardNum3Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum3FieldKeyTyped(evt);
            }
        });

        expiryBox.setText("유효기간*");

        expriyMMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        expriyYYBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel18.setText("/");

        ConsentLabel.setFont(new java.awt.Font("굴림", 1, 10)); // NOI18N
        ConsentLabel.setText("개인정보 수집 및 이용에 대한 동의");

        ConsentTexArea.setColumns(20);
        ConsentTexArea.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        ConsentTexArea.setRows(5);
        ConsentTexArea.setText("필수적인 개인정보의 수집·이용에 관한 사항\n\n ① 수집ㆍ이용 항목 | 성명,전화번호,주소,신용카드 정보\n ② 수집ㆍ이용 목적 | 예약 서비스 제공\n\n동의가 없을 경우 예약 서비스 제공과 관련된 제반 절차 \n진행이 불가능 할 수 있음을 알려드립니다.");
        ConsentTexArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ConsentTexAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(ConsentTexArea);

        javax.swing.GroupLayout cardLayout = new javax.swing.GroupLayout(card);
        card.setLayout(cardLayout);
        cardLayout.setHorizontalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(cardLayout.createSequentialGroup()
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardLayout.createSequentialGroup()
                                .addComponent(payLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardLayout.createSequentialGroup()
                                .addComponent(expiryBox)
                                .addGap(18, 18, 18)
                                .addComponent(expriyMMBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel18)
                                .addGap(6, 6, 6)
                                .addComponent(expriyYYBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConsentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cardLayout.createSequentialGroup()
                                .addComponent(cardnumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConsentCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        cardLayout.setVerticalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payLabel)
                    .addComponent(cardTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardnumLabel)
                    .addComponent(cardNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cardNum2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(cardNum4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNum3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryBox)
                    .addComponent(expriyMMBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expriyYYBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(38, 38, 38)
                .addComponent(ConsentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsentCheck)
                .addGap(18, 18, 18)
                .addComponent(endButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("결제", null, card, "");

        javax.swing.GroupLayout restpaymentLayout = new javax.swing.GroupLayout(restpayment.getContentPane());
        restpayment.getContentPane().setLayout(restpaymentLayout);
        restpaymentLayout.setHorizontalGroup(
            restpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restpaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        restpaymentLayout.setVerticalGroup(
            restpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restpaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        restaurantmenu.setMinimumSize(new java.awt.Dimension(400, 300));
        restaurantmenu.setModal(true);

        RTMENU_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "레스토랑 서비스종류", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RTMENU_TABLE);

        jLabel13.setText("레스토랑 서비스 메뉴");

        RTSELETE_BUTTON.setText("선택");
        RTSELETE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTSELETE_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restaurantmenuLayout = new javax.swing.GroupLayout(restaurantmenu.getContentPane());
        restaurantmenu.getContentPane().setLayout(restaurantmenuLayout);
        restaurantmenuLayout.setHorizontalGroup(
            restaurantmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurantmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restaurantmenuLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 274, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurantmenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RTSELETE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        restaurantmenuLayout.setVerticalGroup(
            restaurantmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurantmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(RTSELETE_BUTTON)
                .addContainerGap())
        );

        roomservicemenu.setMinimumSize(new java.awt.Dimension(400, 300));
        roomservicemenu.setModal(true);

        jLabel14.setText("룸 서비스 메뉴");

        RSSELETE_BUTTON.setText("선택");
        RSSELETE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSSELETE_BUTTONActionPerformed(evt);
            }
        });

        RSMENU_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "룸서비스 종류", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(RSMENU_TABLE);

        javax.swing.GroupLayout roomservicemenuLayout = new javax.swing.GroupLayout(roomservicemenu.getContentPane());
        roomservicemenu.getContentPane().setLayout(roomservicemenuLayout);
        roomservicemenuLayout.setHorizontalGroup(
            roomservicemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomservicemenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomservicemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomservicemenuLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomservicemenuLayout.createSequentialGroup()
                        .addGap(0, 311, Short.MAX_VALUE)
                        .addComponent(RSSELETE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(roomservicemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roomservicemenuLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );
        roomservicemenuLayout.setVerticalGroup(
            roomservicemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomservicemenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(RSSELETE_BUTTON)
                .addContainerGap())
            .addGroup(roomservicemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roomservicemenuLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        roompayment.setBounds(new java.awt.Rectangle(200, 200, 500, 550));
        roompayment.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        payLabel1.setText("결제 안내*");

        ConsentCheck1.setText("개인정보 수집 및 이용에 대해 동의합니다.");
        ConsentCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsentCheck1ActionPerformed(evt);
            }
        });

        endButton1.setText("완료");
        endButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButton1ActionPerformed(evt);
            }
        });

        cardTypeBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "선택", "현금", "하나 BC", "비씨카드(페이북)", "제주카드", "씨티카드", "신협카드", "현대카드", "하나카드", "KB증권(현대증권)", "전북카드", "카카오뱅크", "KDB산업", "하나(외환)", "광주카드", "케이뱅크", "KB국민", "신한카드", "롯데카드", "NH채움", "우체국카드", "우리카드", "저축은행", "MG새마을", "삼성카드", "수협카드" }));
        cardTypeBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTypeBox1ActionPerformed(evt);
            }
        });

        cardnumLabel1.setText("카드 번호*");

        cardNumField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNumField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumField1ActionPerformed(evt);
            }
        });
        cardNumField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNumField1KeyTyped(evt);
            }
        });

        jLabel19.setText("-");

        cardNum2Field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum2Field1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum2Field1KeyTyped(evt);
            }
        });

        jLabel20.setText("-");

        jLabel21.setText("-");

        cardNum4Field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum4Field1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum4Field1KeyTyped(evt);
            }
        });

        cardNum3Field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum3Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNum3Field1ActionPerformed(evt);
            }
        });
        cardNum3Field1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum3Field1KeyTyped(evt);
            }
        });

        expiryBox1.setText("유효기간*");

        expriyMMBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        expriyYYBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel22.setText("/");

        ConsentLabel1.setFont(new java.awt.Font("굴림", 1, 10)); // NOI18N
        ConsentLabel1.setText("개인정보 수집 및 이용에 대한 동의");

        ConsentTexArea1.setColumns(20);
        ConsentTexArea1.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        ConsentTexArea1.setRows(5);
        ConsentTexArea1.setText("필수적인 개인정보의 수집·이용에 관한 사항\n\n ① 수집ㆍ이용 항목 | 성명,전화번호,주소,신용카드 정보\n ② 수집ㆍ이용 목적 | 예약 서비스 제공\n\n동의가 없을 경우 예약 서비스 제공과 관련된 제반 절차 \n진행이 불가능 할 수 있음을 알려드립니다.");
        ConsentTexArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ConsentTexArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(ConsentTexArea1);

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(payLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardTypeBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(expiryBox1)
                                .addGap(18, 18, 18)
                                .addComponent(expriyMMBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel22)
                                .addGap(6, 6, 6)
                                .addComponent(expriyYYBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConsentLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(cardnumLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardNumField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum2Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum3Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum4Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConsentCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(card1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(endButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payLabel1)
                    .addComponent(cardTypeBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardnumLabel1)
                    .addComponent(cardNumField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cardNum2Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(cardNum4Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNum3Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryBox1)
                    .addComponent(expriyMMBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expriyYYBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(38, 38, 38)
                .addComponent(ConsentLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsentCheck1)
                .addGap(18, 18, 18)
                .addComponent(endButton1)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("결제", null, card1, "");

        javax.swing.GroupLayout roompaymentLayout = new javax.swing.GroupLayout(roompayment.getContentPane());
        roompayment.getContentPane().setLayout(roompaymentLayout);
        roompaymentLayout.setHorizontalGroup(
            roompaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roompaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        roompaymentLayout.setVerticalGroup(
            roompaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roompaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        ROOMButton.setText("룸서비스");
        ROOMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOMButtonActionPerformed(evt);
            }
        });

        APMENUButton.setText("신청한 메뉴 보기");
        APMENUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APMENUButtonActionPerformed(evt);
            }
        });

        RESTAURANTjButton.setActionCommand("레스토랑");
        RESTAURANTjButton.setLabel("레스토랑");
        RESTAURANTjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTAURANTjButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel23.setText("서비스 메뉴");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BACK_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(RESTAURANTjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(ROOMButton)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(APMENUButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel23)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ROOMButton)
                    .addComponent(RESTAURANTjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(APMENUButton)
                .addGap(53, 53, 53)
                .addComponent(BACK_BUTTON)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        MainMenu next = new MainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void RSCLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSCLEAR_BUTTONActionPerformed
        NAME_Field.setText("");
        ROOM_Field.setText("");
        DefaultTableModel model = (DefaultTableModel) RSTABLE.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_RSCLEAR_BUTTONActionPerformed

    private void RSSEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSSEARCH_BUTTONActionPerformed

        try {
            SFR300 sr = new SFR300();
            sr.FRead();
            sr.Split();
            roomstate = sr.returnRoomState();
            String name = NAME_Field.getText();
            String room = ROOM_Field.getText();
            DefaultTableModel search;
            search = (DefaultTableModel) RSTABLE.getModel();
            for (int i = 0; i < roomstate.size(); i++) {
                if (roomstate.get(i).getName().equals(name) || roomstate.get(i).getRoomNum().equals(room)) {
                    if (roomstate.get(i).getRoomState().equals("full")) {
                        search.insertRow(search.getRowCount(), new Object[]{
                            roomstate.get(i).getName(),
                            roomstate.get(i).getRoomNum(),
                            roomstate.get(i).getNum(),});
                    }
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RSSEARCH_BUTTONActionPerformed

    private void RSCLOSE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSCLOSE_BUTTONActionPerformed
        roomserviceInfo.setVisible(false);
    }//GEN-LAST:event_RSCLOSE_BUTTONActionPerformed

    private void RSBOOKING_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSBOOKING_BUTTONActionPerformed
        RoomServicePriceInfo RSPriceInfo = new RoomServicePriceInfo();
        DefaultTableModel model = (DefaultTableModel) RSTABLE.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = RSTABLE.getSelectedRow();
        nCol = RSTABLE.getSelectedColumn();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "검색된 값이 없습니다.");
        } else if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            String name = (String) model.getValueAt(nRow, 0);
            String room = (String) model.getValueAt(nRow, 1);
            String guestnum = (String) model.getValueAt(nRow, 2);
            String RSkind = RSKind_Field.getText();
            String RSprice = RSPrice_Field.getText();

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());

            String sum;

            try {
                sum = name + " " + room + " " + guestnum + " " + RSkind + " " + RSprice + " " + time + " 예약" + "\r";
                RSPriceInfo.FWrite(sum);
                JOptionPane.showMessageDialog(null, "예약 완료");
            } catch (IOException ex) {
                Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_RSBOOKING_BUTTONActionPerformed

    private void ROOMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOMButtonActionPerformed
        roomserviceInfo.setVisible(true);
    }//GEN-LAST:event_ROOMButtonActionPerformed

    private void APMENUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APMENUButtonActionPerformed
        bookingserviceInfo.setVisible(true);
    }//GEN-LAST:event_APMENUButtonActionPerformed

    private void BCLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCLEAR_BUTTONActionPerformed
        NAME_Field1.setText("");
        ROOM_Field1.setText("");
        DefaultTableModel model = (DefaultTableModel) AllServiceTable.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_BCLEAR_BUTTONActionPerformed

    private void BSEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSEARCH_BUTTONActionPerformed
        try {
            AllServiceBookingData s = new AllServiceBookingData();
            s.FRead();
            s.Split();
            allserviceInfo = s.returnAllServiceInfo();
            String name = NAME_Field1.getText();
            String room = ROOM_Field1.getText();
            DefaultTableModel search;
            search = (DefaultTableModel) AllServiceTable.getModel();
            for (int i = 0; i < allserviceInfo.size(); i++) {
                if (allserviceInfo.get(i).getName().equals(name) || allserviceInfo.get(i).getRoom().equals(room)) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        allserviceInfo.get(i).getName(),
                        allserviceInfo.get(i).getRoom(),
                        allserviceInfo.get(i).getGuestnum(),
                        allserviceInfo.get(i).getServicekind(),
                        allserviceInfo.get(i).getServiceprice(),
                        allserviceInfo.get(i).getBookingdate(),
                        allserviceInfo.get(i).getBookingtime()
                    });
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BSEARCH_BUTTONActionPerformed

    private void closeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton1ActionPerformed
        bookingserviceInfo.setVisible(false);
    }//GEN-LAST:event_closeButton1ActionPerformed

    private void RESTAURANTjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTAURANTjButtonActionPerformed
        restaurantInfo.setVisible(true);
    }//GEN-LAST:event_RESTAURANTjButtonActionPerformed

    private void RTCLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTCLEAR_BUTTONActionPerformed
        NAME_Field.setText("");
        ROOM_Field.setText("");
        DefaultTableModel model = (DefaultTableModel) RSTABLE.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_RTCLEAR_BUTTONActionPerformed

    private void RTSEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTSEARCH_BUTTONActionPerformed
        try {
            SFR300 sr = new SFR300();
            sr.FRead();
            sr.Split();
            roomstate = sr.returnRoomState();
            String name = RTNAME_Field.getText();
            String room = RTROOM_Field.getText();
            DefaultTableModel search;
            search = (DefaultTableModel) RTTABLE.getModel();
            for (int i = 0; i < roomstate.size(); i++) {
                if (roomstate.get(i).getName().equals(name) || roomstate.get(i).getRoomNum().equals(room)) {
                    if (roomstate.get(i).getRoomState().equals("full")) {
                        search.insertRow(search.getRowCount(), new Object[]{
                            roomstate.get(i).getName(),
                            roomstate.get(i).getRoomNum(),
                            roomstate.get(i).getNum()
                        });
                    }
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RTSEARCH_BUTTONActionPerformed

    private void RTCLOSE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTCLOSE_BUTTONActionPerformed
        restaurantInfo.setVisible(false);
    }//GEN-LAST:event_RTCLOSE_BUTTONActionPerformed

    private void RTBOOKING_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTBOOKING_BUTTONActionPerformed
        //예외레포트 추가
        RestaurantPriceInfo RTPriceInfo = new RestaurantPriceInfo();
        DefaultTableModel model = (DefaultTableModel) RTTABLE.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = RTTABLE.getSelectedRow();
        nCol = RTTABLE.getSelectedColumn();

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "검색된 값이 없습니다.");
        } else if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            String name = (String) model.getValueAt(nRow, 0);
            String room = (String) model.getValueAt(nRow, 1);
            String guestnum = (String) model.getValueAt(nRow, 2);
            String RTkind = RTKind_Field.getText();
            String RTprice = RTPrice_Field.getText();

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());

            String sum = null;

            if (Integer.parseInt(guestnum) >= 4) {
                try {
                    FReport exceptions = new FReport();
                    String in = null;
                    int rtPrice = (Integer.parseInt(RTprice)) - (Integer.parseInt(RTprice) / 10);
                    String discount = Integer.toString((Integer.parseInt(RTprice) / 10));
                    in = "식품 " + RTkind + " 단체할인" + " -" + discount;

                    if (in != null) {
                        exceptions.FWrite(in);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {
                sum = name + " " + room + " " + guestnum + " " + RTkind + " " + RTprice + " " + time + " 예약" + "\r";
                RTPriceInfo.FWrite(sum);
                JOptionPane.showMessageDialog(null, "예약 완료");
            } catch (IOException ex) {
                Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_RTBOOKING_BUTTONActionPerformed

    private void ROOM_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ROOM_FieldActionPerformed

    private void RSPAY_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSPAY_BUTTONActionPerformed
        if (RSKind_Field.getText().equals("") && RSPrice_Field.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "메뉴를 선택 해주세요!!");
        } else
            roompayment.setVisible(true);
    }//GEN-LAST:event_RSPAY_BUTTONActionPerformed

    private void RTPAY_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTPAY_BUTTONActionPerformed
//여기 추가 레포트도 추가됨
        if (RTKind_Field.getText().equals("") && RTPrice_Field.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "메뉴를 선택 해주세요!!");
        } else
            restpayment.setVisible(true);
    }//GEN-LAST:event_RTPAY_BUTTONActionPerformed

    private void RTSERVICEMENU_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTSERVICEMENU_BUTTONActionPerformed
        RestaurantPriceInfo RTPrice = new RestaurantPriceInfo();

        DefaultTableModel rtmodel = (DefaultTableModel) RTMENU_TABLE.getModel();
        rtmodel.setNumRows(0);

        RTPrice.FRead();
        RTPrice.Split();

        try {
            RTserviceinfo = RTPrice.returnRTServiceInfo();
        } catch (IOException ex) {
            Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < RTserviceinfo.size(); i++) {
            rtmodel.insertRow(rtmodel.getRowCount(), new Object[]{
                RTserviceinfo.get(i).getService(),
                RTserviceinfo.get(i).getPrice()
            });
        }
        restaurantmenu.setVisible(true);
    }//GEN-LAST:event_RTSERVICEMENU_BUTTONActionPerformed

    private void RSSERVICEMENU_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSSERVICEMENU_BUTTONActionPerformed
        try {
            DefaultTableModel rsmodel = (DefaultTableModel) RSMENU_TABLE.getModel();
            rsmodel.setNumRows(0);

            RoomServicePriceInfo RSPrice = new RoomServicePriceInfo();
            RSPrice.FRead();
            RSPrice.Split();
            RSserviceinfo = RSPrice.returnRSServiceInfo();

            for (int i = 0; i < RSserviceinfo.size(); i++) {
                rsmodel.insertRow(rsmodel.getRowCount(), new Object[]{
                    RSserviceinfo.get(i).getService(),
                    RSserviceinfo.get(i).getPrice()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        roomservicemenu.setVisible(true);
    }//GEN-LAST:event_RSSERVICEMENU_BUTTONActionPerformed

    private void RTSELETE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTSELETE_BUTTONActionPerformed
        DefaultTableModel model = (DefaultTableModel) RTMENU_TABLE.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = RTMENU_TABLE.getSelectedRow();
        nCol = RTMENU_TABLE.getSelectedColumn();
        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            String RtServiceKind = (String) model.getValueAt(nRow, 0);
            String RtPrice = (String) model.getValueAt(nRow, 1);

            RTKind_Field.setText(RtServiceKind);
            RTPrice_Field.setText(RtPrice);
            restaurantmenu.setVisible(false);
        }
    }//GEN-LAST:event_RTSELETE_BUTTONActionPerformed

    private void RSSELETE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSSELETE_BUTTONActionPerformed
        DefaultTableModel model = (DefaultTableModel) RSMENU_TABLE.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = RSMENU_TABLE.getSelectedRow();
        nCol = RSMENU_TABLE.getSelectedColumn();
        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            String RsServiceKind = (String) model.getValueAt(nRow, 0);
            String RsPrice = (String) model.getValueAt(nRow, 1);

            RSKind_Field.setText(RsServiceKind);
            RSPrice_Field.setText(RsPrice);
            roomservicemenu.setVisible(false);
        }
    }//GEN-LAST:event_RSSELETE_BUTTONActionPerformed

    private void ConsentTexAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ConsentTexAreaAncestorAdded
        ConsentTexArea.setEditable(false);
    }//GEN-LAST:event_ConsentTexAreaAncestorAdded

    private void cardNum3FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum3FieldKeyTyped
        if (cardNum3Field.getText().length() == 4
                || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum3FieldKeyTyped

    private void cardNum3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNum3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNum3FieldActionPerformed

    private void cardNum4FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum4FieldKeyTyped
        if (cardNum4Field.getText().length() == 4
                || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum4FieldKeyTyped

    private void cardNum2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum2FieldKeyTyped
        if (cardNum2Field.getText().length() == 4
                || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum2FieldKeyTyped

    private void cardNumFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumFieldKeyTyped
        if (cardNumField.getText().length() == 4
                || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNumFieldKeyTyped

    private void cardNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumFieldActionPerformed

    }//GEN-LAST:event_cardNumFieldActionPerformed

    private void cardTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTypeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTypeBoxActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        String cardtype = cardTypeBox.getSelectedItem().toString();
        String cardNum = cardNumField.getText() + "-" + cardNum2Field.getText()
                + "-" + cardNum3Field.getText() + "-" + cardNum4Field.getText();

        if (cardtype.equals("현금") && cardNum.length() >= 5) {
            JOptionPane.showMessageDialog(this, "현금 선택은 카드 정보가 필요하지 않습니다..", "오류",
                    JOptionPane.ERROR_MESSAGE);
        } else if (cardtype.equals("선택")) {
            JOptionPane.showMessageDialog(this, "정확하게 입력해주세요.", "오류",
                    JOptionPane.ERROR_MESSAGE);
            if (!ConsentCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "개인정보 수집 및 이용에 대해 "
                        + "동의해주세요.", "오류",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {

            RestaurantPriceInfo RTPriceInfo = new RestaurantPriceInfo();
            DefaultTableModel model = (DefaultTableModel) RTTABLE.getModel();

            int nRow = -1;
            int nCol = -1;

            nRow = RTTABLE.getSelectedRow();
            nCol = RTTABLE.getSelectedColumn();

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "검색된 값이 없습니다.");
            } else if (nRow == -1 && nCol == -1) {
                JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
            } else {
                String name = (String) model.getValueAt(nRow, 0);
                String room = (String) model.getValueAt(nRow, 1);
                String guestnum = (String) model.getValueAt(nRow, 2);
                String RTkind = RTKind_Field.getText();
                String RTprice = RTPrice_Field.getText();

                SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                String time = format.format(System.currentTimeMillis());
                String sum = null;

                if (Integer.parseInt(guestnum) >= 4) {
                    try {
                        FReport exceptions = new FReport();
                        String in = null;
                        int rtPrice = (Integer.parseInt(RTprice)) - (Integer.parseInt(RTprice) / 10);
                        String discount = Integer.toString((Integer.parseInt(RTprice) / 10));
                        in = "식품 " + RTkind + " 단체할인" + " -" + discount;
                        if (in != null) {
                            exceptions.FWrite(in);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                try {
                    sum = name + " " + room + " " + guestnum + " " + RTkind + " " + RTprice + " " + time + " " + cardtype + "\r";
                    RTPriceInfo.AWrite(sum);
                    JOptionPane.showMessageDialog(null, "예약 완료");
                } catch (IOException ex) {
                    Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            restpayment.setVisible(false);
        }
    }//GEN-LAST:event_endButtonActionPerformed

    private void endButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButton1ActionPerformed
        String cardtype = cardTypeBox1.getSelectedItem().toString();
        String cardNum = cardNumField1.getText() + "-" + cardNum2Field1.getText()
                + "-" + cardNum3Field1.getText() + "-" + cardNum4Field1.getText();

        if (cardtype.equals("현금") && cardNum.length() >= 5) {
            JOptionPane.showMessageDialog(this, "현금 선택은 카드 정보가 필요하지 않습니다..", "오류",
                    JOptionPane.ERROR_MESSAGE);
        } else if (cardtype.equals("선택")) {
            JOptionPane.showMessageDialog(this, "정확하게 입력해주세요.", "오류",
                    JOptionPane.ERROR_MESSAGE);
            if (!ConsentCheck1.isSelected()) {
                JOptionPane.showMessageDialog(this, "개인정보 수집 및 이용에 대해 "
                        + "동의해주세요.", "오류",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            RoomServicePriceInfo RSPriceInfo = new RoomServicePriceInfo();
            DefaultTableModel model = (DefaultTableModel) RSTABLE.getModel();
            int nRow = -1;
            int nCol = -1;
            nRow = RSTABLE.getSelectedRow();
            nCol = RSTABLE.getSelectedColumn();

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "검색된 값이 없습니다.");
            } else if (nRow == -1 && nCol == -1) {
                JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
            } else {
                String name = (String) model.getValueAt(nRow, 0);
                String room = (String) model.getValueAt(nRow, 1);
                String guestnum = (String) model.getValueAt(nRow, 2);
                String RTkind = RSKind_Field.getText();
                String RTprice = RSPrice_Field.getText();

                SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                String time = format.format(System.currentTimeMillis());
                String sum = null;

                if (Integer.parseInt(guestnum) >= 4) {
                    try {
                        FReport exceptions = new FReport();
                        String in = null;
                        int rtPrice = (Integer.parseInt(RTprice)) - (Integer.parseInt(RTprice) / 10);
                        String discount = Integer.toString((Integer.parseInt(RTprice) / 10));
                        in = "식품 " + RTkind + " 단체할인" + " -" + discount;
                        if (in != null) {
                            exceptions.FWrite(in);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                try {
                    sum = name + " " + room + " " + guestnum + " " + RTkind + " " + RTprice + " " + time + " " + cardtype + "\r";
                    RSPriceInfo.AWrite(sum);
                    JOptionPane.showMessageDialog(null, "예약 완료");
                } catch (IOException ex) {
                    Logger.getLogger(HotelServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            roompayment.setVisible(false);
        }

    }//GEN-LAST:event_endButton1ActionPerformed

    private void cardTypeBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTypeBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTypeBox1ActionPerformed

    private void cardNumField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumField1ActionPerformed

    private void cardNumField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumField1KeyTyped
        if (cardNumField1.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNumField1KeyTyped

    private void cardNum2Field1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum2Field1KeyTyped
        if (cardNum2Field1.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum2Field1KeyTyped

    private void cardNum4Field1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum4Field1KeyTyped
        if (cardNum4Field1.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum4Field1KeyTyped

    private void cardNum3Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNum3Field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNum3Field1ActionPerformed

    private void cardNum3Field1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum3Field1KeyTyped
        if (cardNum3Field1.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum3Field1KeyTyped

    private void ConsentTexArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ConsentTexArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsentTexArea1AncestorAdded

    private void cardNum2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNum2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNum2FieldActionPerformed

    private void ConsentCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentCheck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsentCheck1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelServiceMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HotelServiceMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APMENUButton;
    private javax.swing.JTable AllServiceTable;
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JButton BCLEAR_BUTTON;
    private javax.swing.JButton BSEARCH_BUTTON;
    private javax.swing.JCheckBox ConsentCheck;
    private javax.swing.JCheckBox ConsentCheck1;
    private javax.swing.JLabel ConsentLabel;
    private javax.swing.JLabel ConsentLabel1;
    private javax.swing.JTextArea ConsentTexArea;
    private javax.swing.JTextArea ConsentTexArea1;
    private javax.swing.JTextField NAME_Field;
    private javax.swing.JTextField NAME_Field1;
    private javax.swing.JButton RESTAURANTjButton;
    private javax.swing.JButton ROOMButton;
    private javax.swing.JTextField ROOM_Field;
    private javax.swing.JTextField ROOM_Field1;
    private javax.swing.JButton RSBOOKING_BUTTON;
    private javax.swing.JButton RSCLEAR_BUTTON;
    private javax.swing.JButton RSCLOSE_BUTTON;
    private javax.swing.JTextField RSKind_Field;
    private javax.swing.JTable RSMENU_TABLE;
    private javax.swing.JButton RSPAY_BUTTON;
    private javax.swing.JTextField RSPrice_Field;
    private javax.swing.JButton RSSEARCH_BUTTON;
    private javax.swing.JButton RSSELETE_BUTTON;
    private javax.swing.JButton RSSERVICEMENU_BUTTON;
    private javax.swing.JTable RSTABLE;
    private javax.swing.JButton RTBOOKING_BUTTON;
    private javax.swing.JButton RTCLEAR_BUTTON;
    private javax.swing.JButton RTCLOSE_BUTTON;
    private javax.swing.JTextField RTKind_Field;
    private javax.swing.JTable RTMENU_TABLE;
    private javax.swing.JTextField RTNAME_Field;
    private javax.swing.JButton RTPAY_BUTTON;
    private javax.swing.JTextField RTPrice_Field;
    private javax.swing.JTextField RTROOM_Field;
    private javax.swing.JButton RTSEARCH_BUTTON;
    private javax.swing.JButton RTSELETE_BUTTON;
    private javax.swing.JButton RTSERVICEMENU_BUTTON;
    private javax.swing.JTable RTTABLE;
    private javax.swing.JDialog bookingserviceInfo;
    private javax.swing.JPanel card;
    private javax.swing.JPanel card1;
    private javax.swing.JTextField cardNum2Field;
    private javax.swing.JTextField cardNum2Field1;
    private javax.swing.JPasswordField cardNum3Field;
    private javax.swing.JPasswordField cardNum3Field1;
    private javax.swing.JTextField cardNum4Field;
    private javax.swing.JTextField cardNum4Field1;
    private javax.swing.JTextField cardNumField;
    private javax.swing.JTextField cardNumField1;
    private javax.swing.JComboBox<String> cardTypeBox;
    private javax.swing.JComboBox<String> cardTypeBox1;
    private javax.swing.JLabel cardnumLabel;
    private javax.swing.JLabel cardnumLabel1;
    private javax.swing.JButton closeButton1;
    private javax.swing.JButton endButton;
    private javax.swing.JButton endButton1;
    private javax.swing.JLabel expiryBox;
    private javax.swing.JLabel expiryBox1;
    private javax.swing.JComboBox<String> expriyMMBox;
    private javax.swing.JComboBox<String> expriyMMBox1;
    private javax.swing.JComboBox<String> expriyYYBox;
    private javax.swing.JComboBox<String> expriyYYBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel payLabel;
    private javax.swing.JLabel payLabel1;
    private javax.swing.JDialog restaurantInfo;
    private javax.swing.JDialog restaurantmenu;
    private javax.swing.JDialog restpayment;
    private javax.swing.JDialog roompayment;
    private javax.swing.JDialog roomserviceInfo;
    private javax.swing.JDialog roomservicemenu;
    // End of variables declaration//GEN-END:variables
}
