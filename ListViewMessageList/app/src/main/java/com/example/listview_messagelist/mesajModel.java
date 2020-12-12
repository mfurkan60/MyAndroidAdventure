package com.example.listview_messagelist;

public class mesajModel {
//şimdi listeyi oluşturmamız lazım. Listeyi de bizler model classı içerisinde
    //oluşturmuş olucagız
    private String mesajIcaerik;
    private String kisi;
    private int resimId;
    //getter and setter oluşturduk! Mesajları private olarak tanımlamak önemli
    // mesajları listenelenecek layout tasarımı layout.xml de

    public mesajModel(String mesajIcaerik, String kisi, int resimId) {
        this.mesajIcaerik = mesajIcaerik;
        this.kisi = kisi;
        this.resimId = resimId;
    }

    public String getMesajIcaerik() {
        return mesajIcaerik;
    }

    public void setMesajIcaerik(String mesajIcaerik) {
        this.mesajIcaerik = mesajIcaerik;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }
}



