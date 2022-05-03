package hms.management;

import hms.check.HotelServiceInfoSave;
import hms.check.HotelServicePrice;
import hms.check.RestaurantServiceInfoSave;
import hms.check.RestaurantServicePrice;
import hms.check.RoomState;
import hms.mainmenu.MainMenu;
import hms.reservation.PeakSeasonChargeInfo;
import hms.reservation.PeakSeasonChargeInfoSave;
import hms.source.DeleteCharge;
import hms.source.DeleteHotelService;
import hms.source.DeleteInfo;
import hms.source.DeleteRestaurant;
import hms.source.LogindataInfo;
import hms.source.RoomServicePriceInfo;
import hms.source.PeakSeasonCharge;
import hms.source.RestaurantPriceInfo;
import hms.source.SFR100;
import hms.source.SFR300;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagementMainMenu extends javax.swing.JFrame {

    private List<PeakSeasonChargeInfo> cinfo = new ArrayList<>();
    private ArrayList<HotelServicePrice> hinfo = new ArrayList<>();
    private ArrayList<RestaurantServicePrice> rinfo = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();

    public ManagementMainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modify = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        ChangeBUTTON = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ROOM_NUM = new javax.swing.JComboBox<>();
        ChangeBUTTON1 = new javax.swing.JButton();
        ROOM_PRICE = new javax.swing.JTextField();
        ChangeBUTTON2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HOTEL_SERVICE = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RESTAURANT_SERVICE = new javax.swing.JComboBox<>();
        H_SERVICE_PRICE = new javax.swing.JTextField();
        R_SERVICE_PRICE = new javax.swing.JTextField();
        BACK_BUTTON1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        IN_PW = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DOUBLE_CHECK = new javax.swing.JTextField();
        PW_CHECK = new javax.swing.JButton();
        add = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IN_ROOM = new javax.swing.JTextField();
        IN_PRICE = new javax.swing.JTextField();
        ADDButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IN_H_SERVICE = new javax.swing.JTextField();
        IN_H_PRICE = new javax.swing.JTextField();
        ADDButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IN_R_SERVICE = new javax.swing.JTextField();
        IN_R_PRICE = new javax.swing.JTextField();
        ADDButton3 = new javax.swing.JButton();
        delete = new javax.swing.JDialog();
        DeleteTable = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        DEL_ROOMDEL_BUTTON = new javax.swing.JButton();
        DEL_LOAD_BUTTON = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hotelTable = new javax.swing.JTable();
        DEL_HSERVICE_DEL = new javax.swing.JButton();
        DEL_LOAD_HSERVICE = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        restaurantTable = new javax.swing.JTable();
        DEL_RSERVICE_DEL = new javax.swing.JButton();
        DEL_LOAD_RSERVICE = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        D_UserTable = new javax.swing.JTable();
        StaffDelete = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        MODIFY_CHECK = new javax.swing.JDialog();
        Add = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Delelte = new javax.swing.JButton();
        ApPeriod_BUTTON = new javax.swing.JButton();
        CtPeriod_BUTTON = new javax.swing.JButton();
        FoodProfit_BUTTON = new javax.swing.JButton();
        CREATEID_BUTTON = new javax.swing.JButton();
        Report_BUTTON = new javax.swing.JButton();
        BACK_BUTTON = new javax.swing.JButton();
        IDmodifyBUTTON = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        modify.setBounds(new java.awt.Rectangle(0, 0, 400, 400));
        modify.setModal(true);

        jTabbedPane2.setMinimumSize(new java.awt.Dimension(100, 46));

        ChangeBUTTON.setText("변경");
        ChangeBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBUTTONActionPerformed(evt);
            }
        });

        jLabel5.setText("가격");

        jLabel1.setText("객실");

        jLabel6.setText("가격");

        ROOM_NUM.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ROOM_NUMAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ROOM_NUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_NUMActionPerformed(evt);
            }
        });

        ChangeBUTTON1.setText("변경");
        ChangeBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBUTTON1ActionPerformed(evt);
            }
        });

        ROOM_PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_PRICEActionPerformed(evt);
            }
        });
        ROOM_PRICE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ROOM_PRICEKeyTyped(evt);
            }
        });

        ChangeBUTTON2.setText("변경");
        ChangeBUTTON2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBUTTON2ActionPerformed(evt);
            }
        });

        jLabel2.setText("가격");

        HOTEL_SERVICE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                HOTEL_SERVICEAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        HOTEL_SERVICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOTEL_SERVICEActionPerformed(evt);
            }
        });

        jLabel3.setText("호텔 서비스");

        jLabel4.setText("레스토랑");

        RESTAURANT_SERVICE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RESTAURANT_SERVICEAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BACK_BUTTON1.setText("이전");
        BACK_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTON1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ROOM_NUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(RESTAURANT_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(HOTEL_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(R_SERVICE_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChangeBUTTON2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(H_SERVICE_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChangeBUTTON1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ROOM_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChangeBUTTON)))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BACK_BUTTON1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ROOM_NUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ROOM_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ChangeBUTTON))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HOTEL_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(H_SERVICE_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ChangeBUTTON1))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RESTAURANT_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_SERVICE_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ChangeBUTTON2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(BACK_BUTTON1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("호텔 정보", jPanel7);

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PW"
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
        UserTable.setMaximumSize(new java.awt.Dimension(32767, 32767));
        UserTable.setMinimumSize(new java.awt.Dimension(340, 16));
        UserTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                UserTableComponentAdded(evt);
            }
        });
        UserTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UserTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setMinWidth(50);
            UserTable.getColumnModel().getColumn(0).setMaxWidth(50);
            UserTable.getColumnModel().getColumn(1).setMinWidth(80);
            UserTable.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        jLabel16.setText("새로운 PW:");

        jLabel17.setText("중복 확인:");

        PW_CHECK.setText("변경");
        PW_CHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PW_CHECKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(PW_CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IN_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOUBLE_CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IN_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(DOUBLE_CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(PW_CHECK))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("사용자 정보", jPanel8);

        javax.swing.GroupLayout modifyLayout = new javax.swing.GroupLayout(modify.getContentPane());
        modify.getContentPane().setLayout(modifyLayout);
        modifyLayout.setHorizontalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        modifyLayout.setVerticalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add.setBounds(new java.awt.Rectangle(0, 0, 500, 500));
        add.setMinimumSize(new java.awt.Dimension(320, 340));
        add.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        add.setSize(new java.awt.Dimension(0, 0));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(310, 330));

        jLabel11.setText("객실");

        jLabel12.setText("가격");

        ADDButton1.setText("추가");
        ADDButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("인원 수");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel14.setText("최대 인원 수");

        jLabel15.setText("추가 금액");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ADDButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(85, 85, 85)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IN_ROOM, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IN_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(IN_ROOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(IN_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(ADDButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("객실", jPanel1);

        jLabel7.setText("호텔 서비스");

        jLabel8.setText("가격");

        IN_H_SERVICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IN_H_SERVICEActionPerformed(evt);
            }
        });

        ADDButton.setText("추가");
        ADDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IN_H_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IN_H_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IN_H_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(IN_H_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(ADDButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("호텔 서비스", jPanel2);

        jLabel9.setText("레스토랑 서비스");

        jLabel10.setText("가격");

        IN_R_PRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IN_R_PRICEActionPerformed(evt);
            }
        });

        ADDButton3.setText("추가");
        ADDButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IN_R_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IN_R_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADDButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IN_R_SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(IN_R_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(ADDButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("레스토랑", jPanel3);

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add.getContentPane());
        add.getContentPane().setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        delete.setBounds(new java.awt.Rectangle(0, 0, 400, 400));
        delete.setMinimumSize(new java.awt.Dimension(360, 450));
        delete.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "호실", "인원수", "가격", "추가인원가격", "최대인원수"
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
        roomTable.setMaximumSize(new java.awt.Dimension(32767, 32767));
        roomTable.setMinimumSize(new java.awt.Dimension(340, 16));
        roomTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                roomTableComponentAdded(evt);
            }
        });
        roomTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                roomTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(roomTable);
        if (roomTable.getColumnModel().getColumnCount() > 0) {
            roomTable.getColumnModel().getColumn(0).setMinWidth(50);
            roomTable.getColumnModel().getColumn(0).setMaxWidth(50);
            roomTable.getColumnModel().getColumn(0).setHeaderValue("type");
            roomTable.getColumnModel().getColumn(1).setMinWidth(50);
            roomTable.getColumnModel().getColumn(1).setMaxWidth(50);
            roomTable.getColumnModel().getColumn(2).setMinWidth(80);
            roomTable.getColumnModel().getColumn(2).setMaxWidth(80);
            roomTable.getColumnModel().getColumn(3).setMinWidth(90);
            roomTable.getColumnModel().getColumn(3).setMaxWidth(90);
            roomTable.getColumnModel().getColumn(3).setHeaderValue("추가인원가격");
            roomTable.getColumnModel().getColumn(4).setMinWidth(70);
            roomTable.getColumnModel().getColumn(4).setMaxWidth(70);
            roomTable.getColumnModel().getColumn(4).setHeaderValue("최대인원수");
        }

        DEL_ROOMDEL_BUTTON.setText("삭제");
        DEL_ROOMDEL_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_ROOMDEL_BUTTONActionPerformed(evt);
            }
        });

        DEL_LOAD_BUTTON.setText("불러오기");
        DEL_LOAD_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_LOAD_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(DEL_LOAD_BUTTON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DEL_ROOMDEL_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEL_ROOMDEL_BUTTON)
                    .addComponent(DEL_LOAD_BUTTON))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        DeleteTable.addTab("객실", jPanel4);

        hotelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "서비스 종류", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        hotelTable.setMaximumSize(new java.awt.Dimension(32767, 32767));
        hotelTable.setMinimumSize(new java.awt.Dimension(340, 16));
        jScrollPane2.setViewportView(hotelTable);

        DEL_HSERVICE_DEL.setText("삭제");
        DEL_HSERVICE_DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_HSERVICE_DELActionPerformed(evt);
            }
        });

        DEL_LOAD_HSERVICE.setText("불러오기");
        DEL_LOAD_HSERVICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_LOAD_HSERVICEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addComponent(DEL_LOAD_HSERVICE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEL_HSERVICE_DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEL_HSERVICE_DEL)
                    .addComponent(DEL_LOAD_HSERVICE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        DeleteTable.addTab("호텔서비스", jPanel5);

        restaurantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "레스토랑 서비스 종류", "가격"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restaurantTable.setMinimumSize(new java.awt.Dimension(340, 16));
        jScrollPane3.setViewportView(restaurantTable);

        DEL_RSERVICE_DEL.setText("삭제");
        DEL_RSERVICE_DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_RSERVICE_DELActionPerformed(evt);
            }
        });

        DEL_LOAD_RSERVICE.setText("불러오기");
        DEL_LOAD_RSERVICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEL_LOAD_RSERVICEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addComponent(DEL_LOAD_RSERVICE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEL_RSERVICE_DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEL_LOAD_RSERVICE)
                    .addComponent(DEL_RSERVICE_DEL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DeleteTable.addTab("레스토랑", jPanel6);

        D_UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PW"
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
        D_UserTable.setMaximumSize(new java.awt.Dimension(32767, 32767));
        D_UserTable.setMinimumSize(new java.awt.Dimension(340, 16));
        D_UserTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                D_UserTableComponentAdded(evt);
            }
        });
        D_UserTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                D_UserTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(D_UserTable);
        if (D_UserTable.getColumnModel().getColumnCount() > 0) {
            D_UserTable.getColumnModel().getColumn(0).setMinWidth(50);
            D_UserTable.getColumnModel().getColumn(0).setMaxWidth(50);
            D_UserTable.getColumnModel().getColumn(1).setMinWidth(80);
            D_UserTable.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        StaffDelete.setText("삭제");
        StaffDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffDeleteActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("*관리자 아이디는 삭제할 수 없습니다.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StaffDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel18)
                        .addGap(42, 42, 42)
                        .addComponent(StaffDelete))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        DeleteTable.addTab("사용자 정보", jPanel9);

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete.getContentPane());
        delete.getContentPane().setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteTable, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteTable)
                .addContainerGap())
        );

        MODIFY_CHECK.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        MODIFY_CHECK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MODIFY_CHECK.setMinimumSize(new java.awt.Dimension(300, 340));
        MODIFY_CHECK.setModal(true);
        MODIFY_CHECK.setSize(new java.awt.Dimension(0, 0));

        Add.setText("추가");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Modify.setText("수정");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Delelte.setText("삭제");
        Delelte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelelteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MODIFY_CHECKLayout = new javax.swing.GroupLayout(MODIFY_CHECK.getContentPane());
        MODIFY_CHECK.getContentPane().setLayout(MODIFY_CHECKLayout);
        MODIFY_CHECKLayout.setHorizontalGroup(
            MODIFY_CHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MODIFY_CHECKLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(MODIFY_CHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delelte, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        MODIFY_CHECKLayout.setVerticalGroup(
            MODIFY_CHECKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MODIFY_CHECKLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Add)
                .addGap(18, 18, 18)
                .addComponent(Modify)
                .addGap(18, 18, 18)
                .addComponent(Delelte)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ApPeriod_BUTTON.setText("지정기간 점유율");
        ApPeriod_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApPeriod_BUTTONActionPerformed(evt);
            }
        });

        CtPeriod_BUTTON.setText("일정기간 점유율");
        CtPeriod_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtPeriod_BUTTONActionPerformed(evt);
            }
        });

        FoodProfit_BUTTON.setText("식품 수익");
        FoodProfit_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodProfit_BUTTONActionPerformed(evt);
            }
        });

        CREATEID_BUTTON.setText("직원 ID생성");
        CREATEID_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEID_BUTTONActionPerformed(evt);
            }
        });

        Report_BUTTON.setText("보고서");
        Report_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Report_BUTTONActionPerformed(evt);
            }
        });

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        IDmodifyBUTTON.setText("정보 수정");
        IDmodifyBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDmodifyBUTTONActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel19.setText("관리 메뉴");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CREATEID_BUTTON)
                            .addComponent(IDmodifyBUTTON))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BACK_BUTTON)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FoodProfit_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ApPeriod_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CtPeriod_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Report_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApPeriod_BUTTON)
                    .addComponent(CtPeriod_BUTTON))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoodProfit_BUTTON)
                    .addComponent(Report_BUTTON))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BACK_BUTTON)
                            .addComponent(IDmodifyBUTTON))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(CREATEID_BUTTON)
                        .addGap(0, 44, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTON1ActionPerformed
        modify.setVisible(false);
    }//GEN-LAST:event_BACK_BUTTON1ActionPerformed

    private void IDmodifyBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDmodifyBUTTONActionPerformed
        MODIFY_CHECK.setVisible(true);
    }//GEN-LAST:event_IDmodifyBUTTONActionPerformed

    private void ApPeriod_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApPeriod_BUTTONActionPerformed
        AppointPeriod next = new AppointPeriod();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_ApPeriod_BUTTONActionPerformed

    private void CtPeriod_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtPeriod_BUTTONActionPerformed
        CertainPeriod next = new CertainPeriod();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CtPeriod_BUTTONActionPerformed

    private void FoodProfit_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodProfit_BUTTONActionPerformed
        FoodProfit next = new FoodProfit();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_FoodProfit_BUTTONActionPerformed

    private void Report_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Report_BUTTONActionPerformed
        Report next = new Report();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Report_BUTTONActionPerformed

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        MainMenu next = new MainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void CREATEID_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEID_BUTTONActionPerformed
        CreateId next = new CreateId();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CREATEID_BUTTONActionPerformed

    private void ChangeBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBUTTONActionPerformed

        try {
            int roomnum = Integer.parseInt(ROOM_NUM.getSelectedItem().toString());
            String fee = ROOM_PRICE.getText();

            PeakSeasonChargeInfoSave save = new PeakSeasonChargeInfoSave();
            PeakSeasonCharge chargeinfo = new PeakSeasonCharge();

            chargeinfo.FRead();
            chargeinfo.Split();
            cinfo = chargeinfo.returnChargeInfo();

            if (fee.isEmpty()) {
                JOptionPane.showMessageDialog(null, "변경을 원하실 경우 가격을 정확히 입력해주세요.");
            }
            for (int i = 0; i < cinfo.size(); i++) {
                if (cinfo.get(i).getRoom() == roomnum) {

                    save.InChargeInfo(i, roomnum, cinfo.get(i).getNumpeople(),
                            fee, cinfo.get(i).getExtracharge(),
                            cinfo.get(i).getMaxpeople());// 정보 넣기

                    JOptionPane.showMessageDialog(null, "변경 완료");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ChangeBUTTONActionPerformed

    private void ROOM_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_PRICEActionPerformed

    }//GEN-LAST:event_ROOM_PRICEActionPerformed

    private void ROOM_PRICEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ROOM_PRICEKeyTyped
        if (!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_ROOM_PRICEKeyTyped

    private void HOTEL_SERVICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOTEL_SERVICEActionPerformed

    }//GEN-LAST:event_HOTEL_SERVICEActionPerformed

    private void ChangeBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBUTTON1ActionPerformed
        try {
            String service = HOTEL_SERVICE.getSelectedItem().toString();
            String price = H_SERVICE_PRICE.getText();
            HotelServiceInfoSave save = new HotelServiceInfoSave();
            RoomServicePriceInfo hotelserviceinfo = new RoomServicePriceInfo();
            hotelserviceinfo.FRead();
            hotelserviceinfo.Split();
            hinfo = hotelserviceinfo.returnRSServiceInfo();
            if (price.isEmpty()) {
                JOptionPane.showMessageDialog(null, "변경을 원하실 경우 가격을 정확히 입력해주세요.");
            }
            for (int i = 0; i < hinfo.size(); i++) {
                if (hinfo.get(i).getService().equals(service)) {
                    save.InHotelServiceInfo(i, service, price);// 정보 넣기
                    JOptionPane.showMessageDialog(null, "변경 완료");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangeBUTTON1ActionPerformed

    private void ChangeBUTTON2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBUTTON2ActionPerformed
        try {
            String service = RESTAURANT_SERVICE.getSelectedItem().toString();
            String price = R_SERVICE_PRICE.getText();

            RestaurantServiceInfoSave save = new RestaurantServiceInfoSave();
            RestaurantPriceInfo restaurantserviceinfo = new RestaurantPriceInfo();

            restaurantserviceinfo.FRead();
            restaurantserviceinfo.Split();

            rinfo = restaurantserviceinfo.returnRTServiceInfo();

            if (price.isEmpty()) {
                JOptionPane.showMessageDialog(null, "변경을 원하실 경우 가격을 정확히 입력해주세요.");
            }
            for (int i = 0; i < rinfo.size(); i++) {
                if (rinfo.get(i).getService().equals(service)) {
                    save.InRestaurantServiceInfo(i, service, price);// 정보 넣기
                    JOptionPane.showMessageDialog(null, "변경 완료");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangeBUTTON2ActionPerformed

    private void ROOM_NUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_NUMActionPerformed

    }//GEN-LAST:event_ROOM_NUMActionPerformed

    private void ROOM_NUMAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ROOM_NUMAncestorAdded

        try {
            PeakSeasonCharge chargeinfo = new PeakSeasonCharge();
            chargeinfo.FRead();
            chargeinfo.Split();

            cinfo = chargeinfo.returnChargeInfo();

            for (int i = 0; i < cinfo.size(); i++) {
                ROOM_NUM.addItem(Integer.toString(cinfo.get(i).getRoom()));
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ROOM_NUMAncestorAdded

    private void HOTEL_SERVICEAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_HOTEL_SERVICEAncestorAdded

        try {
            RoomServicePriceInfo hotelserviceinfo = new RoomServicePriceInfo();
            hotelserviceinfo.FRead();
            hotelserviceinfo.Split();

            hinfo = hotelserviceinfo.returnRSServiceInfo();

            for (int i = 0; i < hinfo.size(); i++) {
                HOTEL_SERVICE.addItem(hinfo.get(i).getService());
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HOTEL_SERVICEAncestorAdded

    private void RESTAURANT_SERVICEAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RESTAURANT_SERVICEAncestorAdded
        
        try {
            RestaurantPriceInfo restaurantserviceinfo = new RestaurantPriceInfo();

            restaurantserviceinfo.FRead();
            restaurantserviceinfo.Split();

            rinfo = restaurantserviceinfo.returnRTServiceInfo();

            for (int i = 0; i < rinfo.size(); i++) {
                RESTAURANT_SERVICE.addItem(rinfo.get(i).getService());
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RESTAURANT_SERVICEAncestorAdded

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        modify.setVisible(true);
    }//GEN-LAST:event_ModifyActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        add.setVisible(true);
    }//GEN-LAST:event_AddActionPerformed

    private void DelelteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelelteActionPerformed
        delete.setVisible(true);
    }//GEN-LAST:event_DelelteActionPerformed

    private void IN_H_SERVICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IN_H_SERVICEActionPerformed

    }//GEN-LAST:event_IN_H_SERVICEActionPerformed

    private void ADDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButtonActionPerformed
        try {
            int cnt = 0;
            String service = IN_H_SERVICE.getText();
            String price = IN_H_PRICE.getText();

            RoomServicePriceInfo hotelserviceinfo = new RoomServicePriceInfo();

            hotelserviceinfo.FRead();
            hotelserviceinfo.Split();

            hinfo = hotelserviceinfo.returnRSServiceInfo();

            if (price.isEmpty()||service.isEmpty()) {
                JOptionPane.showMessageDialog(null, "정확히 입력해주세요.");
            } else {
                for (int i = 0; i < hinfo.size(); i++) {
                    if (service.equals(hinfo.get(i).getService())) {
                        JOptionPane.showMessageDialog(null, "이미 있는 내용입니다.");
                        cnt = 1;
                    }
                }
                if (cnt == 0) {
                    String a = service + " " + price;
                    hotelserviceinfo.PWrite(a);
                    JOptionPane.showMessageDialog(null, "추가되었습니다.");
                }
                cnt = 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ADDButtonActionPerformed

    private void IN_R_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IN_R_PRICEActionPerformed

    }//GEN-LAST:event_IN_R_PRICEActionPerformed

    private void ADDButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButton3ActionPerformed

        try {
            int cnt = 0;
            String service = IN_R_SERVICE.getText();
            String price = IN_R_PRICE.getText();

            RestaurantPriceInfo restaurantserviceinfo = new RestaurantPriceInfo();

            restaurantserviceinfo.FRead();
            restaurantserviceinfo.Split();

            rinfo = restaurantserviceinfo.returnRTServiceInfo();

            if (price.isEmpty()||service.isEmpty()) {
                JOptionPane.showMessageDialog(null, "정확히 입력해주세요.");
            } else {
                for (int i = 0; i < rinfo.size(); i++) {
                    if (service.equals(rinfo.get(i).getService())) {
                        JOptionPane.showMessageDialog(null, "이미 있는 내용입니다.");
                        cnt = 1;
                    }
                }
                if (cnt == 0) {
                    String a = service + " " + price;
                    restaurantserviceinfo.PWrite(a);
                    JOptionPane.showMessageDialog(null,"추가되었습니다.");
                }
                cnt = 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ADDButton3ActionPerformed

    private void ADDButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButton1ActionPerformed

        try {
            int cnt = 0;
            int roomnum = Integer.parseInt(IN_ROOM.getText());
            String fee = IN_PRICE.getText();
            String numpeople = jTextField1.getText();
            String maxpeople = jTextField2.getText();
            String extracharge = jTextField3.getText();

            PeakSeasonCharge chargeinfo = new PeakSeasonCharge();
            chargeinfo.FRead();

            chargeinfo.Split();
            cinfo = chargeinfo.returnChargeInfo();
            
            SFR300 state =new SFR300();
            state.FRead();
            state.Split();
            roomstate = state.returnRoomState();
            
            if (fee.isEmpty()||numpeople.isEmpty()||maxpeople.isEmpty()||extracharge.isEmpty()) {
                JOptionPane.showMessageDialog(null, "정확히 입력해주세요.");
            } else if(cinfo.size()>=100){
                JOptionPane.showMessageDialog(null, "이 호텔은 총 100개의 객실로 한정되어있습니다.");
                cnt = 1;
            }else {
               
                for (int i = 0; i < cinfo.size(); i++) {
                    if (roomnum == cinfo.get(i).getRoom()) {
                        JOptionPane.showMessageDialog(null, "이미 있는 내용입니다.");
                        cnt = 1;
                    }
                }
                if (cnt == 0) {
                    PeakSeasonChargeInfo a = new PeakSeasonChargeInfo(roomnum, numpeople, fee, extracharge, maxpeople);
                    cinfo.add(a);
                    Collections.sort(cinfo, new Comparator<PeakSeasonChargeInfo>() {
                        @Override
                        public int compare(PeakSeasonChargeInfo r1, PeakSeasonChargeInfo r2) {
                            if (r1.getRoom() < r2.getRoom()) {
                                return -1;
                            } else if (r1.getRoom() > r2.getRoom()) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    
                    BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\peakFee.txt", false));
                    log.close();
                    for (PeakSeasonChargeInfo p : cinfo) {
                        String str = Integer.toString(p.getRoom()) + " " + p.getNumpeople() + " " + p.getRoomcharge()
                                + " " + p.getExtracharge() + " " + p.getMaxpeople();
                        chargeinfo.FWrite(str);
                    }
                    state.FWrite( roomstate.size()+1+" "+roomnum +" empty guestname num date checkintime guesscheckouttime");
                }
                JOptionPane.showMessageDialog(null, "추가되었습니다.");
                cnt = 0;
                add.setVisible(false);
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ADDButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void DEL_LOAD_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_LOAD_BUTTONActionPerformed
        try {
            DefaultTableModel charge = (DefaultTableModel) roomTable.getModel();
            charge.setNumRows(0);

            PeakSeasonCharge chargeinfo = new PeakSeasonCharge();
            chargeinfo.FRead();
            chargeinfo.Split();
            cinfo = chargeinfo.returnChargeInfo();

            for (int i = 0; i < cinfo.size(); i++) {
                charge.insertRow(charge.getRowCount(), new Object[]{
                    cinfo.get(i).getRoom(),
                    cinfo.get(i).getNumpeople(),
                    cinfo.get(i).getRoomcharge(),
                    cinfo.get(i).getExtracharge(),
                    cinfo.get(i).getMaxpeople()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DEL_LOAD_BUTTONActionPerformed

    private void DEL_LOAD_HSERVICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_LOAD_HSERVICEActionPerformed

        try {
            DefaultTableModel hotel = (DefaultTableModel) hotelTable.getModel();
            hotel.setNumRows(0);

            RoomServicePriceInfo hotelserviceinfo = new RoomServicePriceInfo();

            hotelserviceinfo.FRead();
            hotelserviceinfo.Split();

            hinfo = hotelserviceinfo.returnRSServiceInfo();

            for (int i = 0; i < hinfo.size(); i++) {
                hotel.insertRow(hotel.getRowCount(), new Object[]{
                    hinfo.get(i).getService(),
                    hinfo.get(i).getPrice()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DEL_LOAD_HSERVICEActionPerformed

    private void roomTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_roomTableAncestorAdded

    }//GEN-LAST:event_roomTableAncestorAdded

    private void roomTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_roomTableComponentAdded

    }//GEN-LAST:event_roomTableComponentAdded

    private void DEL_ROOMDEL_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_ROOMDEL_BUTTONActionPerformed

        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = roomTable.getSelectedRow();
        nCol = roomTable.getSelectedColumn();

        int room = 0;
        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            Object roomNum = model.getValueAt(nRow, 0);
            String str = roomNum.toString();
            room = Integer.parseInt(str);
        }
        if (room != 0) {
            try {
                PeakSeasonCharge chargeinfo = new PeakSeasonCharge();

                chargeinfo.FRead();
                chargeinfo.Split();

                cinfo = chargeinfo.returnChargeInfo();

                int end = cinfo.size();
                
                DeleteCharge d_chargeinfo = new DeleteCharge();
                for (int i = 0; i < cinfo.size(); i++) {
                    if (cinfo.get(i).getRoom() == room) {
                        String delete = Integer.toString(cinfo.get(i).getRoom()) + " "
                                + cinfo.get(i).getNumpeople() + " " + cinfo.get(i).getRoomcharge()
                                + " " + cinfo.get(i).getExtracharge() + " " + cinfo.get(i).getMaxpeople();
                        d_chargeinfo.FWrite(delete);
                        
                        File file = new File("C:\\DB\\peakFee.txt");
                        DeleteInfo cdelete = new DeleteInfo();
                        cdelete.serviceInfo(i, file);
                        
                    }
                }
                room = 0;
                JOptionPane.showMessageDialog(null, "성공적으로 삭제되었습니다.");
                delete.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DEL_ROOMDEL_BUTTONActionPerformed

    private void DEL_HSERVICE_DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_HSERVICE_DELActionPerformed

        DefaultTableModel model = (DefaultTableModel) hotelTable.getModel();

        int nRow = -1;
        int nCol = -1;
        nRow = hotelTable.getSelectedRow();
        nCol = hotelTable.getSelectedColumn();

        String service = null;
        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            Object checkservice = model.getValueAt(nRow, 0);
            service = checkservice.toString();
        }
        if (service != null) {
            try {
                RoomServicePriceInfo hotelserviceinfo = new RoomServicePriceInfo();
                hotelserviceinfo.FRead();
                hotelserviceinfo.Split();

                hinfo = hotelserviceinfo.returnRSServiceInfo();

                DeleteHotelService d_hotelservice = new DeleteHotelService();

                for (int i = 0; i < hinfo.size(); i++) {
                    if (hinfo.get(i).getService().equals(service)) {
                        String delete = hinfo.get(i).getService() + " " + hinfo.get(i).getPrice();
                        d_hotelservice.FWrite(delete);
                        File file = new File("C:\\DB\\hotelserviceprice.txt");
                        DeleteInfo hdelete = new DeleteInfo();
                        hdelete.serviceInfo(i, file);
                    
                    } 
                    
                }
                service = null;
                JOptionPane.showMessageDialog(null, "성공적으로 삭제되었습니다.");
                delete.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DEL_HSERVICE_DELActionPerformed

    private void DEL_LOAD_RSERVICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_LOAD_RSERVICEActionPerformed

        try {
            DefaultTableModel restaurant = (DefaultTableModel) restaurantTable.getModel();
            restaurant.setNumRows(0);

            RestaurantPriceInfo restaurantserviceinfo = new RestaurantPriceInfo();
            restaurantserviceinfo.FRead();
            restaurantserviceinfo.Split();

            rinfo = restaurantserviceinfo.returnRTServiceInfo();

            for (int i = 0; i < rinfo.size(); i++) {
                restaurant.insertRow(restaurant.getRowCount(), new Object[]{
                    rinfo.get(i).getService(),
                    rinfo.get(i).getPrice()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DEL_LOAD_RSERVICEActionPerformed

    private void DEL_RSERVICE_DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEL_RSERVICE_DELActionPerformed

        DefaultTableModel model = (DefaultTableModel) restaurantTable.getModel();
        int nRow = -1;
        int nCol = -1;
        nRow = restaurantTable.getSelectedRow();
        nCol = restaurantTable.getSelectedColumn();

        String service = null;
        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            Object checkservice = model.getValueAt(nRow, 0);
            service = checkservice.toString();
        }

        if (service != null) {
            try {
                RestaurantPriceInfo restaurantserviceinfo = new RestaurantPriceInfo();
                restaurantserviceinfo.FRead();
                restaurantserviceinfo.Split();

                rinfo = restaurantserviceinfo.returnRTServiceInfo();

                DeleteRestaurant d_restaurantservice = new DeleteRestaurant();

                for (int i = 0; i < rinfo.size(); i++) {
                    if (rinfo.get(i).getService().equals(service)) {
                        String delete = rinfo.get(i).getService() + " " + rinfo.get(i).getPrice();
                        d_restaurantservice.FWrite(delete);
                        
                        File file = new File("C:\\DB\\restaurantprice.txt");
                        DeleteInfo hdelete = new DeleteInfo();
                        hdelete.serviceInfo(i, file);
                    
                    }
                }
                service = null;
                JOptionPane.showMessageDialog(null, "성공적으로 삭제되었습니다.");
                delete.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DEL_RSERVICE_DELActionPerformed

    private void UserTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_UserTableComponentAdded

    }//GEN-LAST:event_UserTableComponentAdded

    private void UserTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UserTableAncestorAdded

        ArrayList<LogindataInfo> staffinfo = new ArrayList<>();
        try {
            SFR100 sr = new SFR100();
            sr.FRead();
            sr.Split();

            DefaultTableModel user = (DefaultTableModel) UserTable.getModel();
            user.setNumRows(0);

            staffinfo = sr.returnLogininfo();

            for (int i = 0; i < staffinfo.size(); i++) {
                user.insertRow(user.getRowCount(), new Object[]{
                    staffinfo.get(i).getId(),
                    staffinfo.get(i).getPw()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UserTableAncestorAdded

    private void PW_CHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PW_CHECKActionPerformed
        try {
            ArrayList<LogindataInfo> staffinfo = new ArrayList<>();

            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();

            int nRow = -1;
            int nCol = -1;
            nRow = UserTable.getSelectedRow();
            nCol = UserTable.getSelectedColumn();

            String changepw = null;

            if (nRow == -1 && nCol == -1) {
                JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
            } else {
                Object pw = model.getValueAt(nRow, 1);
                changepw = pw.toString();
            }

            SFR100 sr = new SFR100();
            sr.FRead();
            sr.Split();

            staffinfo = sr.returnLogininfo();

            for (int i = 0; i < staffinfo.size(); i++) {
                if (staffinfo.get(i).getPw().equals(changepw)) {
                    if (IN_PW.getText().equals(DOUBLE_CHECK.getText())) {
                        if (i == 0) {
                            try {
                                sr.AWrite(staffinfo.get(i).getId() + " " + IN_PW.getText());
                            } catch (IOException ex) {
                                Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\staffID.txt", false));
                                log.close();
                                for (int j = 1; j < staffinfo.size(); j++) {
                                    String str = staffinfo.get(j).getId() + " " + IN_PW.getText();
                                    sr.SWrite(str);
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "변경 완료");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PW_CHECKActionPerformed

    private void D_UserTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_D_UserTableComponentAdded

    }//GEN-LAST:event_D_UserTableComponentAdded

    private void D_UserTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_D_UserTableAncestorAdded
        ArrayList<LogindataInfo> staffinfo = new ArrayList<>();
        try {
            DefaultTableModel user = (DefaultTableModel) D_UserTable.getModel();
            user.setNumRows(0);

            SFR100 sr = new SFR100();
            sr.FRead();
            sr.Split();

            staffinfo = sr.returnLogininfo();

            for (int i = 0; i < staffinfo.size(); i++) {
                user.insertRow(user.getRowCount(), new Object[]{
                    staffinfo.get(i).getId(),
                    staffinfo.get(i).getPw()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_D_UserTableAncestorAdded

    private void StaffDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffDeleteActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) D_UserTable.getModel();
            int nRow = -1;
            int nCol = -1;
            nRow = D_UserTable.getSelectedRow();
            nCol = D_UserTable.getSelectedColumn();

            String pw = null;
            String id = null;
            if (nRow == -1 && nCol == -1) {
                JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
            } else {
                Object Pw = model.getValueAt(nRow, 1);
                pw = Pw.toString();
                Object Id = model.getValueAt(nRow, 0);
                id = Id.toString();
            }

            ArrayList<LogindataInfo> staffinfo = new ArrayList<>();

            SFR100 sr = new SFR100();
            sr.FRead();
            sr.Split();

            staffinfo = sr.returnLogininfo();

            for (int i = 0; i < staffinfo.size(); i++) {
                if (staffinfo.get(i).getId().equals(id) && staffinfo.get(i).getPw().equals(pw)) {
                    if (i != 0) {
                        staffinfo.remove(i);
                    } else {
                        JOptionPane.showMessageDialog(null, "관리자는 삭제할 수 없습니다.");
                        break;
                    }
                    BufferedWriter log = new BufferedWriter(new FileWriter("C:\\DB\\staffID.txt", false));
                    log.close();
                    for (int j = 1; j < staffinfo.size(); j++) {
                        String str = staffinfo.get(j).getId() + " " + staffinfo.get(j).getPw();
                        sr.SWrite(str);
                    }
                    JOptionPane.showMessageDialog(null, "성공적으로 삭제되었습니다.");
                    delete.setVisible(false);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagementMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StaffDeleteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagementMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton;
    private javax.swing.JButton ADDButton1;
    private javax.swing.JButton ADDButton3;
    private javax.swing.JButton Add;
    private javax.swing.JButton ApPeriod_BUTTON;
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JButton BACK_BUTTON1;
    private javax.swing.JButton CREATEID_BUTTON;
    private javax.swing.JButton ChangeBUTTON;
    private javax.swing.JButton ChangeBUTTON1;
    private javax.swing.JButton ChangeBUTTON2;
    private javax.swing.JButton CtPeriod_BUTTON;
    private javax.swing.JButton DEL_HSERVICE_DEL;
    private javax.swing.JButton DEL_LOAD_BUTTON;
    private javax.swing.JButton DEL_LOAD_HSERVICE;
    private javax.swing.JButton DEL_LOAD_RSERVICE;
    private javax.swing.JButton DEL_ROOMDEL_BUTTON;
    private javax.swing.JButton DEL_RSERVICE_DEL;
    private javax.swing.JTextField DOUBLE_CHECK;
    private javax.swing.JTable D_UserTable;
    private javax.swing.JButton Delelte;
    private javax.swing.JTabbedPane DeleteTable;
    private javax.swing.JButton FoodProfit_BUTTON;
    private javax.swing.JComboBox<String> HOTEL_SERVICE;
    private javax.swing.JTextField H_SERVICE_PRICE;
    private javax.swing.JButton IDmodifyBUTTON;
    private javax.swing.JTextField IN_H_PRICE;
    private javax.swing.JTextField IN_H_SERVICE;
    private javax.swing.JTextField IN_PRICE;
    private javax.swing.JTextField IN_PW;
    private javax.swing.JTextField IN_ROOM;
    private javax.swing.JTextField IN_R_PRICE;
    private javax.swing.JTextField IN_R_SERVICE;
    private javax.swing.JDialog MODIFY_CHECK;
    private javax.swing.JButton Modify;
    private javax.swing.JButton PW_CHECK;
    private javax.swing.JComboBox<String> RESTAURANT_SERVICE;
    private javax.swing.JComboBox<String> ROOM_NUM;
    private javax.swing.JTextField ROOM_PRICE;
    private javax.swing.JTextField R_SERVICE_PRICE;
    private javax.swing.JButton Report_BUTTON;
    private javax.swing.JButton StaffDelete;
    private javax.swing.JTable UserTable;
    private javax.swing.JDialog add;
    private javax.swing.JDialog delete;
    private javax.swing.JTable hotelTable;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JDialog modify;
    private javax.swing.JTable restaurantTable;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
