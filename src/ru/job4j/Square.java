package ru.job4j;

public class Square {
        public static double square(int p, int k) {
            double h = p/(2*(k+1));
            return (h*k)*h;
        }

        public static void main(String[] args) {
            double result1 = square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        }
}
