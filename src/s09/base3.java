/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s09;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/*
 *
 * @author juju
 */
public class base3 extends javax.swing.JFrame {

    /**
     * Creates new form arreglos
     */
    public base3() {
        initComponents();
        this.setResizable(false);
        this.setSize(480, 860);
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jCombo1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JlabelRotate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxt1 = new javax.swing.JTextField();
        jTxt2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Fire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Resetear");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(25, 25, 25));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCombo1.setBackground(new java.awt.Color(0, 0, 0));
        jCombo1.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jCombo1.setForeground(new java.awt.Color(204, 204, 204));
        jCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 164, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("ETC");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("SansSerif.plain", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("▪");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 17));

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("SansSerif.plain", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 204));
        jLabel6.setText("▪");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 17));

        jLabel2.setBackground(new java.awt.Color(204, 102, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif.plain", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 255));
        jLabel2.setText("▪");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 17));

        JlabelRotate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JlabelRotate.setForeground(new java.awt.Color(204, 204, 204));
        JlabelRotate.setText("TPG - S11");
        JlabelRotate.setToolTipText("");
        JlabelRotate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JlabelRotate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JlabelRotate.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(JlabelRotate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cartograph CF Heavy", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("NO");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLICKNO(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 70, 90));

        jLabel7.setFont(new java.awt.Font("Cartograph CF Heavy", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 255));
        jLabel7.setText("GO");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLICKGO(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, 90));

        jLabel8.setFont(new java.awt.Font("SansSerif.plain", 1, 110)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("󰣇");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 120));

        jLabel9.setFont(new java.awt.Font("Z003", 2, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Sample JUJU");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 860));

        jTxt1.setBackground(new java.awt.Color(51, 51, 51));
        jTxt1.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jTxt1.setForeground(new java.awt.Color(153, 153, 255));
        jTxt1.setText("jTextField1");
        jTxt1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Varible 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(jTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 240, 70));

        jTxt2.setBackground(new java.awt.Color(51, 51, 51));
        jTxt2.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jTxt2.setForeground(new java.awt.Color(153, 153, 255));
        jTxt2.setText("jTextField1");
        jTxt2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Varible 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Fira Code", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.add(jTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 240, 70));

        jScrollPane4.setBackground(new java.awt.Color(51, 51, 51));

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans Light", 0, 21), new java.awt.Color(204, 204, 204))); // NOI18N
        jList1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(153, 153, 255));
        jList1.setEnabled(false);
        jList1.setFocusable(false);
        jList1.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane4.setViewportView(jList1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 240, 400));

        Fire.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Z003", 2, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Sample JUJU");

        label.setFont(new java.awt.Font("SansSerif.plain", 0, 48)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("");

        javax.swing.GroupLayout FireLayout = new javax.swing.GroupLayout(Fire);
        Fire.setLayout(FireLayout);
        FireLayout.setHorizontalGroup(
            FireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FireLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(FireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FireLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FireLayout.createSequentialGroup()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        FireLayout.setVerticalGroup(
            FireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FireLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(label)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        jPanel1.add(Fire, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 240, 220));

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLICKGO(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLICKGO
        //String value1 = JOptionPane.showInputDialog("nombre");
        //int value2 = JOptionPane.showConfirmDialog(null, "confirm");        
        //JOptionPane.showMessageDialog(null, "message: " + value1 + " " + value2);
        int[] oneArray = {1, 2, 3, 4, 5};
        oneArray[oneArray.length - 1] = 6;
        String[] listText = new String[oneArray.length];
        
        for (int i = 0; i < oneArray.length; i++) {
            listText[i] = oneArray[i] + "-number";
        }
        
        try {
            String combo = (String) jCombo1.getSelectedItem();
            int var1 = Integer.parseInt(jTxt1.getText());
            int var2 = Integer.parseInt(jTxt2.getText());
            String areaModel = "";
            DefaultListModel model1 = new DefaultListModel();
            for (int i = 0; i < var1 + var2; i++) {
                model1.addElement(i);
                areaModel+= i + "\n";
            }
            jList1.setListData(listText);
            this.changeFire(true);
        } catch (Exception e) {
            this.changeFire(false);
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_CLICKGO
        
    private void changeFire(boolean change) {
        Color color = new Color(51,51,255);
        if (change) {
            color = new Color(153,51,255);
        }
        Fire.setBackground(color); 
    }
    
    private void CLICKNO(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLICKNO
        String[] emptyList = {};
        jList1.setListData(emptyList);
        jTxt1.setText("");
        jTxt2.setText("");
        jTxt1.requestFocus();
        this.changeFire(false);
    }//GEN-LAST:event_CLICKNO

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
            java.util.logging.Logger.getLogger(base3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(base3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(base3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(base3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new base3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fire;
    private javax.swing.JLabel JlabelRotate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTxt1;
    private javax.swing.JTextField jTxt2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
