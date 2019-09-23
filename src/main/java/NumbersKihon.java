import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        return 2147483647;
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        return -2147483648;
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {
        return a%b;
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        return Double.MAX_VALUE;
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        return Double.MIN_VALUE;
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
        return Double.isNaN(a);
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
        return Double.isInfinite(a);
    }
}
