/**
 * Created by Сергей on 03.03.2018.
 */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonnacciCount(13));
    }

    public int fibonnacciCount(int n)
    {
        if(n == 0) return 0;

        if (n == 1) return 1;

        else return fibonnacciCount(n -1) + fibonnacciCount(n - 2);
    }
}
