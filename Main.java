
import java.util.Scanner;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) {

//    Void Pendataan Mahasiswa
    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.dataMahasiswa();


//    Void Penilaian Matkul
    PenilaianMatkul matkul = new PenilaianMatkul();
    matkul.nilaiMatkul();

//    Void Riwayat Penilaian
    mahasiswa.tampilkanMahasiswa();
    matkul.tampilkanNilai();


    }
}