package org.bank;

public class BankInfo extends AxisBank {
public void saving() {
System.out.println("savings:4%");
}
public void fixed() {
System.out.println("Fixed: 6%");
}
public static void main(String[] args) {
	BankInfo b=new BankInfo();
	b.saving();
	b.fixed();
	b.deposit();
}
}
