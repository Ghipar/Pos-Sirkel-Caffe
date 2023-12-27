
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author REHAN
 */
public class autokode extends javax.swing.JFrame {

    /**
     * Creates new form autokode
     */
    public autokode() {
        initComponents();
    }

    public void auto_kode_retcus() {
        try {
            String sql = "SELECT * FROM refund order by Kode_Refund desc ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            //LocalDate hutao = LocalDate.now();

            Calendar kal = new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
            int bulan = kal.get(Calendar.MONTH) + 1;
            int tgl1 = kal.get(Calendar.DAY_OF_MONTH);
            String tanggal = tahun + "" + bulan + "" + tgl1;
            if (tanggal.length() == 6) {
                String tanggalu = tahun + "0" + bulan + "0" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Refund").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.koderet.setText("RTRC" + tanggalu + "" + Nol + AN);

                } else {
                    uwuu.koderet.setText("RTRC" + tanggalu + "001");

                }
            } else if (tanggal.length() == 7) {
                String tanggale = tahun + "0" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Refund").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.koderet.setText("RTRC" + tanggale + "" + Nol + AN);

                } else {
                    uwuu.koderet.setText("RTRC" + tanggale + "001");

                }
            } else if (tanggal.length() == 8) {
                String tanggali = tahun + "" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Refund").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.koderet.setText("RTRC" + tanggali + "" + Nol + AN);

                } else {
                    uwuu.koderet.setText("RTRC" + tanggali + "001");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void auto_kode_retsup() {
        try {
            String sql = "SELECT * FROM retur order by Kode_Retur desc ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            //LocalDate hutao = LocalDate.now();

            Calendar kal = new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
            int bulan = kal.get(Calendar.MONTH) + 1;
            int tgl1 = kal.get(Calendar.DAY_OF_MONTH);
            String tanggal = tahun + "" + bulan + "" + tgl1;
            if (tanggal.length() == 6) {
                String tanggalu = tahun + "0" + bulan + "0" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Retur").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.rskoderet.setText("RTRS" + tanggalu + "" + Nol + AN);

                } else {
                    uwuu.rskoderet.setText("RTRS" + tanggalu + "001");

                }
            } else if (tanggal.length() == 7) {
                String tanggale = tahun + "0" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Retur").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.rskoderet.setText("RTRS" + tanggale + "" + Nol + AN);

                } else {
                    uwuu.rskoderet.setText("RTRS" + tanggale + "001");

                }
            } else if (tanggal.length() == 8) {
                String tanggali = tahun + "" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Retur").substring(12);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.rskoderet.setText("RTRS" + tanggali + "" + Nol + AN);

                } else {
                    uwuu.rskoderet.setText("RTRS" + tanggali + "001");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void auto_kode_pembah() {
        try {
            String sql = "SELECT * FROM pembelian_bahan order by Kode_Pembelian desc ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            //LocalDate hutao = LocalDate.now();

            Calendar kal = new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
            int bulan = kal.get(Calendar.MONTH) + 1;
            int tgl1 = kal.get(Calendar.DAY_OF_MONTH);
            String tanggal = tahun + "" + bulan + "" + tgl1;
            if (tanggal.length() == 6) {
                String tanggalu = tahun + "0" + bulan + "0" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Pembelian").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kodetrantok.setText(tanggalu + "" + Nol + AN);

                } else {
                    uwuu.kodetrantok.setText(tanggalu + "001");

                }
            } else if (tanggal.length() == 7) {
                String tanggale = tahun + "0" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Pembelian").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kodetrantok.setText(tanggale + "" + Nol + AN);

                } else {
                    uwuu.kodetrantok.setText(tanggale + "001");

                }
            } else if (tanggal.length() == 8) {
                String tanggali = tahun + "" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Pembelian").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kodetrantok.setText(tanggali + "" + Nol + AN);

                } else {
                    uwuu.kodetrantok.setText(tanggali + "001");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void auto_kode_tran() {
        try {
            String sql = "SELECT * FROM transaksi order by Kode_Transaksi desc ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            //LocalDate hutao = LocalDate.now();

            Calendar kal = new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
            int bulan = kal.get(Calendar.MONTH) + 1;
            int tgl1 = kal.get(Calendar.DAY_OF_MONTH);
            String tanggal = tahun + "" + bulan + "" + tgl1;
            if (tanggal.length() == 6) {
                String tanggalu = tahun + "0" + bulan + "0" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Transaksi").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kdtransto.setText(tanggalu + "" + Nol + AN);

                } else {
                    uwuu.kdtransto.setText(tanggalu + "001");

                }
            } else if (tanggal.length() == 7) {
                String tanggale = tahun + "0" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Transaksi").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kdtransto.setText(tanggale + "" + Nol + AN);

                } else {
                    uwuu.kdtransto.setText(tanggale + "001");

                }
            } else if (tanggal.length() == 8) {
                String tanggali = tahun + "" + bulan + "" + tgl1;
                if (res.next()) {

                    String kode2 = res.getString("Kode_Transaksi").substring(8);
                    int oper = Integer.parseInt(kode2);
                    String AN = "" + (oper + 1);
                    String Nol = "";

                    if (AN.length() == 1) {
                        Nol = "00";
                    } else if (AN.length() == 2) {
                        Nol = "0";
                    } else if (AN.length() == 3) {
                        Nol = "";
                    }

                    uwuu.kdtransto.setText(tanggali + "" + Nol + AN);

                } else {
                    uwuu.kdtransto.setText(tanggali + "001");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void auto_kode_diskon() {
        try {
            String sql = "SELECT * FROM diskon order by Kode_Diskon desc ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();

            if (res.next()) {
                String kode2 = res.getString("Kode_Diskon").substring(3);
                String AN = "" + (Integer.parseInt(kode2) + 1);
                String AN2 = "" + (Integer.parseInt(kode2));
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "00";
                } else if (AN.length() == 2) {
                    Nol = "0";
                } else if (AN.length() == 3) {
                    Nol = "";
                }

                uwuu.kddiskon.setText("DIS" + Nol + AN);
                uwuu.kddiskonfix.setText("DIS" + Nol + AN2);

            } else {
                uwuu.kddiskon.setText("DIS001");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void kirim() {

        if ((uwuu.stokerti.getText().equals("" + 0) && uwuu.stoketlr.getText().equals("" + 0) && uwuu.stokesis.getText().equals("" + 0)
                && uwuu.stokenutela.getText().equals("" + 0) && uwuu.stokektg.getText().equals("" + 0) && uwuu.stoketempura.getText().equals("" + 0)
                && uwuu.stokesukoi.getText().equals("" + 0) && uwuu.stokbtg.getText().equals("" + 0) && uwuu.stoksuht.getText().equals("" + 0)
                && uwuu.stokskm.getText().equals("" + 0) && uwuu.stokkpi.getText().equals("" + 0) && uwuu.stokcrm.getText().equals("" + 0)
                && uwuu.stokbc.getText().equals("" + 0) && uwuu.stokbt.getText().equals("" + 0) && uwuu.stokbr.getText().equals("" + 0)
                && uwuu.stokgc.getText().equals("" + 0) && uwuu.stokemie.getText().equals("" + 0)
                && uwuu.stokeltg.getText().equals("" + 0) && uwuu.stokedgng.getText().equals("" + 0))
                || (uwuu.hargatlur.getText().equals("" + 0) && uwuu.hargaroti.getText().equals("" + 0) && uwuu.hargasis.getText().equals("" + 0)
                && uwuu.harganutela.getText().equals("" + 0) && uwuu.hargakentang.getText().equals("" + 0) && uwuu.hargateampura.getText().equals("" + 0)
                && uwuu.hargasukoi.getText().equals("" + 0) && uwuu.hargabintang.getText().equals("" + 0) && uwuu.hargauht.getText().equals("" + 0)
                && uwuu.hargakm.getText().equals("" + 0) && uwuu.hargakopi.getText().equals("" + 0) && uwuu.hargacaramel.getText().equals("" + 0)
                && uwuu.hargabubukcok.getText().equals("" + 0) && uwuu.hargabubukgreen.getText().equals("" + 0) && uwuu.hargabukred.getText().equals("" + 0)
                && uwuu.hargalontong.getText().equals("" + 0) && uwuu.hargadaging.getText().equals("" + 0)) || uwuu.nasupbah.getText().equals("Nama Supplier")) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data bahan!!", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int tlr = ((Integer.parseInt(uwuu.hargatlur.getText())) /* (Integer.parseInt(uwuu.stoketlr.getText()))*/);
            int roti = ((Integer.parseInt(uwuu.hargaroti.getText())) /* (Integer.parseInt(uwuu.stokerti.getText()))*/);
            int sosis = ((Integer.parseInt(uwuu.hargasis.getText())) /* (Integer.parseInt(uwuu.stokesis.getText()))*/);
            int mie = ((Integer.parseInt(uwuu.hargamie.getText())) /* (Integer.parseInt(uwuu.stokemie.getText()))*/);
            int daging = ((Integer.parseInt(uwuu.hargadaging.getText())) /* (Integer.parseInt(uwuu.stokedgng.getText()))*/);
            int lontong = ((Integer.parseInt(uwuu.hargalontong.getText())) /* (Integer.parseInt(uwuu.stokeltg.getText()))*/);
            int ktg = ((Integer.parseInt(uwuu.hargakentang.getText())) /* (Integer.parseInt(uwuu.stokektg.getText()))*/);
            int nutela = ((Integer.parseInt(uwuu.harganutela.getText())) /* (Integer.parseInt(uwuu.stokenutela.getText()))*/);
            int tempura = ((Integer.parseInt(uwuu.hargateampura.getText())) /* (Integer.parseInt(uwuu.stoketempura.getText()))*/);
            int sukoi = ((Integer.parseInt(uwuu.hargasukoi.getText())) /* (Integer.parseInt(uwuu.stokesukoi.getText()))*/);
            int bintang = ((Integer.parseInt(uwuu.hargabintang.getText())) /* (Integer.parseInt(uwuu.stokbtg.getText()))*/);
            int susuUht = ((Integer.parseInt(uwuu.hargauht.getText())) /* (Integer.parseInt(uwuu.stoksuht.getText()))*/);
            int susukm = ((Integer.parseInt(uwuu.hargakm.getText())) /* (Integer.parseInt(uwuu.stokskm.getText()))*/);
            int kpi = ((Integer.parseInt(uwuu.hargakopi.getText())) /* (Integer.parseInt(uwuu.stokkpi.getText()))*/);
            int caram = ((Integer.parseInt(uwuu.hargacaramel.getText())) /* (Integer.parseInt(uwuu.stokcrm.getText()))*/);
            int bc = ((Integer.parseInt(uwuu.hargabubukcok.getText())) /* (Integer.parseInt(uwuu.stokbc.getText()))*/);
            int gt = ((Integer.parseInt(uwuu.hargabubukgreen.getText())) /* (Integer.parseInt(uwuu.stokbt.getText()))*/);
            int red = ((Integer.parseInt(uwuu.hargabukred.getText())) /* (Integer.parseInt(uwuu.stokbr.getText()))*/);
            int gla = ((Integer.parseInt(uwuu.hargagula.getText())) /* (Integer.parseInt(uwuu.stokgc.getText()))*/);
            int total = tlr + roti + sosis + mie + daging + lontong + ktg + nutela + tempura
                    + sukoi + bintang + susuUht + susukm + kpi + caram + bc + gt + red + gla;
            uwuu.totalkabehbah.setText("" + total);
            try {

                String sqll = "INSERT pembelian_bahan VALUES ('" + uwuu.kodetrantok.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.totalkabehbah.getText() + "','" + uwuu.nasupbah.getText() + "')";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                pst1.execute();
                //detail
                try {
                    //telur
                    if ((Integer.parseInt(uwuu.stoketlr.getText()) > 0)) {

                        try {
                            String sqltlr = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN001','" + uwuu.stoketlr.getText() + "','" + tlr + "')";
                            String sql2 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stoketlr.getText()) + Integer.parseInt(uwuu.jmlhtelur.getText())) + "' WHERE Kode_Bahan = 'MKN001'";
                            java.sql.PreparedStatement psttlr = conn.prepareStatement(sqltlr);
                            java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
                            psttlr.execute();
                            pst2.execute();

                        } catch (Exception e) {
                            System.out.println("telur" + e);
                        }
                    }
                    //roti
                    if ((Integer.parseInt(uwuu.stokerti.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN002','" + uwuu.stokerti.getText() + "','" + roti + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokerti.getText()) + Integer.parseInt(uwuu.jmlhroti.getText())) + "' WHERE Kode_Bahan = 'MKN002'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //sosis
                    if ((Integer.parseInt(uwuu.stokesis.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN004','" + uwuu.stokesis.getText() + "','" + sosis + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokesis.getText()) + Integer.parseInt(uwuu.jmlhsis.getText())) + "' WHERE Kode_Bahan = 'MKN004'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //mie
                    if ((Integer.parseInt(uwuu.stokemie.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN003','" + uwuu.stokemie.getText() + "','" + mie + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokemie.getText()) + Integer.parseInt(uwuu.jmlhmie.getText())) + "' WHERE Kode_Bahan = 'MKN003'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //daging
                    if ((Integer.parseInt(uwuu.stokedgng.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN005','" + uwuu.stokedgng.getText() + "','" + daging + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokedgng.getText()) + Integer.parseInt(uwuu.jmlhdgng.getText())) + "' WHERE Kode_Bahan = 'MKN005'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //lontong
                    if ((Integer.parseInt(uwuu.stokeltg.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN011','" + uwuu.stokeltg.getText() + "','" + lontong + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokeltg.getText()) + Integer.parseInt(uwuu.jmlhltg.getText())) + "' WHERE Kode_Bahan = 'MKN011'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //nutela
                    if ((Integer.parseInt(uwuu.stokenutela.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN007','" + uwuu.stokenutela.getText() + "','" + nutela + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokenutela.getText()) + Integer.parseInt(uwuu.jmlhnutela.getText())) + "' WHERE Kode_Bahan = 'MKN007'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //kentang
                    if ((Integer.parseInt(uwuu.stokektg.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN006','" + uwuu.stokektg.getText() + "','" + ktg + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokektg.getText()) + Integer.parseInt(uwuu.jmlhktg.getText())) + "' WHERE Kode_Bahan = 'MKN006'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //tempura
                    if ((Integer.parseInt(uwuu.stoketempura.getText()) > 0)) {
                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN008','" + uwuu.stoketempura.getText() + "','" + tempura + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stoketempura.getText()) + Integer.parseInt(uwuu.jmlhtempura.getText())) + "' WHERE Kode_Bahan = 'MKN008'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //sukoi
                    if ((Integer.parseInt(uwuu.stokesukoi.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN009','" + uwuu.stokesukoi.getText() + "','" + sukoi + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokesukoi.getText()) + Integer.parseInt(uwuu.jmlhnusukoi.getText())) + "' WHERE Kode_Bahan = 'MKN009'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //bintang
                    if ((Integer.parseInt(uwuu.stokbtg.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MKN010','" + uwuu.stokbtg.getText() + "','" + bintang + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokbtg.getText()) + Integer.parseInt(uwuu.jmlhbtg.getText())) + "' WHERE Kode_Bahan = 'MKN010'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //suht
                    if ((Integer.parseInt(uwuu.stoksuht.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM001','" + uwuu.stoksuht.getText() + "','" + susuUht + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stoksuht.getText()) + Integer.parseInt(uwuu.jmlhsuht.getText())) + "' WHERE Kode_Bahan = 'MNM001'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }

                    //skm
                    if ((Integer.parseInt(uwuu.stokskm.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM002','" + uwuu.stokskm.getText() + "','" + susukm + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokskm.getText()) + Integer.parseInt(uwuu.jmlhskm.getText())) + "' WHERE Kode_Bahan = 'MNM002'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //kopi
                    if ((Integer.parseInt(uwuu.stokkpi.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM003','" + uwuu.stokkpi.getText() + "','" + kpi + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokkpi.getText()) + Integer.parseInt(uwuu.jmlhkpi.getText())) + "' WHERE Kode_Bahan = 'MNM003'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //caramel
                    if ((Integer.parseInt(uwuu.stokcrm.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM004','" + uwuu.stokcrm.getText() + "','" + caram + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokcrm.getText()) + Integer.parseInt(uwuu.jmlhcrm.getText())) + "' WHERE Kode_Bahan = 'MNM004'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //bc
                    if ((Integer.parseInt(uwuu.stokbc.getText()) > 0)) {
                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM005','" + uwuu.stokbc.getText() + "','" + bc + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokbc.getText()) + Integer.parseInt(uwuu.jmlhbc.getText())) + "' WHERE Kode_Bahan = 'MNM005'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //bt
                    if ((Integer.parseInt(uwuu.stokbt.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM006','" + uwuu.stokbt.getText() + "','" + gt + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokbt.getText()) + Integer.parseInt(uwuu.jmlhbt.getText())) + "' WHERE Kode_Bahan = 'MNM006'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //br
                    if ((Integer.parseInt(uwuu.stokbr.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM007','" + uwuu.stokbr.getText() + "','" + red + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokbr.getText()) + Integer.parseInt(uwuu.jmlhbr.getText())) + "' WHERE Kode_Bahan = 'MNM007'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    //gc
                    if ((Integer.parseInt(uwuu.stokgc.getText()) > 0)) {

                        try {
                            String sqlrti = "INSERT detail_pembelian VALUES ('" + uwuu.kodetrantok.getText() + "','MNM008','" + uwuu.stokgc.getText() + "','" + gla + "')";
                            String sql3 = "UPDATE `bahan` SET `Jumlah`= '" + (Integer.parseInt(uwuu.stokgc.getText()) + Integer.parseInt(uwuu.jmlhgc.getText())) + "' WHERE Kode_Bahan = 'MNM008'";
                            java.sql.PreparedStatement pstrti = conn.prepareStatement(sqlrti);
                            java.sql.PreparedStatement pst3 = conn.prepareStatement(sql3);
                            pstrti.execute();
                            pst3.execute();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
                uwuu.stoketlr.setText("" + 0);
                uwuu.stokerti.setText("" + 0);
                uwuu.stokesis.setText("" + 0);
                uwuu.stokemie.setText("" + 0);
                uwuu.stokedgng.setText("" + 0);
                uwuu.stokeltg.setText("" + 0);
                uwuu.stokenutela.setText("" + 0);
                uwuu.stokektg.setText("" + 0);
                uwuu.stoketempura.setText("" + 0);
                uwuu.stokesukoi.setText("" + 0);
                uwuu.stokbtg.setText("" + 0);
                uwuu.stoksuht.setText("" + 0);
                uwuu.stokskm.setText("" + 0);
                uwuu.stokkpi.setText("" + 0);
                uwuu.stokcrm.setText("" + 0);
                uwuu.stokbc.setText("" + 0);
                uwuu.stokbt.setText("" + 0);
                uwuu.stokbr.setText("" + 0);
                uwuu.stokgc.setText("" + 0);
                uwuu.nasupbah.setText("Nama Supplier");
                uwuu.totalkabehbah.setText("");
                uwuu.hargatlur.setText("" + 0);
                uwuu.hargaroti.setText("" + 0);
                uwuu.hargasis.setText("" + 0);
                uwuu.hargamie.setText("" + 0);
                uwuu.hargadaging.setText("" + 0);
                uwuu.hargalontong.setText("" + 0);
                uwuu.harganutela.setText("" + 0);
                uwuu.hargakentang.setText("" + 0);
                uwuu.hargateampura.setText("" + 0);
                uwuu.hargasukoi.setText("" + 0);
                uwuu.hargabintang.setText("" + 0);
                uwuu.hargauht.setText("" + 0);
                uwuu.hargakm.setText("" + 0);
                uwuu.hargakopi.setText("" + 0);
                uwuu.hargacaramel.setText("" + 0);
                uwuu.hargabubukcok.setText("" + 0);
                uwuu.hargabubukgreen.setText("" + 0);
                uwuu.hargabukred.setText("" + 0);
                uwuu.hargagula.setText("" + 0);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        new keranjang().cek();
        new autokode().auto_kode_pembah();
    }

    public void clear() {
        uwuu.stoketlr.setText("" + 0);
        uwuu.stokerti.setText("" + 0);
        uwuu.stokesis.setText("" + 0);
        uwuu.stokemie.setText("" + 0);
        uwuu.stokedgng.setText("" + 0);
        uwuu.stokeltg.setText("" + 0);
        uwuu.stokenutela.setText("" + 0);
        uwuu.stokektg.setText("" + 0);
        uwuu.stoketempura.setText("" + 0);
        uwuu.stokesukoi.setText("" + 0);
        uwuu.stokbtg.setText("" + 0);
        uwuu.stoksuht.setText("" + 0);
        uwuu.stokskm.setText("" + 0);
        uwuu.stokkpi.setText("" + 0);
        uwuu.stokcrm.setText("" + 0);
        uwuu.stokbc.setText("" + 0);
        uwuu.stokbt.setText("" + 0);
        uwuu.stokbr.setText("" + 0);
        uwuu.stokgc.setText("" + 0);
        uwuu.nasupbah.setText("Nama Supplier");
        uwuu.totalkabehbah.setText("");
        uwuu.hargatlur.setText("" + 0);
        uwuu.hargaroti.setText("" + 0);
        uwuu.hargasis.setText("" + 0);
        uwuu.hargamie.setText("" + 0);
        uwuu.hargadaging.setText("" + 0);
        uwuu.hargalontong.setText("" + 0);
        uwuu.harganutela.setText("" + 0);
        uwuu.hargakentang.setText("" + 0);
        uwuu.hargateampura.setText("" + 0);
        uwuu.hargasukoi.setText("" + 0);
        uwuu.hargabintang.setText("" + 0);
        uwuu.hargauht.setText("" + 0);
        uwuu.hargakm.setText("" + 0);
        uwuu.hargakopi.setText("" + 0);
        uwuu.hargacaramel.setText("" + 0);
        uwuu.hargabubukcok.setText("" + 0);
        uwuu.hargabubukgreen.setText("" + 0);
        uwuu.hargabukred.setText("" + 0);
        uwuu.hargagula.setText("" + 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(autokode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(autokode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(autokode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(autokode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autokode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
