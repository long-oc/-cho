/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit;

import java.util.Scanner;
import static demogit.DemoGit.getFac;
import static demogit.DemoGit.PI;
/**
 *
 * @author Long
 */
public class DemoGit {

    /**
     */
 
        public static final double PI=3.1415;
        // ham tinh giai thua n!= 1.2.3.4...n
        // 0!=1!=1
        //21! cuc lon , tran kieu long , chua khong noi
        // int : toi da 2 ty 1 may
        // ham tinh giai thua trong gioi han dau vao tu 0-20
//        public static long getFac(int n){
//            if(n<0||n>20){
//                throw new IllegalArgumentException("n mus be between 1 to 20");
//            }
//            if(n==0||n==1)
//            return 1;
//            long resut=1;
//            for (int i = 2; i <=n; i++) {
//                resut*=i;
//            }
//            return resut;
//        }
        
        // viet de quy cho hoanh trang
        //goi lai chinh minh voi quy mo khac
        //5! = 5*4!, tinh 4! roi tinh tiep
        //...
        //de quy phai co diem dung
        // rat de bi lap vo tan neu khong co dung
        //ket luan n!= n* (n-1)!
        public static long getFac(int n){
            if(n<0 || n>20)
                throw new IllegalArgumentException("n must between 0..20");
            
            if(n==0 || n==1){
                return 1;
            }           
           return n * getFac(n-1);
            
            
        }
 
        // minh hoa khai nieu refactoring - toi uu, chinh sua lai code
        // cho tot hon
        //va minh hoa khai niem regression test , test hoi quy, test lai nhung gi da
        // tung test XANH, de check xem code con xanh nhu ngay xua sau khi da sua code
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long expected = 120; //ta mong nhan dc 120 neu goi 5
        long actual = (long) getFac(5);
        System.out.println("5! Expected: "+expected +"; Actual: "+actual);
        
        System.out.println("6! :"+(long) DemoGit.getFac(6));
        //System.out.println("0! :"+(long) DemoGit.getFac(-10));
        System.out.println("PI:" + PI);
        }
    //muon ket luan ham minh ngon, thi ta phai nhin bang mat ket qua chay cua ham
    //va so sanh voi ki vong
    //lam tung truong hop chay ham - test case
    //cach nay on, nhung mat suc
    
    //Nang cao: dung mau sac, xanh do de ket luan
    //ta thay xanh, ham y moi tinh huong on
    //ta thay do, chi 1 thang mau do , coi nhu ham toang
    //ta sai them 1 framework, unit test ten chung
    //Junit , testing , nunit,.. la nhung framework cu the de giup test cac ham
    //mot cach hieu qua
    // dung no ta tich hop vao mot quy trinh
}
    

