/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2;

import java.util.Scanner;

/**
 *
 * @author hieuvo
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("nhập số tiền gửi ngân hàng : ");
        double soTienGui = scanner.nextDouble();
        
        System.out.print("nhập lãi suất hàng năm (%): ");
        double laiSuatHangNam = scanner.nextDouble();


        System.out.print("nhập số tháng gửi: ");
        int soThangGui = scanner.nextInt();
        
        double tienLai = soTienGui * (laiSuatHangNam / 100) / 12 * soThangGui;
        double tongTienCuoiKy = soTienGui + tienLai;

        System.out.println("số tiền lãi: " + tienLai + " VND");
        System.out.println("số tiền gốc cuối kỳ: " + tongTienCuoiKy + " VND");
    }
}
