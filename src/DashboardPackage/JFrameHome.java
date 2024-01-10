/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DashboardPackage;

import java.sql.Connection;
import Config.Koneksi;
import LoginPackage.JFrameLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import rojerusan.RSMaterialButtonRectangle;

/**
 *
 * @author USER
 */
public class JFrameHome extends javax.swing.JFrame {
    private String username;
    private String level;
    private Connection conn;

    private void getDataEmployee() {
        DefaultTableModel model = (DefaultTableModel) dataEmployee.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM user";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String nip      = rs.getString("nip");
                String nama     = rs.getString("nama");
                String gender   = rs.getString("gender");
                String jabatan  = rs.getString("jabatan");
                String email    = rs.getString("email");
                
                Object[] rowData = {nip,nama,gender,jabatan,email};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void getDataHistory() {
        DefaultTableModel model = (DefaultTableModel) dataHistory.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM attendance";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String nip      = rs.getString("nip");
                String nama     = rs.getString("nama");
                String tanggal   = rs.getString("tanggal");
                String keterangan  = rs.getString("keterangan");
                
                Object[] rowData = {nip,nama,tanggal,keterangan};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void getDataRecap(){
        DefaultTableModel model = (DefaultTableModel) tblDataRecap.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM user";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String nip      = rs.getString("nip");
                String nama     = rs.getString("nama");
                String gender   = rs.getString("gender");
                String jabatan  = rs.getString("jabatan");
                String email    = rs.getString("email");
                
                Object[] rowData = {nip,nama,gender,jabatan,email};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
        private void clearEmployeeData(){
            txtNipData.setText("");
            txtNameData.setText("");
            txtEmailData.setText("");
            cbPosition.setSelectedIndex(-1);
            cbGender.setSelectedIndex(-1);
        }

    public JFrameHome() {
        initComponents();
        //      penangkapan variable login dari JframeLogin untuk ditampilkan kedalam label
        this.username = "Default";
        this.level = "Default";
        LabelUserLevel.setText(this.username);
        LabelUserProfil.setText(this.level);

    }
      // Konstruktor dengan parameter
    public JFrameHome(String username, String level) {
        initComponents();
        conn = Koneksi.getConnection();
        getDataEmployee();
        getDataHistory();
        getDataRecap();

        //Switch Menu Panel
        PanelDashboard.setVisible(true);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        
        //Main menu panel Switch
        Dashboard.setVisible(true);
        Employee.setVisible(false);
        Attendance.setVisible(false);
        Announcement.setVisible(false);
        Recapitulation.setVisible(false);
        About.setVisible(false);
        
        
        // Inisialisasi nilai username dan level dari JFrameLogin
        this.username = username;
        this.level = level;

        // Atur nilai label sesuai dengan username dan level
        LabelUserLevel.setText(this.level);
        LabelUserProfil.setText(this.username);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtama = new javax.swing.JPanel();
        PanelMenu = new keeptoo.KGradientPanel();
        PanelMenu1 = new keeptoo.KGradientPanel();
        LabelUserProfil = new javax.swing.JLabel();
        LabelUserLevel = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        PanelMenuHead = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDashboard = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelAttendance = new javax.swing.JLabel();
        labelAnnouncement = new javax.swing.JLabel();
        labelRecap = new javax.swing.JLabel();
        labelAbout = new javax.swing.JLabel();
        labelLogout = new javax.swing.JLabel();
        PanelDashboard = new javax.swing.JPanel();
        PanelAttendance = new javax.swing.JPanel();
        PanelData = new javax.swing.JPanel();
        PanelAnnouncement = new javax.swing.JPanel();
        PanelRecap = new javax.swing.JPanel();
        PanelAbout = new javax.swing.JPanel();
        panelLogout = new javax.swing.JPanel();
        PanelNavbar = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelBox1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelLine = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelBox2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelLine1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        panelChart = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        Employee = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataEmployee = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        txtEmailData = new javax.swing.JTextField();
        txtNameData = new javax.swing.JTextField();
        txtNipData = new javax.swing.JTextField();
        cbPosition = new javax.swing.JComboBox<>();
        btnEdit = new keeptoo.KButton();
        btnCancel = new keeptoo.KButton();
        btnDelete1 = new keeptoo.KButton();
        Attendance = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelFormAttn = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        radioBtnPresent = new javax.swing.JRadioButton();
        radioBtnLate = new javax.swing.JRadioButton();
        radioBtnPermission = new javax.swing.JRadioButton();
        radioBtnAlpha = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        btnSimpanAttendance = new rojerusan.RSMaterialButtonRectangle();
        txtNip = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataHistory = new javax.swing.JTable();
        btnUnduhData = new rojerusan.RSMaterialButtonRectangle();
        Announcement = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Recapitulation = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataRecap = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        btnUnduh = new rojerusan.RSMaterialButtonRectangle();
        About = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        gbr_gedung = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUtama.setBackground(new java.awt.Color(255, 255, 255));
        PanelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setkEndColor(new java.awt.Color(255, 255, 255));
        PanelMenu.setkStartColor(new java.awt.Color(86, 177, 222));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        PanelMenu1.setkEndColor(new java.awt.Color(204, 204, 204));
        PanelMenu1.setkStartColor(new java.awt.Color(86, 177, 222));
        PanelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelUserProfil.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LabelUserProfil.setText("user");
        PanelMenu1.add(LabelUserProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, -1));

        LabelUserLevel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelUserLevel.setText("level");
        PanelMenu1.add(LabelUserLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, -1));

        labelUser.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        labelUser.setText("Welcome !");
        PanelMenu1.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 80, 20));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/profile.png"))); // NOI18N
        PanelMenu1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        PanelMenuHead.setBackground(new java.awt.Color(0, 153, 204));
        PanelMenuHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Company");
        PanelMenuHead.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("App");
        PanelMenuHead.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 20));

        PanelMenu1.add(PanelMenuHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        PanelMenu.add(PanelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 160));

        labelDashboard.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/dashboardIcon.png"))); // NOI18N
        labelDashboard.setText("Dashboard");
        labelDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDashboardMouseClicked(evt);
            }
        });
        PanelMenu.add(labelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        labelData.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/dataIcon.png"))); // NOI18N
        labelData.setText("Employee ");
        labelData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDataMouseClicked(evt);
            }
        });
        PanelMenu.add(labelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        labelAttendance.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/AttendanceIcon.png"))); // NOI18N
        labelAttendance.setText("Attendance");
        labelAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAttendanceMouseClicked(evt);
            }
        });
        PanelMenu.add(labelAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        labelAnnouncement.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelAnnouncement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/announcement.png"))); // NOI18N
        labelAnnouncement.setText("Announcement");
        labelAnnouncement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAnnouncement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAnnouncementMouseClicked(evt);
            }
        });
        PanelMenu.add(labelAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        labelRecap.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelRecap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/RecapIcon.png"))); // NOI18N
        labelRecap.setText("Recapitulation");
        labelRecap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRecap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRecapMouseClicked(evt);
            }
        });
        PanelMenu.add(labelRecap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        labelAbout.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/aboutIcon.png"))); // NOI18N
        labelAbout.setText("About");
        labelAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAboutMouseClicked(evt);
            }
        });
        PanelMenu.add(labelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        labelLogout.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        labelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/logoutIcon.png"))); // NOI18N
        labelLogout.setText("Logout");
        labelLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoutMouseClicked(evt);
            }
        });
        PanelMenu.add(labelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        PanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 40));

        PanelAttendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 40));

        PanelData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 40));

        PanelAnnouncement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 40));

        PanelRecap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelRecap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 40));

        PanelAbout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(PanelAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        panelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelMenu.add(panelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 40));

        PanelUtama.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        PanelNavbar.setBackground(new java.awt.Color(86, 177, 222));
        PanelNavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelUtama.add(PanelNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 25)); // NOI18N
        jLabel1.setText("DASHBOARD");
        Dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel3.setText("Overview & Statistic");
        Dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        panelBox1.setBackground(new java.awt.Color(255, 255, 255));
        panelBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        panelBox1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setText("Karyawan");
        panelBox1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel8.setText("120");
        panelBox1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Employee Data Table");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBox1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        panelLine.setBackground(new java.awt.Color(255, 255, 255));
        panelLine.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        panelLine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBox1.add(panelLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/userIcon.png"))); // NOI18N
        panelBox1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 80));

        Dashboard.add(panelBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 190, 140));

        panelBox2.setBackground(new java.awt.Color(255, 255, 255));
        panelBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        panelBox2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/userIcon.png"))); // NOI18N
        panelBox2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 80));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel11.setText("Pelamar");
        panelBox2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel12.setText("40");
        panelBox2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        panelLine1.setBackground(new java.awt.Color(255, 255, 255));
        panelLine1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        panelLine1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBox2.add(panelLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 10));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Applicant Data Table");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBox2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        Dashboard.add(panelBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 190, 140));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel14.setText("Bar Chart");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Dashboard.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 610, 40));

        panelChart.setBackground(new java.awt.Color(255, 255, 255));
        panelChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLineChart.setBackground(new java.awt.Color(255, 255, 255));
        panelLineChart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 0, 0)));
        panelLineChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/barchartImg.png"))); // NOI18N
        panelLineChart.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        panelChart.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 210));

        panelBarChart.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/pychartImg_1.png"))); // NOI18N
        panelBarChart.add(jLabel44);

        panelChart.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 210));

        Dashboard.add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 610, 260));

        PanelUtama.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        Employee.setBackground(new java.awt.Color(255, 255, 255));
        Employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel15.setText("Data Table Employment");
        Employee.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        dataEmployee.setAutoCreateRowSorter(true);
        dataEmployee.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        dataEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIP", "Name", "Gender", "Position", "Email"
            }
        ));
        dataEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataEmployee.setGridColor(new java.awt.Color(0, 153, 255));
        dataEmployee.setRowHeight(55);
        dataEmployee.setRowMargin(10);
        dataEmployee.setSelectionForeground(new java.awt.Color(0, 0, 0));
        dataEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataEmployee);

        Employee.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 640, 190));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setText("Active Employees");
        Employee.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Search :");
        Employee.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        Employee.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 62, 180, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel33.setText("Change Employement Data");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 20));

        Employee.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 640, 50));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel29.setText("NIP :");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel30.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel30.setText("Name :");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel32.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel32.setText("Email :");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel28.setText("Position :");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jLabel31.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        jLabel31.setText("Gender :");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        jPanel4.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        txtEmailData.setBackground(new java.awt.Color(153, 204, 255));
        txtEmailData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(txtEmailData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 30));

        txtNameData.setBackground(new java.awt.Color(153, 204, 255));
        txtNameData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(txtNameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 30));

        txtNipData.setBackground(new java.awt.Color(153, 204, 255));
        txtNipData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(txtNipData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 30));

        cbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Employee" }));
        jPanel4.add(cbPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("Change Data");
        btnEdit.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnEdit.setkEndColor(new java.awt.Color(255, 255, 255));
        btnEdit.setkForeGround(new java.awt.Color(0, 0, 102));
        btnEdit.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnEdit.setkHoverForeGround(new java.awt.Color(0, 0, 153));
        btnEdit.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnEdit.setkPressedColor(new java.awt.Color(0, 0, 0));
        btnEdit.setkStartColor(new java.awt.Color(0, 204, 204));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 40));

        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCancel.setkBackGroundColor(new java.awt.Color(0, 0, 255));
        btnCancel.setkEndColor(new java.awt.Color(255, 255, 255));
        btnCancel.setkForeGround(new java.awt.Color(0, 0, 102));
        btnCancel.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnCancel.setkHoverForeGround(new java.awt.Color(51, 0, 153));
        btnCancel.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnCancel.setkStartColor(new java.awt.Color(0, 204, 204));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 120, 40));

        btnDelete1.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete1.setText("Delete Data");
        btnDelete1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnDelete1.setkEndColor(new java.awt.Color(255, 255, 255));
        btnDelete1.setkForeGround(new java.awt.Color(0, 0, 102));
        btnDelete1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnDelete1.setkHoverForeGround(new java.awt.Color(0, 0, 153));
        btnDelete1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnDelete1.setkStartColor(new java.awt.Color(0, 204, 204));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 120, 40));

        Employee.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 640, 260));

        PanelUtama.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        Attendance.setBackground(new java.awt.Color(255, 255, 255));
        Attendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 25)); // NOI18N
        jLabel18.setText("ATTENDANCE");
        Attendance.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Fulfill Your Attendantion To Get A Good Reputation");
        Attendance.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Please Fill Your Presence");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        Attendance.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 640, 50));

        panelFormAttn.setBackground(new java.awt.Color(153, 204, 255));
        panelFormAttn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelFormAttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Status");
        panelFormAttn.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        radioBtnPresent.setBackground(new java.awt.Color(153, 204, 255));
        radioBtnPresent.setText("Present");
        panelFormAttn.add(radioBtnPresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        radioBtnLate.setBackground(new java.awt.Color(153, 204, 255));
        radioBtnLate.setText("Late");
        panelFormAttn.add(radioBtnLate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        radioBtnPermission.setBackground(new java.awt.Color(153, 204, 255));
        radioBtnPermission.setText("Permission");
        panelFormAttn.add(radioBtnPermission, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        radioBtnAlpha.setBackground(new java.awt.Color(153, 204, 255));
        radioBtnAlpha.setText("Alpha");
        panelFormAttn.add(radioBtnAlpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel21.setText("Select Date");
        panelFormAttn.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        panelFormAttn.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, -1));

        btnSimpanAttendance.setText("Submit");
        btnSimpanAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanAttendanceActionPerformed(evt);
            }
        });
        panelFormAttn.add(btnSimpanAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 100, 40));
        panelFormAttn.add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, -1));

        jLabel34.setText("Insert NIP");
        panelFormAttn.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        Attendance.add(panelFormAttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 640, 200));

        dataHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIP", "Name", "Date", "Information"
            }
        ));
        jScrollPane3.setViewportView(dataHistory);

        Attendance.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 640, 230));

        btnUnduhData.setText("Download Data");
        btnUnduhData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnduhDataActionPerformed(evt);
            }
        });
        Attendance.add(btnUnduhData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 150, 50));

        PanelUtama.add(Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        Announcement.setBackground(new java.awt.Color(255, 255, 255));
        Announcement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel23.setText("Announcement !");
        Announcement.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/meeting.jpg"))); // NOI18N
        Announcement.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel39.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel39.setText("Meeting Conference will be held At White House October 28 - 29 2024");
        Announcement.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel24.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel24.setText("We are pleased to announce that the business meeting conference will be held on [date] at [time].");
        Announcement.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel41.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel41.setText("Let's attend this event together to discuss opportunities for collaboration and innovation in the ");
        Announcement.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 580, -1));

        jLabel42.setText("world of business.");
        Announcement.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        PanelUtama.add(Announcement, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        Recapitulation.setBackground(new java.awt.Color(255, 255, 255));
        Recapitulation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel26.setText("Recap Of Company Employee Data");
        Recapitulation.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tblDataRecap.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblDataRecap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIP", "Name", "Gender", "Position", "Email"
            }
        ));
        tblDataRecap.setRowHeight(50);
        tblDataRecap.setRowMargin(5);
        jScrollPane2.setViewportView(tblDataRecap);

        Recapitulation.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 650, -1));

        jLabel27.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel27.setText("The data displayed is all permanent employee data who already have access to the application.");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Recapitulation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));

        btnUnduh.setText("Download");
        btnUnduh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnduhActionPerformed(evt);
            }
        });
        Recapitulation.add(btnUnduh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 120, 40));

        PanelUtama.add(Recapitulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        About.setBackground(new java.awt.Color(255, 255, 255));
        About.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel2.setText("About Us");
        About.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("PT Company FFA, founded in 2024, is a leader in the field of Technology.");
        About.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("The focus on innovation, quality and superior service makes it the top choice in the market.");
        About.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("With a vision of becoming something, PT Company FFA is also active in social responsibility and sustainability.");
        About.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("His high dedication makes him a trusted partner and positive contributor in various aspects.");
        About.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        gbr_gedung.setBackground(new java.awt.Color(255, 255, 255));
        gbr_gedung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/about.jpg"))); // NOI18N
        gbr_gedung.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 650, 310));

        About.add(gbr_gedung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 700, 360));

        PanelUtama.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 650));

        getContentPane().add(PanelUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDashboardMouseClicked
        //Switch menu panel
        PanelDashboard.setVisible(true);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        Dashboard.setVisible(true);
        
        //Main panel ditampilkan
        Dashboard.setVisible(true);
        Employee.setVisible(false);
        Attendance.setVisible(false);
        Recapitulation.setVisible(false);
        Announcement.setVisible(false);
//        Setting.setVisible(false);
        About.setVisible(false);
    }//GEN-LAST:event_labelDashboardMouseClicked

    private void labelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDataMouseClicked
        // Switch menu panel
        PanelDashboard.setVisible(false);
        PanelData.setVisible(true);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        
        //Main panel ditampilkan
        Dashboard.setVisible(false);
        Employee.setVisible(true);
        Attendance.setVisible(false);
        Recapitulation.setVisible(false);
        Announcement.setVisible(false);
