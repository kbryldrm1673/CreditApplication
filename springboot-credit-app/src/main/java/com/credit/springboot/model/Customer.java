package com.credit.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "tc_no")
	private long tcNo;
	
	@Column(name = "ad")
	private String ad;
	
	@Column(name = "soyad")
	private String soyad;
	
	@Column(name = "cep_tel")
	private long cepTel;
	
	@Column(name = "kredi_tutar")
	private long krediTutar;
	
	@Column(name = "vade")
	private String vade;
	
	
	@Column(name = "arac_plaka")
	private String aracPlaka;
	
	@Column(name = "yeni_kimlik")
	private boolean yeniKimlik;
	
	@Column(name = "dogum_tarihi")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dogumTarihi;
	
	@Column(name = "kimlik_son")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date kimlikSon;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTcNo() {
		return tcNo;
	}

	public void setTcNo(long tcNo) {
		this.tcNo = tcNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public long getCepTel() {
		return cepTel;
	}

	public void setCepTel(long cepTel) {
		this.cepTel = cepTel;
	}

	public long getKrediTutar() {
		return krediTutar;
	}

	public void setKrediTutar(long krediTutar) {
		this.krediTutar = krediTutar;
	}

	public String getVade() {
		return vade;
	}

	public void setVade(String vade) {
		this.vade = vade;
	}

	public String getAracPlaka() {
		return aracPlaka;
	}

	public void setAracPlaka(String aracPlaka) {
		this.aracPlaka = aracPlaka;
	}

	public boolean isYeniKimlik() {
		return yeniKimlik;
	}

	public void setYeniKimlik(boolean yeniKimlik) {
		this.yeniKimlik = yeniKimlik;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public Date getKimlikSon() {
		return kimlikSon;
	}

	public void setKimlikSon(Date kimlikSon) {
		this.kimlikSon = kimlikSon;
	}
	
	
}
