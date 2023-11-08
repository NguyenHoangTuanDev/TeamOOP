

//
//public class ListNhanVien extends NhanVien{
//    int n;
//    NhanVien[] pe = new NhanVien[1];
//
//    //------------------------Ham thiet lap----------------------
//    public ListNhanVien(){}
//    public ListNhanVien(int a, NhanVien b[]){n = a; pe = b;}
//    public ListNhanVien(ListNhanVien c){n = c.n; pe = c.pe;}
//    
//    
//    //------------------------Nhap, xuat--------------------------
//    
//    public void nhap(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap n : ");
//        n = ip.nextInt();
//        pe = new NhanVien[n];
//        
//        for (int i = 0; i<n; i++){
//            System.out.println("Nhan vien "+ (i+1));
//            pe[i] = new NhanVien();
//            pe[i].nhap();
//        }
//    }
//    
//    public void xuat(){
//        for (int i = 0; i<n; i++){
//            System.out.println("Nhan vien "+ (i+1));
//            super.xuat();
//        }
//    }
//    
//    //-----------------------them---------------------------
//    public void them(){
//        Scanner ip = new Scanner(System.in);
//        System.out.println("Them nhan vien.");
//        pe = Arrays.copyOf(pe, pe.length +1);
//        pe[n].nhap();
//        n++;
//    }
//    
//    //-----------------------sua---------------------------
//    public void sua(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap ma nhan vien can sua : ");
//        String m = ip.next();
//        for (int i = 0; i<n; i++){
//            if (m == pe[i].ma)
//            {
//                pe[i].nhap();
//            }
//        }
//    }
//    
//    //-----------------------xoa---------------------------
//    public void xoa(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap ma nhan vien can xoa : ");
//        String m = ip.next();
//        for (int i = 0; i<n; i++){
//            if (m == pe[i].ma)
//            {
//                for(int j = i; j<n-1; j++){
//                    pe[j] = pe[j+1];
//                }
//                break;
//            }
//        }
//        pe = Arrays.copyOf(pe, pe.length-1);
//    }
//    
//    //-----------------------tim kiem---------------------------
//    public void timkiem_Ma(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap ma cua khach hang can tim : ");
//        String m = ip.next();
//        int a = 0;
//        for(int i = 0; i<n; i++){
//            if (m == pe[i].ma){
//                    System.out.println("Khach hang can tim.");
//                    pe[i].xuat();
//                    a = 1;
//                    break;
//            }
//        }
//        if(a == 0){System.out.println("Khong tim thay.");}
//    }
//    
//    public void timkiem_Ten(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap ten cua khach hang can tim : ");
//        String t = ip.next();
//        int a = 0;
//        for(int i = 0; i<n; i++){
//            if (t == pe[i].ten){
//                    System.out.println("Khach hang can tim.");
//                    pe[i].xuat();
//                    a = 1;
//            }
//        }
//        if(a == 0){System.out.println("Khong tim thay.");}
//    }
//    
//    public void timkiem_Sdt(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap sdt cua khach hang can tim : ");
//        String s = ip.next();
//        int a = 0;
//        for(int i = 0; i<n; i++){
//            if (s == pe[i].sdt){
//                    System.out.println("Khach hang can tim.");
//                    pe[i].xuat();
//                    a = 1;
//                    break;
//            }
//        }
//        if(a == 0){System.out.println("Khong tim thay.");}
//    }
//    
//    public void timkiem_Chucvu(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap chuc vu cua nhan vien can tim : ");
//        String c = ip.next();
//        int a = 0;
//        for(int i = 0; i<n; i++){
//            if (c == pe[i].chucvu){
//                    System.out.println("Nhan vien can tim.");
//                    pe[i].xuat();
//                    a = 1;
//            }
//        }
//        if(a == 0){System.out.println("Khong tim thay.");}
//    }
//    
//    //-----------------------thong ke---------------------------
//    public void thongke_Ten(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap ten : ");
//        String t = ip.next();
//        for (int i = 0; i<n; i++){
//            if(t == pe[i].ten){
//                pe[i].xuat();
//            }
//        }
//    }
//    
//    public void thongke_Gt(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap gioi tinh : ");
//        String g = ip.next();
//        for (int i = 0; i<n; i++){
//            if(g == pe[i].gt){
//                pe[i].xuat();
//            }
//        }
//    }
//    
//    public void thongke_Cv(){
//        Scanner ip = new Scanner(System.in);
//        System.out.print("Nhap chuc vu : ");
//        String c = ip.next();
//        for (int i = 0; i<n; i++){
//            if(c == pe[i].chucvu){
//                pe[i].xuat();
//            }
//        }
//    }
//}

