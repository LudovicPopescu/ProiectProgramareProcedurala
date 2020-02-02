package main;

public class Asignare {

	public static void main(String[] args) {
		int a=3;
		int b=(a=2)*a;
		int c=b*(b=5);
		System.out.println(a=++a);
		System.out.println(b=++b);
		System.out.println(c=+c);

	}

}
