	package quanlisach;
	import java.text.SimpleDateFormat;
	import java.util.Enumeration;
	import java.util.Scanner;
	import java.util.Vector;
	
	public class SachManagement {
		Vector list = new Vector();
		public SachManagement() {
			while(true) {
				System.out.println("Quan Li Sach");
				System.out.println("1. Nhap Thong Tin Sach");
				System.out.println("2. Xem Thong Tin Sach");
				int n;
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Moi ban chon chuc nang:");
				n = keyboard.nextInt();
				switch(n) {
				case 1: NhapTT();
						 break;
				case 2: InTT();
						break;
				case 3: System.out.println("ket thuc chuong trinh");
				return;
				
				}
			}
		}
		public void NhapTT() {
			Scanner keyboard = new Scanner(System.in);
			int n;
			System.out.println("Nhap so luong sach=");
			n =Integer.parseInt(keyboard.nextLine());
			for(int i=1; i<n; i++) {
				System.out.println("Nhap ma sach");
				String maSach=keyboard.nextLine();
				System.out.println("Nhap ten sach");
				String tenSach=keyboard.nextLine();
				System.out.println("Nhap so luong");
				int sl=Integer.parseInt(keyboard.nextLine());
				System.out.println("Nam xuat ban");
				SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
				String namXb=keyboard.nextLine();
				Sach s =new Sach(maSach, tenSach, sl, namXb);
				list.add(s);
				
			}
		}
		public void InTT() {
			System.out.println("Thong Tin Cua Sach Ma Ban Da Chon");
			Enumeration vEnum = list.elements();
			int i=1;
			while(vEnum.hasMoreElements()) {
				Sach sa = (Sach)vEnum.nextElement();
				System.out.println("Ma Sach= " +sa.getMaSach() + "Ten Sach= "+sa.getTenSach() + "So Luong= "+sa.getSl()+ "Nam Xuat Ban= "+sa.getNamXB());
				
			}
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			new SachManagement();
			
	}

}
