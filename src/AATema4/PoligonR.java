package AATema4;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.TWO_PI;

public class PoligonR extends PoligonIrregular{

    PoligonR(int n, Punt2D centre, float radi){
        super (n);
        float angle=0;
        for(int i=0; i<n; i++){
            float x = centre.x + radi * cos(angle);
            float y = centre.y + radi * sin(angle);
            char c= Integer.toString(i).charAt(0);
            Punt2D p = new Punt2D(c, x, y);
            this.setAt(i, p);
            angle+=TWO_PI/n;
        }
    }
}
