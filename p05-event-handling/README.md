## Tabel Pengamatan Praktikum 2 — PengamatEvent

| No. | Tindakan | Event yang tercatat |
|---|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | mouseEntered dan mouseExited (MouseEvent) |
| 2 | Klik tombol Klik saya | actionPerformed (ActionEvent) |
| 3 | Centang lalu hapus centang Aktifkan fitur | itemStateChanged (ItemEvent) |
| 4 | Ganti pilihan dari Pagi menjadi Malam | itemStateChanged (ItemEvent), dengan kondisi SELECTED |
| 5 | Klik isian, lalu ketik kata abc | keyTyped (KeyEvent) |
| 6 | Klik tombol setelah mengetik di isian | focusLost (FocusEvent) pada isian, dan actionPerformed (ActionEvent) pada tombol |

## Eksperimen Praktikum 3 — Konversi Suhu
1\. Saat pilihan pada ComboBox diganti, pesan item berubah muncul sebanyak dua kali. Hal ini terjadi karena sistem mendeteksi perubahan pada pilihan sebelumnya dan pilihan yang baru dipilih.

2\. Hasil konversi dengan keyPressed masih menggunakan isi kolom sebelum karakter terbaru dimasukkan. Oleh karena itu, angka hasil konversi terlihat tertinggal satu karakter saat kita mengetik.

3\. Ketika huruf dimasukkan setelah blok try-catch dihapus, program menampilkan error NumberFormatException di jendela Output. Error ini terjadi karena program mengharapkan masukan berupa angka, tetapi yang dimasukkan justru huruf.

## Eksperimen Praktikum 4 — Kalkulator Sederhana
1\. Pesan `kali` muncul dua kali saat tombol perkalian diklik karena terdapat dua listener yang menjalankan aksi yang sama. Sebaiknya cukup menggunakan satu listener agar perintah tidak berjalan berulang.

2\. Pada tab Design, ditambahkan tombol `%` pada bagian operator kalkulator. Pada tab Source, ditambahkan kode untuk menangani tombol tersebut dan menghitung sisa pembagian menggunakan operator `%` di method `hitung()`.

3\. Kursor kembali ke kolom angka pertama setelah tombol Hapus ditekan karena terdapat perintah `angka1Field.requestFocusInWindow()` di method `hapus()`. Perintah ini mengembalikan fokus ke kolom pertama agar angka baru bisa langsung dimasukkan.

## Peta Event — FormAnggotaPerpustakaan

| Komponen | Event | Fungsi |
|---|---|---|
| Checkbox persetujuan | `itemStateChanged` | Mengaktifkan tombol Daftar ketika persetujuan dicentang. |
| Tombol Batal | `actionPerformed` | Mengosongkan seluruh isian dan mengembalikan fokus ke kolom NPM. |
| Tombol Daftar | `actionPerformed` | Menampilkan ringkasan data anggota menggunakan `JOptionPane`. |
| Kolom NPM | `keyReleased` | Memperbarui jumlah digit NPM yang diketik. |
| Form JFrame | `windowClosing` | Menampilkan konfirmasi sebelum aplikasi ditutup. |

### Pengaturan Form
- `defaultCloseOperation`: `DO_NOTHING_ON_CLOSE`
- Tombol Daftar tidak aktif saat form pertama kali dibuka.
- Tombol Daftar aktif setelah checkbox persetujuan dicentang.

