package pertemuan4;

import java.util.Scanner;

public class MainArrayofrecord {
	
	/*
	 * jika kita ingin mengelola sebuah record menjadi banyak
	 * objek, maka dalam pemanggilannya kita bisa menggunakan 
	 * array of record, array of record adalah array yang
	 * menggunakan record sebagai tipedatanya,formatnya
	 * 
	 * NamaRecord [] aliasArray = new NamaRecord [index];
	 * 
	 * 		
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		RecordPemainBola [] arrPemain = new RecordPemainBola [3];
		String nama, no, posisi;
		int caps, goal;
		
		for (int idx=0; idx < arrPemain.length; idx++) {
			System.out.println("Masukan data pemain ke-"+ idx);
			
			arrPemain [idx] = new RecordPemainBola();
			
			System.out.print("Nama Pemain:"); nama = sc.next();
			System.out.print("No Pemain:"); no = sc.next();
			System.out.print("Posisi Pemain:"); posisi = sc.next();
			System.out.print("caps Pemain:"); caps = sc.nextInt();
			System.out.print("goal Pemain:"); goal = sc.nextInt();
			
			arrPemain [idx].setsNama(nama);
			arrPemain [idx].setsNoPunggung(no);
			arrPemain [idx].setsPosisi(posisi);
			arrPemain [idx].setiCaps(caps);
			arrPemain [idx].setiGoal(goal);
			
			System.out.print("Nama Pemain :"+ arrPemain[idx].getsNama());
			System.out.print("No Pemain :"+ arrPemain[idx].getsNoPunggung());
			System.out.print("posisi Pemain :"+ arrPemain[idx].getsPosisi());
			System.out.print("caps Pemain :"+ arrPemain[idx].getiCaps());
			System.out.print("goal Pemain :"+ arrPemain[idx].getiGoal());
		}
		
	}

}
