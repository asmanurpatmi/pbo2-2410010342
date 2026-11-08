# Pertemuan PBO P06

## Foto atau Pindaian Lembar Peer Review

## Tabel singkat berisi temuan dari teman dan perbaikan

## Tangkapan layar (screenshot) formAnggota dengan pesan kesalahan
![Screenshot Form dengan Pesan Kesalahan](Screnshoot-P06/Screenshot-Form-dengan-Pesan-Kesalahan.png)

## Tangkapan layar jendela Navigator yang memperlihatkan label pesan
![Screenshot Navigator](Screnshoot-P06/Screenshot-Navigator.png)

## E. Jawaban Eksperimen Praktikum 4
1\. Saat mengetik huruf pada isian NPM, huruf tersebut tidak muncul karena isian NPM hanya bisa diisi angka. Hal ini disebabkan oleh perintah `evt.consume();` yang berfungsi membatalkan huruf yang diketik selain angka.

2\. Setelah mengisi email dengan `siti@` lalu menekan Tab, pesan kesalahan langsung muncul karena format email yang dimasukkan belum benar.

3\. Saat isian Nama dilewati tanpa mengetik apa pun, tidak ada pesan kesalahan yang muncul. Hal ini karena program hanya memeriksa nama jika isian sudah diisi. Kalau masih kosong, pemeriksaan baru dilakukan saat tombol Daftar diklik.

4\. Saat persetujuan dicentang lalu tombol Daftar diklik dalam keadaan form kosong, fokus langsung berpindah ke isian NPM karena NPM merupakan isian pertama yang belum benar.

5\. Saat menekan tombol Alt bersama huruf N, fokus berpindah ke isian Nama. Hal ini karena huruf N digunakan sebagai shortcut pada label Nama dengan pengaturan `displayedMnemonic` dan `labelFor`.

6\. Iya, data yang sudah diisi tetap ada karena saat memilih No, penghapusan dibatalkan. Jadi, data yang sebelumnya dimasukkan tidak terhapus dan masih tampil di form.

## Deklarasi Penggunaan AI
Saya menggunakan AI (ChatGPT) untuk membantu mengatasi kendala saat membuat Form Anggota Perpustakaan di NetBeans, terutama dalam penerapan event handling dan pengaturan komponen form.