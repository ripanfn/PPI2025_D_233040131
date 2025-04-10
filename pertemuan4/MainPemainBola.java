package pertemuan4;

import java.util.Scanner;

public class MainPemainBola {
	
	/*
	 *kelas record harus memiliki pasangan kelas, yang menjadi
	 *kelas mainnya. kelas yang memiliki main method dan memanggil
	 *recod yang sudah kita buat 
	 * 
	 * memanggil record mirip dengan membuat variable, dimana
	 * formatnya
	 * 
	 * namaRecord aliasvariable = new namaRecord;
	 * 
	 * mirip dengan saat kita mengakses scanner
	 * 
	 * Scanner sc = new Scanner (System.in)
	 * 
	 * scanner adalah sebuah record
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecordPemainBola pemain= new RecordPemainBola();
		pemain.setsNama("elklemer");
		pemain.setsNoPunggung("9");
		pemain.setsPosisi("penyerang");
		pemain.setiCaps(4);
		pemain.setiGoal(1);
		
		System.out.println("Pemain bernama " + pemain.getsNama()+
		       " bernomor punggung " + pemain.getsNoPunggung() +
		       " memiliki jumlah goal " + pemain.getiGoal());
		
		
		RecordPemainBola pemain2= new RecordPemainBola();
		pemain2.setsNama("rizki ridho");
		pemain2.setsNoPunggung("5");
		pemain2.setsPosisi("bek tengah");
		pemain2.setiCaps(9);
		pemain2.setiGoal(1);
		
		System.out.println("Pemain bernama " + pemain2.getsNama()+
		       " bernomor punggung " + pemain2.getsNoPunggung() +
		       " memiliki jumlah goal " + pemain2.getiGoal());
		
		
	}

}
