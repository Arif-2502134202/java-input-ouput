import java.util.Scanner;  // Import class yang diperlukan dari library java
import java.text.*;

class Main {
	//Fungsi untuk menampilkan nilai angka dengan format desimal
	public static void customFormat(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      System.out.println(output);
	}
	//fungsi utama 
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Masukkan Nama Anda : ");
		String namaUser = myObj.nextLine();  // Read user input
	
		System.out.println(" ");
		System.out.println("Stock Gudang Input Barang");
		System.out.println("#########################");
		System.out.println(" ");
		System.out.println("Selamat Datang : " + namaUser);  // Output user input
	
		System.out.println(" ");
		System.out.print("Masukkan Nama Barang : ");
		String namaBarang = myObj.nextLine();
		System.out.println(" ");
		System.out.print("Masukkan Jumlah Barang : ");
		int qty = myObj.nextInt();
		System.out.println(" ");
		System.out.print("Masukkan Harga Beli Barang : ");
		double hargaBeli = myObj.nextDouble();
		System.out.println(" ");
		System.out.print("Masukkan Harga Jual Barang : ");
		double hargaJual = myObj.nextDouble();
	
		System.out.println(" ");
		System.out.println("Stock Gudang Input Barang");
		System.out.println("#########################");
		System.out.println(" ");
		System.out.println("Nama Barang   : " + namaBarang);
		System.out.println("Jumlah Barang : " + qty);
		System.out.print("Harga Beli    : Rp. "); 
		customFormat("##,###.##", hargaBeli); 
		System.out.print("Harga Jual    : Rp. "); 
		customFormat("##,###.##", hargaJual);
		System.out.println(" ");
		System.out.println("#########################");
	}
}