package OOP.quản_lý.nhanvien;

import OOP.thư_viện.IFile;
import java.util.ArrayList;
import java.util.Arrays;

import OOP.thư_viện.IListFile;
import OOP.hàm_chung.DisplayFormat;
import OOP.hàm_chung.TableConsole;
import OOP.hàm_chung.Validation;
import OOP.thư_viện.IListElement;
import OOP.thư_viện.InputException;

public class ListNhanVien implements IListFile, IListElement
{
    private ArrayList<NhanVien> listnhanvien;
    
    public ListNhanVien() {
        this.listnhanvien = new ArrayList<NhanVien>();
    }
    
	@Override
    public boolean addElement(Object obj) {
		NhanVien nv = (NhanVien)obj;
		return this.listnhanvien.add(nv);
    }
    
    public void addAllElement(ListNhanVien list) {
        for (int i = 0; i < list.size(); ++i) {
            this.listnhanvien.add(list.getElement(i));
        }
    }
    public NhanVien getElement(int index) {
      	return this.listnhanvien.get(index);
   	}

	@Override
    public boolean setElement(int index, Object obj) {
		NhanVien nv = (NhanVien)obj;
		if(this.listnhanvien.set(index, nv) == null) {
			return false;
		}
		return true;
   	}
        
	@Override
	public void nhapDanhSachThongTin() {
        System.out.print("Nhap so luong nhan vien can them: ");
        int a = Validation.nhapDuLieuSo(1, 100);
        for (int i = 1; i <= a; ++i) {
            try {
                    NhanVien nv = new NhanVien();
                    System.out.println(DisplayFormat.inRaChuNamGiua(DisplayFormat.widthDisplay / 2, "Nhap thong tin nhan vien thu " + i, '='));
                    nv.nhap();
                    boolean isEqualsmaNV = this.contains(nv.getmaNV());
                    boolean isEqualsSDT= this.contains(nv.getSDT());
				if(isEqualsMa || isEqualsCMND) {
					throw new InputException("Ma nhan vien hoac SDT da co, vui long nhap lai du lieu!!!");
				}
                    this.addElement(nv);

            }
           catch(RuntimeException ex) {
				System.out.println(ex.getMessage());
				i -= 1;
			} 
        }
	}

    @Override
    public void xuatDanhSachThongTin() {
		Integer[] arrayWidth = {8, 12, 28, 15, 15};
		String[] arrayTitle = {"STT", "Ma nhan vien", "Ho va ten", "Dia chi", "SDT"};
		ArrayList<Integer> arrayWidthColumns = new ArrayList<Integer>(Arrays.asList(arrayWidth));
		ArrayList<String> arrayTitleColumns = new ArrayList<String>(Arrays.asList(arrayTitle));
		TableConsole table = new TableConsole(arrayWidthColumns);
		table.setTitle(arrayTitleColumns);
      	for(int i = 0; i < this.listnhanvien.size(); ++i) {
			ArrayList<String> rowData = new ArrayList<String>();
			rowData.add(Integer.toString(i + 1)); // add so thu tu
			rowData.addAll(this.listnhanvien.get(i).xuatMangThongTin());
			table.addRowData(rowData);
      	}
		System.out.println(DisplayFormat.inRaChuNamGiua(DisplayFormat.widthDisplay, "DANH SACH NHAN VIEN", '-'));
		table.DrawTable();
    }
    
    @Override
    public int size() {
        return this.listnhanvien.size();
    }

	@Override
	public boolean isEmpty() {
		return this.listnhanvien.isEmpty();
	}
    
    @Override
    public boolean contains(String strProperty) {
        for (NhanVien nv : this.listnhanvien) {
            if (nv.contains(strProperty)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int indexOf(String strProperty) {
        for (int i = 0; i < this.listnhanvien.size(); ++i) {
            NhanVien nv = this.listnhanvien.get(i);
            if (nv.contains(strProperty)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean removeElement(int index) {
        if (index < 0 || index >= this.listnhanvien.size()) {
        	return false;
        }
        this.listnhanvien.remove(index);
        return true;
    }
    
    @Override
    public void readListDataInDatabase(ArrayList<String> listnhanvien) {
        for (int i = 0; i < listnhanvien.size(); ++i) {
            NhanVien nv = new NhanVien();
            nv.readDataInDatabase(listnhanvien.get(i));
            this.listnhanvien.add(nv);
        }
    }
    
    @Override
    public ArrayList<String> writeListDataInDatabase() {
        ArrayList<String> data = new ArrayList<String>();
        for (int i = 0; i < this.listnhanvien.size(); ++i) {
            data.add(this.listnhanvien.get(i).writeDataInDatabase());
        }
        return data;
    }
}
