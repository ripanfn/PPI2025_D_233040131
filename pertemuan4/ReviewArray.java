package pertemuan4;

import java.util.Scanner;

public class ReviewArray {
	public static void main(String[] args) {
		/*
		 * Array adalah struktur data yang menampung banyak nilai
		 * dengan tipedata yang sama. Array adalah sebuah vriable
		 * yang digunakan untuk menampung banyak nilai.
		 * Secara deklarasi pembuatan Array mirip dengan pembuatan 
		 * variable. berikut adalah formatnya :
		 * 
		 * Tipedata [] namaArray = new Tipedata [banyakIndex];
		 * 
		 * contoh
		 * String [] arrString = new String [index];
		 * int [] arrInt = new int [index];
		 * 
		 * elemen array akan selalu dimulai dari 0,sehingga
		 * jika sebuah array memiliki index 10. maka elemennya
		 * akan dimulai dari 0 hingga 9 (10-1)
		 * 
		 * contoh soal  buatlah sebuah program menggunakan array berindex 
		 * 5,dimana array tersebut akan menampung nilai berebntuk desimal yang
		 * diinputkan dari keyboard.
		 * setelah diinputkan, munculkan semua nilai yang telah
		 * diinputkan
		 */
		
		Scanner sc = new Scanner (System.in);
		double [] arrNilai = new double [5];
		
		for (int idx=0; idx< arrNilai.length; idx++) {
			System.out.println("Masukan nilai ke-"+idx);
			arrNilai [idx]= sc.nextDouble();
			
		}
		for (int idx=0; idx<arrNilai.length; idx++) {
			System.out.println("nilai ke-"+ idx +" = "+ arrNilai[idx]);
		}
		
	}

}