//        Setting.setVisible(false);
        About.setVisible(false);
    }//GEN-LAST:event_labelDataMouseClicked

    private void labelAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAttendanceMouseClicked
        // Switch menu panel
        PanelDashboard.setVisible(false);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(true);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        
        //Main panel ditampilkan
        Dashboard.setVisible(false);
        Employee.setVisible(false);
        Attendance.setVisible(true);
        Recapitulation.setVisible(false);
        Announcement.setVisible(false);
//        Setting.setVisible(false);
        About.setVisible(false);
    }//GEN-LAST:event_labelAttendanceMouseClicked

    private void labelAnnouncementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAnnouncementMouseClicked
        // Switch menu panel
        PanelDashboard.setVisible(false);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(true);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        
        //Main panel ditampilkan
        Dashboard.setVisible(false);
        Employee.setVisible(false);
        Attendance.setVisible(false);
        Announcement.setVisible(true);
        Recapitulation.setVisible(false);
        About.setVisible(false);
    }//GEN-LAST:event_labelAnnouncementMouseClicked

    private void labelRecapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecapMouseClicked
        // Switch menu panel
        PanelDashboard.setVisible(false);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(true);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(false);
        
        //Main panel ditampilkan
        Dashboard.setVisible(false);
        Employee.setVisible(false);
        Attendance.setVisible(false);
        Recapitulation.setVisible(true);
        Announcement.setVisible(false);
        About.setVisible(false);
    }//GEN-LAST:event_labelRecapMouseClicked

    private void labelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAboutMouseClicked
        // Switch menu panel
        PanelDashboard.setVisible(false);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(true);
        panelLogout.setVisible(false);
        
        //Main panel ditampilkan
        Dashboard.setVisible(false);
        Employee.setVisible(false);
        Attendance.setVisible(false);
        Recapitulation.setVisible(false);
        Announcement.setVisible(false);
