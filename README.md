package com.company;

public class Main {

    public static void main(String[] args) {
        {
            System.out.print("Факториал:");
            System.out.print(fact(6) + "\n");
        }
        {
            System.out.print("Степень числа:");
            System.out.print(pow(3, 2) + "\n");
        }
        {
            System.out.print("Кол-во ушей:");
            System.out.print(bunnyEars2(2) + "\n");
        }
    }

    public static int fact(int n) {
        if (n == 1)
            return 1;
        return fact(n - 1) * n;
    }

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }

    public static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return rabbit;
        }
        return (rabbit % 2 == 1) ? 2 + bunnyEars2(rabbit - 1) : 3 + bunnyEars2(rabbit - 1);

    }
}
