package com.dorukt.entities;

public class Muhasebeci extends Personel {

	public String muhasebeUnvani;

	@Override
	public int getMaasKatSayisi() {

		return 4;
	}

	@Override
	public String bilgiGetir() {
		return "ad: " + getAd() + " Adres: " + getAdres() + " Telefon: " + getTelefon();
	}
}
