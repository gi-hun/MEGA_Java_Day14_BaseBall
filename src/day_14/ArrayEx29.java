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
import java.util.Random;

public class ArrayEx29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		int strike = 0;
		int ball = 0;
		
		int i = 0;
		while(i<3)
		{
			int num = ran.nextInt(10) +1;
			int check = 1;
			int j = 0;
			while(j<i)
			{
				if(num == me[j])
				{
					check--;
				}
				j++;
			}
			if(check == 1)
			{
				me[i] = num;
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
		}
		if(ball == 4)
		{
			System.out.println("포볼 출루!");
		}
	}
}
