
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author REHAN
 */
public class suplaya extends javax.swing.JFrame {

    /**
     * Creates new form suplaya
     */
    public suplaya() {
        initComponents();
    }

    public void recus() {

        try {
            String sql = "SELECT * FROM bahan ";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                uwuu.rsbah.addItem(res.getString("Nama_Bahan"));

            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void rtrc() {
        try {

            if ((uwuu.calasanfield.getText().equals("Alasan") || uwuu.cjmlhmenufield.getText().equals("Jumlah Menu")
                    || uwuu.rcfieldkdtran.getText().equals("Kode Transaksi")) || (uwuu.calasanfield.getText().equals("") || uwuu.cjmlhmenufield.getText().equals("")
                    || uwuu.rcfieldkdtran.getText().equals("") || uwuu.rcdisk.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Data retur kurang lengkap!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (uwuu.ukembal.isSelected()) {
                    if (uwuu.Commenu.getSelectedItem().equals("Indomie Special")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MKB01' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Sate Taichan")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MKB02' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Kentang")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MKR01' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Ropang")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MKR02' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Sosis Tempura")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR03','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MKR03' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Coffee Creamy")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MCB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MCB01' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Integer.parseInt(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Coffee Cream Caramel")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MCB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MCB02' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Choco Blitz")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MMB01' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Green Tea")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MMB02' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    } else if (uwuu.Commenu.getSelectedItem().equals("Red Velvo")) {
                        java.sql.Connection conn = (Connection) Config.configDB();
                        String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB03','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                + ",'" + uwuu.ukembal.getText() + "')";
                        java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                        pst1.execute();
                        JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                        String sql = "SELECT * FROM menu where Kode_Menu = 'MMB03' ";
                        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
                        java.sql.ResultSet res = stm.executeQuery();
                        while (res.next()) {
                            double diskkon = (Double.parseDouble(uwuu.rcdisk.getText()) / 100);
                            double hitung = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) * diskkon);
                            double totali = ((Double.parseDouble(res.getString("Harga")) * Double.parseDouble(uwuu.cjmlhmenufield.getText())) - hitung);
                            uwuu.totukemrc.setText("" + totali);
                        }
                    }
                } else {
                    //menu1
                    int jupes1 = Integer.parseInt(uwuu.cjmlhmenufield.getText());
                    if (uwuu.Commenu.getSelectedItem().equals("Indomie Special")) {
                        int telur = Integer.parseInt(uwuu.jmlhtelur.getText());
                        int mie = Integer.parseInt(uwuu.jmlhmie.getText());
                        int sosis = Integer.parseInt(uwuu.jmlhsis.getText());
                        if (jupes1 >= 1) {
                            //menu1
                            if ((jupes1 * 1) > telur || (jupes1 * 1) > mie || (jupes1 * 1) > sosis) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan indomie special");
                                if ((jupes1 * 1) > telur) {
                                    Cua.jLabel2.setText("Telur out of stock");
                                }
                                if ((jupes1 * 1) > mie) {
                                    Cua.jLabel3.setText("Mie out of stock");
                                }
                                if ((jupes1 * 1) > sosis) {
                                    Cua.jLabel4.setText("Sosis out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");

                                } catch (Exception e) {

                                }
                            }

                        }
                    } //menu 2
                    else if (uwuu.Commenu.getSelectedItem().equals("Sate Taichan")) {
                        int daging = Integer.parseInt(uwuu.jmlhdgng.getText());
                        int lontong = Integer.parseInt(uwuu.jmlhltg.getText());

                        if (jupes1 >= 1) {
                            if ((jupes1 * 150) > daging || (jupes1 * 1) > lontong) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan sate taichan");
                                if ((jupes1 * 150) > daging) {
                                    Cua.jLabel2.setText("Daging out of stock");
                                }
                                if ((jupes1 * 1) > lontong) {
                                    Cua.jLabel3.setText("Lontong out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");

                                } catch (Exception e) {

                                }
                            }
                        } //menu 3
                    } else if (uwuu.Commenu.getSelectedItem().equals("Kentang")) {
                        int kentang = Integer.parseInt(uwuu.jmlhktg.getText());
                        if (jupes1 >= 1) {
                            if ((jupes1 * 150) > kentang) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan kentang");
                                if ((jupes1 * 150) > kentang) {
                                    Cua.jLabel2.setText("Kentang out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }
                            }

                        }
                    }//menu 4
                    else if (uwuu.Commenu.getSelectedItem().equals("Ropang")) {
                        int roti = Integer.parseInt(uwuu.jmlhroti.getText());
                        int nutela = Integer.parseInt(uwuu.jmlhnutela.getText());
                        if (jupes1 >= 1) {
                            if ((jupes1 * 2) > roti || (jupes1 * 10) > nutela) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan ropang");
                                if ((jupes1 * 2) > roti) {
                                    Cua.jLabel2.setText("Roti out of stock");
                                }
                                if ((jupes1 * 10) > nutela) {
                                    Cua.jLabel3.setText("Nutela out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }
                            }

                        }
                    }//menu 5
                    else if (uwuu.Commenu.getSelectedItem().equals("Sosis Tempura")) {
                        int sosis = Integer.parseInt(uwuu.jmlhsis.getText());
                        int tempura = Integer.parseInt(uwuu.jmlhtempura.getText());
                        int sukoi = Integer.parseInt(uwuu.jmlhnusukoi.getText());
                        int bintang = Integer.parseInt(uwuu.jmlhbtg.getText());
                        if (jupes1 >= 1) {
                            if ((jupes1 * 2) > sosis || (jupes1 * 2) > tempura || (jupes1 * 2) > sukoi || (jupes1 * 2) > bintang) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan sosis tempura");
                                if ((jupes1 * 2) > sosis) {
                                    Cua.jLabel2.setText("Sosis out of stock");
                                }
                                if ((jupes1 * 2) > tempura) {
                                    Cua.jLabel3.setText("tempura out of stock");
                                }
                                if ((jupes1 * 2) > sukoi) {
                                    Cua.jLabel4.setText("sukoi out of stock");
                                }
                                if ((jupes1 * 2) > bintang) {
                                    Cua.jLabel5.setText("bintang out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MKR03','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }

                            }

                        }

                    }//menu 6
                    else if (uwuu.Commenu.getSelectedItem().equals("Coffee Creamy")) {
                        int suht = Integer.parseInt(uwuu.jmlhsuht.getText());
                        int skm = Integer.parseInt(uwuu.jmlhskm.getText());
                        int kopi = Integer.parseInt(uwuu.jmlhkpi.getText());
                        if (jupes1 >= 1) {
                            if ((jupes1 * 100) > suht || (jupes1 * 15) > skm || (jupes1 * 10) > kopi) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan coffe creamy");
                                if ((jupes1 * 100) > suht) {
                                    Cua.jLabel2.setText("Susu UHT out of stock");
                                }
                                if ((jupes1 * 15) > skm) {
                                    Cua.jLabel3.setText("Susu KM out of stock");
                                }
                                if ((jupes1 * 10) > kopi) {
                                    Cua.jLabel4.setText("kopi Robusta out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MCB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }

                            }

                        }

                    }//menu 7
                    else if (uwuu.Commenu.getSelectedItem().equals("Coffee Cream Caramel")) {
                        int suht = Integer.parseInt(uwuu.jmlhsuht.getText());
                        int skm = Integer.parseInt(uwuu.jmlhskm.getText());
                        int kopi = Integer.parseInt(uwuu.jmlhkpi.getText());
                        int crm = Integer.parseInt(uwuu.jmlhcrm.getText());
                        if (jupes1 >= 1) {
                            if ((jupes1 * 100) > suht || (jupes1 * 15) > skm || (jupes1 * 10) > kopi || (jupes1 * 10) > crm) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan coffe cream caramel");
                                if ((jupes1 * 100) > suht) {
                                    Cua.jLabel2.setText("Susu UHT out of stock");
                                }
                                if ((jupes1 * 15) > skm) {
                                    Cua.jLabel3.setText("Susu KM out of stock");
                                }
                                if ((jupes1 * 10) > kopi) {
                                    Cua.jLabel4.setText("kopi Robusta out of stock");
                                }
                                if ((jupes1 * 10) > crm) {
                                    Cua.jLabel4.setText("caramel out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MCB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }

                            }

                        }

                    }//menu 8
                    else if (uwuu.Commenu.getSelectedItem().equals("Choco Blitz")) {
                        int suht = Integer.parseInt(uwuu.jmlhsuht.getText());
                        int bc = Integer.parseInt(uwuu.jmlhbc.getText());
                        int gc = Integer.parseInt(uwuu.jmlhgc.getText());

                        if (jupes1 >= 1) {
                            if ((jupes1 * 100) > suht || (jupes1 * 15) > bc || (jupes1 * 15) > gc) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan Choco blitz");
                                if ((jupes1 * 100) > suht) {
                                    Cua.jLabel2.setText("Susu UHT out of stock");
                                }
                                if ((jupes1 * 15) > bc) {
                                    Cua.jLabel3.setText("Bubuk Coklat out of stock");
                                }
                                if ((jupes1 * 15) > gc) {
                                    Cua.jLabel4.setText("Gula Cair out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB01','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }

                            }

                        }

                    }//MENU 9
                    else if (uwuu.Commenu.getSelectedItem().equals("Green Tea")) {
                        int suht = Integer.parseInt(uwuu.jmlhsuht.getText());
                        int bt = Integer.parseInt(uwuu.jmlhbt.getText());
                        int gc = Integer.parseInt(uwuu.jmlhgc.getText());

                        if (jupes1 >= 1) {
                            if ((jupes1 * 100) > suht || (jupes1 * 15) > bt || (jupes1 * 15) > gc) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan grean tea");
                                if ((jupes1 * 100) > suht) {
                                    Cua.jLabel2.setText("Susu UHT out of stock");
                                }
                                if ((jupes1 * 15) > bt) {
                                    Cua.jLabel3.setText("Bubuk grean tea out of stock");
                                }
                                if ((jupes1 * 15) > gc) {
                                    Cua.jLabel4.setText("Gula Cair out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB02','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                                } catch (Exception e) {

                                }

                            }

                        }

                    }// menu 10
                    else if (uwuu.Commenu.getSelectedItem().equals("Red Velvo")) {
                        int suht = Integer.parseInt(uwuu.jmlhsuht.getText());
                        int br = Integer.parseInt(uwuu.jmlhbr.getText());
                        int gc = Integer.parseInt(uwuu.jmlhgc.getText());

                        if (jupes1 >= 1) {
                            if ((jupes1 * 100) > suht || (jupes1 * 15) > br || (jupes1 * 15) > gc) {
                                new Cua().setVisible(true);
                                Cua.jLabel1.setText("Gagal pesan Red velvo");
                                if ((jupes1 * 100) > suht) {
                                    Cua.jLabel2.setText("Susu UHT out of stock");
                                }
                                if ((jupes1 * 15) > br) {
                                    Cua.jLabel3.setText("Bubuk Redvelvet out of stock");
                                }
                                if ((jupes1 * 15) > gc) {
                                    Cua.jLabel4.setText("Gula Cair out of stock");
                                }

                            } else {
                                try {
                                    java.sql.Connection conn = (Connection) Config.configDB();
                                    String sqll = "INSERT INTO refund VALUES ('" + uwuu.koderet.getText() + "','" + uwuu.rcfieldkdtran.getText() + "','" + uwuu.idkas.getText() + "','MMB03','" + uwuu.Commenu.getSelectedItem() + "','" + uwuu.cjmlhmenufield.getText() + "','" + uwuu.calasanfield.getText() + "','" + uwuu.tgle.getText() + "','" + uwuu.rcdisk.getText() + "'"
                                            + ",'Menu Baru')";
                                    java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                                    pst1.execute();
                                    JOptionPane.showMessageDialog(null, "Berhasil tersimpan");

                                } catch (Exception e) {

                                }

                            }
                        }
                    }

                }

                uwuu.calasanfield.setText("Alasan Retur");
                uwuu.cjmlhmenufield.setText("Jumlah Menu");
                uwuu.rcfieldkdtran.setText("Kode Transaksi");
                uwuu.rcdisk.setText("0");
                uwuu.Commenu.removeAllItems();
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Data retur kurang lengkap!!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void rtrs() {
        try {
            if ((uwuu.rsjumlahmenu.getText().equals("Jumlah Bahan") || uwuu.rsalasan.getText().equals("Alasan Retur") || uwuu.rsnasup.getText().equals("Nama Supplier"))
                    || (uwuu.rsjumlahmenu.getText().equals("") || uwuu.rsalasan.getText().equals("") || uwuu.rsnasup.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Data retur kurang lengkap!!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sqll = "INSERT INTO retur VALUES ('" + uwuu.rskoderet.getText() + "','" + uwuu.idkas.getText() + "','" + uwuu.rsbah.getSelectedItem() + "','" + uwuu.rsjumlahmenu.getText() + "','" + uwuu.rsalasan.getText() + "','" + uwuu.rsnasup.getText() + "','" + uwuu.tgle.getText() + "')";

                java.sql.Connection conn = (Connection) Config.configDB();

                java.sql.PreparedStatement pst1 = conn.prepareStatement(sqll);
                pst1.execute();

                JOptionPane.showMessageDialog(null, "Berhasil tersimpan");
                uwuu.rsjumlahmenu.setText("Jumlah Bahan");
                uwuu.rsalasan.setText("Alasan Retur");
                uwuu.rsnasup.setText("Nama Supplier");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data retur kurang lengkap!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void rettable() {
        uwuu.retcuta.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        uwuu.retcuta.getTableHeader().setOpaque(true);
        uwuu.retcuta.getTableHeader().setBackground(new Color(225, 225, 225));
        uwuu.retcuta.getTableHeader().setForeground(new Color(32, 136, 203));

        uwuu.retcuta.setRowHeight(25);
        //membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Kode_Refund");
        model.addColumn("Kode_Transaksi");
        model.addColumn("ID_Kasir");
        model.addColumn("Kode_Menu");
        model.addColumn("Nama_Menu");
        model.addColumn("Jumlah_Menu");
        model.addColumn("Alasan");
        model.addColumn("Tanggal_Refund");
        model.addColumn("Diskon");
        model.addColumn("Keterangan");

        //menampilkan data databse ke dalam table
        try {
            int no = 1;
            String sql = "select * from refund";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10)});
            }
            uwuu.retcuta.setModel(model);
        } catch (Exception e) {
        }
//supplier
        uwuu.rstable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        uwuu.rstable.getTableHeader().setOpaque(true);
        uwuu.rstable.getTableHeader().setBackground(new Color(225, 225, 225));
        uwuu.rstable.getTableHeader().setForeground(new Color(32, 136, 203));

        uwuu.rstable.setRowHeight(25);
        //membuat tampilan model tabel
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("No");
        model1.addColumn("Kode_Retur");
        model1.addColumn("ID_Kasir");
        model1.addColumn("Nama_Bahan");
        model1.addColumn("Jumlah_Menu");
        model1.addColumn("Alasan");
        model1.addColumn("Nama_Supplier");
        model1.addColumn("Tanggal_Retur");

        //menampilkan data databse ke dalam table
        try {
            int no = 1;
            String sql = "select * from retur";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model1.addRow(new Object[]{no++, res.getString(1),
                    res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
            }
            uwuu.rstable.setModel(model1);
        } catch (Exception e) {
        }
    }

    public void rsuptable() {

    }

    public void searchret() {
        try {
            String sql = "select * from refund where "
                    + "Kode_Refund ='" + uwuu.retckoderets.getText() + "' || Kode_Transaksi = '" + uwuu.retckodetrans.getText() + "' || Tanggal_Refund = '" + uwuu.retctgls.getText() + "' ";

            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Kode_Refund");
            tbl.addColumn("Kode_Transaksi");
            tbl.addColumn("Nama_Menu");
            tbl.addColumn("Alasan");
            tbl.addColumn("ID_Kasir");
            tbl.addColumn("Tanggal_Refund");
            uwuu.retcuta.setModel(tbl);
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("Kode_Refund"),
                    res.getString("Kode_Transaksi"),
                    res.getString("Nama_Menu"),
                    res.getString("Alasan"),
                    res.getString("ID_Kasir"),
                    res.getString("Tanggal_Refund")
                });
                uwuu.retcuta.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");

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
            java.util.logging.Logger.getLogger(suplaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suplaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suplaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suplaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.sql.Connection conn;
        try {
            conn = (Connection) Config.configDB();
            String sql = "SELECT * FROM menu where Kode_Menu = 'MCB01' ";
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {
                double diskkon = (Double.parseDouble("20")/100);
                double hitung = ((Double.parseDouble(res.getString("Harga"))*2) * diskkon);
                double totali = ((Double.parseDouble(res.getString("Harga")) * 2) - hitung);
                System.out.println(totali);
            }
        } catch (SQLException ex) {
            Logger.getLogger(suplaya.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suplaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
