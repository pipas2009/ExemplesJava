package ClassesAbstractes;

public class MeinParking {

    public static void main(String[] args) {
        Cotxe c1= new Cotxe("43959RLS", 5);
        Cotxe c2= new Cotxe("35728YSD", 5);
        Cotxe c3= new Cotxe("98543OIW", 3);

        Parking p= new Parking(5);
        p.print();

        p.entrada(c1);
        p.entrada(c2);


        p.print();

        p.sortida(c1);
        p.entrada(c3);

        p.print();
    }
}
