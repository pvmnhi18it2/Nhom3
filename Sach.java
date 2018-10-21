	package quanlisach;
	
	import java.text.SimpleDateFormat;
	import java.util.Scanner;
	import java.util.Date;
	
	public class Sach {
		String maSach;
		String tenSach;
		int sl;
		String namXb;
		public Sach( String maSach, String tenSach, int sl, String namXb) {
			this.maSach = maSach;
			this.tenSach = tenSach;
			this.sl = sl;
			this.namXb = namXb;
		}
		
		public String getTenSach() {
			return tenSach;
		}
		public void setTenSach(String tenSach) {
			this.tenSach = tenSach;
		}
		public String getMaSach() {
			return maSach;
		}
		public void setMaSach(String maSach) {
			this.maSach = maSach;
		}
		public int getSl() {
			return sl;			
		} 
		public void setSl(int sl) {
			this.sl = sl;
		}
		public String getNamXB() {
			return namXb;
		}
		public void setNamXB(String namXb) {
			this.namXb = namXb;
			
		}
		
		
		public Sach() {
			maSach= new String("");	
			tenSach= new String("");	
			namXb= new String("");	
			sl=0;	
			}
}

	