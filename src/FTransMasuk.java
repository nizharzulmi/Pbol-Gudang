
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import lib.koneksi;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FTransMasuk extends javax.swing.JInternalFrame {
koneksi konek = new koneksi();
    private ActionEvent evt;
   
    /**
     * Creates new form FTransMasuk
     */
    public FTransMasuk() {
        initComponents();
        btRefreshActionPerformed(evt);
        combobarang();
        skg();
    }

public void combobarang(){
    try{
        String sql = "select idBarang from t_barang";
        Statement st = konek.getKoneksi().createStatement();
        ResultSet res = st.executeQuery(sql);
        while(res.next()){
            Object[] ob = new Object[2];
            ob[0] = res.getString(1);
            cbbBarang.addItem((String) ob[0]);
        }
        st.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void skg(){
    Date date = new Date();//library date sekarang
    dcTanggal.setDate(date);
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
        btRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMasuk = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dcTanggal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbbBarang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        lbStok = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        btSimpan = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();

        setTitle("Form Transaksi Masuk");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI BARANG MASUK");

        btRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        tbMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID TRANSAKSI", "TANGGAL", "ID BARANG", "JUMLAH"
            }
        ));
        jScrollPane1.setViewportView(tbMasuk);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tanggal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Barang");

        cbbBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---pilih---" }));
        cbbBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbBarangActionPerformed(evt);
            }
        });

        jLabel4.setText("DATA BARANG");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Barang");

        lbNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNama.setText("Nama Barang");

        lbStok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbStok.setText("Jumlah");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stok");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Jumlah");

        btSimpan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btCetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCetak.setText("CETAK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbStok)
                                            .addComponent(lbNama)))
                                    .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbbBarang, javax.swing.GroupLayout.Alignment.LEADING, 0, 85, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btSimpan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCetak)
                .addGap(27, 27, 27)
                .addComponent(btRefresh)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbNama))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbStok)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addComponent(btSimpan)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
    DefaultTableModel tb = new DefaultTableModel();
    tb.addColumn("NO");
    tb.addColumn("ID TRANSAKSI");
    tb.addColumn("TANGGAL");
    tb.addColumn("ID BARANG");
    tb.addColumn("JUMLAH");
    try{
        String sql = "Select * from t_masuk";
        Statement st = konek.getKoneksi().createStatement();
        ResultSet has = st.executeQuery(sql);
        int no =0;
        while(has.next()){
            no = no + 1;
            tb.addRow(new Object[]{no, has.getString(1), has.getString(2), has.getString(3), has.getString(4)});
        }
        tbMasuk.setModel(tb);
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,"error" +e);
        }    
    }//GEN-LAST:event_btRefreshActionPerformed

    private void cbbBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbBarangActionPerformed
        String pid = (String) cbbBarang.getSelectedItem();
        try{
            String sql = "select * from t_barang where idBarang ='"+pid+"'";
            Statement st = konek.getKoneksi().createStatement();
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                Object[] ob = new Object[10];
                ob[0] = res.getString(2);
                ob[1] = res.getString(3);
                lbNama.setText((String) ob[0]);
                lbStok.setText((String) ob[1]);
            }
            st.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cbbBarangActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        String tgl = new SimpleDateFormat("yyyy-MM-dd").format(dcTanggal.getDate());
        String brg = (String) cbbBarang.getSelectedItem();
        int jml = 0;
        int stok = 0;
        int sisa = 0;
        
        if(!brg.equals("---pilih---") && !tfJumlah.getText().isEmpty()){
            jml = Integer.parseInt(tfJumlah.getText());
            stok = Integer.parseInt(lbStok.getText());
            sisa = stok + jml;
            String sql1 = "insert into t_masuk(tanggal, idBarang, jumlah) values('"+tgl+"','"+brg+"','"+jml+"')";
            String sql2 = "update t_barang set stok ='"+sisa+"' where idBarang='"+brg+"' ";
            
            try{
                Statement s = konek.getKoneksi().createStatement();
                s.executeUpdate(sql1);
                s.executeUpdate(sql2);
                s.close();
                JOptionPane.showMessageDialog(null, "Transaksi berhasil disimpan");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Transaksi gagal disimpan : "+ e);}
            }else{
            JOptionPane.showMessageDialog(null, "Form harus diisi dengan benar..!!!");}
        
        this.btRefreshActionPerformed(evt);
        
        cbbBarang.setSelectedIndex(0);
        lbNama.setText("Nama Barang");
        lbStok.setText("Jumlah");
        tfJumlah.setText("0");
        skg();
        
    }//GEN-LAST:event_btSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSimpan;
    private javax.swing.JComboBox<String> cbbBarang;
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbStok;
    private javax.swing.JTable tbMasuk;
    private javax.swing.JTextField tfJumlah;
    // End of variables declaration//GEN-END:variables

}