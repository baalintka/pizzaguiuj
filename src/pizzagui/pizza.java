/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzagui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author balli
 */
public class pizza extends javax.swing.JFrame {

    private int ara=1000;
            /**
     * Creates new form pizza
     */
    public pizza() {
        
        initComponents();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        rendeles = new javax.swing.JButton();
        klasszikb = new javax.swing.JRadioButton();
        vekonyb = new javax.swing.JRadioButton();
        sajtb = new javax.swing.JRadioButton();
        baconb = new javax.swing.JRadioButton();
        hagymab = new javax.swing.JRadioButton();
        kukoricab = new javax.swing.JRadioButton();
        paradicsomb = new javax.swing.JRadioButton();
        kolbaszb = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        telotext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        artxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rendeles.setBackground(new java.awt.Color(153, 153, 255));
        rendeles.setText("Rendelés");
        rendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendelesActionPerformed(evt);
            }
        });

        buttonGroup4.add(klasszikb);
        klasszikb.setSelected(true);
        klasszikb.setText("Klasszikus");
        klasszikb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klasszikbActionPerformed(evt);
            }
        });

        buttonGroup4.add(vekonyb);
        vekonyb.setText("Vékony");
        vekonyb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vekonybActionPerformed(evt);
            }
        });

        sajtb.setText("sajt");
        sajtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sajtbActionPerformed(evt);
            }
        });

        baconb.setText("bacon");
        baconb.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                baconbAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        baconb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconbActionPerformed(evt);
            }
        });

        hagymab.setText("hagyma");
        hagymab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hagymabActionPerformed(evt);
            }
        });

        kukoricab.setText("kukorica");
        kukoricab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kukoricabActionPerformed(evt);
            }
        });

        paradicsomb.setText("paradicsom");
        paradicsomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paradicsombActionPerformed(evt);
            }
        });

        kolbaszb.setText("kolbász");
        kolbaszb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolbaszbActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 153, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Pizza-rendelő 4000");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        telotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telotextActionPerformed(evt);
            }
        });
        telotext.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                telotextPropertyChange(evt);
            }
        });

        jLabel1.setText("Válasszon feltétet:");

        jLabel2.setText("Válasszon pizzatésztát:");

        jLabel3.setText("1000Ft");

        jLabel5.setText("Kérem adja meg a telefonszámát:");

        jLabel6.setText("200Ft/db");

        artxt.setText("1000Ft");

        jLabel7.setText("Ár:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(klasszikb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(vekonyb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telotext, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(baconb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))
                                    .addComponent(kukoricab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kolbaszb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(98, 98, 98))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(paradicsomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(76, 76, 76))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hagymab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(114, 114, 114))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sajtb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(193, 193, 193))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rendeles)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klasszikb)
                    .addComponent(sajtb)
                    .addComponent(hagymab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vekonyb)
                    .addComponent(baconb)
                    .addComponent(paradicsomb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kukoricab)
                    .addComponent(kolbaszb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rendeles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(artxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(telotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jMenu2.setText("Pizzarendelés");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendelesActionPerformed
        int ar=1000;
        String teszta="";
        String feltet="";
        String cim = "Számla";
        boolean sajt = sajtb.isSelected();
        boolean bacon = baconb.isSelected();
        boolean hagyma = hagymab.isSelected();
        boolean kukorica = kukoricab.isSelected();
        boolean kolbasz = kolbaszb.isSelected();
        boolean paradicsom = paradicsomb.isSelected();
        String teloszam=telotext.getText();
        String teloszamkiir="";
        teloszamkiir+=teloszam;
        
        if (klasszikb.isSelected()) {
            teszta+=klasszikb.getText();
        }else{
            teszta+=vekonyb.getText();
        }
        
        
            if (sajt) {
                feltet+="-";
                feltet+=sajtb.getText();
                feltet+=("\n");
                ar+=200;
            }
            if(bacon){
                feltet+="-";
                feltet+=baconb.getText();
                feltet+=("\n");

                ar+=200;
            }
            if(hagyma){
                feltet+="-";
                feltet+=hagymab.getText();
                feltet+=("\n");

                ar+=200;
            }
            if(kukorica){
                feltet+="-";
                feltet+=kukoricab.getText();
                feltet+=("\n");

                ar+=200;
            }
            if(kolbasz){
                feltet+="-";
                feltet+=kolbaszb.getText();
                feltet+=("\n");

                ar+=200;
            }
            if(paradicsom){
                feltet+="-";
                feltet+=paradicsomb.getText();
                feltet+=("\n");
                ar+=200;
                
            }
         
         
            
            
        if ((sajt || bacon || hagyma || kukorica || kolbasz || paradicsom) && !telotext.getText().isEmpty()){
            String uzenet = "Rendelt pizza: \n"+"Tésztája: "+teszta+" tészta \n"+"Kért feltétek :\n"+feltet+"Telefon : "+teloszamkiir+"\nPizza ára: "+ar+"Ft";
            JOptionPane.showMessageDialog(null, uzenet, cim, 1);
         
        }else if((sajt || bacon || hagyma || kukorica || kolbasz || paradicsom) && telotext.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nem adott meg telefonszámot!", "", 2);
        }
        
        else if(!((sajt) && (bacon) &&(hagyma) &&(kukorica) &&(kolbasz) &&(paradicsom)) && (telotext.getText().isEmpty())){
            
            JOptionPane.showMessageDialog(rootPane, "Nem adott meg telefonszámot, nem választott feltétet!", "", 2);
         }else if(!((sajt) && (bacon) &&(hagyma) &&(kukorica) &&(kolbasz) &&(paradicsom)) && !telotext.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Nem választott feltétet!", "", 2);
         }

            
        
        
    }//GEN-LAST:event_rendelesActionPerformed

    private void paradicsombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paradicsombActionPerformed
        if (paradicsomb.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_paradicsombActionPerformed

    private void kolbaszbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolbaszbActionPerformed
        if (kolbaszb.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_kolbaszbActionPerformed

    private void hagymabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hagymabActionPerformed
        if (hagymab.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_hagymabActionPerformed

    private void baconbAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_baconbAncestorAdded
        
    }//GEN-LAST:event_baconbAncestorAdded

    private void klasszikbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klasszikbActionPerformed
       
    }//GEN-LAST:event_klasszikbActionPerformed

    private void baconbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconbActionPerformed
        if (baconb.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_baconbActionPerformed

    private void telotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telotextActionPerformed
        
    }//GEN-LAST:event_telotextActionPerformed

    private void telotextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_telotextPropertyChange
        
    }//GEN-LAST:event_telotextPropertyChange

    private void sajtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sajtbActionPerformed
        if (sajtb.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_sajtbActionPerformed

    private void vekonybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vekonybActionPerformed
        
    }//GEN-LAST:event_vekonybActionPerformed

    private void kukoricabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kukoricabActionPerformed
        if (kukoricab.isSelected()) {
            ara+=200;
            String ujara = Integer.toString(ara);
            artxt.setText(ujara+"Ft");
        }else{
            ara-=200;
            String ujara2 = Integer.toString(ara);
            artxt.setText(ujara2+"Ft");
        }
    }//GEN-LAST:event_kukoricabActionPerformed
    
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
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artxt;
    private javax.swing.JRadioButton baconb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton hagymab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton klasszikb;
    private javax.swing.JRadioButton kolbaszb;
    private javax.swing.JRadioButton kukoricab;
    private javax.swing.JRadioButton paradicsomb;
    private javax.swing.JButton rendeles;
    private javax.swing.JRadioButton sajtb;
    private javax.swing.JTextField telotext;
    private javax.swing.JRadioButton vekonyb;
    // End of variables declaration//GEN-END:variables

    
    
}
