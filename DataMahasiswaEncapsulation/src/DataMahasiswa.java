/*

    Nama    : Ardena Afif Pratama
    NIM     : 422021611016
*/

import java.util.*;
public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDiri dataDiri = new DataDiri();

        System.out.print("Masukkan nama Anda : ");
        dataDiri.setNama(scanner.nextLine());

        System.out.print("Masukkan NIM Anda : ");
        dataDiri.setNim(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Masukkan alamat Anda : ");
        dataDiri.setAlamat(scanner.nextLine());

        System.out.print("Masukkan prodi Anda : ");
        dataDiri.setProdi(scanner.nextLine());


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama saya adalah " + dataDiri.getNama());
        System.out.println("NIM saya : " + dataDiri.getNim());
        System.out.println("Saya tinggal di " + dataDiri.getAlamat());
        System.out.println("Saya kuliah jurusan " + dataDiri.getProdi());
    }

}