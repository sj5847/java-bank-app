package JavaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
	
	private String acc;
	private String name;
	private int money;
	
	public List<Account> userList = new ArrayList<>();

public Account(String acc, String name) {

		this.acc = acc;
		this.name = name;
		this.money = 0;
	}


@Override
public String toString() {
	return  acc+" "+ name+" " + money;
}




public String getAcc() {
	return acc;
}


public void setAcc(String acc) {
	this.acc = acc;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getMoney() {
	return money;
}


public void setMoney(int money) {
	this.money = money;
}


@Override
public int hashCode() {
	return Objects.hash(acc, money, name, userList);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	return Objects.equals(acc, other.acc) && money == other.money && Objects.equals(name, other.name)
			&& Objects.equals(userList, other.userList);
}










}

