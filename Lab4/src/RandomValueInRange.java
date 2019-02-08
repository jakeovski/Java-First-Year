
public class RandomValueInRange {
    public static void main(String[] args) {
        System.out.println(random(10,1));
    }
    public static int random(int a, int b) {
        int x = 0;
        if ( a > b) {
            int range = a - b + 1;
            x = (int)(Math.random() * range) + b;
        }
        int range = b - a + 1;
        x = (int)(Math.random() * range) + a;
        return x;
    }
}
