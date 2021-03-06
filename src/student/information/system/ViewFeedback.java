/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Arafat Hossain Ar
 */
public class ViewFeedback extends javax.swing.JFrame {

    /**
     * Creates new form ViewData
     */
    public ViewFeedback() {
        initComponents();
        jtableCustom();
        try {
            updateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ViewFeedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/view_64px.png")));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FeedbackTable = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new keeptoo.KButton();
        deleteButton = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Feedback");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view_64px_white.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Feedback");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(1019, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FeedbackTable.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        FeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Date", "Title", "Discription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FeedbackTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FeedbackTable.setShowHorizontalLines(true);
        FeedbackTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(FeedbackTable);
        if (FeedbackTable.getColumnModel().getColumnCount() > 0) {
            FeedbackTable.getColumnModel().getColumn(0).setMinWidth(20);
            FeedbackTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            FeedbackTable.getColumnModel().getColumn(0).setMaxWidth(100);
            FeedbackTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            FeedbackTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            FeedbackTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            FeedbackTable.getColumnModel().getColumn(4).setPreferredWidth(120);
            FeedbackTable.getColumnModel().getColumn(5).setPreferredWidth(400);
        }

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        updateButton.setText("Update");
        updateButton.setFocusable(false);
        updateButton.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        updateButton.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        updateButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateButton.setkHoverStartColor(new java.awt.Color(0, 102, 51));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        deleteButton.setkHoverColor(new java.awt.Color(153, 153, 153));
        deleteButton.setkHoverEndColor(java.awt.Color.red);
        deleteButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        deleteButton.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        deleteButton.setkStartColor(java.awt.Color.red);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) FeedbackTable.getModel();
        if (FeedbackTable.getSelectedRow() == -1) {

            if (FeedbackTable.getRowCount() == 0) {

                PopUp popUp = new PopUp();
                popUp.setVisible(true);
                popUp.setHeader.setText("Error!");
                popUp.setHeader.setForeground(Color.red);
                popUp.setMsg.setText("No data to Update.");

            } else {
                PopUp popUp = new PopUp();
                popUp.setVisible(true);
                popUp.setHeader.setText("Error!");
                popUp.setHeader.setForeground(Color.red);
                popUp.setMsg.setText("Select a Row to Update.");
            }
        } else {

            UpdateFeedback updateFeedback = new UpdateFeedback();
            updateFeedback.setVisible(true);

            int selectedRowIndex = FeedbackTable.getSelectedRow();
            updateFeedback.id.setText(model.getValueAt(selectedRowIndex, 0).toString());
            updateFeedback.name.setText(model.getValueAt(selectedRowIndex, 1).toString());
            updateFeedback.phone.setText(model.getValueAt(selectedRowIndex, 2).toString());
            updateFeedback.date.setText(model.getValueAt(selectedRowIndex, 3).toString());
            updateFeedback.feedback.setText(model.getValueAt(selectedRowIndex, 4).toString());
            updateFeedback.discription.setText(model.getValueAt(selectedRowIndex, 5).toString());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            // TODO add your handling code here:
            searchStudent();
        } catch (SQLException ex) {
            Logger.getLogger(ViewFeedback.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {

            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter numbers only.");

        }
    }//GEN-LAST:event_searchKeyTyped

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
            java.util.logging.Logger.getLogger(ViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FeedbackTable;
    private keeptoo.KButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private keeptoo.KButton updateButton;
    // End of variables declaration//GEN-END:variables
    private void jtableCustom() {
        JTableHeader header = FeedbackTable.getTableHeader();
        header.setBackground(Color.getHSBColor(54, 109, 104));
        header.setForeground(Color.BLACK);
        header.setFont(new Font("Tahoma", Font.BOLD, 18));
        FeedbackTable.setGridColor(Color.LIGHT_GRAY);
        FeedbackTable.setRowHeight(25);

    }

    public void updateTable() throws SQLException {

        Connection conn = DatabaseConnection.ConnectDb();
        String url = "Select id, name, phone, date, feedback, discription from feedbackdata";

        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet rs = pstm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) FeedbackTable.getModel();
            Object[] colData = new Object[6];
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            while (rs.next()) {
                colData[0] = rs.getString("id");
                colData[1] = rs.getString("name");
                colData[2] = rs.getString("phone");
                colData[3] = rs.getString("date");
                colData[4] = rs.getString("feedback");
                colData[5] = rs.getString("discription");
                model.addRow(colData);

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void searchStudent() throws SQLException {

        Connection con = DatabaseConnection.ConnectDb();
        PreparedStatement ps;
        updateTable();
        if (search.getText().equals("")) {
            updateTable();
        } else {

            ps = con.prepareStatement("SELECT * FROM `feedbackdata` WHERE  phone = '" + search.getText() + "'");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) FeedbackTable.getModel();

            Object[] colData = new Object[6];
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            while (rs.next()) {

                colData[0] = rs.getString("id");
                colData[1] = rs.getString("name");
                colData[2] = rs.getString("phone");
                colData[3] = rs.getString("date");
                colData[4] = rs.getString("feedback");
                colData[5] = rs.getString("discription");
                model.addRow(colData);
            }

        }
    }

    private void deleteData() {
        DefaultTableModel model = (DefaultTableModel) FeedbackTable.getModel();

        if (FeedbackTable.getSelectedRow() == -1) {

            if (FeedbackTable.getRowCount() == 0) {

                PopUp popUp = new PopUp();
                popUp.setVisible(true);
                popUp.setHeader.setText("Error!");
                popUp.setHeader.setForeground(Color.red);
                popUp.setMsg.setText("No data to delete.");

            } else {
                PopUp popUp = new PopUp();
                popUp.setVisible(true);
                popUp.setHeader.setText("Error!");
                popUp.setHeader.setForeground(Color.red);
                popUp.setMsg.setText("Select a Row to delete.");
            }
        } else {
            int row = FeedbackTable.getSelectedRow();
            String getID = FeedbackTable.getValueAt(row, 0).toString();
            //System.out.println(getroll);
            String sql = "delete from feedbackdata where id='" + getID + "'";
            try {

                Connection conn = DatabaseConnection.ConnectDb();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                PopUp popUp = new PopUp();
                popUp.setVisible(true);
                popUp.setHeader.setText("Success!");
                popUp.setHeader.setForeground(Color.green);
                popUp.setMsg.setText("Data Deleted!");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            model.removeRow(FeedbackTable.getSelectedRow());
        }
    }
}
