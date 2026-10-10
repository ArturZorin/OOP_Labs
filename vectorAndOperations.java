

public class vectorAndOperations {
    static class vector {
        private double i;
        private double j;
        private double k;

        public vector(double i, double j, double k) {
            this.i = i;
            this.j = j;
            this.k = k;
        }

        public double getI() {
            return i;
        }

        public void setI(double i) {
            this.i = i;
        }

        public double getJ() {
            return j;
        }

        public void setJ(double j) {
            this.j = j;
        }

        public double getK() {
            return k;
        }

        public void setK(double k) {
            this.k = k;
        }
    }


    public static vector plus(vector v1, vector v2) {
        return new vector(v1.i + v2.i, v1.j + v2.j, v1.k + v2.k);
    }

    public static vector minus(vector v1, vector v2) {
        return new vector(v1.i - v2.i, v1.j - v2.j, v1.k - v2.k);
    }

    public static double scalarMultiply(vector v1, vector v2) {
        return v1.i * v2.i + v1.j * v2.j + v1.k * v2.k;
    }

    public static vector multiply(vector v, double scalar) {
        return new vector(v.i * scalar, v.j * scalar, v.k * scalar);
    }


    public static void main() {
        vector v = new vector(1.0,1.0,1.0);
        vector multiplyOn3 = multiply(v, 3.0) ;
        System.out.printf("3*vector: %.1f, %.1f, %.1f", multiplyOn3.getI(), multiplyOn3.getJ(), multiplyOn3.getK());
    }
}
