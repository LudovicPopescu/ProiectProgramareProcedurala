package main;

public class Mediu {
int x=0;// variabila globala
void method1() {
	int Y = x;//Y=1;
}
void method2() {
	int z=1;//variabila locala metodei method2
	System.out.println(x);
	x=1+z;//y este necunoscut-> deci nu se poate face aceasta operatie
	System.out.println(x);
	
    }

}
