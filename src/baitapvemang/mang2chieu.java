/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapvemang;
import java.util.Random;
public class mang2chieu {
    int n ;
    int[][] mang1,mang2;
    
    public mang2chieu(int n){
       this.n = n;
       mang1 = new int[n][n];
       mang2 = new int[n][n];
       initValue();
    }   

    public void initValue() {
       Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mang1[i][j] = r.nextInt(10);
                mang2[i][j] = r.nextInt(10);
            }
        }
    }
    public void printMang1(){
        prinMang(mang1);
    }
    public void printMang2(){
        prinMang(mang2);
    }
    public void prinMang(int[][] mang){
        System.out.println("----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mang[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mang2chieu m = new mang2chieu(2);
        m.printMang1();
        m.printMang2();
    }
}
