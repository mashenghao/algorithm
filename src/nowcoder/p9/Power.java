public class Power {
        public double Power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new RuntimeException("不能为0");
        }
        int ex = exponent;
        if (exponent < 0) {
            ex = -exponent;
        }
        double result = pow(base, ex);

        return exponent < 0 ? 1 / result : result;
    }

    private double pow(double base, int ex) {
        if (ex == 0) {
            return 1;
        } else if (ex == 1) {
            return base;
        } else {
            double result = pow(base, ex >> 1);
            result *= result;
            if ((ex & 1) == 1) {
                result *= base;
            }
            return result;
        }
    }
}
