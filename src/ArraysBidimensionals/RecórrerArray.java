package ArraysBidimensionals;

public class RecórrerArray {
    static void main(String[] args) {
        String[][] array = {
                {"A", "B", "c", "D"},
                {"E", "F", "G", "H"}
        };
        //files
        System.out.println("Length: "+ array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%d, %d: %s.\n",i, j, array[i][j]);
            }
        }
        //columnes
        System.out.println("Length: "+ array.length);
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%d, %d: %s.\n",i, j, array[i][j]);
            }
        }
        // diagonal descendent
        System.out.println("Length: "+ array.length);
        for(int i=0, j=0; i<array.length; i++, j++) {
            System.out.printf("%d, %d: %s.\n", i, j, array[i][j]);
        }
    }
}
