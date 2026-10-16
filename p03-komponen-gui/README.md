\# P03 — Komponen GUI dengan Java Swing


\## Identitas Praktikum


\- Mata Kuliah: Pemrograman Berorientasi Objek 2
\- Modul: P03 — Komponen GUI
\- Nama: Asma Nur Patmi
\- NPM: 2410010342
\- Program Studi: Teknik Informatika


\##Hasil Praktikum

\### 1. FormTiketTravel — Tema Terang

Berikut adalah hasil tampilan aplikasi FormTiketTravel dengan tema terang.
!\[FormTiketTravel Tema Terang](Screenshot-p03/Screenshot-tema%20terang.png)

\### 2. FormTiketTravel — Tema Gelap

Berikut adalah hasil tampilan aplikasi FormTiketTravel dengan tema gelap.
!\[FormTiketTravel Tema Gelap](Screenshot-p03/Screenshot-tema%20gelap.png)

\### 3. Design FormTiketTravel dan Navigator

Berikut adalah tampilan Design FormTiketTravel pada NetBeans beserta jendela Navigator.
!\[Design FormTiketTravel dan Navigator](Screenshot-p03/Screenshot-Design%20%2B%20Navigator.png)


\## Pertanyaan Refleksi G

\### 1. Jelaskan perbedaan top-level container, intermediate container, dan atomic component.

Top-level container adalah wadah utama aplikasi, contohnya `JFrame`. Intermediate container digunakan untuk mengelompokkan komponen lain, contohnya `JPanel`. Atomic component merupakan komponen yang digunakan langsung oleh pengguna, contohnya `JButton` dan `JTextField`.

\### 2. Mengapa JRadioButton yang menjadi pilihan dalam satu kelompok perlu menggunakan ButtonGroup?

Karena JRadioButton dalam ButtonGroup yang sama hanya dapat dipilih satu pada satu waktu. Contohnya, pengguna hanya dapat memilih kelas Ekonomi atau Bisnis. Jika satu pilihan dipilih, pilihan lainnya akan otomatis tidak terpilih.

\### 3. Kapan sebaiknya menggunakan JComboBox dibandingkan JRadioButton?

JComboBox cocok digunakan jika pilihan cukup banyak agar tampilan tidak terlalu penuh. JRadioButton cocok digunakan jika pilihan sedikit dan ingin semua pilihan langsung terlihat. Contohnya, kota tujuan menggunakan JComboBox, sedangkan pilihan kelas Ekonomi dan Bisnis menggunakan JRadioButton.

\### 4. Mengapa kode tidak sebaiknya ditambahkan langsung ke dalam initComponents()?

Karena `initComponents()` merupakan kode yang dibuat secara otomatis oleh NetBeans. Perubahan langsung pada bagian tersebut dapat tertimpa ketika desain form diubah melalui GUI Builder. Kode tambahan sebaiknya ditulis di konstruktor setelah `initComponents()`, pada event handler, atau pada method tambahan.

\### 5. Mengapa FlatLightLaf.setup() dipanggil sebelum form dibuat?

Karena `FlatLightLaf.setup()` digunakan untuk mengatur tema tampilan Swing. Jika dipanggil sebelum form dibuat, komponen pada form dapat menggunakan tema FlatLaf sejak pertama kali ditampilkan.