package movieticketsystem;

public class BookingForm extends javax.swing.JFrame {

    public BookingForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("ENTER YOUR NAME");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("ENTER YOUR NUMBER");
        jTextField4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField4MouseMoved(evt);
            }
        });
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jComboBox2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBox2MouseMoved(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("NAME:");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("MOVIES:");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("NUMBER:");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("DATE:");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("TIMINGS:");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOKING FORM");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    jComboBox3.setEnabled(true);
        for (int i = 0; i < 5; i++) {
            if (i == jComboBox2.getSelectedIndex())
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(MovieDate[i]));
                }           
    }//GEN-LAST:event_jComboBox2ActionPerformed
        
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        jComboBox4.setEnabled(true);
        a=jComboBox2.getSelectedIndex();
        b=jComboBox3.getSelectedIndex();
        MovieTiming= F.readworddetails("MovieTiming.txt",(a*5)+b-a,5,5);
        for (int i = 0; i < 5; i++) {
            if (i == jComboBox2.getSelectedIndex())
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(MovieTiming[i]));
                }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
         
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
     
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
    jTextField2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
       jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        
        
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (jTextField4.getText().length()==11) {
             jComboBox2.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseMoved
       
    }//GEN-LAST:event_jTextField4MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowSeats SS = new ShowSeats();
        SS.setLocationRelativeTo(null);
        SS.setVisible(true);
        this.dispose();
        Filing F = new Filing();
        int i = jComboBox2.getSelectedIndex();
        int j = jComboBox3.getSelectedIndex();
        int k = jComboBox4.getSelectedIndex();
        F.addtempdetails(Integer.toString(i) + " " + Integer.toString(j) + " " + Integer.toString(k), "tmp");
        SS.checkingallseats();
        String MovieName = (String) jComboBox2.getSelectedItem();
        String Number= jTextField4.getText().replaceAll(" ", "");
        String MovieDate = (String) jComboBox3.getSelectedItem();
        String MovieTiming = (String) jComboBox4.getSelectedItem();
        String a=jTextField2.getText().replaceAll(" ", "_");
        F.addtempdetails(a+" ", "tmp2");
        F.adddetails(Number+" ", "tmp2");
        F.adddetails(MovieName.replaceAll(" ", "_")+" ", "tmp2");
        F.adddetails(MovieDate+" ", "tmp2");
        F.adddetails(MovieTiming+" ", "tmp2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseMoved
        if (jTextField4.getText().length() == 11 && jTextField2.getText().equals("") == false) {
            jComboBox2.setEnabled(true);
        }
        if (jTextField4.getText().length() != 11) {
            jTextField4.setText("Invalid Number");
            jComboBox2.setEnabled(false);
        }
        if (jTextField2.getText().equals("") == true || jTextField2.getText().equals("ENTER YOUR NAME") == true) {
            jTextField2.setText("Name Missing");
            jComboBox2.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox2MouseMoved

//    Intialization  
    Filing F = new Filing();
    String[] MovieList = F.readlinedetails("MovieList.txt", 5);
    String[][] MovieDate = F.readworddetails("MovieDate.txt", 0, 5, 5);
    String[][] MovieTiming = new String[5][5];
    int a,b=0;
    
    void ComboBoxListName() {
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(MovieList));
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        jButton1.setEnabled(false);
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
