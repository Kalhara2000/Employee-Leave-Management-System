package leave.management.system;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Manager extends javax.swing.JFrame {

    String dbquery, EmpID, EmpDate, DBdate, DBid, DBresaon;
    String empi, dat, lt, lr, dec, ManName;

    public Manager() {
        initComponents();
    }

    public void ManagerName(String DBname) {
        ManName = DBname;
        managerName.setText(ManName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        managerName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        empidFiled = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        decisionBox = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        lev_res = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Management System - Leave Management Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 555));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Leave Management Form");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 153));
        jLabel2.setText("Manager Name :");

        managerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        managerName.setForeground(new java.awt.Color(255, 102, 102));
        managerName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                managerNameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        DataTable.setBackground(new java.awt.Color(153, 153, 255));
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Date", "Leave Type", "Leave Reason", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        DataTable.setEnabled(false);
        jScrollPane1.setViewportView(DataTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Emp ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Date :");

        searchBtn.setBackground(new java.awt.Color(51, 51, 255));
        searchBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Decision :");

        decisionBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decisionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Reject ", "Accept " }));
        decisionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decisionBoxActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(51, 204, 0));
        updateBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 0, 51));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        lev_res.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lev_res.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("Leave Reason");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(managerName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empidFiled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(lev_res, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(empidFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(managerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lev_res, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    public void load_data() throws ClassNotFoundException, SQLException {
        //System.out.println("function run");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            java.sql.Statement stt = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"Emp ID", "Date", "Leave Type", "Leave Reason", "Status"}, 0);

            DataTable.setModel(model);
            String sqlQ = "SELECT * FROM emp_leave";

            ResultSet rs = stt.executeQuery(sqlQ);

            while (rs.next()) {
                empi = rs.getString("emp_id");
                dat = rs.getString("date");
                lt = rs.getString("leave_type");
                lr = rs.getString("leave_reason");
                dec = rs.getString("decision");

                model.addRow(new Object[]{empi, dat, lt, lr, dec});
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";

            try ( Connection con = DriverManager.getConnection(url, user, pass)) {
                java.sql.Statement stt0 = con.createStatement();

                String EmpID = empidFiled.getText();
                String EmpDate = dateField.getText();
                String fdec = decisionBox.getSelectedItem().toString();

                if ("".equals(EmpID)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Please search and update later", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("".equals(EmpDate)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Please search and update later", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    String dbqueryU = "UPDATE emp_leave SET decision='" + fdec + "' WHERE emp_id= '" + EmpID + "' AND date= '" + EmpDate + "'";

                    int rowsAffected = stt0.executeUpdate(dbqueryU);

                    if (rowsAffected > 0) {
                        // Update successful
                        load_data(); // Assuming this method loads data after the update
                    } else {
                        // Handle the case when no rows were updated
                    }

                    JOptionPane.showMessageDialog(new JFrame(), "Successfully Updated...", "Error", JOptionPane.INFORMATION_MESSAGE);
                    empidFiled.setText("");
                    dateField.setText("");
                    lev_res.setText("");
                    decisionBox.setSelectedIndex(0);
                }

            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }


    }//GEN-LAST:event_updateBtnActionPerformed

    private void decisionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decisionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decisionBoxActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/leave_management_system_db";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            java.sql.Statement stt = con.createStatement();

            if ("".equals(empidFiled.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Employee ID is require", "Error", JOptionPane.ERROR_MESSAGE);

            } else if ("".equals(dateField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Date is require", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                EmpID = empidFiled.getText();
                EmpDate = dateField.getText();

                dbquery = "SELECT * FROM emp_leave WHERE emp_id= '" + EmpID + "'";

                ResultSet rs = stt.executeQuery(dbquery);

                boolean matchFound = false; // Flag to track if a match is found

                while (rs.next()) {
                    DBdate = rs.getString("date");
                    DBid = rs.getString("emp_id");

                    if (DBid.equals(EmpID) && DBdate.equals(EmpDate)) {
                        rs.getString("decision");
                        DBresaon = rs.getString("leave_reason");
                        lev_res.setText(DBresaon);
                        //System.out.println(EmpID + " " + DBdecis);

                        matchFound = true; // Set the flag to true if a match is found
                        break; // Exit the loop once a match is found
                    }
                }

                if (!matchFound) {
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect Emp ID or Date", "Error", JOptionPane.ERROR_MESSAGE);
                    empidFiled.setText("");
                    dateField.setText("");
                }

            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void managerNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_managerNameAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_managerNameAncestorAdded

//    public static void main(String args[]) throws ClassNotFoundException, SQLException {
//        Manager man = new Manager();
//        man.setVisible(true);
//        man.load_data();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable DataTable;
    private javax.swing.JTextField dateField;
    public static javax.swing.JComboBox<String> decisionBox;
    private javax.swing.JTextField empidFiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lev_res;
    private javax.swing.JButton logoutBtn;
    public static javax.swing.JLabel managerName;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
