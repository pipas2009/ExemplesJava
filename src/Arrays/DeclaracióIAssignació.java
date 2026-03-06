package Arrays;

public class DeclaracióIAssignació {
    static void main(String[] args) {
        int[] num = {1, 5, 9, 3, 22, 55, 78, 4, 0};
        num[2]= 3;
        System.out.printf("%s", num[2]);

        int num2= num[2];

        int x= num.length;

        for(int i=0; i<num.length; i++){
            System.out.printf("Casella d%: %i.%n", i, num[i]);
        }
    }
}
