/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.UserDirectory;

/**
 *
 * @author navdishbatra
 */
public class AdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessArea;
    private UserDirectory userDirectory;
    CreateJPanel createPanel;
    /** Creates new form AdminJPanel */
    public AdminJPanel(JPanel userProcessArea) {
        initComponents();
        this.userProcessArea = userProcessArea;
        this.userDirectory = new UserDirectory();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CreateBtn = new javax.swing.JButton();
        ManageBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        ManageBtn.setText("Manage");
        ManageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(CreateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(ManageBtn)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateBtn)
                    .addComponent(ManageBtn))
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        createPanel = new CreateJPanel(userProcessArea, userDirectory);
        
        userProcessArea.add("CreateJPanel", createPanel);
        CardLayout layout = (CardLayout)userProcessArea.getLayout();
        layout.next(userProcessArea);
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void ManageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageBtnActionPerformed
        // TODO add your handling code here:
        ManageJPanel managePanel = new ManageJPanel(userProcessArea,userDirectory);
        
        userProcessArea.add("ManageJPanel", managePanel);
        CardLayout layout = (CardLayout)userProcessArea.getLayout();
        layout.next(userProcessArea);
    }//GEN-LAST:event_ManageBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton ManageBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}