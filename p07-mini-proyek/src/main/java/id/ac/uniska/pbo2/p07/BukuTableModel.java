/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BukuTableModel extends AbstractTableModel {

    private final String[] kolom = {
        "Kode", "Judul", "Penulis", "Tahun Terbit", "Status"
    };

    private final List<Buku> daftarBuku = new ArrayList<>();

    public BukuTableModel() {
        daftarBuku.add(new Buku("B001", "Laskar Pelangi",
                "Andrea Hirata", 2005, true));
        daftarBuku.add(new Buku("B002", "Bumi",
                "Tere Liye", 2014, true));
        daftarBuku.add(new Buku("B003", "Laut Bercerita",
                "Leila S. Chudori", 2017, false));
        daftarBuku.add(new Buku("B004", "Negeri 5 Menara",
                "Ahmad Fuadi", 2009, true));
        daftarBuku.add(new Buku("B005", "Perahu Kertas",
                "Dee Lestari", 2009, true));
    }

    @Override
    public int getRowCount() {
        return daftarBuku.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buku buku = daftarBuku.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return buku.getKode();
            case 1:
                return buku.getJudul();
            case 2:
                return buku.getPenulis();
            case 3:
                return buku.getTahunTerbit();
            case 4:
                return buku.isTersedia() ? "Tersedia" : "Dipinjam";
            default:
                return null;
        }
    }

    public void tambahBuku(Buku buku) {
        int baris = daftarBuku.size();
        daftarBuku.add(buku);
        fireTableRowsInserted(baris, baris);
    }

    public void ubahBuku(int index, Buku buku) {
        daftarBuku.set(index, buku);
        fireTableRowsUpdated(index, index);
    }

    public void hapusBuku(int index) {
        daftarBuku.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public Buku getBuku(int index) {
        return daftarBuku.get(index);
    }

    public int jumlahTersedia() {
        int jumlah = 0;

        for (Buku buku : daftarBuku) {
            if (buku.isTersedia()) {
                jumlah++;
            }
        }

        return jumlah;
    }
}