//        Setting.setVisible(false);
        About.setVisible(true);
    }//GEN-LAST:event_labelAboutMouseClicked

    private void labelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoutMouseClicked
        PanelDashboard.setVisible(false);
        PanelData.setVisible(false);
        PanelAttendance.setVisible(false);
        PanelAnnouncement.setVisible(false);
        PanelRecap.setVisible(false);
        PanelAbout.setVisible(false);
        panelLogout.setVisible(true);
        
        int jawaban = JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawaban == JOptionPane.YES_OPTION) {
            System.out.println("Anda memilih keluar.");
            this.dispose();
            JFrameLogin Login = new JFrameLogin();
            Login.show();
        } else {
            System.out.println("Anda membatalkan keluar.");
            // Tambahkan kode untuk menangani pembatalan di sini, jika diperlukan
        }
    }//GEN-LAST:event_labelLogoutMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        DefaultTableModel model = (DefaultTableModel) dataEmployee.getModel();
        model.setRowCount(0);

        String cari = txtSearch.getText();

        try {
            String sql = "SELECT * FROM user WHERE nip LIKE ? OR nama LIKE ?"
            + " OR gender LIKE ? OR jabatan LIKE ? OR email LIKE?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%" + cari + "%");
            st.setString(2,"%" + cari + "%");
            st.setString(3,"%" + cari + "%");
            st.setString(4,"%" + cari + "%");
            st.setString(5,"%" + cari + "%");
            ResultSet rs = st.executeQuery();

            while(rs.next()){
                String nip     = rs.getString("nip");
                String nama    = rs.getString("nama");
                String gender  = rs.getString("gender");
                String jabatan = rs.getString("jabatan");
                String email   = rs.getString("email");

                Object[] rowData = {nip,nama,gender,jabatan,email};
                model.addRow(rowData);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnSimpanAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanAttendanceActionPerformed
        try{ 
            String sql = "INSERT INTO attendance (nip, tanggal, keterangan, nama) SELECT ?, ?, ?, nama FROM user WHERE nip = ?";
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, txtNip.getText());
            pstm.setDate(2, new java.sql.Date(datePicker.getDate().getTime()));
            if (radioBtnPresent.isSelected()) {
                pstm.setString(3, "Present");
            } else if (radioBtnLate.isSelected()) {
                pstm.setString(3, "Late");
            } else if (radioBtnPermission.isSelected()) {
                pstm.setString(3, "Permission");
            } else if (radioBtnAlpha.isSelected()) {
                pstm.setString(3, "Alpha");
            }
            pstm.setString(4, txtNip.getText());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil..");
            getDataHistory();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanAttendanceActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = dataEmployee.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang akan diperbarui");
            return;
        }
        
        String nip = dataEmployee.getValueAt(selectedRow, 0).toString();
        String nama = txtNameData.getText();
        String gender = cbGender.getSelectedItem().toString();
        String jabatan = cbPosition.getSelectedItem().toString();
        String email = txtEmailData.getText();
        
        
        
        if(nama.isEmpty() || gender.isEmpty() || jabatan.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Semua Kolom Harus Diisi!","Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE user SET nama=?, gender=?, jabatan=?, email=? where nip=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, gender);
            st.setString(3, jabatan);
            st.setString(4, email);
            st.setString(5, nip);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
            }
            st.close();
            getDataEmployee();
            clearEmployeeData();
        } catch (Exception e) {
            Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void dataEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataEmployeeMouseClicked
        int selectedRow = dataEmployee.getSelectedRow();
        if(selectedRow != -1){
            Object nipObj = dataEmployee.getValueAt(selectedRow, 0);
            Object namaObj = dataEmployee.getValueAt(selectedRow, 1);
            Object genderObj = dataEmployee.getValueAt(selectedRow, 2);
            Object jabatanObj = dataEmployee.getValueAt(selectedRow, 3);
            Object emailObj = dataEmployee.getValueAt(selectedRow, 4);
            
           
            
            String nip = (nipObj != null) ? nipObj.toString() : "";
            String nama = (namaObj != null) ? namaObj.toString() : "";
            String gender = (genderObj != null) ? genderObj.toString() : "";
            String jabatan = (jabatanObj != null) ? jabatanObj.toString() : "";
            String email = (emailObj != null) ? emailObj.toString() : "";
            
            
            txtNipData.setText(nip);
            txtNameData.setText(nama);
             // Pengecekan null dan validasi nilai gender sebelum ditetapkan ke ComboBox
            if (gender != null && (gender.equalsIgnoreCase("Laki - Laki") || gender.equalsIgnoreCase("Perempuan"))) {
                cbGender.setSelectedItem(gender);
            } else {
                // Atur default jika nilai gender tidak valid
                cbGender.setSelectedItem("Unknown");
            }
            // Pengecekan null dan validasi nilai jabatan sebelum ditetapkan ke ComboBox
            if (jabatan != null && !jabatan.isEmpty()) {
                cbPosition.setSelectedItem(jabatan);
            } else {
                // Atur default jika nilai jabatan tidak valid
                cbPosition.setSelectedItem("Unknown");
            }
            txtEmailData.setText(email);
           

        }
    }//GEN-LAST:event_dataEmployeeMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearEmployeeData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
         int selectedRow = dataEmployee.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris yang akan di hapus");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_NO_OPTION){
            String nip = dataEmployee.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM user WHERE nip=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, nip);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil DIhapus");    
                }
                getDataEmployee();
                clearEmployeeData();
                st.close();
            } catch (Exception e) {
                Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, e);
            }
        
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUnduhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnduhActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDataRecap.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        // Buat string untuk menyimpan data
        StringBuilder data = new StringBuilder();

        // Tambahkan header kolom
        for (int i = 0; i < colCount; i++) {
            data.append(model.getColumnName(i)).append(",");
        }
        data.append("\n");

        // Tambahkan data baris
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data.append(model.getValueAt(i, j)).append(",");
            }
            data.append("\n");
        }
        // Menentukan jalur ke folder "Download"
        String downloadFolderPath = System.getProperty("user.home") + "\\Downloads\\";
        String filePath = downloadFolderPath + "data.csv";

        // Simpan data ke file CSV (gantilah dengan format yang diinginkan)
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(data.toString());
            writer.close();
            
            JOptionPane.showMessageDialog(this, "Data berhasil diunduh ke file data.csv");

            // Tampilkan dialog unduh atau buka file
            // (gunakan library atau kelas Java yang sesuai)
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.");
        }
    
    }//GEN-LAST:event_btnUnduhActionPerformed

    private void btnUnduhDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnduhDataActionPerformed
        DefaultTableModel model = (DefaultTableModel) dataHistory.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        // Buat string untuk menyimpan data
        StringBuilder data = new StringBuilder();

        // Tambahkan header kolom
        for (int i = 0; i < colCount; i++) {
            data.append(model.getColumnName(i)).append(",");
        }
        data.append("\n");

        // Tambahkan data baris
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data.append(model.getValueAt(i, j)).append(",");
            }
            data.append("\n");
        }
        // Menentukan jalur ke folder "Download"
        String downloadFolderPath = System.getProperty("user.home") + "\\Downloads\\";
        String filePath = downloadFolderPath + "data.csv";

        // Simpan data ke file CSV (gantilah dengan format yang diinginkan)
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(data.toString());
            writer.close();
            
            JOptionPane.showMessageDialog(this, "Data berhasil diunduh ke file dataAttendance.csv");

            // Tampilkan dialog unduh atau buka file
            // (gunakan library atau kelas Java yang sesuai)
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.");
        }
    }//GEN-LAST:event_btnUnduhDataActionPerformed

    /**
     * @param args the command line arguments
     */ 
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel Announcement;
    private javax.swing.JPanel Attendance;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Employee;
    private javax.swing.JLabel LabelUserLevel;
    private javax.swing.JLabel LabelUserProfil;
    private javax.swing.JPanel PanelAbout;
    private javax.swing.JPanel PanelAnnouncement;
    private javax.swing.JPanel PanelAttendance;
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelData;
    private keeptoo.KGradientPanel PanelMenu;
    private keeptoo.KGradientPanel PanelMenu1;
    private javax.swing.JPanel PanelMenuHead;
    private javax.swing.JPanel PanelNavbar;
    private javax.swing.JPanel PanelRecap;
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JPanel Recapitulation;
    private keeptoo.KButton btnCancel;
    private keeptoo.KButton btnDelete1;
    private keeptoo.KButton btnEdit;
    private rojerusan.RSMaterialButtonRectangle btnSimpanAttendance;
    private rojerusan.RSMaterialButtonRectangle btnUnduh;
    private rojerusan.RSMaterialButtonRectangle btnUnduhData;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbPosition;
    private javax.swing.JTable dataEmployee;
    private javax.swing.JTable dataHistory;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JPanel gbr_gedung;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAbout;
    private javax.swing.JLabel labelAnnouncement;
    private javax.swing.JLabel labelAttendance;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelRecap;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelBox1;
    private javax.swing.JPanel panelBox2;
    private javax.swing.JPanel panelChart;
    private javax.swing.JPanel panelFormAttn;
    private javax.swing.JPanel panelLine;
    private javax.swing.JPanel panelLine1;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPanel panelLogout;
    private javax.swing.JRadioButton radioBtnAlpha;
    private javax.swing.JRadioButton radioBtnLate;
    private javax.swing.JRadioButton radioBtnPermission;
    private javax.swing.JRadioButton radioBtnPresent;
    private javax.swing.JTable tblDataRecap;
    private javax.swing.JTextField txtEmailData;
    private javax.swing.JTextField txtNameData;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNipData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
