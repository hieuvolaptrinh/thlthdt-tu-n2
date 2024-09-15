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
public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        int tong = num1 + num2;
        int hieu = num1 - num2;
        int tich = num1 * num2;
        int thuong = num1 / num2;
        int phanDu = num1 % num2;

        System.out.println("tổng là : " + tong);
        System.out.println("hiệu là : " + hieu);
        System.out.println("tích là : " + tich);
        System.out.println("thương là : " + thuong);
        System.out.println("phần dư là : " + phanDu);
    }
}
