/*
    Homework 3
    Jason Chen
    112515450
 */
public class Emirp {
    public static void main(String[] args){
        int printed = 0, i = 12;
        do{
            i++;
            if(prime_condition(i) && prime_condition(backwards_n(i))){
                if(non_palindrome(i)){
                    System.out.print(i + " ");
                    printed++;
                    if(printed % 10 == 0){
                        System.out.print("\n");
                    }
                }
            }
        }while(printed != 100);
    }
    public static boolean prime_condition(int n){
        boolean is_prime = true;
        int counter = 1;
        do{
            counter++;
            if(n % counter == 0){
                is_prime = false;
                break;
            }
        }while(counter != n / 2);
        return is_prime;
    }
    public static boolean non_palindrome(int n){
        return(backwards_n(n) != n);
    }
    public static int backwards_n(int n){
        int i = 0;
        do{
            i *= 10;
            i += n % 10;
            n /= 10;
        }while(n != 0);
        return i;
    }
}
