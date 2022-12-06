package movieticketsystem;

import javax.swing.table.DefaultTableModel;


public class ViewTheTicket extends javax.swing.JFrame {

    public ViewTheTicket() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NAME:");

        jTextField1.setText("ENTER YOUR NAME");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("ENTER YOUR NUMBER");
        jTextField2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField2MouseMoved(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NUMBER:");

        jButton1.setText("Check");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Movie", "Date", "Timing", "Seat"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTER NAME AND NUMBER FOR TICKET");

        jButton2.setText("Delete Selected Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jLabel1, jLabel2, jTextField1, jTextField2});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String[][] details = F.readworddetails("Userdetails.txt", 0, F.checklength("Userdetails.txt"), 7);
        name = jTextField1.getText();
        number = jTextField2.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < F.checklength("Userdetails.txt"); i++) {
            if (details[i][0].equals(jTextField1.getText().replaceAll(" ", "_")) == true && details[i][1].equals(jTextField2.getText().replaceAll(" ", "_")) == true) {
                slotnumber = i;

                model.addRow(new Object[]{details[i][0].replaceAll("_", " "), details[i][2].replaceAll("_", " "), details[i][3].replaceAll("_", " "),
                    details[i][4].replaceAll("_", " "), details[i][5].replaceAll("_", " ")});
            }
            jButton1.setText("Check");
            }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] tabledetails = new String[5];
        int row = jTable1.getSelectedRow();
        int[] columns = jTable1.getSelectedColumns();

        for (int j = 0; j < 5; j++) {
            tabledetails[j] = (String) jTable1.getValueAt(row, j);
        }
        deletedetails(slotnumber - (jTable1.getRowCount() - row) + 1);
        slotnumber = 0;
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       MainFrame MF= new MainFrame();
       MF.setVisible(true);
       MF.setLocationRelativeTo(null);
       this.dispose();   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
       jButton2.setEnabled(false);
        if (jTextField2.getText().length()==11&&jTextField1.getText().equals("")==false) {
             jButton1.setEnabled(true);}
       if(jTextField2.getText().length()!=11)
       {
             jTextField2.setText("Invalid Number");
             jButton1.setEnabled(false);
       }
       if(jTextField1.getText().equals(null)==true||jTextField1.getText().equals("ENTER YOUR NAME")==true)
       {
             jTextField1.setText("Name Missing");
             jButton1.setEnabled(false);
       }
        if(jTable1.getSelectedRow()!=-1)
        {
        jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1MouseMoved

    private void jTextField2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseMoved
       
    }//GEN-LAST:event_jTextField2MouseMoved

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if(jTable1.getSelectedRow()!=-1)
        {
        jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked
    
//    Global Intialization
      int slotnumber;
    String name, number;
    Filing F = new Filing();      
            
    void deletedetails(int slotnumber){
        String[][] seatsdetails = F.readworddetails("Seats.txt", 0, F.checklength("Seats.txt"), 4);
        String[][] userdetails = F.readworddetails("Userdetails.txt", 0, F.checklength("Userdetails.txt"), 7);
        int filelength = F.checklength("Seats.txt");
        F.addtempdetails("", "Userdetails.txt");
        F.addtempdetails("", "Seats.txt");
        for (int i = 0; i < filelength; i++) {
            if (i == slotnumber) {
                continue;
            }
            F.adddetails(seatsdetails[i][0] + " " + seatsdetails[i][1] + " " + seatsdetails[i][2] + " " + seatsdetails[i][3] + "\n", "Seats.txt");
            F.adddetails(userdetails[i][0] + " " + userdetails[i][1] + " " + userdetails[i][2] + " "
                    + userdetails[i][3] + " " + userdetails[i][4] + " " + userdetails[i][5] + " " + userdetails[i][6] + "\n", "Userdetails.txt");
        }
        jButton1.setText("Refresh");
    }
    
    void firstcall()
    {
    jButton2.setEnabled(false);
            }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTheTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
