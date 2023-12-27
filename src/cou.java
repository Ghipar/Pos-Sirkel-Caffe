
import com.barcodelib.barcode.Linear;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author REHAN
 */
public class cou {

    public void kun() {
        //menu1
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MKB01' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu2
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MKB02' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count1.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu3
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MKR01' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count2.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu4
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MKR02' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count3.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu5
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MKR03' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count4.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu6
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MCB01' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count5.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu7
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MCB02' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count6.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu8
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MMB01' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count7.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu9
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MMB02' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count8.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        //menu10
        try {
            String sql = "SELECT SUM(Jumlah_pesanan) FROM detail_transaksi where Kode_Menu = 'MMB03' ";
            //String sql = "select * from mhs join akun on mhs.nim = akun.nim";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet res = stm.executeQuery();
            while (res.next()) {

                uwuu.count9.setText(res.getString("SUM(Jumlah_pesanan)"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        uwuu.qtyma1.setText("");
        uwuu.qtyma2.setText("");
        uwuu.qtyma3.setText("");
        uwuu.qtyma4.setText("");
        uwuu.qtyma5.setText("");
        uwuu.qtyma6.setText("");
        uwuu.qtyma7.setText("");
        uwuu.qtyma8.setText("");
        uwuu.qtyma9.setText("");
        uwuu.qtyma10.setText("");
        uwuu.namapem.setText("");
        uwuu.nomeja.setText("");
        uwuu.diskon.setText("");

    }

    public void mselmin() {
        try {
            int itungan6 = Integer.parseInt(uwuu.count5.getText());
            int itungan7 = Integer.parseInt(uwuu.count6.getText());
            int itungan8 = Integer.parseInt(uwuu.count7.getText());
            int itungan9 = Integer.parseInt(uwuu.count8.getText());
            int itungan10 = Integer.parseInt(uwuu.count9.getText());
            if (itungan6 > itungan7 && itungan6 > itungan8 && itungan6 > itungan9 && itungan6 > itungan10) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mscoffe.png")));
            } else if (itungan7 > itungan8 && itungan7 > itungan9 && itungan7 > itungan10 && itungan7 > itungan6) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mscoffecreamcaram.png")));
            } else if (itungan8 > itungan9 && itungan8 > itungan10 && itungan8 > itungan7 && itungan8 > itungan6) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mschocoblitz.png")));
            } else if (itungan9 > itungan10 && itungan9 > itungan8 && itungan9 > itungan7 && itungan9 > itungan6) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/msgreentea.png")));
            } else if (itungan10 > itungan9 && itungan10 > itungan8 && itungan10 > itungan7 && itungan10 > itungan6) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/msredpel.png")));
            }
        } catch (Exception e) {
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
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/msindomie.png")));
            } else if (itungan2 > itungan3 && itungan2 > itungan4 && itungan2 > itungan5
                    && itungan2 > itungan1) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mssatetai.png")));
            } else if (itungan3 > itungan4 && itungan3 > itungan5 && itungan3 > itungan2
                    && itungan3 > itungan1) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mskentang.png")));
            } else if (itungan4 > itungan5 && itungan4 > itungan3 && itungan4 > itungan2
                    && itungan4 > itungan1) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/msropang.png")));
            } else if (itungan5 > itungan4 && itungan5 > itungan3 && itungan5 > itungan2
                    && itungan5 > itungan1) {
                uwuu.msel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagepath/mstempu (2).png")));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cetbarcode() {
        try {
           
            Linear barcode = new Linear();
            barcode.setType(Linear.CODE128B);
            barcode.setData(uwuu.kdtransto.getText());
            barcode.setI(11.0f);
            String fname = uwuu.kdtransto.getText();
            //barcode.renderBarcode("E:\\\\gifar\\\\College\\\\MATKUL\\\\SMT 2\\\\Tugas\\\\SI Berbasyis Obyek\\\\Project\\\\FinalProjek2\\\\src\\\\imgbarcode\\\\" + fname + ".png");
            barcode.renderBarcode("E:\\\\POS SIRKEL\\\\" + fname + ".png");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mencetak barcode" + e);
        }
    }

    public void savebarcode() {
        String fname = uwuu.kdtransto.getText();
        //String sql = "UPDATE `transaksi` SET `Url_Barcode` ='E:\\\\gifar\\\\College\\\\MATKUL\\\\SMT 2\\\\Tugas\\\\SI Berbasyis Obyek\\\\Project\\\\FinalProjek2\\\\src\\\\imgbarcode\\\\" + fname + ".png'  where Kode_Transaksi = '" + uwuu.kdtransto.getText() + "'";
        String sql = "UPDATE `transaksi` SET `Url_Barcode` ='E:\\\\POS SIRKEL\\\\" + fname + ".png'  where Kode_Transaksi = '" + uwuu.kdtransto.getText() + "'";
        try {
            Connection conn = Config.configDB();
            java.sql.PreparedStatement pstrti = conn.prepareStatement(sql);
            pstrti.execute();
//          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Disimpan" + e);
        }
    }

    public void print() {
//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setJobName("Print Data");
//        job.setPrintable(new Printable() {
//            public int print(Graphics pg, PageFormat pf, int pageNum) {
//                pf.setOrientation(PageFormat.LANDSCAPE);
//                if (pageNum > 0) {
//                    return Printable.NO_SUCH_PAGE;
//                }
//                Graphics2D g2 = (Graphics2D) pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                g2.scale(0.24, 0.24);
//                uwuu.ristruk.paint(g2);
//                return Printable.PAGE_EXISTS;
//            }
//        });
//        boolean ok = job.printDialog();
//        if (ok) {
//            try {
//                job.print();
//            } catch (PrinterException ex) {
//            }
//        }
        java.sql.Connection con = null;
        try {
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName(jdbcDriver);
            String url = "jdbc:mysql://localhost:3306/project2";
            String user = "root";
            String pass = "";

            con = DriverManager.getConnection(url, user, pass);
            Statement stm = con.createStatement();

            try {
//                String report = ("E:\\gifar\\College\\MATKUL\\SMT 2\\Tugas\\SI Berbasyis Obyek\\Project"
//                        + "\\FinalProjek2\\src\\struk.jrxml");
                String report = ("E:\\POS SIRKEL\\src\\struk.jrxml");
                HashMap hash = new HashMap();
                //mengambil parameter dari i report
                hash.put("kode", uwuu.kdtransto.getText());
                JasperReport JRpt = JasperCompileManager.compileReport(report);

                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, con);
                JasperViewer.viewReport(JPrint, false);
            } catch (Exception e) {
                System.out.println("Report cant view coz : " + e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d);
//        SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");
//        System.out.println(tf.format(d));
//    }
}
