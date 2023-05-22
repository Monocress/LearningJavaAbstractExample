package com.dorukt.entities;

public class Muhendis extends Personel {
	// Shift+Alt+A ile birden çok satırda aynı sütunda düzenleme yapılır. Açmak
	// içinde bas çıkmak içinde aynı kombinasyon

	public String uzmanlikAlani;
	public String calismaSekli;

	public Muhendis(String isim, String adres, String telefon, String uzmanlikAlani) {
//		this.ad = isim;
//		this.adres = adres;
//		this.telefon = telefon;
//		this.uzmanlikAlani = uzmanlikAlani;
		System.out.println("Mudur sınıfı 4 parametreli constructor calıstı");
	}
	/*
	 * this()=> aynı sınıftaki constructor cağırımında kullanılır this. => aynı
	 * sınftaki üye degiskenlere eriişimde kullanılır.
	 * 
	 * super()=> üst sınıftaki constructor cagırımında kullandık super. => üst
	 * sınıftaki üye değişkenlere eşirimde kullanılır.
	 * 
	 * 
	 */

	@Override
	public String toString() {

		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", calismaSekli=" + calismaSekli + super.toString() + "]";
	}

	public Muhendis() {
		super();
	}

	@Override
	public int getMaasKatSayisi() {

		return 3;
	}

	@Override
	public String bilgiGetir() {
		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
	}
}
