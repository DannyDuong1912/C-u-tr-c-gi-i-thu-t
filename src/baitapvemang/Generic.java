/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapvemang;

public class Generic {
    public static <T> double TinhTBC(T[] mang){
        double tong = 0 ;
        for (T mang1 : mang) {
            double value = Double.parseDouble(mang1 + "");
            tong+=value;
        }
        return tong/mang.length;
    }
    public static void main(String[] args) {
        Integer[] mangInt = {5,10, 15};
        System.out.println("TBC-int: "+ TinhTBC(mangInt));
        Float[] f = {5f,10f};
        System.out.println("TBC-int: "+ TinhTBC(f));
    }
}
