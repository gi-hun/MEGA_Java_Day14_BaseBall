/*
 * # ���� �߱� ����
 * 1. me�� 1~9 ������ ���� 3���� ����
 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
 * ��)
 * ���� : 1 7 3
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
				System.out.print("["+(i+1)+"]"+"1~9 �Է�: ");
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
				System.out.println("���� �ƿ�!");
				break;
			}
			else if(ball == 4)
			{
				System.out.println("���� ���!");
				break;
			}
		}
	}
}
