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

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
