package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용해보자 2
        *   필기.
        *    5명의 자바 점수를 정수로 입력받아 합계와 평균을 실수로 구하는 프로그램 만들기
        *   */

        int []scores=new int[5];

        Scanner sc= new Scanner(System.in);

        for(int i=0; i <scores.length; i++){

            System.out.println((i+1)+"번째 학생의 자바 점수를 입력해주세요: ");
            scores[i]=sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        for(int i=0; i<scores.length; i++){
            sum += scores[i];

        }
        avg=sum/scores.length;

        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);


    }
}
