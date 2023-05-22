package com.dorukt.entities;

public class Mudur extends Personel {

	public String yonetimDepartmani;
	public String mudurDerecesi;

	public Mudur() {
		super();
		System.out.println("Mudur sınıf bos constructor çalıştı.");
	}

	public Mudur(String isim, String adres, String telefon, String yonetimDepartmani) {
		super(isim, adres, telefon);
		this.yonetimDepartmani = yonetimDepartmani;
		System.out.println("Mudur sınıfı 4 parametreli constructor calıstı");
	}

//	@Override
//	public String toString() {
//		return "Mudur [yonetimDepartmani=" + yonetimDepartmani + ", mudurDerecesi=" + mudurDerecesi + ", ad=" + ad
//				+ ", adres=" + adres + ", telefon=" + telefon + "]";
//	}

	// Erişim belirleyicisi: Default: Aynı package'daki classlar erişebilir.
	// Diğer package'lardaki classlar erişimez.

	// Constructor: Kurucu sınıftan nesne yaratırken çalışan metod.

	public void calis() {
		System.out.println("***********müdür calisiyor.");

	}

	@Override
	public int getMaasKatSayisi() {

		return 5;
	}

	public void yeniMaasHesapla() {

	}

	@Override
	public String bilgiGetir() {
		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
	}

}
