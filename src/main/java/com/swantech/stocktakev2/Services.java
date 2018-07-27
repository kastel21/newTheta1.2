package com.swantech.stocktakev2;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

class Services extends javax.swing.JFrame
{
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JTextField jTextField5;
  private javax.swing.JTextField jTextField6;
  private javax.swing.JTextField jTextField7;
  
  public Services()
  {
    initComponents();
  }
  


  public javax.swing.JPanel getComps()
  {
    return jPanel1;
  }
  










  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jTextField4 = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jTextField5 = new javax.swing.JTextField();
    jTextField6 = new javax.swing.JTextField();
    jTextField7 = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();
    
    setDefaultCloseOperation(3);
    
    jLabel1.setText("jLabel1");
    
    jTextField4.setText("jTextField4");
    
    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);
    
    jTextField5.setText("jTextField4");
    
    jTextField6.setText("jTextField4");
    
    jTextField7.setText("jTextField4");
    
    jButton2.setText("jButton2");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Services.this.jButton2ActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTextField4, -2, 171, -2)
      .addComponent(jTextField5, -2, 171, -2)
      .addComponent(jTextField6, -2, 171, -2)
      .addComponent(jTextField7, -2, 171, -2))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, 32767)
      .addComponent(jScrollPane1, -2, 325, -2)
      .addGap(21, 21, 21))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(222, 222, 222)
      .addComponent(jLabel1, -2, 132, -2))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jButton2, -2, 143, -2)))
      .addContainerGap(-1, 32767)));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jLabel1, -2, 24, -2)
      .addGap(74, 74, 74)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, -2, 306, -2)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(jTextField4, -2, 28, -2)
      .addGap(55, 55, 55)
      .addComponent(jTextField7, -2, 28, -2)
      .addGap(32, 32, 32)
      .addComponent(jTextField5, -2, 28, -2)
      .addGap(36, 36, 36)
      .addComponent(jTextField6, -2, 28, -2)))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, 32767)
      .addComponent(jButton2, -2, 49, -2)
      .addGap(29, 29, 29)));
    

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, -1, -1, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, -1, -1, 32767));
    

    pack();
  }
  
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {}
}
