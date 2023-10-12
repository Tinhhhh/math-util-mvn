package com.vvt.birdservice.main;


import com.vvt.birdservice.core.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        int n = 0; //hàm ý kiểm tra 0!
        long expected = 1;// hàm ý rằng,hy vọng
        long actual = MathUtility.getFactorial(n);
        //so sánh giữa expected == actual hay k
        System.out.println(n + "!-> expected: " + expected + " actual: " + actual);

        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n); //5!
        System.out.println(n + "! -> expected: " + expected + "! actual: " + actual);
    }
}

// thợ code viết code phải có trách nhiện test code của mình khi viết hàm , class
// có 3 cách test code 
//1: in ra màn hình kết quả xử lí hàm
//2: in ra log file
//3 dùng đồ chời bên ngoài đem vào - thư viện đem vào
// nhưng dù thế nào thì cũng phải gồm 3 công việc :
// {bộ data đưa vào và giá trị kỳ cọng (test case)}
//- thiết kế test case
// - thực thi test case gọi là test run
// - ghi bug nếu có bug, log bug
//( thiếu)
// MỘT TEST CASE GỒM NHỮNG INFO SAU:
// TEST CASE ID | TEST CASE DESCRIPTION | STEPS/ PROCEDURES
// EXPECTED RESULT | STATUS (PASSED | FAILED)
//TEST CASE LÀ TÌNH HUỐNG XÀI APP VỚI BỘ DATA ĐƯA VÀO VÀ GIÁ TRỊ KÌ VỌNG APP PHẢI TRẢ VỀ
// GIỜ TA MÚN TEST HÀM getF() ta phải thiết kế các test case col xem
// hàm trả về đúng k

