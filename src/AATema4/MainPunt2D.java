package AATema4;

public class MainPunt2D {

    static void main(String[] args) {

        Punt2D p1, p2,p3;

        p1=new Punt2D('O');
        p2= new Punt2D('A',200,100);
        p3= new Punt2D('C',100,400);

        p1.print();
        p1.setXY(50,300);
        p1.print();

        p2.setNom('B');
        p2.print();

        p3.print();

    }

}
