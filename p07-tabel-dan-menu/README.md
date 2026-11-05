## Jawaban Eksperimen Praktikum 5

1\. Tabel tidak langsung menampilkan data baru secara visual. Namun, pesan status atau jumlah data menunjukkan bahwa kontak berhasil ditambahkan.

2\. Nama yang muncul pada dialog konfirmasi hapus adalah Budi Santoso.

3\. Kontak yang baru ditambahkan bisa tertimpa ketika pengguna kembali melakukan aktivitas pada jendela utama, misalnya memilih kontak lain lalu melakukan edit.

4\. Ctrl+E dan Ctrl+D tidak berfungsi jika belum ada baris yang dipilih karena aplikasi membutuhkan data kontak yang akan diedit atau dihapus.

5\. Baris pada initComponents() yang mengatur tombol hapus mengalami perubahan pada bagian accelerator, dari kombinasi Ctrl+D menjadi tombol Delete (KeyEvent.VK_DELETE).

6\. Muncul pesan error IllegalArgumentException: Cannot set a null TableModel. karena model tabel belum dibuat ketika initComponents() dijalankan. Akibatnya, tabel menerima nilai model yang masih null.
