package com.dorukt.entities;

//The type Mudur cannot subclass the final class Personel
//final classlardan kalıtım yapılamaz./ miras alınamaz.

public abstract class Personel {

	private String ad;
	private String adres;
	private String telefon;
	public String cepTel;
	protected String tc;
	private int maas;

	public int yas;
	private int maasKatSayisi;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public int gorevTazminati;

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public Personel() {
		super();
		System.out.println("Personel sınıfı bos constructor çalıştı.");
	}

	public Personel(String ad, String adres, String telefon) {
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		System.out.println("3 parametre çalıştı.");
	}

	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + "]";
	}

	public void calis() {
		System.out.println("***********personel calisiyor.");

	}

	public int getMaasKatSayisi() {

		return 1;
	}

	// public abstract String bilgiGetir();
	// final keywordu eklenen metod override edilemez.
//	public final String bilgiGetir() {
//		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
//	}

	public String bilgiGetir() {
		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
	}

}
