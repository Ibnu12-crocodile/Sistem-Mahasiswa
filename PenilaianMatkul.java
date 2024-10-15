
import java.util.Scanner;

class PenilaianMatkul {

    String nilaiSO;
    String nilaiRPL;
    String nilaiBDT;
    String nilaiTBO;
    String nilaiPBO1;
    String nilaiStatistika;
    String nilaiJarkom;




    String [][] Matkul =  {
            {"Sistem Operasi", "3 SKS", nilaiSO},
            {"Rekayasa Perangkat Lunak", "3 SKS", nilaiRPL},
            {"Basis Data Terdistribusi", "3 SKS", nilaiBDT},
            {"Teori Bahasa Otomata", "3 SKS", nilaiTBO},
            {"Pemograman Berorientasi Objek", "3 SKS", nilaiPBO1},
            {"Statistika", "3 SKS", nilaiStatistika},
            {"Jaringan Komputer", "3 SKS", nilaiJarkom},


    };




     void nilaiMatkul() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Matkul.length; i++) {
            System.out.println("");
            System.out.print("Masukkan nilai untuk mata kuliah " + Matkul[i][0] + ": ");
            int nilai = scanner.nextInt();
            Matkul[i][2] = penilaianMatkul(nilai);
        }


    }


    static String penilaianMatkul(int nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 50) {
            return "C";
        } else if (nilai >= 30) {
            return "D";
        } else {
            return "E";
        }
    }


     void tampilkanNilai() {
         System.out.println("");
         System.out.println("Nilai Mata Kuliah:");
         for (String[] matkul : Matkul) {
            System.out.println(matkul[0] + " (" + matkul[1] + ") : " + matkul[2]);
        }
    }


    }









