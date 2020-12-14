package tugas8;
public class Soal extends javax.swing.JFrame {
    public Soal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        namaText = new javax.swing.JTextField();
        asm1Label = new javax.swing.JLabel();
        asm1Text = new javax.swing.JTextField();
        asm2Label = new javax.swing.JLabel();
        asm2Text = new javax.swing.JTextField();
        examLabel = new javax.swing.JLabel();
        examText = new javax.swing.JTextField();
        asgLabel = new javax.swing.JLabel();
        asgText = new javax.swing.JTextField();
        quizLabel = new javax.swing.JLabel();
        quizText = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        nilaiLabel = new javax.swing.JLabel();
        hurufLabel = new javax.swing.JLabel();
        bobotLabel = new javax.swing.JLabel();
        hasiltotal = new javax.swing.JLabel();
        hasilnilai = new javax.swing.JLabel();
        hasilhuruf = new javax.swing.JLabel();
        hasilbobot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        namaLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaLabel.setText("Nama");

        namaText.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        asm1Label.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        asm1Label.setForeground(new java.awt.Color(255, 255, 255));
        asm1Label.setText("Assesment 1");

        asm1Text.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        asm2Label.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        asm2Label.setForeground(new java.awt.Color(255, 255, 255));
        asm2Label.setText("Assesment 2");

        asm2Text.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        examLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        examLabel.setForeground(new java.awt.Color(255, 255, 255));
        examLabel.setText("Final Exam");

        examText.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        asgLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        asgLabel.setForeground(new java.awt.Color(255, 255, 255));
        asgLabel.setText("Assignment");

        asgText.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        quizLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        quizLabel.setForeground(new java.awt.Color(255, 255, 255));
        quizLabel.setText("Quiz");

        quizText.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        submit.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NILAI AKHIR MAHASISWA");

        back.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("Total");

        nilaiLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        nilaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        nilaiLabel.setText("Nilai Akhir");

        hurufLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        hurufLabel.setForeground(new java.awt.Color(255, 255, 255));
        hurufLabel.setText("Huruf");

        bobotLabel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        bobotLabel.setForeground(new java.awt.Color(255, 255, 255));
        bobotLabel.setText("Bobot");

        hasiltotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hasiltotal.setForeground(new java.awt.Color(255, 255, 255));
        hasiltotal.setText("-");

        hasilnilai.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hasilnilai.setForeground(new java.awt.Color(255, 255, 255));
        hasilnilai.setText("-");

        hasilhuruf.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hasilhuruf.setForeground(new java.awt.Color(255, 255, 255));
        hasilhuruf.setText("-");

        hasilbobot.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hasilbobot.setForeground(new java.awt.Color(255, 255, 255));
        hasilbobot.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asm1Label)
                            .addComponent(namaLabel)
                            .addComponent(asm2Label)
                            .addComponent(examLabel)
                            .addComponent(asgLabel)
                            .addComponent(quizLabel))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(asgText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(examText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(asm2Text, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(asm1Text, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quizText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(hurufLabel)
                                    .addGap(27, 27, 27))
                                .addComponent(nilaiLabel)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(totalLabel)
                                    .addGap(31, 31, 31)))
                            .addComponent(bobotLabel))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hasilbobot, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(hasiltotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hasilnilai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hasilhuruf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLabel)
                            .addComponent(hasiltotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nilaiLabel)
                            .addComponent(hasilnilai)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asm1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asm1Label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asm2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asm2Label)
                            .addComponent(hurufLabel)
                            .addComponent(hasilhuruf))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examLabel)
                            .addComponent(bobotLabel)
                            .addComponent(hasilbobot))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asgLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quizText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quizLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(back))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        float asm1 = Float.parseFloat(asm1Text.getText());
        float asm2 = Float.parseFloat(asm2Text.getText());
        float exam = Float.parseFloat(examText.getText());
        float asg = Float.parseFloat(asgText.getText());
        float quiz = Float.parseFloat(quizText.getText());

        float outTotal = asm1 + asm2 + exam + asg + quiz;
        float outRata = (0.15f*asm1) + (0.15f*asm2) + (0.45f*exam) + (0.2f*asg) + (0.05f*quiz);

        String huruf;
        String bobot;
        if (outRata >=85) {
            huruf = "A";
            bobot = "4.00";
        } else if (outRata >=80) {
            huruf = "A-";
            bobot = "3.67";
        } else if (outRata >=75) {
            huruf = "B+";
            bobot = "3.33";
        } else if (outRata >=70) {
            huruf = "B";
            bobot = "3.00";
        } else if (outRata >=65) {
            huruf = "B-";
            bobot = "2.50";
        } else if (outRata >=60) {
            huruf = "C";
            bobot = "2.00";
        } else if (outRata >=50) {
            huruf = "D";
            bobot = "1.00";
        } else {
            huruf = "E";
            bobot = "0.00";
        }

        hasiltotal.setText(Float.toString(outTotal));
        hasilnilai.setText(Float.toString(outRata));
        hasilhuruf.setText(huruf);
        hasilbobot.setText(bobot);
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Tugas8 home = new Tugas8();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asgLabel;
    private javax.swing.JTextField asgText;
    private javax.swing.JLabel asm1Label;
    private javax.swing.JTextField asm1Text;
    private javax.swing.JLabel asm2Label;
    private javax.swing.JTextField asm2Text;
    private javax.swing.JButton back;
    private javax.swing.JLabel bobotLabel;
    private javax.swing.JLabel examLabel;
    private javax.swing.JTextField examText;
    private javax.swing.JLabel hasilbobot;
    private javax.swing.JLabel hasilhuruf;
    private javax.swing.JLabel hasilnilai;
    private javax.swing.JLabel hasiltotal;
    private javax.swing.JLabel hurufLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaText;
    private javax.swing.JLabel nilaiLabel;
    private javax.swing.JLabel quizLabel;
    private javax.swing.JTextField quizText;
    private javax.swing.JButton submit;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
