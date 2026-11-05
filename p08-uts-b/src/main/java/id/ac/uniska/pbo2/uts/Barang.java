// Nama: Asma Nur Patmi
// NPM : 2410010342
package id.ac.uniska.pbo2.uts;

/** Data satu barang belanja. Subtotal dihitung dari harga dikali jumlah. */
public record Barang(String nama, Kategori kategori, long harga, int jumlah) {

    public long subtotal() {
        return harga * jumlah;
    }
}