package AATema4;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;
import static processing.core.PConstants.TWO_PI;

public class SolR extends PoligonIrregular{

    SolR(int n, Punt2D centre, float radi1, float radi2) {
        super(n);
        float angle = 3 * PI / 2;
        for (int i = 0; i < n; i++) {
            float radi = i % 3 == 0 ? radi2 : radi1;
            float x1 = centre.x + radi * cos(angle);
            float y1 = centre.y + radi * sin(angle);
            char c = Integer.toString(i).charAt(0);
            Punt2D p = new Punt2D(c, x1, y1);
            this.setAt(i, p);
            angle += TWO_PI / n;
        }
    }
}
