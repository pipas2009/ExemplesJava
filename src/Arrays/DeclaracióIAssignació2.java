package Arrays;

public class DeclaracióIAssignació2 {
    static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 22, 55, 78, 4, 0};

        for(int i=num.length-1; i>0; i--){
            System.out.printf("Casella d%: %i.%n", i, num[i]);
        }
    }
}
