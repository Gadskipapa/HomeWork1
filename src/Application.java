import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Application theApp = new Application();
        theApp.runTheApp();
    }

    public void runTheApp() {
        Calculator calc = new Calculator();
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int firstNumb = scan.nextInt();
        System.out.println("Введите второе число");
        int secondNumb = scan.nextInt();
        System.out.println("Введите операцию. 1 - сложение; 2 - разность; 3 - умножение; 4 - деление.");
        String oper = scan.next();
        switch (oper) {
            case "1" :
                System.out.println(calc.calculateSum(firstNumb, secondNumb));
                break;
            case "2" :
                System.out.println(calc.calculateMinus(firstNumb, secondNumb));
                break;
            case "3" :
                System.out.println(calc.calculateMnoj(firstNumb, secondNumb));
                break;
            case "4" :
                System.out.println(calc.calculateDelen(firstNumb, secondNumb));
                break;
            default :
                System.out.println("Педали попутал?");
                runTheApp();
        }
    }
}
