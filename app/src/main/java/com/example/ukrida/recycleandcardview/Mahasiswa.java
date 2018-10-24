package com.example.ukrida.recycleandcardview;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String nohp;

    public Mahasiswa(String nama, String npm, String nohp) {
        this.nama = nama;
        this.npm = npm;
        this.nohp = nohp;

    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getNohp() {
        return nohp;
    }

}
