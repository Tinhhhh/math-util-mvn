/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvt.birdservice.core;

// class này chứa các hàm static sinh ra để làm tool dùng chung
//các nơi khác
// cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua
//hàm, mà khôg cần lưu trữ gì hết, cái đó nên là STATIC
//đồ nào mà là STATIC thì gọi trực tiếp qua class
// không bao giờ gọi statc qua con đường new
public class MathUtility {

    public static final double PI = 3.14;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(" Invalid n . n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n*getFactorial(n-1);
    }
    //RECURSION - RECURSION
    //BÚP BÊ NGA - ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //             NHỎ ĐẾN 1 MỨC THÌ DỪNG LẠI
    //5! = 1.2.3.4... .5
    //5! = 4! x 5 = 5 x 4!
    //4! = 1.2.3.   4
    //4! = 3! X 4 = 4 X 3! đuổi nhau rồi
    //3!          = 3 x 2!
    //2!          = 2 x 1! DỪNG NGAY
    //N!          = N x (N-1)!
    
    //KĨ THUẬT KIỂM THỬ HỒI QUY - REGRESSION TEST
    //TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN CÓ ỔN KO
    //TẠI SAO LẠI PHẢI TEST LẠI???
    //CODE THEO 1 THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
    //1. ANH EM FIX BUG, SẼ SỬA CODE
    //2. ANH EM TỐI ƯU, CHỈNH SUS7Ả CODE ĐỂ CODE ĐẸP HƠN, CHẠY TỐT HƠN
    //   NHANH HƠN
    //3. ANH EM THÊM HÀM MỚI, MOETHOD MỚI
    
    //KHI SỬA CODE, PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
    //NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SÓT
    //NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC RUN, VÀ NHÌN MÀU ĐƯA RA
    //NẾU CODE MÀU XANH, CODE CHỈNH SỬA ỔN, VÌ THOẢ EXPECTED == ACTUAL
    //NẾU MÀU ĐỎ, CODE KO ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
    //TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KO HAO SỨC, CHÍNH XÁC MIỄN ĐỦ TEST CASE, TEST SCRIPT
    
    //TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST GỌI LÀ TEST HỒI QUY REGRESSION

    
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException(" Invalid n . n must be between 0..20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
