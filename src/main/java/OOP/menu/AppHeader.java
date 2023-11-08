package menu;

import OOP.thư_viện.IHienThi;
import OOP.hàm_chung.DisplayFormat;

public class AppHeader implements IHienThi
{
    public void xuatTitle() {
    }
    
    public void xuat() {
		int widthDisplay = DisplayFormat.widthDisplay;

		System.out.println(DisplayFormat.inRaHangCungKyTu(widthDisplay, '='));

		System.out.println(DisplayFormat.inRaChuHaiBenHang(widthDisplay, '|'));

		System.out.printf("%s%s%s\n", "|", DisplayFormat.inRaChuNamGiua(widthDisplay - 2, "QUAN LY CUA HANG BAN DIEN THOAI", ' '), "|");

		System.out.println(DisplayFormat.inRaChuHaiBenHang(widthDisplay, '|'));

		System.out.println(DisplayFormat.inRaHangCungKyTu(widthDisplay, '='));
        System.out.printf("\n");
    }
}
