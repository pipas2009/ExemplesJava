public class DiesDeLaSetmana {
    public static enum Dies_Setmana {Dl, Dm, Dc, Dj, Dv, Ds, Dg}

    static void main(String[] args) {
        Dies_Setmana d = Dies_Setmana. Dl;
        switch (d){
            case Dl : case Dm: case Dc: case Dj: case Dv:
                System.out.println("Dia faner");
                case Ds: case Dg:
                System.out.println("Dia festiu");

        }

    }
}
