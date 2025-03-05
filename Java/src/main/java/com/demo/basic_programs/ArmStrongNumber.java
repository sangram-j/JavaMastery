package com.sj.demo.basic_programs;

/*Write java program to check whether number is Armstrong or not.
(A positive number is called Armstrong number if it is equal to the sum of cubes of its digits
for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.*/

public class ArmStrongNumber {//sum of cube of all digits

    public void isArmStrongNumber(int input) {//input=153
        int tempValue = input;//tempValue=153
        int sum = 0;
        while (input != 0) {
            int remainder = input % 10; //153%10=3, 15%10=5, 1%10=1
            sum = sum + (remainder * remainder * remainder); //sum=0+(3*3*3)=27, 27+(5*5*5)=152, 152+(1*1*1)=153
            input = input / 10; //153/10=15, 15/10=1, 1/10=0
        }
        if (sum == tempValue) {
            System.out.println(tempValue + " is armstrong no");
        } else {
            System.out.println(tempValue + " is not armstrong");
        }
    }

    public static void main(String[] args) {
        ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Check below no is armstrong or not");
		System.out.println("Enter the number");
		int value=sc.nextInt();*/
        //armStrongNumber.isArmStrongNumber(value);
        isASnumber(153);
		
		/*if(armStrongNumber.isArmStrongNumber(value)) {
			System.out.println(value+" is armstrong");
		}else {
			System.out.println(value+" is not armstrong");
		}*/
    }

    public static boolean isASnumber(int no) {
        int temp = no;
        int rem;
        int sum = 0;
        while (no != 0) {
            rem = no % 10;
            sum = sum + (rem * rem * rem);
            no = no / 10;
        }
        if (temp == sum) {
            System.out.println("this is armstrong no");
        } else {
            System.out.println("not armstrong no");
        }
        return false;
    }
}
