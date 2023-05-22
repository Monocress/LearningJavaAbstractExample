package com.dorukt.entities;

public class Hizmetli extends Personel {

	public int[] gorevYaptigiKatlar;

	@Override
	public int getMaasKatSayisi() {

		return 1;
	}

	@Override
	public String bilgiGetir() {
		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
	}
}
