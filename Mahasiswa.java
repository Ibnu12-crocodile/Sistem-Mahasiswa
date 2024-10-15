
import java.util.Scanner;



class Mahasiswa {

    Scanner scanner = new Scanner(System.in);

    String namaMahasiswa, nimMahasiswa, kelasMahasiswa, jurusanMahasiswa;


    String [][] mahasiswa = {
            {namaMahasiswa, nimMahasiswa, kelasMahasiswa, jurusanMahasiswa}
    };

//      fungsi mengisi array dengan data mahasiswa
       void dataMahasiswa (){


               System.out.println();
               System.out.println("Masukan Nama Mahasiswa");
               mahasiswa[0][0] = scanner.nextLine();
               System.out.println();
               System.out.println("Masukan NIM Mahasiswa");
               mahasiswa[0][1] = scanner.nextLine();
               System.out.println();
               System.out.println("Masukan Kelas Mahasiswa");
               mahasiswa[0][2] = scanner.nextLine();
               System.out.println();
               System.out.println("Masukan Jurusan Mahasiswa");
               mahasiswa[0][3] = scanner.nextLine();
               System.out.println();


           }


//      Fungsi menampilkan data mahasiswa
       void tampilkanMahasiswa(){
           System.out.println("");
           System.out.println("Riwayat Penilaian Mahasiswa");
           System.out.println("");
           System.out.println("Nama     : " + mahasiswa[0][0]);
           System.out.println("NIM      : " + mahasiswa[0][1]);
           System.out.println("Kelas    : " + mahasiswa[0][2]);
           System.out.println("Jurusan  : " + mahasiswa[0][3]);

           }
       }






