package hms.management;

import hms.check.CheckOutInfo;
import hms.check.RoomState;
import hms.reservation.PeakSeasonChargeInfo;
import hms.source.FReport;
import hms.source.PeakSeasonCharge;
import hms.source.SFR300;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Report extends javax.swing.JFrame {

    private ArrayList<ReportInfo> reportinfo = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    private ArrayList<CheckOutInfo> checkout = new ArrayList<>();
    private ArrayList<PeakSeasonChargeInfo> chargeInfo = new ArrayList<>();

    public Report() {
        initComponents();
        DefaultTableCellRenderer renderer
                = (DefaultTableCellRenderer) ReportTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        ReportTable.getTableHeader().setDefaultRenderer(renderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACK_BUTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("굴림체", 1, 18)); // NOI18N
        jLabel1.setText("예외 보고서");

        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "구분", "상세 종류", "예외 종류", "금액"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ReportTable.setMaximumSize(new java.awt.Dimension(32767, 32767));
        ReportTable.setMinimumSize(new java.awt.Dimension(340, 16));
        ReportTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ReportTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ReportTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BACK_BUTTON)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BACK_BUTTON)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed

        ManagementMainMenu next = new ManagementMainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void ReportTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ReportTableAncestorAdded

        try {
            DefaultTableModel report = (DefaultTableModel) ReportTable.getModel();
            report.setNumRows(0);

            FReport freport = new FReport();
            freport.FRead();
            freport.Split();
            reportinfo = freport.returnReportInfo();

            for (int i = 0; i < reportinfo.size(); i++) {
                report.insertRow(report.getRowCount(), new Object[]{
                    reportinfo.get(i).getDivide(),
                    reportinfo.get(i).getType(),
                    reportinfo.get(i).getPricetype(),
                    reportinfo.get(i).getPrice()
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReportTableAncestorAdded
    public void AdditionalGuest() throws IOException {

        PeakSeasonCharge sr = new PeakSeasonCharge();

        SFR300 a = new SFR300();
        a.FRead();
        a.Split();

        roomstate = a.returnRoomState();

        String state = "full";
        String checkindate = null;
        String[] name = new String[2];
        int num = 0;

        a.CRead();
        a.CSplit();
        checkout = a.returnCheckOut();
        String checkoutdate = null;

        for (int i = 0; i < roomstate.size(); i++) {
            for (int j = 0; j < checkout.size(); j++) {
                if (roomstate.get(i).getRoomState().equals(state)
                        && roomstate.get(i).getName().equals(checkout.get(j).getName())
                        && roomstate.get(i).getRoomNum().equals(checkout.get(j).getRoom())) {
                    checkindate = roomstate.get(i).getDate();
                    String[] firstdate = checkindate.split("-");
                    Calendar FirstDate = new GregorianCalendar(Integer.parseInt(firstdate[0]),
                            Integer.parseInt(firstdate[1]), Integer.parseInt(firstdate[2])); //체크인시간

                    checkoutdate = checkout.get(j).getDate();
                    String[] seconddate = checkoutdate.split("-");
                    Calendar SecondDate = new GregorianCalendar(Integer.parseInt(seconddate[0]),
                            Integer.parseInt(seconddate[1]), Integer.parseInt(seconddate[2])); //체크아웃시간
                    long diffSec = (SecondDate.getTimeInMillis() - FirstDate.getTimeInMillis()) / 1000; //계산
                    long diffDays = Math.abs(diffSec / (24 * 60 * 60) + 1); //계산

                    int overNum = 0, extraFee = 0;
                    long fee = 0;
                    num = Integer.parseInt(checkout.get(j).getRoom());
                    sr.FRead(); //객실
                    sr.Split();
                    chargeInfo = sr.returnChargeInfo();
                    for (int k = 0; k < chargeInfo.size(); k++) {

                        if (chargeInfo.get(k).getRoom() == num && diffDays >= 1) { //객실 번호랑 번호가 같으면
                            if (Integer.parseInt(roomstate.get(i).getNum()) > Integer.parseInt(chargeInfo.get(i).getNumpeople())
                                    && Integer.parseInt(roomstate.get(i).getNum()) <= Integer.parseInt(chargeInfo.get(i).getMaxpeople())) {

                                overNum = Integer.parseInt(roomstate.get(i).getNum()) - Integer.parseInt(chargeInfo.get(i).getNumpeople());
                                extraFee = Integer.parseInt(chargeInfo.get(i).getExtracharge()) * overNum;
                                fee = diffDays * (Long.parseLong(chargeInfo.get(i).getRoomcharge()) + extraFee);

                                FReport exceptions = new FReport();
                                String in = null;
                                in = "객실 " + roomstate.get(i).getRoomNum() + " 추가인원" + " +" + (diffDays * extraFee);

                                if (in != null) {
                                    exceptions.FWrite(in);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JTable ReportTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
