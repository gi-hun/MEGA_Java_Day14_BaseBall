/*
 * # 숫자 야구 게임
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */
package day_14;

import java.util.Scanner;

public class ArrayEx29_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		int strike = 0;
		int ball = 0;
		
		while(true)
		{
			int i = 0;
			while(i<3)
			{
				System.out.print("["+(i+1)+"]"+"1~9 입력: ");
				int data = sc.nextInt();
				
				int check = 1;
				int j = 0;
				while(j<i)
				{
					if(data == me[j])
					{
						check--;
					}
					j++;
				}
				if(check == 1)
				{
					me[i] = data;
					i++;
				}
			}
			
			System.out.print("com= ");
			for(int j=0;j<3;j++)
			{
				System.out.print(com[j]+" ");
			}
			System.out.println();
			
			System.out.print("me=  ");
			for(int j=0;j<3;j++)
			{
				System.out.print(me[j]+" ");
			}
			System.out.println();
			
			
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					if(j!=k)
					{
						if(com[j] == me[k])
						{
							ball++;
						}
					}
					else if(j==k)
					{
						if(com[j] == me[k])
						{
							strike++;
						}
					}
				}
			}
			
			System.out.println();
			System.out.println(strike+"strike");
			System.out.println(ball+"ball");
			
			if(strike == 3)
			{
				System.out.println("삼진 아웃!");
				break;
			}
			else if(ball == 4)
			{
				System.out.println("포볼 출루!");
				break;
			}
		}
	}
}
