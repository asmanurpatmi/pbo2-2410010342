\## Jawaban Eksperimen Praktikum 2



1.\\ FlowLayout: Komponen menjadi rata tengah. Saat jendela diperkecil, komponen dapat berpindah ke baris berikutnya. Baris yang berubah adalah pengaturan `alignment` pada `flowPanel` di `initComponents()`.



2.\\ GridLayout: Terbentuk 5 baris karena 9 tombol disusun dalam 2 kolom, sehingga satu tombol berada di baris terakhir.



3.\\cBoxLayout: Lebar tombol menyesuaikan ruang horizontal yang tersedia karena `maximumSize` diatur menjadi 32767. Vertical Strut menambahkan jarak vertikal antartombol agar susunannya lebih rapi.## Jawaban Eksperimen Praktikum 4





\## Jawaban Eksperimen Praktikum 4



1\\. Mengubah Weight X pada `namaField` menjadi 0.0

Setelah Weight X diubah menjadi `0.0`, kolom Nama tidak ikut melebar saat jendela diperbesar. Ruang kosong di sebelah kanan kolom bertambah.



2\\. Mengubah posisi `formPanel` dari North menjadi Center

Saat posisi North, form tetap berada di bagian atas. Saat posisi Center, form berada di bagian tengah `isiPanel` dan posisinya menyesuaikan ruang yang tersedia ketika ukuran jendela berubah.



3\\. Menghapus `setMinimumSize(getSize())`

Setelah baris tersebut dihapus, jendela bisa diperkecil. Area Alamat awalnya tidak mengikuti perubahan ukuran karena Weight X bernilai `0.0`. Setelah diubah menjadi `1.0`, area Alamat ikut menyesuaikan ukuran jendela.





\## Jawaban Refleksi G



1.\\Mengapa Null Layout dan Absolute Layout sebaiknya dihindari? 

&#x20;  Karena posisi dan ukuran komponen tidak menyesuaikan dengan perubahan ukuran jendela.



2.\\Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.  

&#x20;  FlowLayout menyusun komponen secara berurutan dan dapat berpindah baris, sedangkan GridLayout mempertahankan susunan baris dan kolom dengan ukuran komponen yang sama.



3.\\Apa fungsi Weight X dan Fill pada constraint GridBagLayout?

&#x20;  Weight X mengatur pembagian ruang horizontal tambahan, sedangkan Fill menentukan apakah komponen mengisi ruang yang tersedia.



4.\\Mengapa formPanel dibungkus isiPanel dan diletakkan di North? 

&#x20;  Agar form berada di bagian atas dan terpisah dari komponen lainnya.



5.\\Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.

&#x20;  - Konsistensi: gaya komponen dibuat seragam.

&#x20;  - Pengelompokan: data anggota, kontak, dan persetujuan dipisahkan berdasarkan fungsinya.





Tahap 2.\\ — Tabel rancangan untuk README

|Bagian|Panel|layout|
|-|-|-|
|Jendela|Jframe|BorderLayout|
|Header|headerPanel|BoxLayout (Y\_AXIS)|
|Isi from|isiPanel|Border Layout|
|From isian|fromPanel|GridBagLayout|
|Tombol|tombolPanel|FlowLayout (RIGHT)|





Tahap 4.\\ Saling Menilai

|NO|Pemeriksaan|Ya atau Belum|
|-|-|-|
|1.|Label singkat, jelas, sejajar||
|2.|Isian dikelompokkan dengan judul bagian||
|3.|Placeholder dipakai untuk isian yang punya format||
|4.|Kompenan sesuai jenis data||
|5.|Tombol Utama menonjol dan berada dibawah kanan bawah||
|6.|Jarak antar kompenan konsisten||
|7.|From tetap rapi saat jendela dilebarkan dan ditinggikan||
|8.|Tampilan dibuat dengan Jframe From dan layout maneger, bukan Null layout atau Absolute Layout||



Saran teman saya :



