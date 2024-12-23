package ua.kyrylo.bieliaiev;

public class SumCalculator {

    public int sum(int n) {
        if (n < 1) throw new IllegalArgumentException();

        return (1 + n) * n / 2;
    }
}
