package OOP.quản_lý.nhanvien;



// import java.util.Scanner;

// public class NhanVien extends Khachhang{
//     String chucvu;
    
//     //------------------------Ham thiet lap----------------------
//     public NhanVien(){} 
//     public NhanVien(String m, String t, String g, String pn, String ad, String cv)
//     {
//         super(m,t,g,pn,ad);
//         chucvu = cv;
//     }
//     public NhanVien(NhanVien a1)
//     {
//         super((Khachhang)a1);
//         chucvu = a1.chucvu;
//     }
    
    
//     //-----------------------get, set-----------------------
//     public void setCV(String c){chucvu = c;}
//     public String getCV(){return chucvu;}
    
    
//     //------------------------Nhap, xuat--------------------------
//     public void nhap(){
//         Scanner ip = new Scanner(System.in);
//         super.nhap();
//         System.out.print("Chuc vu : ");
//         chucvu = ip.next();
//     }
    
//     public void xuat(){
//         super.xuat();  
//         System.out.print("Chuc vu : " + chucvu);  
//     }
// }


import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;
import OOP.thư_viện.IFile;
import OOP.hàm_chung.Validation;

public class NhanVien implements IFile
{
    private String maNV;
    private String tenNV;
    private double SDT;
    private int diaChi;
    
    public NhanVien() {
    }
    
    public NhanVien(String maNV, String tenNV, double SDT, int diaChi) {
        super(maNV, tenNV, SDT, diaChi);
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.SDT = SDT;
        this.diaChi = diaChi;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setSDT(double SDT) {
        this.SDT = SDT;
    }

    public void setDiaChi(int diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public double getSDT() {
        return SDT;
    }

    public int getDiaChi() {
        return diaChi;
    }
    
    
    
    public void nhap() {
        super.nhapthongtin();
        System.out.print("Nhap Ma: ");
		this.maNV = Validation.nhapDuLieu(4);
        System.out.print("Nhap ho va ten: ");
		this.tenNV = Validation.nhapDưLieu();
        System.out.print("Nhap vi tri: ");
		this.SDT = Validation.nhapDuLieuSo();
        System.out.print("Nhap dia chi nha: ");
		this.diaChi = Validation.nhapDuLieuSo();
    }
    
    @Override
	public ArrayList<String> xuatMangThongTin() {
		ArrayList<String> array = new ArrayList<String>();
		array.add(this.maNV);
		array.add(this.tenNV);
		array.add(Integer.toString(this.diaChi));
		array.add(Double.toString(this.SDT));
		
		return array;
	}
    
    @Override
    public void readDataInDatabase(String data) {
        StringTokenizer sc = new StringTokenizer(data, ";");
        this.maNV = sc.nextToken();
        this.tenNV = sc.nextToken();
        this.diaChi = Integer.parseInt(sc.nextToken());
        this.SDT = Double.parseDouble(sc.nextToken());
    }
    
    @Override
    public String writeDataInDatabase() {
        return String.format("%s;%s;%s;%s;", this.maNV, this.tenNV, this.SDT, this.diaChi);
    }
    
    @Override
    public boolean contains(String strProperty) {
		if(this.Ma.equals(strProperty)) { return true; }
		if(this.CMND.equals(strProperty)) { return true; }
		return false;
	}
}
