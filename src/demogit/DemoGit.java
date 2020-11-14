/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit;

import java.util.Scanner;

/**
 *
 * @author Long
 */
public class DemoGit {

    /**
     * @param args the command line arguments
     */
 
        public static final double PI=3.1415;
        // ham tinh giai thua n!= 1.2.3.4...n
        // 0!=1!=1
        //21! cuc lon , tran kieu long , chua khong noi
        // int : toi da 2 ty 1 may
        // ham tinh giai thua trong gioi han dau vao tu 0-20
        public static long getFac(int n){
            if(n<0||n>20){
                throw new IllegalArgumentException("n mus be between 1 to 20");
            }
            if(n==0||n==1)
            return 1;
            long resut=1;
            for (int i = 2; i <=n; i++) {
                resut*=i;
            }
            return resut;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long expected = 120; //ta mong nhan dc 120 neu goi 5
        long actual = (long) DemoGit.getFac(5);
        System.out.println("5! Expected: "+expected +"; Actual: "+actual);
        
        System.out.println("6! :"+(long) DemoGit.getFac(6));
        System.out.println("0! :"+(long) DemoGit.getFac(-10));
        
        }
    
}
    

