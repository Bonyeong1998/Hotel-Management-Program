package hms.reservation;

import hms.check.RoomState;
import hms.mainmenu.MainMenu;
import hms.source.PeakSeasonCharge;
import hms.source.SFR200;
import hms.source.SFR300;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservationMenu extends javax.swing.JFrame {

    private ArrayList<PeakSeasonChargeInfo> chargeInfo = new ArrayList<>();
    private ArrayList<GuestInfo> guestInfo = new ArrayList<>();
    private ArrayList<AddressInfo> addressInfo = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();
    private ArrayList<CardInfo> cardInfo = new ArrayList<>();

    private int checkCardButton = 0;
    private String checkRoomNum = "";
    private String checkPeopleNum = "";
    private boolean isOverNum = false;

    public ReservationMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchDialog = new javax.swing.JDialog();
        searchButton = new javax.swing.JButton();
        cityLabel = new javax.swing.JLabel();
        streatLabel = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        streataddressLabel = new javax.swing.JLabel();
        detailedLabel = new javax.swing.JLabel();
        detailedTextField = new javax.swing.JTextField();
        roadOutLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cityBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        streetIsEmpty = new javax.swing.JLabel();
        detailedIsEmpty = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ShowFee = new javax.swing.JDialog();
        closeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FeeTable = new javax.swing.JTable();
        FeeText = new javax.swing.JLabel();
        Because = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        BecauseText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        payment = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        card = new javax.swing.JPanel();
        payLabel = new javax.swing.JLabel();
        ConsentCheck = new javax.swing.JCheckBox();
        endButton = new javax.swing.JButton();
        cardTypeBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        cardnumLabel = new javax.swing.JLabel();
        cardNumField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cardNum2Field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cardNum4Field = new javax.swing.JTextField();
        cardNum3Field = new javax.swing.JPasswordField();
        expiryBox = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        expriyMMBox = new javax.swing.JComboBox<>();
        expriyYYBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ConsentLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConsentTexArea = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        BACK_BUTTON = new javax.swing.JButton();
        label2 = new java.awt.Label();
        CheckButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CheckInYear = new javax.swing.JComboBox<>();
        CheckInMonth = new javax.swing.JComboBox<>();
        CheckInDay = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        CodeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        paymentInfo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        PhoneText2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PhoneText3 = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        PersonComboBox = new javax.swing.JComboBox<>();
        possibleNum = new javax.swing.JLabel();
        CHARGE_BUTTON1 = new javax.swing.JButton();
        guessFeeButton = new javax.swing.JButton();
        ReTypeDate = new javax.swing.JLabel();
        Estimation = new javax.swing.JLabel();
        DayTerm = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        RoomText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddressText = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        CheckOutYear = new javax.swing.JComboBox<>();
        CheckOutMonth = new javax.swing.JComboBox<>();
        CheckOutDay = new javax.swing.JComboBox<>();

        SearchDialog.setTitle("주소 검색");
        SearchDialog.setMinimumSize(new java.awt.Dimension(430, 400));
        SearchDialog.setModal(true);
        SearchDialog.setName("search"); // NOI18N

        searchButton.setText("검색");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        cityLabel.setText("시도*");

        streatLabel.setText("도로명*");

        streetField.setText(" ");
        streetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetFieldActionPerformed(evt);
            }
        });

        streataddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        streataddressLabel.setText("도로명주소:");
        streataddressLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        detailedLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        detailedLabel.setText("상세주소:");
        detailedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        roadOutLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setText("주소입력");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "강원도", "경기도", "경상남도", "경상북도", "광주광역시", "대구광역시", "부산광역시", "서울특별시", "세종특별자치시", "울산광역시", "인천광역시", "전라남도", "전라북도", "제주특별자치도", "충청남도", "충청북도" }));

        jLabel4.setFont(new java.awt.Font("굴림", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("* 동, 층, 호 등 상세 주소를 입력하신 후, '주소입력'버튼을 눌러주세요.");

        streetIsEmpty.setFont(new java.awt.Font("굴림", 0, 10)); // NOI18N
        streetIsEmpty.setForeground(new java.awt.Color(204, 0, 0));

        detailedIsEmpty.setFont(new java.awt.Font("굴림", 0, 10)); // NOI18N
        detailedIsEmpty.setForeground(new java.awt.Color(204, 0, 51));
        detailedIsEmpty.setText(" ");

        jLabel14.setFont(new java.awt.Font("굴림", 0, 9)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("도로명v 건물번호");

        javax.swing.GroupLayout SearchDialogLayout = new javax.swing.GroupLayout(SearchDialog.getContentPane());
        SearchDialog.getContentPane().setLayout(SearchDialogLayout);
        SearchDialogLayout.setHorizontalGroup(
            SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDialogLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(SearchDialogLayout.createSequentialGroup()
                            .addComponent(detailedIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchDialogLayout.createSequentialGroup()
                                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(streataddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(detailedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detailedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(roadOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchDialogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchDialogLayout.createSequentialGroup()
                                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(streatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(SearchDialogLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cityBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchButton)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(36, 36, 36))
        );
        SearchDialogLayout.setVerticalGroup(
            SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchDialogLayout.createSequentialGroup()
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchDialogLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streatLabel)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streetIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchDialogLayout.createSequentialGroup()
                        .addComponent(streataddressLabel)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDialogLayout.createSequentialGroup()
                        .addComponent(roadOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailedLabel)
                    .addComponent(detailedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SearchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(SearchDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailedIsEmpty)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        ShowFee.setMinimumSize(new java.awt.Dimension(600, 320));
        ShowFee.setModal(true);
        ShowFee.setName("Fee"); // NOI18N

        closeButton.setText("닫기");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        FeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "방 호수", "기본 인원", "기본 요금", "1인 추가 요금", "최대 인원"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(FeeTable);

        javax.swing.GroupLayout ShowFeeLayout = new javax.swing.GroupLayout(ShowFee.getContentPane());
        ShowFee.getContentPane().setLayout(ShowFeeLayout);
        ShowFeeLayout.setHorizontalGroup(
            ShowFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowFeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowFeeLayout.createSequentialGroup()
                        .addComponent(FeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowFeeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ShowFeeLayout.setVerticalGroup(
            ShowFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowFeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton))
        );

        Because.setMinimumSize(new java.awt.Dimension(430, 400));
        Because.setModal(true);

        jLabel6.setText("변경하는 이유를 작성해주세요");

        BecauseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BecauseTextActionPerformed(evt);
            }
        });

        jButton3.setText("작성완료");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BecauseLayout = new javax.swing.GroupLayout(Because.getContentPane());
        Because.getContentPane().setLayout(BecauseLayout);
        BecauseLayout.setHorizontalGroup(
            BecauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BecauseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
            .addGroup(BecauseLayout.createSequentialGroup()
                .addGroup(BecauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BecauseLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(BecauseText, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BecauseLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel6)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        BecauseLayout.setVerticalGroup(
            BecauseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BecauseLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(82, 82, 82)
                .addComponent(BecauseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(60, 60, 60))
        );

        payment.setBounds(new java.awt.Rectangle(200, 200, 500, 550));
        payment.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

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

        cardTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "카드 선택", "하나 BC", "비씨카드(페이북)", "제주카드", "씨티카드", "신협카드", "현대카드", "하나카드", "KB증권(현대증권)", "전북카드", "카카오뱅크", "KDB산업", "하나(외환)", "광주카드", "케이뱅크", "KB국민", "신한카드", "롯데카드", "NH채움", "우체국카드", "우리카드", "저축은행", "MG새마을", "삼성카드", "수협카드" }));

        cardnumLabel.setText("카드 번호*");

        cardNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNumField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNumFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("-");

        cardNum2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum2FieldKeyTyped(evt);
            }
        });

        jLabel10.setText("-");

        jLabel11.setText("-");

        cardNum4Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum4Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum4FieldKeyTyped(evt);
            }
        });

        cardNum3Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cardNum3Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNum3FieldKeyTyped(evt);
            }
        });

        expiryBox.setText("유효기간*");

        expriyMMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        expriyYYBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel12.setText("/");

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
                                .addComponent(jLabel12)
                                .addGap(6, 6, 6)
                                .addComponent(expriyYYBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ConsentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cardLayout.createSequentialGroup()
                                .addComponent(cardnumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNum3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
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
                    .addComponent(jLabel7)
                    .addComponent(cardNum2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cardNum4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNum3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryBox)
                    .addComponent(expriyMMBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expriyYYBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
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

        jTabbedPane1.addTab("신용카드", null, card, "");

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment.getContentPane());
        payment.getContentPane().setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACK_BUTTON.setText("이전");
        BACK_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BUTTONActionPerformed(evt);
            }
        });

        label2.setText("고객 정보");

        CheckButton.setText("예약하기");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("입실 날짜");

        CheckInYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));

        CheckInMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        CheckInDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jButton2.setText("예약 수정");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("고유ID");

        jLabel9.setText("고유ID는 예약 수정시에만 입력");

        paymentInfo.setText("신용카드 정보");
        paymentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentInfoActionPerformed(evt);
            }
        });

        label3.setText("이름");

        label6.setText("호실");

        label7.setText("전화번호");

        jLabel1.setText("-");

        PhoneText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneText2KeyTyped(evt);
            }
        });

        jLabel2.setText("-");

        PhoneText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneText3ActionPerformed(evt);
            }
        });
        PhoneText3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneText3KeyTyped(evt);
            }
        });

        PhoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneTextKeyTyped(evt);
            }
        });

        label5.setText("인원 수");

        PersonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        CHARGE_BUTTON1.setText("객실 요금표");
        CHARGE_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHARGE_BUTTON1ActionPerformed(evt);
            }
        });

        guessFeeButton.setText("예상금액 확인");
        guessFeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessFeeButtonActionPerformed(evt);
            }
        });

        ReTypeDate.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneText2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(PhoneText3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RoomText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(PersonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(possibleNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CHARGE_BUTTON1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ReTypeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DayTerm, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(Estimation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guessFeeButton))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RoomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PersonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(possibleNum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText)
                            .addComponent(PhoneText3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PhoneText2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DayTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CHARGE_BUTTON1)
                        .addComponent(guessFeeButton))
                    .addComponent(Estimation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReTypeDate, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("주소");

        SearchButton.setText("주소 검색");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SearchButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel3))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel13.setText("퇴실 날짜");

        CheckOutYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));
        CheckOutYear.setMinimumSize(new java.awt.Dimension(51, 21));

        CheckOutMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        CheckOutDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(BACK_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckInYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckInMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckOutYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckOutMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckInDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckOutDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(paymentInfo)
                                .addGap(0, 329, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckInYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckInMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckInDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckOutYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CheckOutMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckOutDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BACK_BUTTON, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton2)
                            .addComponent(CheckButton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACK_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BUTTONActionPerformed
        MainMenu next = new MainMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACK_BUTTONActionPerformed

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        SFR200 a = new SFR200();
        SFR300 b = new SFR300();
        a.FRead();
        b.FRead();

        try {
            a.Split();
            b.Split();
            guestInfo = a.returnGuestInfo();
            roomstate = b.returnRoomState();
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        GuestInfoSave save = new GuestInfoSave();
        String guestinfo;
        String code;
        String name;
        String roomNum;
        String guestNum;
        String phoneNum;
        String address;
        String InYear, InMonth, InDay;
        String OutYear, OutMonth, OutDay;
        String cardtype;
        String cardnum;
        String expriymonth;
        String expriyear;
        String guarantee;

        String money = Estimation.getText();
        code = Integer.toString(guestInfo.size() + 1);
        name = NameText.getText();
        roomNum = RoomText.getText();
        InYear = CheckInYear.getSelectedItem().toString();
        InMonth = CheckInMonth.getSelectedItem().toString();
        InDay = CheckInDay.getSelectedItem().toString();
        OutYear = CheckOutYear.getSelectedItem().toString();
        OutMonth = CheckOutMonth.getSelectedItem().toString();
        OutDay = CheckOutDay.getSelectedItem().toString();
        guestNum = PersonComboBox.getSelectedItem().toString();
        phoneNum = PhoneText.getText() + PhoneText2.getText() + PhoneText3.getText();
        address = AddressText.getText();
        address = address.replace("<br>", "");
        address = address.replace("<html>", "");

        if (checkCardButton == 1) {
            cardtype = cardInfo.get(0).getCardtype();
            cardnum = cardInfo.get(0).getCardNum();
            expriymonth = cardInfo.get(0).getExpriymonth();
            expriyear = cardInfo.get(0).getExpriyyear();
            guarantee = "보증고객";
        } else {
            cardtype = "카드없음";
            cardnum = "카드없음";
            expriymonth = "MM";
            expriyear = "YYYY";
            guarantee = "예약고객";
        }

        guestinfo = code + "|" + name + "|" + roomNum + "|" + InYear + "|" + InMonth + "|" + InDay + "|"
                + OutYear + "|" + OutMonth + "|" + OutDay + "|" + guestNum + "|" + phoneNum + "|" + address + "|"
                + cardtype + "|" + cardnum + "|" + expriymonth + "|" + expriyear + "|" + guarantee + "|" + money + "|";

        int count = 1;

        String InDate = InYear + "|" + InMonth + "|" + InDay;
        String OutDate = OutYear + "|" + OutMonth + "|" + OutDay;
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String today = year + "|" + month + "|" + day;
        int compare1 = 0;
        int compare2 = 0;
        int compare3 = 0;
        int compare4 = 0;
        int compare5 = 0;
        int compare6 = 0;
        
        for (int i = 0; i < guestInfo.size(); i++) {
            if (guestInfo.get(i).getRoomnum().equals(roomNum)) {
                String bookIn = guestInfo.get(i).getInYear() + "|" + guestInfo.get(i).getInMonth() + "|" + guestInfo.get(i).getInDay();
                String bookOut = guestInfo.get(i).getOutYear() + "|" + guestInfo.get(i).getOutMonth() + "|" + guestInfo.get(i).getOutDay();
                
                compare1 = InDate.compareTo(bookIn);
                compare2 = InDate.compareTo(bookOut);
                compare3 = OutDate.compareTo(bookIn);
                compare4 = OutDate.compareTo(bookOut);
                compare5 = InDate.compareTo(today);
                compare6 = InDate.compareTo(OutDate);
                
                if(compare5<0) {
                    count = 2;
                    break;
                }
                if(compare6>=0) {
                    count = 2;
                    break;
                }
                
                if (compare1 < 0 && compare2 < 0 && compare3 < 0 && compare4 < 0) {
                    
                } else if (compare1 < 0 && compare2 < 0 && compare3 == 0 && compare4 < 0) {
                    
                } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                    count = 0;
                } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                    count = 0;
                } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                    count = 0;
                } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                    count = 0;
                } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                    count = 0;
                } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                    count = 0;
                } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                    count = 0;
                } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                    count = 0;
                } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                    count = 0;
                } else if (compare1 > 0 && compare2 == 0 && compare3 > 0 && compare4 > 0) {
                    
                } else if (compare1 > 0 && compare2 > 0 && compare3 > 0 && compare4 > 0) {
                    
                }
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "예약된 방입니다.");
        } else if (count == 2) {
            JOptionPane.showMessageDialog(null, "날짜를 재입력 하십시오.");
        }

        if (isOverNum == true) {
            JOptionPane.showMessageDialog(null, "해당 호실의 최대 인원수를 초과합니다.");
            count = 0;
        }
        if (count == 1) {
            try {
                save.Addguest(guestinfo);
                JOptionPane.showMessageDialog(null, "입력 성공");
                cardInfo.clear();
            } catch (IOException ex) {
                Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            String filepath = "C:\\DB\\\\ADDRESS\\";
            String filename = null;

            String city;
            String street;

            city = cityBox.getSelectedItem().toString();
            street = streetField.getText();

            filename = city + ".txt";
            File file = new File(filepath, filename);
            addressInfo = AddressInOut.FRead(file);

            Stream<AddressInfo> sp = addressInfo.stream().filter(e -> e.getCity().equals(city)
                    && e.getStreat().equals(street));

            sp.forEach(e -> roadOutLabel.setText("<html>" + e.getCity() + " " + e.getSigugun()
                    + " " + e.getEupmyeon() + e.getStreat() + " " + "<br>" + e.getBuildname() + "<html>"));

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String add1, add2;

        add1 = roadOutLabel.getText();
        add2 = detailedTextField.getText();
        AddressText.setText(add1 + " " + add2);

        if (add1.isEmpty()) {
            streetIsEmpty.setText("*도로명을 정확하게 입력해주세요.");
        }
        if (add2.isEmpty())
            detailedIsEmpty.setText("*상세주소를 입력해주세요.");
        else
            SearchDialog.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GuestInfoSave save = new GuestInfoSave();
        String name;
        String code;
        String roomNum;
        String guestNum;
        String phoneNum;
        String address;
        String InYear, InMonth, InDay;
        String OutYear, OutMonth, OutDay;
        String cardtype;
        String cardnum;
        String expriymonth;
        String expriyyear;
        String guarantee;
        String money = Estimation.getText();
        name = NameText.getText();
        roomNum = RoomText.getText();
        InYear = CheckInYear.getSelectedItem().toString();
        InMonth = CheckInMonth.getSelectedItem().toString();
        InDay = CheckInDay.getSelectedItem().toString();
        OutYear = CheckOutYear.getSelectedItem().toString();
        OutMonth = CheckOutMonth.getSelectedItem().toString();
        OutDay = CheckOutDay.getSelectedItem().toString();
        guestNum = PersonComboBox.getSelectedItem().toString();
        phoneNum = PhoneText.getText() + PhoneText2.getText() + PhoneText3.getText();
        address = AddressText.getText();
        address = address.replace("<br>", "");
        address = address.replace("<html>", "");
        int counting = 1;

        if (checkCardButton == 1) {
            cardtype = cardInfo.get(0).getCardtype();
            cardnum = cardInfo.get(0).getCardNum();
            expriymonth = cardInfo.get(0).getExpriymonth();
            expriyyear = cardInfo.get(0).getExpriyyear();
            guarantee = "보증고객";
        } else {
            cardtype = "카드없음";
            cardnum = "카드없음";
            expriymonth = "MM";
            expriyyear = "YYYY";
            guarantee = "예약고객";
        }

        SFR200 a = new SFR200();
        a.FRead();
        code = CodeField.getText();

        try {
            a.Split();
            guestInfo = a.returnGuestInfo();
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(null, "예약 수정을 원한다면 고유ID와 바꿀정보를 입력해야합니다.");
            counting = 0;
        }

        if (counting == 1) {
            for (int i = 0; i < guestInfo.size(); i++) {
                if (!guestInfo.get(i).getInYear().equals(InYear) || !guestInfo.get(i).getInMonth().equals(InMonth) || !guestInfo.get(i).getInDay().equals(InDay)
                        || !guestInfo.get(i).getOutYear().equals(OutYear) || !guestInfo.get(i).getOutMonth().equals(OutMonth) || !guestInfo.get(i).getOutDay().equals(OutDay)) {
                    JOptionPane.showMessageDialog(null, "날짜는 변경하실 수 없습니다.");
                    counting = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < guestInfo.size(); i++) {
            if (!guestInfo.get(i).getRoomnum().equals(roomNum)) {
                try {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy|mm|dd");
                    String InDate = InYear + "|" + InMonth + "|" + InDay;
                    String OutDate = OutYear + "|" + OutMonth + "|" + OutDay;

                    int compare1 = 0;
                    int compare2 = 0;
                    int compare3 = 0;
                    int compare4 = 0;

                    for (int j = 0; j < guestInfo.size(); j++) {
                        if (guestInfo.get(j).getRoomnum().equals(roomNum)) {
                            String bookIn = guestInfo.get(j).getInYear() + "|" + guestInfo.get(j).getInMonth() + "|" + guestInfo.get(j).getInDay();
                            String bookOut = guestInfo.get(j).getOutYear() + "|" + guestInfo.get(j).getOutMonth() + "|" + guestInfo.get(j).getOutDay();

                            Date guestdate = format.parse(bookIn);
                            compare1 = InDate.compareTo(bookIn);
                            compare2 = InDate.compareTo(bookOut);
                            compare3 = OutDate.compareTo(bookIn);
                            compare4 = OutDate.compareTo(bookOut);

                            if (compare1 < 0 && compare2 < 0 && compare3 < 0 && compare4 < 0) {

                            } else if (compare1 < 0 && compare2 < 0 && compare3 == 0 && compare4 < 0) {

                            } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                                counting = 0;
                            } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                                counting = 0;
                            } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                                counting = 0;
                            } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 < 0) {
                                counting = 0;
                            } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                                counting = 0;
                            } else if (compare1 == 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                                counting = 0;
                            } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                                counting = 0;
                            } else if (compare1 < 0 && compare2 < 0 && compare3 > 0 && compare4 == 0) {
                                counting = 0;
                            } else if (compare1 > 0 && compare2 < 0 && compare3 > 0 && compare4 > 0) {
                                counting = 0;
                            } else if (compare1 > 0 && compare2 == 0 && compare3 > 0 && compare4 > 0) {

                            } else if (compare1 > 0 && compare2 > 0 && compare3 > 0 && compare4 > 0) {

                            }
                        }
                    }
                    if (counting == 0) {
                        JOptionPane.showMessageDialog(null, "예약된 방입니다.");
                    }
                } catch (ParseException e) {
                }
            }
        }

        try {
            for (int i = 0; i < guestInfo.size(); i++) {
                if (counting == 1) {
                    if (guestInfo.get(i).getCode().equals(code)) {
                        if (money.isEmpty()) {
                            money = guestInfo.get(i).getMoney();
                        }
                        if (name.isEmpty()) {
                            name = guestInfo.get(i).getName();
                        }
                        if (roomNum.isEmpty()) {
                            roomNum = guestInfo.get(i).getRoomnum();
                        }
                        if (guestNum.equals("1")) {
                            guestNum = guestInfo.get(i).getGuestnum();
                        }
                        if (phoneNum.equals("")) {
                            phoneNum = guestInfo.get(i).getPhone();
                        }
                        if (address.isEmpty()) {
                            address = guestInfo.get(i).getAddress();
                        }
                        if (cardtype.equals("카드없음")) {
                            cardtype = guestInfo.get(i).getCardtype();
                            cardnum = guestInfo.get(i).getCardnum();
                            expriyyear = guestInfo.get(i).getExpriyear();
                            expriymonth = guestInfo.get(i).getExpriymonth();
                            guarantee = guestInfo.get(i).getGuarantee();
                        }
                        save.Inguest(code, name, roomNum, InYear, InMonth, InDay,
                                OutYear, OutMonth, OutDay,
                                guestNum, phoneNum, address, cardtype, cardnum,
                                expriymonth, expriyyear, guarantee, money);
                        checkCardButton = 0;
                        JOptionPane.showMessageDialog(null, "예약 수정");
                        Because.setVisible(true);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String text = BecauseText.getText();
        String code = CodeField.getText();

        File file = new File("C:\\DB\\because.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            FileWriter fw = new FileWriter("C:\\DB\\because.txt", true);
            if (text.isEmpty()) {
                fw.write(code + " " + "이유없음\n");
            } else {
                fw.write(code + " " + text + "\r\n");
            }
            fw.close();
            br.close();
        } catch (Exception e) {

        }
        Because.setVisible((false));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BecauseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BecauseTextActionPerformed

    }//GEN-LAST:event_BecauseTextActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        String cardtype = cardTypeBox.getSelectedItem().toString();
        String cardNum = cardNumField.getText() + "-" + cardNum2Field.getText()
                + "-" + cardNum3Field.getText() + "-" + cardNum4Field.getText();
        String expriymonth = expriyMMBox.getSelectedItem().toString();
        String expriyyear = expriyYYBox.getSelectedItem().toString();

        if (cardtype.equals("카드선택") || cardNum.length() <= 18
                || expriymonth.equals("MM") || expriyyear.equals("YYYY")) {
            JOptionPane.showMessageDialog(this, "정확하게 입력해주세요.", "오류",
                    JOptionPane.ERROR_MESSAGE);
            if (!ConsentCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "개인정보 수집 및 이용에 대해 "
                        + "동의해주세요.", "오류",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            CardInfo getcard = new CardInfo(cardtype, cardNum, expriymonth, expriyyear);
            cardInfo.add(getcard);
            checkCardButton = 1;
            payment.setVisible(false);
        }
    }//GEN-LAST:event_endButtonActionPerformed


    private void cardNumFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNumFieldKeyTyped
        if (cardNumField.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNumFieldKeyTyped

    private void cardNum2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum2FieldKeyTyped
        if (cardNum2Field.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum2FieldKeyTyped

    private void cardNum4FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum4FieldKeyTyped
        if (cardNum4Field.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum4FieldKeyTyped

    private void cardNum3FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNum3FieldKeyTyped
        if (cardNum3Field.getText().length() == 4 || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cardNum3FieldKeyTyped

    private void ConsentTexAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ConsentTexAreaAncestorAdded
        ConsentTexArea.setEditable(false);
    }//GEN-LAST:event_ConsentTexAreaAncestorAdded

    private void paymentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentInfoActionPerformed
        payment.setVisible(true);
    }//GEN-LAST:event_paymentInfoActionPerformed

    private void PhoneText2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneText2KeyTyped
        PhoneKeyType(PhoneText2, evt, 4);
    }//GEN-LAST:event_PhoneText2KeyTyped

    private void PhoneText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneText3ActionPerformed

    }//GEN-LAST:event_PhoneText3ActionPerformed

    private void PhoneText3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneText3KeyTyped
        PhoneKeyType(PhoneText3, evt, 4);
    }//GEN-LAST:event_PhoneText3KeyTyped

    private void PhoneTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneTextKeyTyped
        PhoneKeyType(PhoneText, evt, 3);
    }//GEN-LAST:event_PhoneTextKeyTyped

    private void CHARGE_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHARGE_BUTTON1ActionPerformed
        PeakSeasonCharge sr = new PeakSeasonCharge();

        DefaultTableModel model = (DefaultTableModel) FeeTable.getModel();
        model.setNumRows(0);

        FeeText.setText("객실 요금표\n");
        sr.FRead();
        sr.Split();
        try {
            chargeInfo = sr.returnChargeInfo();
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < chargeInfo.size(); i++) {
            model.insertRow(model.getRowCount(), new Object[]{
                chargeInfo.get(i).getRoom(),
                chargeInfo.get(i).getNumpeople(),
                chargeInfo.get(i).getRoomcharge(),
                chargeInfo.get(i).getExtracharge(),
                chargeInfo.get(i).getMaxpeople()
            });
        }
        ShowFee.setVisible(true);
    }//GEN-LAST:event_CHARGE_BUTTON1ActionPerformed

    private void guessFeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessFeeButtonActionPerformed
        PeakSeasonCharge sr = new PeakSeasonCharge();

        int num = 0;
        int inYear = Integer.parseInt(CheckInYear.getSelectedItem().toString());
        int inMonth = Integer.parseInt(CheckInMonth.getSelectedItem().toString());
        int inDay = Integer.parseInt(CheckInDay.getSelectedItem().toString());
        int outYear = Integer.parseInt(CheckOutYear.getSelectedItem().toString());
        int outMonth = Integer.parseInt(CheckOutMonth.getSelectedItem().toString());
        int outDay = Integer.parseInt(CheckOutDay.getSelectedItem().toString());

        checkRoomNum = RoomText.getText();
        checkPeopleNum = PersonComboBox.getSelectedItem().toString();
        num = Integer.parseInt(checkRoomNum);

        ReTypeDate.setText("");

        Calendar FirstDate = new GregorianCalendar(inYear, inMonth, inDay);
        Calendar SecondDate = new GregorianCalendar(outYear, outMonth, outDay);

        long diffSec = (SecondDate.getTimeInMillis() - FirstDate.getTimeInMillis()) / 1000;
        long diffDays = diffSec / (24 * 60 * 60) + 1;

        int overNum = 0, extraFee = 0;
        long fee = 0;
        possibleNum.setForeground(Color.red);
        isOverNum = false;

        if (RoomText.getText().isEmpty()) {
            possibleNum.setText("호실이 입력되지 않았습니다.");
            Estimation.setText("");
        }

        sr.FRead();
        sr.Split();
        try {
            chargeInfo = sr.returnChargeInfo();
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < chargeInfo.size(); i++) {
            if (diffDays <= 1) {
                ReTypeDate.setText("날짜를 재입력 하세요.");
                Estimation.setText("");
                DayTerm.setText("");
            }
            if (chargeInfo.get(i).getRoom() == num) {
                DayTerm.setText(diffDays + "일");
                if (Integer.parseInt(checkPeopleNum) <= Integer.parseInt(chargeInfo.get(i).getNumpeople())) {
                    fee = diffDays * (Long.parseLong(chargeInfo.get(i).getRoomcharge()));
                    possibleNum.setText("");
                    Estimation.setText(Long.toString(fee));
                } else if (Integer.parseInt(checkPeopleNum) > Integer.parseInt(chargeInfo.get(i).getMaxpeople())) {
                    possibleNum.setText("해당 호실의 최대 인원 수는 " + chargeInfo.get(i).getMaxpeople() + "명 입니다.");
                    isOverNum = true;
                    Estimation.setText("재입력");
                    DayTerm.setText("");
                    break;
                } else if (Integer.parseInt(checkPeopleNum) > Integer.parseInt(chargeInfo.get(i).getNumpeople()) && Integer.parseInt(checkPeopleNum) <= Integer.parseInt(chargeInfo.get(i).getMaxpeople())) {
                    overNum = Integer.parseInt(checkPeopleNum) - Integer.parseInt(chargeInfo.get(i).getNumpeople());
                    extraFee = Integer.parseInt(chargeInfo.get(i).getExtracharge()) * overNum;
                    fee = diffDays * (Long.parseLong(chargeInfo.get(i).getRoomcharge()) + extraFee);
                    possibleNum.setText("");
                    Estimation.setText(Long.toString(fee));
                }
            }
        }
    }//GEN-LAST:event_guessFeeButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        SearchDialog.setVisible(true);
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        ShowFee.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void streetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetFieldActionPerformed

    }//GEN-LAST:event_streetFieldActionPerformed
    //오후 6시 이후 해당 날짜의 보증 고객은 필수 결제 표시(6시에 한 번 체크함.)
    private void vouchEssential() {

        try {
            GuestInfoSave save = new GuestInfoSave();

            SFR200 sr = new SFR200();
            sr.FRead();
            sr.Split();

            guestInfo = sr.returnGuestInfo();

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
            String current = date.format(cal.getTime());

            for (int i = 0; i < guestInfo.size(); i++) {
                guestInfo.get(i).setGuarantee("필수결제");
            }
            SimpleDateFormat hour = new SimpleDateFormat("HH");
            String checkhour = hour.format(cal.getTime());

            for (int i = 0; i < guestInfo.size(); i++) {
                String indate = guestInfo.get(i).getInYear() + "-" + guestInfo.get(i)
                        .getInMonth() + "-" + guestInfo.get(i).getInDay();
                if (indate.equals(current) && !guestInfo.get(i).getCardtype().equals("카드없음")) {
                    if (Integer.parseInt(checkhour) >= 18) {
                        save.essential(guestInfo.get(i).getCode(), guestInfo.get(i).getName(), guestInfo.get(i).getRoomnum(), guestInfo.get(i).getInYear(),
                                guestInfo.get(i).getInMonth(), guestInfo.get(i).getInDay(), guestInfo.get(i).getOutYear(), guestInfo.get(i).getOutMonth(),
                                guestInfo.get(i).getOutDay(), guestInfo.get(i).getGuestnum(), guestInfo.get(i).getPhone(), guestInfo.get(i).getAddress(),
                                guestInfo.get(i).getCardtype(), guestInfo.get(i).getCardnum(), guestInfo.get(i).getExpriymonth(), guestInfo.get(i).getExpriyear(),
                                guestInfo.get(i).getGuarantee(), i, guestInfo.get(i).getMoney());
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ReservationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void vouchGuest() {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 10, 12, 5, 59);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                vouchEssential();
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, cal.getTime(), 1000 * 60 * 60 * 24);
    }

    //폰번호를 받기위해 3, 4자리 이상, 정수가 아닌 자료형을 받지 못하도록 하는 메소드 
    private void PhoneKeyType(JTextField a, KeyEvent evt, int length) {
        if (a.getText().length() == length
                || !(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) {
            evt.consume();
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
            java.util.logging.Logger.getLogger(ReservationMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReservationMenu().vouchGuest();
                new ReservationMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressText;
    private javax.swing.JButton BACK_BUTTON;
    private javax.swing.JDialog Because;
    private javax.swing.JTextField BecauseText;
    private javax.swing.JButton CHARGE_BUTTON1;
    private javax.swing.JButton CheckButton;
    private javax.swing.JComboBox<String> CheckInDay;
    private javax.swing.JComboBox<String> CheckInMonth;
    private javax.swing.JComboBox<String> CheckInYear;
    private javax.swing.JComboBox<String> CheckOutDay;
    private javax.swing.JComboBox<String> CheckOutMonth;
    private javax.swing.JComboBox<String> CheckOutYear;
    private javax.swing.JTextField CodeField;
    private javax.swing.JCheckBox ConsentCheck;
    private javax.swing.JLabel ConsentLabel;
    private javax.swing.JTextArea ConsentTexArea;
    private javax.swing.JLabel DayTerm;
    private javax.swing.JLabel Estimation;
    private javax.swing.JTable FeeTable;
    private javax.swing.JLabel FeeText;
    private javax.swing.JTextField NameText;
    private javax.swing.JComboBox<String> PersonComboBox;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JTextField PhoneText2;
    private javax.swing.JTextField PhoneText3;
    private javax.swing.JLabel ReTypeDate;
    private javax.swing.JTextField RoomText;
    private javax.swing.JButton SearchButton;
    private javax.swing.JDialog SearchDialog;
    private javax.swing.JDialog ShowFee;
    private javax.swing.JPanel card;
    private javax.swing.JTextField cardNum2Field;
    private javax.swing.JPasswordField cardNum3Field;
    private javax.swing.JTextField cardNum4Field;
    private javax.swing.JTextField cardNumField;
    private javax.swing.JComboBox<String> cardTypeBox;
    private javax.swing.JLabel cardnumLabel;
    private javax.swing.JComboBox<String> cityBox;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel detailedIsEmpty;
    private javax.swing.JLabel detailedLabel;
    private javax.swing.JTextField detailedTextField;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel expiryBox;
    private javax.swing.JComboBox<String> expriyMMBox;
    private javax.swing.JComboBox<String> expriyYYBox;
    private javax.swing.JButton guessFeeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JLabel payLabel;
    private javax.swing.JDialog payment;
    private javax.swing.JButton paymentInfo;
    private javax.swing.JLabel possibleNum;
    private javax.swing.JLabel roadOutLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel streatLabel;
    private javax.swing.JLabel streataddressLabel;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel streetIsEmpty;
    // End of variables declaration//GEN-END:variables
}
