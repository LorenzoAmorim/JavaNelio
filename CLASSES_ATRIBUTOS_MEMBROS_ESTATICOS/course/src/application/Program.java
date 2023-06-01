package CLASSES_ATRIBUTOS_MEMBROS_ESTATICOS.course.src.application;

import java.util.Locale;
import java.util.Scanner;

import CLASSES_ATRIBUTOS_MEMBROS_ESTATICOS.course.src.entities.Triangle;

public class Program {

	//RESOLVENDO UM PROBLEMA SEM A ORIENTAÇÃO A OBJETOS
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//definindo as variáveis das medidas dos lados dos triângulos x e y
		Triangle x, y;
		//instanciar/criar o objeto
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		/*A partir de agora, a função irá ler um número double (sc.nextDouble()) e irá
		guardar num atributo "a" do objeto "x" = x.a*/
		//x.a - para acessar o atributo "a" da classe Triangle
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		//a variável areaX recebe o objeto com o cálculo da fórmula "x.area" da classe triangle
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		sc.close();
		
	}

}