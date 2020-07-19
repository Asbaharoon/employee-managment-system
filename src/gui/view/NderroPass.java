/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.EmployeeException;
import BL.PerdoruesiRepository;
import DAL.Departmenti;
import DAL.Perdoruesi;
import gui.model.PerdoruesiComboBoxModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MR-ROBOT
 */
public class NderroPass extends javax.swing.JInternalFrame {
    PerdoruesiComboBoxModel pcbm = new PerdoruesiComboBoxModel();
    PerdoruesiRepository pr = new PerdoruesiRepository();
    /**
     * Creates new form NderroPass
     */
    public NderroPass() {
        initComponents();
        loadComboBox();
    }
    
        public void loadComboBox() {
        try {
            List<Perdoruesi> lista = pr.findExceptAdmin();
            pcbm.add(lista);
            perdoruesiCB.setModel(pcbm);
            perdoruesiCB.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changePasswordBtn = new javax.swing.JButton();
        perdoruesiCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        newPassTxt1 = new javax.swing.JPasswordField();
        newPassTxt = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setText("Fjalekalimi i ri:");

        jLabel2.setText("Perseritni fjalekalimin:");

        changePasswordBtn.setText("Change Password");
        changePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBtnActionPerformed(evt);
            }
        });

        perdoruesiCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdoruesiCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Zgjedh Perdoruesin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perdoruesiCB, 0, 289, Short.MAX_VALUE)
                            .addComponent(newPassTxt1)
                            .addComponent(newPassTxt))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perdoruesiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newPassTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBtnActionPerformed
        try {
            // TODO add your handling code here:
            Perdoruesi perdoruesi =(Perdoruesi) perdoruesiCB.getSelectedItem();
            if(perdoruesi.getRoliID().getRoliID()==1){
                JOptionPane.showMessageDialog(null, "Nuk mund te nderrohet passwordi i nje administratori");
                return;
            }
            Perdoruesi p = (Perdoruesi)perdoruesiCB.getSelectedItem();
            String pass1 = new String(newPassTxt1.getPassword());
            String pass2 =new String(newPassTxt.getPassword());
            if(pass1.equals(pass2)){
                p.setPassword(pass2);
                JOptionPane.showMessageDialog(null, "Fjalekalimi u nderrua me sukses");
            }else{
                JOptionPane.showMessageDialog(null, "Nuk perputhen fjalekalimet e shenuara");
            }
            pr.edit(p);
        } catch (EmployeeException ex) {
            Logger.getLogger(NderroPass.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_changePasswordBtnActionPerformed

    private void perdoruesiCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdoruesiCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perdoruesiCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField newPassTxt;
    private javax.swing.JPasswordField newPassTxt1;
    private javax.swing.JComboBox perdoruesiCB;
    // End of variables declaration//GEN-END:variables
}
