import java.util.Scanner;
class Main {
  
  public static void main(final String[] args) {
    Scanner s = new Scanner(System.in);
    double a,b,c;
    System.out.println("Программа решает уравнение: ax^2+bx+c=0");
    System.out.println("Введите значение a: ");
    a = s.nextDouble();
    System.out.println("Введите значение b: ");
    b = s.nextDouble();
    System.out.println("Введите значение c: ");
    c = s.nextDouble();

    double D = Math.pow(b,2) - 4*a*c;

    if (D<0){
      System.out.println("Дискриминант меньше нуля, корней нет");
    }else if(D==0){
      double x;
      x = -b / (2 * a);
      System.out.println("Дискриминант равен нулю, корень уравнения: " + x);
    }else{
      double x1,x2;
      x1 = (-b + Math.sqrt(D))/(2*a);
      x2 = (-b - Math.sqrt(D))/(2*a);
      System.out.println("Дискриминант больше нуля и имеет два корня: x1 = "+x1 +" , x2 = "+ x2);
    }
  }
}
