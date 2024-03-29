package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 사용목적을 이해할 수 있다. */
        /* 필기.
        *   배열이란?
        *   동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        *   배열은 heap 영역에 new 연산자를 이용하여 할당
        *   */

        /* 필기.
        *   배열 사용 이유
        *   만약 배열을 사용하지 않으면 변수를 여럿 사용해야함
        *   1. 연속된 메모리 공간으로 관리할 수 없다.
        *   2. 반복문 이용한 연속 처리가 불가능하다.
        *   */

        /* 목차. 배열의 선언 및 할당 */
        int[]arr=new int[5];

        System.out.println("arr="+arr);

        /* 필기. 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)를 이용해 접근 */
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

       /* 필기.
       *   배열의 사용방법
       *    1. 배열의 선언
       *    2. 배열의 할당
       *    3. 배열의 인덱스 공간에 값 대입
       *    */

        /* 목차.1. 배열의 선언 */

        /* 필기
        *   자료형[] 변수명;
        *   자료형 변수명[];
        *   이런식으로 선언을 할 수 있다.
        *   */
        int num2;
        num2=10;

        /* 필기. 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것 */ //변수는 값이었다면 배열은 주소라는 것의 차이
        int[]num;       //[] 배열이라는 뜻, 즉 정수형태의 배열이라는 것
        num=new int[5];

        char[]cnum;
//        int num1[];       되기는 하는데 잘안함

        /* 필기.
        *   선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        *   new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
        *   발생한 주소를 레퍼런스 변수(참조형)에 저장하고 이를 참조해
        *   사용하므로 참조자료형(reference type)이라고 한다.
        *    */

        /* 필기. 배열 할당 시에 반드시 크기를 지정해줘야 함. */
        int[]iarr;      //선언
//        iarr=new int[]; //크기를 지정해줘야함
        iarr=new int[5];    //new를 쓰는 것은 heap 메모리에 공간을 만들어 준다는 뜻

        /* 필기. 위의 선언과 할당을 동시에 할 수 있다. */

        int age1=1;
        int age2=2;
        int age3=3;
        int asldkfjslkdfjlsfj=4;
        int slafkjskfdslkf=5;

        int[] age=new int[5];

        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;      //int age1=1; age2=2; asldkfjslkdfjlsfj=4; 즉, 규칙이 없다. 내가 마음대로 이름을 비슷하게 age1 age2 age3 로 생성했을뿐.

        System.out.println("age[0] = " + age[0]);
        System.out.println("age[1] = " + age[1]);
        System.out.println("age[2] = " + age[2]);
        System.out.println("age[3] = " + age[3]);
        System.out.println("age[4] = " + age[4]);

        /* 필기.
        *   값의 형태별 기본값
        *   정수:0
        *   실수:0.0
        *   논리:false
        *   문자:\u0000
        *   참조:null
        *   */

        /*필기.
        *  자바에서 지정한 기본값 외의 값으로 초기화 하고 싶으면 블럭({})을 이용한다.
        *   블럭({}) 을 사용하는 경우에는 new를 사용하지 않아도 되며,
        *   값의 갯수만큼 자동으로 크기가 설정된다.
        *    */

        int[]iarr3=new int[5];
        iarr[0]=10;
        iarr[1]=20;
        iarr[2]=30;
        iarr[3]=40;
        iarr[4]=50;

        int[] iarr4={10,20,30,40,50};
        int[] iarr5= new int[]{10,20,30,40,50,60,70};

        System.out.println("iarr4 길이" + iarr4.length);
        System.out.println("iarr5 길이= " + iarr5.length);

        for(int i=0; i< iarr5.length; i++){

            System.out.println("iarr5[" + i +"] ="+iarr5[i]);
        }
        //문자열 배열을 만들어보자.
        String[]sarr={"apple","banana","grape"};
        for(int i=0; i< sarr.length;i++){
            System.out.println("sarr[" +i+ "] = " + sarr[i]);
        }
    }
}
