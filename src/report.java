
import java.sql.Connection;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author REHAN
 */
public class report extends javax.swing.JFrame {

    /**
     * Creates new form report
     */
    public String ganti = "";
    public StringTokenizer token;
    public long angka;

    public report() {
        initComponents();

    }

    public void tampilkanrep() {
        try {
            String tampilan = "yyyy-MM-dd";
            SimpleDateFormat fmt = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fmt.format(uwuu.tgllap.getDate()));
            String sql = "SELECT * FROM laporan_bulanan where Tanggal = '" + tanggal + "' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                uwuu.pmbln.setText(res.getString("Total_Pemasukan"));
                angka = Integer.parseInt(uwuu.pmbln.getText());
                ganti = NumberFormat.getNumberInstance(Locale.US).format(angka);
                token = new StringTokenizer(ganti, ".");
                ganti = token.nextToken();
                ganti = ganti.replace(',', '.');
                uwuu.pmbln.setText("Rp. " + String.format(ganti));
                uwuu.penter.setText(res.getString("Jumlah_Pesanan"));
                uwuu.jbMakanan.setText(res.getString("Best_Makanan"));
                uwuu.jbMinuman.setText(res.getString("Best_Minuman"));
                uwuu.Kmakanan.setText(res.getString("Bad_Makanan"));
                uwuu.Kminuman.setText(res.getString("Bad_Minuman"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void mselmin() {
        try {
            int itungan6 = Integer.parseInt(uwuu.count5.getText());
            int itungan7 = Integer.parseInt(uwuu.count6.getText());
            int itungan8 = Integer.parseInt(uwuu.count7.getText());
            int itungan9 = Integer.parseInt(uwuu.count8.getText());
            int itungan10 = Integer.parseInt(uwuu.count9.getText());
            if (itungan6 > itungan7 && itungan6 > itungan8 && itungan6 > itungan9 && itungan6 > itungan10) {
                uwuu.jbMinuman.setText("COFFEE CREAMY");
            } else if (itungan7 > itungan8 && itungan7 > itungan9 && itungan7 > itungan10 && itungan7 > itungan6) {
                uwuu.jbMinuman.setText("COFFEE CREAM CARAMEL");
            } else if (itungan8 > itungan9 && itungan8 > itungan10 && itungan8 > itungan7 && itungan8 > itungan6) {
                uwuu.jbMinuman.setText("CHOCO BLITZ");
            } else if (itungan9 > itungan10 && itungan9 > itungan8 && itungan9 > itungan7 && itungan9 > itungan6) {
                uwuu.jbMinuman.setText("GREEN TEA");
            } else if (itungan10 > itungan9 && itungan10 > itungan8 && itungan10 > itungan7 && itungan10 > itungan6) {
                uwuu.jbMinuman.setText("REDVELVO");
            }
        } catch (Exception e) {
        }

    }

    public void mpilbah() {
        if (uwuu.jbMakanan.getText().equalsIgnoreCase("kentang")) {
            uwuu.lapbah1.setText("Kentang 150g");
            uwuu.lapbah2.setText("");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMakanan.getText().equalsIgnoreCase("indomie spesial")) {
            uwuu.lapbah1.setText("Indomie 1 pcs");
            uwuu.lapbah2.setText("Telor 1 Butir");
            uwuu.lapbah3.setText("Sosis 1 pcs");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMakanan.getText().equalsIgnoreCase("sate taichan")) {
            uwuu.lapbah1.setText("Daging ayam 150g");
            uwuu.lapbah2.setText("Lontong 1 pcs");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMakanan.getText().equalsIgnoreCase("ropang")) {
            uwuu.lapbah1.setText("Roti 2 pcs");
            uwuu.lapbah2.setText("Nutela 10g");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMakanan.getText().equalsIgnoreCase("sosis tempura")) {
            uwuu.lapbah1.setText("Sosis 2 pcs");
            uwuu.lapbah2.setText("Tempura 2 pcs");
            uwuu.lapbah3.setText("Sukoi 2 pcs");
            uwuu.lapbah4.setText("Bintang 2 pcs");
        }
    }

    public void mpilbah1() {
        if (uwuu.jbMinuman.getText().equalsIgnoreCase("coffe creamy")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Susu KM 15ml");
            uwuu.lapbah3.setText("Kopi 10g");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMinuman.getText().equalsIgnoreCase("choco blitz")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Bubuk coklat 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMinuman.getText().equalsIgnoreCase("Greentea")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Green tea 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMinuman.getText().equalsIgnoreCase("Red Velvo")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Red Velvet 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.jbMinuman.getText().equalsIgnoreCase("coffe cream caramel")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Susu KM 15ml");
            uwuu.lapbah3.setText("Kopi 10g");
            uwuu.lapbah4.setText("Caramel 10g");
        }
    }

    public void mpilbah2() {
        if (uwuu.Kmakanan.getText().equalsIgnoreCase("kentang")) {
            uwuu.lapbah1.setText("Kentang 150g");
            uwuu.lapbah2.setText("");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kmakanan.getText().equalsIgnoreCase("indomie spesial")) {
            uwuu.lapbah1.setText("Indomie 1 pcs");
            uwuu.lapbah2.setText("Telor 1 Butir");
            uwuu.lapbah3.setText("Sosis 1 pcs");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kmakanan.getText().equalsIgnoreCase("sate taichan")) {
            uwuu.lapbah1.setText("Daging ayam 150g");
            uwuu.lapbah2.setText("Lontong 1 pcs");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kmakanan.getText().equalsIgnoreCase("ropang")) {
            uwuu.lapbah1.setText("Roti 2 pcs");
            uwuu.lapbah2.setText("Nutela 10g");
            uwuu.lapbah3.setText("");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kmakanan.getText().equalsIgnoreCase("sosis tempura")) {
            uwuu.lapbah1.setText("Sosis 2 pcs");
            uwuu.lapbah2.setText("Tempura 2 pcs");
            uwuu.lapbah3.setText("Sukoi 2 pcs");
            uwuu.lapbah4.setText("Bintang 2 pcs");
        }
    }

    public void mpilbah3() {
        if (uwuu.Kminuman.getText().equalsIgnoreCase("coffe creamy")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Susu KM 15ml");
            uwuu.lapbah3.setText("Kopi 10g");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kminuman.getText().equalsIgnoreCase("choco blitz")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Bubuk coklat 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kminuman.getText().equalsIgnoreCase("Greentea")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Green tea 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kminuman.getText().equalsIgnoreCase("Red Velvo")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Red Velvet 15g");
            uwuu.lapbah3.setText("Gula cair 15ml");
            uwuu.lapbah4.setText("");
        } else if (uwuu.Kminuman.getText().equalsIgnoreCase("coffe cream caramel")) {
            uwuu.lapbah1.setText("Susu UHT 100ml");
            uwuu.lapbah2.setText("Susu KM 15ml");
            uwuu.lapbah3.setText("Kopi 10g");
            uwuu.lapbah4.setText("Caramel 10g");
        }
    }

    public void mselman() {
        try {
            int itungan1 = Integer.parseInt(uwuu.count.getText());
            int itungan2 = Integer.parseInt(uwuu.count1.getText());
            int itungan3 = Integer.parseInt(uwuu.count2.getText());
            int itungan4 = Integer.parseInt(uwuu.count3.getText());
            int itungan5 = Integer.parseInt(uwuu.count4.getText());

            if (itungan1 > itungan2 && itungan1 > itungan3 && itungan1 > itungan4 && itungan1 > itungan5) {
                uwuu.jbMakanan.setText("INDOMIE");
            } else if (itungan2 > itungan3 && itungan2 > itungan4 && itungan2 > itungan5
                    && itungan2 > itungan1) {
                uwuu.jbMakanan.setText("SATE TAICHAN");
            } else if (itungan3 > itungan4 && itungan3 > itungan5 && itungan3 > itungan2
                    && itungan3 > itungan1) {
                uwuu.jbMakanan.setText("KENTANG");
            } else if (itungan4 > itungan5 && itungan4 > itungan3 && itungan4 > itungan2
                    && itungan4 > itungan1) {
                uwuu.jbMakanan.setText("ROPANG");
            } else if (itungan5 > itungan4 && itungan5 > itungan3 && itungan5 > itungan2
                    && itungan5 > itungan1) {
                uwuu.jbMakanan.setText("TEMPURA");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void rapot() {
        Calendar kal = new GregorianCalendar();
        int tahun = kal.get(Calendar.YEAR);
        int bulan = kal.get(Calendar.MONTH) + 1;
        int tgl1 = kal.get(Calendar.DAY_OF_MONTH);
        String tglsi = (tahun + "-" + bulan + "-" + tgl1);

        if (tgl1 == 30 || tgl1 == 31 || (tgl1 == 28 && bulan == 2) || (tgl1 == 29 && bulan == 2)) {

            //pemasukan
            uwuu.pmbln.setText(uwuu.totalrtra.getText());
            //mostsell
            try {
                int itungan1 = Integer.parseInt(uwuu.count.getText());
                int itungan2 = Integer.parseInt(uwuu.count1.getText());
                int itungan3 = Integer.parseInt(uwuu.count2.getText());
                int itungan4 = Integer.parseInt(uwuu.count3.getText());
                int itungan5 = Integer.parseInt(uwuu.count4.getText());
                int itungan6 = Integer.parseInt(uwuu.count5.getText());
                int itungan7 = Integer.parseInt(uwuu.count6.getText());
                int itungan8 = Integer.parseInt(uwuu.count7.getText());
                int itungan9 = Integer.parseInt(uwuu.count8.getText());
                int itungan10 = Integer.parseInt(uwuu.count9.getText());
                //best
                if (itungan1 > itungan2 && itungan1 > itungan3 && itungan1 > itungan4 && itungan1 > itungan5) {
                    uwuu.jbMakanan.setText("INDOMIE");
                } else if (itungan2 > itungan3 && itungan2 > itungan4 && itungan2 > itungan5
                        && itungan2 > itungan1) {
                    uwuu.jbMakanan.setText("SATE TAICHAN");
                } else if (itungan3 > itungan4 && itungan3 > itungan5 && itungan3 > itungan2
                        && itungan3 > itungan1) {
                    uwuu.jbMakanan.setText("KENTANG");
                } else if (itungan4 > itungan5 && itungan4 > itungan3 && itungan4 > itungan2
                        && itungan4 > itungan1) {
                    uwuu.jbMakanan.setText("ROPANG");
                } else if (itungan5 > itungan4 && itungan5 > itungan3 && itungan5 > itungan2
                        && itungan5 > itungan1) {
                    uwuu.jbMakanan.setText("TEMPURA");
                }
                if (itungan6 > itungan7 && itungan6 > itungan8 && itungan6 > itungan9 && itungan6 > itungan10) {
                    uwuu.jbMinuman.setText("COFFEE CREAMY");
                } else if (itungan7 > itungan8 && itungan7 > itungan9 && itungan7 > itungan10 && itungan7 > itungan6) {
                    uwuu.jbMinuman.setText("<html>COFFEE CREAM <br/>CARAMEL</html>");
                } else if (itungan8 > itungan9 && itungan8 > itungan10 && itungan8 > itungan7 && itungan8 > itungan6) {
                    uwuu.jbMinuman.setText("CHOCO BLITZ");
                } else if (itungan9 > itungan10 && itungan9 > itungan8 && itungan9 > itungan7 && itungan9 > itungan6) {
                    uwuu.jbMinuman.setText("GREEN TEA");
                } else if (itungan10 > itungan9 && itungan10 > itungan8 && itungan10 > itungan7 && itungan10 > itungan6) {
                    uwuu.jbMinuman.setText("REDVELVO");
                }
                //kureng
                if (itungan1 < itungan2 && itungan1 < itungan3 && itungan1 < itungan4 && itungan1 < itungan5) {
                    uwuu.Kmakanan.setText("INDOMIE");
                } else if (itungan2 < itungan3 && itungan2 < itungan4 && itungan2 < itungan5
                        && itungan2 < itungan1) {
                    uwuu.Kmakanan.setText("SATE TAICHAN");
                } else if (itungan3 < itungan4 && itungan3 < itungan5 && itungan3 < itungan2
                        && itungan3 < itungan1) {
                    uwuu.Kmakanan.setText("KENTANG");
                } else if (itungan4 < itungan5 && itungan4 < itungan3 && itungan4 < itungan2
                        && itungan4 < itungan1) {
                    uwuu.Kmakanan.setText("ROPANG");
                } else if (itungan5 < itungan4 && itungan5 < itungan3 && itungan5 < itungan2
                        && itungan5 < itungan1) {
                    uwuu.Kmakanan.setText("TEMPURA");
                }
                if (itungan6 < itungan7 && itungan6 < itungan8 && itungan6 < itungan9 && itungan6 < itungan10) {
                    uwuu.Kminuman.setText("COFFEE CREAMY");
                } else if (itungan7 < itungan8 && itungan7 < itungan9 && itungan7 < itungan10 && itungan7 < itungan6) {
                    uwuu.Kminuman.setText("<html>COFFEE CREAM <br/>CARAMEL</html>");
                } else if (itungan8 < itungan9 && itungan8 < itungan10 && itungan8 < itungan7 && itungan8 < itungan6) {
                    uwuu.Kminuman.setText("CHOCO BLITZ");
                } else if (itungan9 < itungan10 && itungan9 < itungan8 && itungan9 < itungan7 && itungan9 < itungan6) {
                    uwuu.Kminuman.setText("GREEN TEA");
                } else if (itungan10 < itungan9 && itungan10 < itungan8 && itungan10 < itungan7 && itungan10 < itungan6) {
                    uwuu.Kminuman.setText("REDVELVO");
                }
                try {
                    String sql = "SELECT COUNT(Kode_Transaksi) FROM transaksi ";
                    java.sql.Connection conn = (Connection) Config.configDB();
                    java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                    java.sql.ResultSet res = stm.executeQuery();
                    while (res.next()) {
                        uwuu.penter.setText(res.getString("COUNT(Kode_Transaksi)"));

                    }
                } catch (Exception e) {
                    System.out.println(e);

                }
                try {
                    java.sql.Connection conn = (Connection) Config.configDB();
                    String sql = "INSERT INTO laporan_bulanan VALUES('" + uwuu.totalilang.getText() + "' ,'" + uwuu.penter.getText() + "','" + uwuu.jbMakanan.getText() + "','" + uwuu.jbMinuman.getText() + "','" + tglsi + "','" + uwuu.Kmakanan.getText() + "','" + uwuu.Kminuman.getText() + "' )";
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
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
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\REHAN\\Downloads\\Boleh download.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(945, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(773, 773, 773))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDayChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(731, 731, 731))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jDayChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)))
                .addContainerGap(419, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jDateChooser2.getDateFormatString();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jDateChooser2.getJCalendar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
