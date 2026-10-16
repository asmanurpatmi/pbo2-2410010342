# Tugas 3 -Komponen GUI Swing

## A. Tangkapan Layar Form Pemesanan Tiket Travel

### 1. Tema Terang

Berikut adalah tampilan FormTiketTravel menggunakan tema terang.

![Form Pemesanan Tiket Travel - Tema Terang](Screenshot-p03/Screenshot-tema%20terang.png)

### 2. Tema Gelap

Berikut adalah tampilan FormTiketTravel menggunakan tema gelap.

![Form Pemesanan Tiket Travel - Tema Gelap](Screenshot-p03/Screenshot-tema%20gelap.png)

---

## B. Tab Design FormTiketTravel (Jendela Navigator)

Berikut adalah tampilan Design FormTiketTravel di NetBeans beserta jendela Navigator.

![Tab Design FormTiketTravel dan Navigator](Screenshot-p03/Screenshot-Design%20%2B%20Navigator.png)

---

## C. Jawaban Pertanyaan Refleksi (Bagian G)

1\. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing satu contoh.

Top-level container adalah wadah utama berupa jendela aplikasi, contohnya JFrame. Intermediate container adalah wadah untuk 
Top-level container adalah wadah utama yang digunakan sebagai jendela aplikasi, contohnya JFrame. Intermediate container adalah wadah untuk mengelompokkan komponen lain, contohnya JPanel. Sedangkan atomic component adalah komponen yang digunakan langsung untuk berinteraksi dengan pengguna, contohnya JButton.

2\. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?

Karena JRadioButton yang memiliki buttonGroup yang sama hanya bisa memilih satu pilihan. Misalnya pada pilihan kelas Ekonomi dan Bisnis, pengguna hanya boleh memilih salah satunya. Jadi kalau Ekonomi dipilih, Bisnis akan otomatis tidak terpilih.

3\. Kapan Anda memilih JComboBox dibandingkan JRadioButton?

Saya memilih JComboBox jika pilihan yang tersedia cukup banyak dan tidak ingin membuat tampilan terlalu penuh. Sedangkan JRadioButton lebih cocok jika pilihannya sedikit dan semua pilihan ingin langsung terlihat.

4\. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan dimana kode tambahan seharusnya ditulis?

Karena initComponents() merupakan kode yang otomatis oleh NetBeans dari tampilan Design. Jika diedit langsung, perubahan bisa tertimpa ketika tampilan form diubah melalui Design. Kode tambahan sebaiknya ditulis di luar bagian initComponents(), misalnya di konstruktor setelah initComponents(), pada event handler, atau pada method tambahan.

5\. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?

Karena FlatLightLaf.setup() digunakan untuk mengatur tampilan atau tema Swing terlebih dahulu. Jika dipanggil sebelum form dibuat, komponen yang ada di dalam form akan langsung menggunakan tema FlatLaf saat pertama kali ditampilkan.