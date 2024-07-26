/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapvemang;

import java.util.Random;
import java.util.Scanner;

public class BaiTapVeMang {
// khai bao mang so nguyen
    float a[];
// so luong phan tư 
    int n;
    
 public BaiTapVeMang(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap vao so luong phan tu cua Mang:");
     n = sc.nextInt();
     a = taoMangSoThuc(n);
     printA();
 }
 // Viết pt in ra mảng
 public void printA(){
     for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + "  ");
     }
 }
 // viết phương thức trả về mảng số thực n phẩn tử 
 public float[] taoMangSoThuc(int n){
     Random r = new Random();
     
     float[] temp = new float[n];
     for (int i = 0; i < n; i++) {
         temp[i] = r.nextFloat();
     }
     return temp;
 }
 
 // thêm 1 phần tử x vào cuối mảng 
 public void addX(float x){
     //Tăng n lên
     n = n+1;
     // Tạo mảng temp
     float[] temp = new float[n];
     // copy dữ liệu 
     for (int i = 0; i < a.length; i++) {
         temp[i] = a[i];
     }
     // thêm x vào cuối mẩng 
     temp[n-1] = x;
     // gán lại cho mảng
     a = temp ;
 }
 // tính tổng 2 phần tử đầu tiên
  public void sum2pt(){
      float sum = 0;
//      if(a.length >=1){
//          sum+= a[0];
//      }
//      if(a.length >=2){
//          sum+= a[1];
//      }
      for (int i = 0; i<=2 && i < a.length; i++) {
          sum+=a[i];
      }
      
      System.out.println("tong 2 phan tu dau tien: " + sum);
  }
  // in tong mang
  public void SumA(){
      float sum = 0;
      for (int i = 0; i < a.length; i++) {
          sum+=a[i];
      }
       System.out.println("Tong Mang A: " + sum);
  }
  // tim gia tri nho nhat
  public void findMin(){
      float min =a[0];
      for (int i = 0; i < a.length; i++) {
          if(min >a[i]){
              min = a[i];
          }
      }
      System.out.println("Min = " + min );
  }
  // in ra gia tri ngau nhien 
  public void printRandon(){
      Random r = new Random();
      int index = r.nextInt(a.length);
      System.out.println("A["+index+"]="+a[index]);
  }
 
    public static void main(String[] args) {
        BaiTapVeMang b = new BaiTapVeMang();
        b.addX(1.3f);
        System.out.println();
        b.printA();
        System.out.println();
        b.sum2pt();
        System.out.println();
        b.SumA();
        System.out.println();
        b.findMin();
        b.printRandon();
    }
    
    // bài 04 phút 32 
}
