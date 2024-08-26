public class test {
    public static void main(String[] args) {
        int sum = 0;
        int j = 17;
        while(j %10 != 0) {
            sum += j;
            j++;
        }
        System.out.println("j:-->" + j + ", sum:" + sum);
    }
}
