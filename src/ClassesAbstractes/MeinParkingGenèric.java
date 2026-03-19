package ClassesAbstractes;

public class MeinParkingGenèric {
    public static void main(String[] args) {
        PrkingGenèric<Cotxe> parkCotxes= new PrkingGenèric<>(5);
        parkCotxes.entrada(new Cotxe("349874HJH",4));

        PrkingGenèric<Bicicleta> parkBicis= new PrkingGenèric<>(10);
        parkBicis.entrada(new Bicicleta("897424UST", "Caldentei"));
    }
}
