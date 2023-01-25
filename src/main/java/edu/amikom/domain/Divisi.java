package edu.amikom.domain;
import java.util.LinkedList;

public class Divisi {

	private int id;

	private String nama;

	private LinkedList<Karyawan> karyawan = new LinkedList<Karyawan>();


	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}

	public LinkedList<Karyawan> getKaryawan() {
		return karyawan;
	}

	public void getDivisi() {

	}

}
