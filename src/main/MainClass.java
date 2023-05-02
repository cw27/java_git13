package main;

import java.util.Scanner;

import event.EventServiceImpl;
import member.*;

public class MainClass {
	public static void main(String[] args) {
		MemberServiceImpl ms = new MemberServiceImpl();
		EventServiceImpl es = new EventServiceImpl();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1.회원 이동 2.이벤트 이동 3.종료");
			System.out.print(">>> ");
			int num = input.nextInt();

			switch (num) {
			case 1:
				System.out.println("회원 정보");
				System.out.println("1.회원 가입 2.회원 수 보기");
				System.out.print(">>> ");
				int n1 = input.nextInt();
				if (n1 == 1) {
					ms.member1();
					break;
				} else {
					ms.member2();
				}
				break;
			case 2:
				System.out.println("이벤트 정보");
				System.out.println("1.이번달 이벤트 보기 2.모든 이벤트 보기");
				System.out.print(">>> ");
				int n2 = input.nextInt();
				if (n2 == 1) {
					es.event1();
					break;
				} else {
					es.event2();
				}
				break;
			case 3:
				System.out.println("종료");
				System.exit(1);
				break;

			}
		}
	}
}
