package hms.check;

import hms.reservation.ReservationMenu;

import hms.reservation.GuestInfo;
import hms.search.SearchMenu;
import hms.source.SFR200;
import hms.source.SFR300;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CheckIN extends javax.swing.JFrame {

    private ArrayList<GuestInfo> guestInfo = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    String[] blank = new String[4];


    public CheckIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchInfo = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        NAME_Field = new javax.swing.JTextField();
        ROOM_Field = new javax.swing.JTextField();
        SEARCH_BUTTON = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        LoadInfo = new javax.swing.JButton();
        searchName = new javax.swing.JRadioButton();
        searchRoom = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        BACK_BUTTON = new javax.swing.JButton();
        bookedButton = new javax.swing.JButton();
        nonbookedButton = new javax.swing.JButton();
        RoomNum = new javax.swing.JTextField();
        inButton = new javax.swing.JButton();
        BookingName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GuestNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        searchInfo.setMinimumSize(new java.awt.Dimension(568, 400));
        searchInfo.setModal(true);

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호수", "인원", "번호", "기간"
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
        jScrollPane3.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setMinWidth(20);
            searchTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            searchTable.getColumnModel().getColumn(1).setMinWidth(20);
            searchTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            searchTable.getColumnModel().getColumn(2).setMinWidth(10);
            searchTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            searchTable.getColumnModel().getColumn(3).setMinWidth(40);
            searchTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        SEARCH_BUTTON.setText("검색");
        SEARCH_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BUTTONActionPerformed(evt);
            }
        });

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        LoadInfo.setText("가져오기");
        LoadInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadInfoActionPerformed(evt);
            }
        });

        searchName.setText("이름");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });

        searchRoom.setText("호실");

        jLabel1.setText("예약자 명단");

        javax.swing.GroupLayout searchInfoLayout = new javax.swing.GroupLayout(searchInfo.getContentPane());
        searchInfo.getContentPane().setLayout(searchInfoLayout);
        searchInfoLayout.setHorizontalGroup(
            searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchInfoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchInfoLayout.createSequentialGroup()
                            .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(searchInfoLayout.createSequentialGroup()
                                    .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(searchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addComponent(SEARCH_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))
                                .addGroup(searchInfoLayout.createSequentialGroup()
                                    .addComponent(LoadInfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchInfoLayout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)))))
        );
        searchInfoLayout.setVerticalGroup(
            searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchInfoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAME_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchName))
                .addGap(25, 25, 25)
                .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ROOM_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCH_BUTTON)
                    .addComponent(searchRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(LoadInfo))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        bookedButton.setText("예약 고객");
        bookedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedButtonActionPerformed(evt);
            }
        });

        nonbookedButton.setText("비예약 고객");
        nonbookedButton.setToolTipText("");
        nonbookedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonbookedButtonActionPerformed(evt);
            }
        });

        RoomNum.setEditable(false);

        inButton.setText("체크인");
        inButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inButtonActionPerformed(evt);
            }
        });

        BookingName.setEditable(false);

        jLabel3.setText("이름");

        jLabel4.setText("호수");

        jLabel2.setText("인원");

        GuestNum.setEditable(false);

        jLabel5.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel5.setText("체크인");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(BACK_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(bookedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nonbookedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BookingName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(RoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuestNum, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookedButton)
                    .addComponent(nonbookedButton))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inButton)
                    .addComponent(GuestNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(BACK_BUTTON)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        CheckMenu next = new CheckMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void nonbookedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonbookedButtonActionPerformed
        ReservationMenu next = new ReservationMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_nonbookedButtonActionPerformed

    private void bookedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedButtonActionPerformed
        NAME_Field.setText("");
        ROOM_Field.setText("");
       
        DefaultTableModel search = (DefaultTableModel) searchTable.getModel();
        
        search.setNumRows(0);
        ButtonGroup check = new ButtonGroup();
        check.add(searchName);
        check.add(searchRoom);
        try {
            SFR200 sr = new SFR200();
            sr.FRead();
            sr.Split();
            guestInfo = sr.returnGuestInfo();
            
            SimpleDateFormat ft = new SimpleDateFormat("yyyy|MM|dd");
            String SystemTime = ft.format(System.currentTimeMillis());
            Date system = ft.parse(SystemTime);
            int compare = 0;
            
            for (int i = 0; i < guestInfo.size(); i++) {
                String InDate = guestInfo.get(i).getInYear() + "|" + guestInfo.get(i).getInMonth() + "|" + guestInfo.get(i).getInDay();
                Date guestDate = ft.parse(InDate);
                compare = guestDate.compareTo(system);
                
                if(compare >= 0) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        guestInfo.get(i).getName(),
                        guestInfo.get(i).getRoomnum(),
                        guestInfo.get(i).getGuestnum(),
                        guestInfo.get(i).getPhone(),
                        guestInfo.get(i).getInYear()+"."+guestInfo.get(i).getInMonth()+"."+guestInfo.get(i).getInDay()+" ~ "
                                +guestInfo.get(i).getOutYear()+"."+guestInfo.get(i).getOutMonth()+"."+guestInfo.get(i).getOutDay()
                    });
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException e) {
        }     
        searchInfo.setVisible(true);
    }//GEN-LAST:event_bookedButtonActionPerformed

    private void SEARCH_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BUTTONActionPerformed
        String name = NAME_Field.getText();
        String room = ROOM_Field.getText();
        for (int i = 0; i < guestInfo.size(); i++) {
            if(searchName.isSelected()) {
                if (guestInfo.get(i).getName().equals(name)) {
                    searchTable.changeSelection(i, 0, false , false);
                }
            }
            if(searchRoom.isSelected()) {
                if (guestInfo.get(i).getRoomnum().equals(room)) {
                    searchTable.changeSelection(i, 0, false , false);
                }
            }
        }
    }//GEN-LAST:event_SEARCH_BUTTONActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        searchInfo.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void LoadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadInfoActionPerformed
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        
        int nRow = -1;
        int nCol = -1;
        
        nRow = searchTable.getSelectedRow();
        nCol = searchTable.getSelectedColumn();

        if (nRow == -1 && nCol == -1) {
            JOptionPane.showMessageDialog(null, "선택된 값이 없습니다.");
        } else {
            Object roomNum = model.getValueAt(nRow, 1);
            Object name = model.getValueAt(nRow, 0);
            Object guestNum = model.getValueAt(nRow, 2);
            String str = roomNum.toString();
            String str2 = name.toString();
            String str3 = guestNum.toString();

            RoomNum.setText(str);
            BookingName.setText(str2);
            GuestNum.setText(str3);
            searchInfo.setVisible(false);
        }
    }//GEN-LAST:event_LoadInfoActionPerformed

    private void inButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inButtonActionPerformed
        int cnt = 0;
        try {
            String num = RoomNum.getText();
            String name = BookingName.getText();
            String guestNum = GuestNum.getText();

            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());
            SFR200 sr = new SFR200();
            ReservationCancle cs = new ReservationCancle();
            sr.FRead();
            sr.Split();

            guestInfo = sr.returnGuestInfo();
            
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
            String current = date.format(cal.getTime());

            SimpleDateFormat hour = new SimpleDateFormat("HH");
            String checkhour = hour.format(cal.getTime());

            for (int i = 0; i < guestInfo.size(); i++) {
                String indate = guestInfo.get(i).getInYear() + "-" + guestInfo.get(i)
                        .getInMonth() + "-" + guestInfo.get(i).getInDay();
                if (num.equals(guestInfo.get(i).getRoomnum()) && indate.equals(current)
                        && guestInfo.get(i).getCardtype().equals("카드없음")) {
                    if (Integer.parseInt(checkhour) >= 18) {
                        cs.cancle(i);
                        JOptionPane.showMessageDialog(null, "예약이 취소되었습니다.");
                        cnt = 1;
                    }
                }
            }
            if (cnt != 1) {
                SFR300 a = new SFR300();
                a.FRead();
                String state = "empty";
                try {
                    a.Split();
                    roomstate = a.returnRoomState();
                } catch (IOException ex) {
                    Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (int i = 0; i < roomstate.size(); i++) {
                    if (roomstate.get(i).getRoomNum().equals(num) && roomstate.get(i).getRoomState().equals(state)) {
                        RoomStateSave save = new RoomStateSave();
                        try {
                            save.Inguest(num, roomstate.get(i).getIndex(), name, time, guestNum);
                            JOptionPane.showMessageDialog(null, "체크인 성공");
                        } catch (IOException ex) {
                        }
                    }
                    else if(roomstate.get(i).getRoomNum().equals(num) && !roomstate.get(i).getRoomState().equals(state)) {
                        JOptionPane.showMessageDialog(null, "이미 체크인 되어 있습니다");
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inButtonActionPerformed

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameActionPerformed
   public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JTextField BookingName;
    private javax.swing.JTextField GuestNum;
    private javax.swing.JButton LoadInfo;
    private javax.swing.JTextField NAME_Field;
    private javax.swing.JTextField ROOM_Field;
    private javax.swing.JTextField RoomNum;
    private javax.swing.JButton SEARCH_BUTTON;
    private javax.swing.JButton bookedButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton inButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nonbookedButton;
    private javax.swing.JDialog searchInfo;
    private javax.swing.JRadioButton searchName;
    private javax.swing.JRadioButton searchRoom;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
