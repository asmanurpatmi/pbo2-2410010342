// Nama: Asma Nur Patmi
// NPM : 2410010342
package id.ac.uniska.pbo2.uts;

/** Kategori barang. toString() dipakai sebagai teks di JComboBox dan tabel. */
public enum Kategori {
    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String label;

    Kategori(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}