package JavaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class User implements Accountln{
	public Account user;
	public List<Account> userList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	@Override
	public void create() {
		System.out.println("계좌번호");
		String acc = sc.nextLine();
//		user.setAcc(sc.nextLine());
		System.out.println("이름");
		String name = sc.nextLine();
//		user.setName(sc.nextLine());
		System.out.println("초기 입금액");
		int money = sc.nextInt();
//		user.setMoney(sc.nextInt());
		Account user = new Account(acc,name);
		user.setMoney(money);
		userList.add(user);
		sc.nextLine();
		System.out.println("계좌가 생성되었습니다.");
		
	}

	@Override
	public void show() {

		Set<Account> set = new HashSet<>();
		for(Account user : userList) {
			System.out.println(user);
		}
//		System.out.println("예금주명");
//		String name = sc.nextLine();
//		System.out.println("계좌번호");
//		String account = sc.nextLine();
//			for(Account data : userList) {
//				if(data.getName().equals(name)&&data.getAcc().equals(account)) {
//				System.out.println(data);
//			}
//				else System.out.println("해당 예금주는 존재하지 않습니다.");
//		}
//		
}

	@Override
	public void deposit() {

		System.out.println("계좌번호");
		String acc = sc.nextLine();
	
//		boolean found = false;
//		Iterator<Account> it = userList.iterator();
//		while(it.hasNext()) {
		
//		Account data = it.next();
		for(Account data: userList) {
			if(data.getAcc().equals(acc)) {
				System.out.println("입금하실 금액");
				int money = sc.nextInt();
				 sc.nextLine();
//				data.setName(name);
				 data.setMoney(data.getMoney()+ money);
				System.out.println("입금완료" + data);
//				found=true;
				break;
//				userList.add(data);
			}
			else {
				
				System.out.println("현재 고객님이 존재하지 않습니다.");
			}
		}
	
	}

	@Override
	public void withdraw() {
		
		System.out.println("계좌번호");
		String acc = sc.nextLine();
		for(Account data: userList) {
			if(data.getAcc().equals(acc)) {
				System.out.println("출금하실 금액");
				int money = sc.nextInt();
				sc.nextLine();
				if(data.getMoney()<money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					data.setMoney(data.getMoney()-money);
					System.out.println(data);
					
				}
//				data.setName(name);
//				userList.add(data);
			}
			else {
				
				System.out.println("현재 고객님이 존재하지 않습니다.");
			}
		}
		
	}

}
