package pertemuan4;

public class RecordPemainBola {
	
	/*
	 *Record adalah struktur data lain selain array,
	 *jika array menampung nilai dengan tipe data yang
	 *sama. sedangkan record adalah struktur data yang
	 *mempresentasikan sebuah objek dengan banyak
	 *atribut (bisa saja tipedata berbeda-beda)
	 *
	 *contoh objek dengan atribut banyak adalah objek
	 *pemain bola, dimana memiliki atribut seperti
	 *nama, no punggunng, posisi, caps dan goal.
	 *
	 *atribut pada record akan dituliskan sebagai variable,
	 *hanya saja atribut pada record tidak boleh diakses 
	 *langsung,hanya diperbolehkan menggunakan method
	 */
	
	//block atribut
	private String sNama, sNoPunggung, sPosisi;
	private int iCaps, iGoal;
	
	//block method
	public String getsNama() {
		return sNama;
	}
	public void setsNama(String sNama) {
		this.sNama = sNama;
	}
	public String getsNoPunggung() {
		return sNoPunggung;
	}
	public void setsNoPunggung(String sNoPunggung) {
		this.sNoPunggung = sNoPunggung;
	}
	public String getsPosisi() {
		return sPosisi;
	}
	public void setsPosisi(String sPosisi) {
		this.sPosisi = sPosisi;
	}
	public int getiCaps() {
		return iCaps;
	}
	public void setiCaps(int iCaps) {
		this.iCaps = iCaps;
	}
	public int getiGoal() {
		return iGoal;
	}
	public void setiGoal(int iGoal) {
		this.iGoal = iGoal;
	}
	
	
	

}
