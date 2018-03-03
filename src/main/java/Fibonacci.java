/**
 * Created by Сергей on 03.03.2018.
 */
public class Fibonacci {

    int position;
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciCount(fibonacci.position));
    }

    public int fibonacciCount(int n)
    {
        if(n < 0) throw  new IllegalArgumentException();

        if(n == 0) return 0;

        if (n == 1) return 1;

        else return fibonacciCount(n -1) + fibonacciCount(n - 2);


    }
}
