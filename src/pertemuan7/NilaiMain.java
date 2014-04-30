package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class NilaiMain {

	private List<Nilai> listNilai;
	private List<Mahasiswa> listMhs;
	private List<Matakuliah> listMk;
	
	public NilaiMain() {
		// TODO Auto-generated constructor stub
		this.listNilai = new ArrayList<Nilai>();
		this.listMhs = new ArrayList<Mahasiswa>();
		this.listMk = new ArrayList<Matakuliah>();
	}
	
	public void initMhs(){
		listMhs.add(new Mahasiswa("113040001","AA","AAA"));
		listMhs.add(new Mahasiswa("113040002","BB","BBB"));
	}
	
	public void initMatkul(){
		listMk.add(new Matakuliah("IF01","RKPPL",3));
		listMk.add(new Matakuliah("IF02","PSBK",3));
	}
	
	public void initNilai(){
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(1), 4.0));

		listNilai.add(new Nilai(listMhs.get(1), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 4.0));
	}
	
	public void tampilMhs(){
		for (Mahasiswa mhs : listMhs) {
			System.out.println(mhs);
		}
	}
	
	public void tampilMatkul(){
		for (Matakuliah mk : listMk) {
			System.out.println(mk);
		}
	}
	
	public void tampilNilai(){
		for (Nilai n : listNilai) {
			System.out.println(n);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NilaiMain main = new NilaiMain();
		main.initMhs();
		main.initMatkul();
		main.initNilai();
		
		System.out.println("=================List Mahasiswa============");
		main.tampilMhs();
		System.out.println("=================List Matakuliah===========");
		main.tampilMatkul();
		System.out.println("=================List Nilai===========");
		main.tampilNilai();
	}

}
