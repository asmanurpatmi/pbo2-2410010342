// Nama: Asma Nur Patmi
// NPM : 2410010342
package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/** Menghubungkan daftar Barang dengan JTable dan menghitung total, diskon, bayar. */
public class BarangTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private static final long BATAS_DISKON = 100_000;

    private final List<Barang> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);
        return switch (kolom) {
            case 0 -> b.nama();
            case 1 -> b.kategori();
            case 2 -> rupiah(b.harga());
            case 3 -> b.jumlah();
            default -> rupiah(b.subtotal());
        };
    }

    public void tambah(Barang barang) {
        daftar.add(barang);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    /** True jika nama sudah ada, tanpa membedakan huruf besar dan kecil. */
    public boolean ada(String nama) {
        for (Barang b : daftar) {
            if (b.nama().equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public long total() {
        long jumlah = 0;
        for (Barang b : daftar) {
            jumlah += b.subtotal();
        }
        return jumlah;
    }

    /** 10 persen dari total jika total minimal Rp100.000, dibulatkan ke bawah. */
    public long diskon() {
        long total = total();
        return total >= BATAS_DISKON ? total / 10 : 0;
    }

    public long bayar() {
        return total() - diskon();
    }

    /** Contoh: 125000 menjadi Rp125.000. */
    public static String rupiah(long nilai) {
        return "Rp" + String.format("%,d", nilai).replace(',', '.');
    }
}