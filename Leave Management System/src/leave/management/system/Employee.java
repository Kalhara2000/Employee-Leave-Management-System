package leave.management.system;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Employee extends javax.swing.JFrame {

    String LeaveComboValue, Fdate, FReson, query, emp_Name;
    String emp_id;
    String dis = "Pending";

    public Employee() {
        initComponents();
    }

    public void EmployeeName(String DBname, String DBid) {
        emp_Name = DBname;
        emp_id = DBid;
        empName.setText(emp_Name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        annualText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        casualText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LeaveCombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        LeaveReson = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Management System - Employee Leave Form");
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Leave Form");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Amount of annual leave you have : 14");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("and casual leave : 07");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Employee Name :");

        empName.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        empName.setForeground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Your Currunt :");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("Annual Leave : ");

        annualText.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        annualText.setForeground(new java.awt.Color(204, 0, 51));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("Casual Leave : ");

        casualText.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        casualText.setForeground(new java.awt.Color(204, 0, 51));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Date :");

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Leave type :");

        LeaveCombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LeaveCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leave type..", "Annual", "Casual", "Other" }));
        LeaveCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveComboActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Leave reason :");

        logout.setBackground(new java.awt.Color(204, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(0, 153, 0));
        ok.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 0, 153));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Leave Type", "Leave Reason", "Status"
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
        jTable1.setEnabled(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ok)
                                        .addGap(18, 18, 18)
                                        .addComponent(clear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logout))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LeaveReson, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LeaveCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casualText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annualText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casualText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(LeaveCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(LeaveReson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(ok)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LeaveComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveComboActionPerformed
        // TODO add your handling code here:
        LeaveComboValue = LeaveCombo.getSelectedItem().toString();
    }//GEN-LAST:event_LeaveComboActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        dateField.setText("");
        LeaveCombo.setSelectedIndex(0);
        LeaveReson.setText("");
    }//GEN-LAST:event_clearActionPerformed

    public void loaddata() throws ClassNotFoundException, SQLException {
        //System.out.println("function run");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";

            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                java.sql.Statement stt = con.createStatement();
                DefaultTableModel model = new DefaultTableModel(new String[]{"Date", "Leave Type", "Leave Reason", "Status"}, 0);
                jTable1.setModel(model);
                String sql = "SELECT * FROM emp_leave WHERE emp_id= '" + emp_id + "'";
                ResultSet rs = stt.executeQuery(sql);
                String dat, lt, lr, dec;
                while (rs.next()) {
                    //i = rs.getString("id");
                    dat = rs.getString("date");
                    lt = rs.getString("leave_type");
                    lr = rs.getString("leave_reason");
                    dec = rs.getString("decision");
                    
                    model.addRow(new Object[]{dat, lt, lr, dec});
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            java.sql.Statement stt = con.createStatement();

            if ("".equals(dateField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Date is require", "Dialog", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(LeaveCombo.getSelectedItem().toString())) {

                JOptionPane.showMessageDialog(new JFrame(), "require", "Dialog", JOptionPane.ERROR_MESSAGE);

            } else {

                Fdate = dateField.getText();
                FReson = LeaveReson.getText();
                String empid = emp_id;

                query = "INSERT INTO emp_leave (date,leave_type ,leave_reason,decision,emp_id)"
                        + "VALUES ('" + Fdate + "','" + LeaveComboValue + "','" + FReson + "','" + dis + "','" + empid + "')";

                //System.out.println(query);
                stt.executeUpdate(query);

                dateField.setText("");
                LeaveCombo.setSelectedIndex(0);
                LeaveReson.setText("");

                JOptionPane.showMessageDialog(new JFrame(), "Successfully ...", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                loaddata();//data load in the table
                con.close();
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }//GEN-LAST:event_okActionPerformed

    public void annual() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";
            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                java.sql.Statement sta = con.createStatement();
                
                String sqlQuery = "SELECT COUNT(leave_type) AS leave_count FROM emp_leave WHERE decision = 'Accept' AND leave_type = 'Annual' AND emp_id = '" + emp_id + "'";
                ResultSet rSet = sta.executeQuery(sqlQuery);
                
                if (rSet.next()) {
                    int AnnnualleaveCount = rSet.getInt("leave_count");
                    int AnnualCount;
                    
                    AnnualCount = 14 - AnnnualleaveCount;
                    
                    String annualCountText = String.valueOf(AnnualCount);
                    annualText.setText(annualCountText);
                    
                    //System.out.println("Leave annual Count: " + annualCountText);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    public void casual() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";
            try (Connection con = DriverManager.getConnection(url, user, pass)) {
                java.sql.Statement stc = con.createStatement();
                
                String sqlQuery = "SELECT COUNT(leave_type) AS leave_count FROM emp_leave WHERE decision = 'Accept' AND leave_type = 'Casual' AND emp_id = '" + emp_id + "'";
                ResultSet rSet = stc.executeQuery(sqlQuery);
                
                if (rSet.next()) {
                    int CasualleaveCount = rSet.getInt("leave_count");
                    int CasualCount;
                    
                    CasualCount = 7 - CasualleaveCount;
                    
                    String casualCountText = String.valueOf(CasualCount);
                    casualText.setText(casualCountText);
                    
                    //System.out.println("Leave Casual Count: " + casualCountText);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        // TODO code application logic here
//        Employee emp = new Employee();
//        emp.setVisible(true);
//        emp.loaddata();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LeaveCombo;
    private javax.swing.JTextField LeaveReson;
    public static javax.swing.JLabel annualText;
    private javax.swing.JLabel casualText;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel empName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables


}
