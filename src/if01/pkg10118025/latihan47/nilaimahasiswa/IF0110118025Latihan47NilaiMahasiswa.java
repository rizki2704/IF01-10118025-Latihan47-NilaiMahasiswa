/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan47.nilaimahasiswa;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiAkhir nilai = new NilaiAkhir();
        nilai.setQuiz(60);
        nilai.setUts(80);
        nilai.setUas(75);

        System.out.printf("QUIZ \t\t= %.1f%n", nilai.getQuiz());
        System.out.printf("UTS \t\t= %.1f%n", nilai.getUts());
        System.out.printf("UAS \t\t= %.1f%n%n", nilai.getUas());
        System.out.printf("Nilai Akhir \t= %.1f%n%n", nilai.nilaiAkhir());
        System.out.printf("Index \t\t= %c%n", nilai.index());
        System.out.printf("Keterangan\t= %s%n", nilai.Keterangan());

    }
    
}
