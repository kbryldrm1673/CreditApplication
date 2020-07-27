package com.credit.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "il")
	private String il;
	
	@Column(name = "ilce")
	private String ilce;
	
	@Column(name = "ev_adres")
	private String evAdres;
	
	@Column(name = "ev_kimin")
	private String evKimin;
	
	@Column(name = "calisma_sekli")
	private String calısmaSekli;
	
	@Column(name = "meslek")
	private String meslek;
	
	@Column(name = "vergi_dairesi")
	private String vergiDairesi;
	
	@Column(name = "vergi_numarasi")
	private long vergiNumarasi;
	
	@Column(name = "is_yeri_unvan")
	private String isYeriUnvani;
	
	@Column(name = "is_yeri_il")
	private String isYeriIl;
	
	@Column(name = "is_yeri_ilce")
	private String isYeriIlce;
	
	@Column(name = "is_yeri_adres")
	private String isYeriAdres;
	
	@Column(name = "is_telefon")
	private long isTelefon;
	
	@Column(name = "aylik_gelir")
	private long aylikGelir;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getEvAdres() {
		return evAdres;
	}

	public void setEvAdres(String evAdres) {
		this.evAdres = evAdres;
	}

	public String getEvKimin() {
		return evKimin;
	}

	public void setEvKimin(String evKimin) {
		this.evKimin = evKimin;
	}

	public String getCalısmaSekli() {
		return calısmaSekli;
	}

	public void setCalısmaSekli(String calısmaSekli) {
		this.calısmaSekli = calısmaSekli;
	}

	public String getMeslek() {
		return meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public String getVergiDairesi() {
		return vergiDairesi;
	}

	public void setVergiDairesi(String vergiDairesi) {
		this.vergiDairesi = vergiDairesi;
	}

	public long getVergiNumarasi() {
		return vergiNumarasi;
	}

	public void setVergiNumarasi(long vergiNumarasi) {
		this.vergiNumarasi = vergiNumarasi;
	}

	public String getIsYeriUnvani() {
		return isYeriUnvani;
	}

	public void setIsYeriUnvani(String isYeriUnvani) {
		this.isYeriUnvani = isYeriUnvani;
	}

	public String getIsYeriIl() {
		return isYeriIl;
	}

	public void setIsYeriIl(String isYeriIl) {
		this.isYeriIl = isYeriIl;
	}

	public String getIsYeriIlce() {
		return isYeriIlce;
	}

	public void setIsYeriIlce(String isYeriIlce) {
		this.isYeriIlce = isYeriIlce;
	}

	public String getIsYeriAdres() {
		return isYeriAdres;
	}

	public void setIsYeriAdres(String isYeriAdres) {
		this.isYeriAdres = isYeriAdres;
	}

	public long getIsTelefon() {
		return isTelefon;
	}

	public void setIsTelefon(long isTelefon) {
		this.isTelefon = isTelefon;
	}

	public long getAylikGelir() {
		return aylikGelir;
	}

	public void setAylikGelir(long aylikGelir) {
		this.aylikGelir = aylikGelir;
	}
	
}
