package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	String name;
	@Override
	public void member1() {
		System.out.print("회원 이름 입력: ");
		name = sc.next();
		arr.add(name);
	}

	@Override
	public void member2() {
		System.out.print("총 회원 수: ");
		System.out.println(arr.size());
	}
	
}
