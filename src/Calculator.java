public class Calculator {

    private int first;
    private int second;

    public Calculator() {

    }

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int calculateSum() {
        int sum = this.first + this.second; // в итоговом калькуляторе методы по умолчанию излишни
        return sum;                         // но решил оставить для наглядности
    }

    public int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int calculateMinus() {
        int sum = this.first - this.second;
        return sum;
    }

    public int calculateMinus(int a, int b) {
        int sum = a - b;
        return sum;
    }

    public int calculateMnoj() {
        int sum = this.first * this.second;
        return sum;
    }

    public int calculateMnoj(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public int calculateDelen() {
        int sum = this.first / this.second;
        return sum;
    }

    public int calculateDelen(int a, int b) {
        int sum = a / b;
        return sum;
    }

}


