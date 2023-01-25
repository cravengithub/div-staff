package edu.amikom.domain;

public class Karyawan {

	private int nik;

	private String nama;

	private String email;

	private Divisi divisi;

	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public String getNama() {
		return nama;
	}
	
	public void setDivisi(Divisi divisi) {
		this.divisi = divisi;
	}
	
	public Divisi getDivisi() {
		return divisi;
	}
	
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void simpan() {

	}

}
