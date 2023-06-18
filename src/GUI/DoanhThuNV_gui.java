/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DoanhThuNV_dao;
import DAO.HoaDon_dao;
import POJO.DoanhThuNV_pojo;
import POJO.HoaDon_pojo;
import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class DoanhThuNV_gui extends javax.swing.JInternalFrame {

    /**
     * Creates new form DoanhThuNV_gui
     */
    DefaultTableModel dtmDT = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    public DoanhThuNV_gui() {
        this.setTitle("Doanh thu nhân viên");
        initComponents();
        this.setSize(1920, 1080);
        spFromDate.setEnabled(false);
        spToDate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDoanhThu = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spFromDate = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spToDate = new javax.swing.JSpinner();
        btnThongKeDoanhThuNV = new javax.swing.JButton();
        cbDieuKien = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        tbDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDoanhThu);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("THỐNG KÊ DOANH THU CỦA NHÂN VIÊN");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Từ ngày:");

        spFromDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spFromDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1682355600000L), new java.util.Date(1640970000000L), new java.util.Date(1682442000000L), java.util.Calendar.DAY_OF_MONTH));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("đến ngày:");

        spToDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spToDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1682442000000L), new java.util.Date(1640970000000L), new java.util.Date(1682442000000L), java.util.Calendar.DAY_OF_MONTH));

        btnThongKeDoanhThuNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongKeDoanhThuNV.setText("Thống kê");
        btnThongKeDoanhThuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeDoanhThuNVActionPerformed(evt);
            }
        });

        cbDieuKien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbDieuKien.setText("Có điều kiện");
        cbDieuKien.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbDieuKienStateChanged(evt);
            }
        });
        cbDieuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDieuKienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDieuKien)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThongKeDoanhThuNV)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKeDoanhThuNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDieuKien)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doanhthu.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addContainerGap(469, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeDoanhThuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeDoanhThuNVActionPerformed
        // TODO add your handling code here:
        String[] tieuDeDT = {"Mã nhân viên", "Tên nhân viên", "Doanh thu"};
        dtmDT.setColumnIdentifiers(tieuDeDT);
        hienthiDT();
    }//GEN-LAST:event_btnThongKeDoanhThuNVActionPerformed

    private void cbDieuKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDieuKienMouseClicked
        // TODO add your handling code here:    

    }//GEN-LAST:event_cbDieuKienMouseClicked

    private void cbDieuKienStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbDieuKienStateChanged
        // TODO add your handling code here:
        if (cbDieuKien.isSelected()) {
            spFromDate.setEnabled(true);
            spToDate.setEnabled(true);
        } else {
            spFromDate.setEnabled(false);
            spToDate.setEnabled(false);
        }
    }//GEN-LAST:event_cbDieuKienStateChanged

    private void hienthiDT() {
        try {
            SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
            String fromDate = formater.format(spFromDate.getValue());
            String toDate = formater.format(spToDate.getValue());
            ArrayList<DoanhThuNV_pojo> dsHD;
            if (cbDieuKien.isSelected()) {
                dsHD = DoanhThuNV_dao.layDanhSachDoanhThuNVTheoNgay(fromDate, toDate);
            } else {
                dsHD = DoanhThuNV_dao.layDanhSachDoanhThuNV();
            }
            dtmDT.setRowCount(0);
            for (DoanhThuNV_pojo dt : dsHD) {
                Vector<Object> v = new Vector<Object>();
                v.add(dt.getMaNV());
                v.add(dt.getTenNV());
                v.add(dt.getDoanhThu());
                dtmDT.addRow(v);
            }
            tbDoanhThu.setModel(dtmDT);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền thống kê", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKeDoanhThuNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbDieuKien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spFromDate;
    private javax.swing.JSpinner spToDate;
    private javax.swing.JTable tbDoanhThu;
    // End of variables declaration//GEN-END:variables
}
