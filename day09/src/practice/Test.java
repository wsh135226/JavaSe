package practice;

public class Test {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        for (float y = 1.5f; y > -1.5f; y -= 0.1f) {
            for (float x = -1.5f; x < 1.5f; x += 0.05f) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) < 0.0f) {
                    //System.err.print:输出红色
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.err.print("\n");
        }
    }
}
