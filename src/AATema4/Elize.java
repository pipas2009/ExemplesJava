package AATema4;

import static processing.core.PApplet.cos;
import static processing.core.PApplet.sin;
import static processing.core.PConstants.PI;
import static processing.core.PConstants.TWO_PI;

public class Elize extends PoligonIrregular{

    Elize(int n, Punt2D centre, float radi1, float radi2) {
        super(n);
        float angle = 3 * PI / 2;
        for (int i = 0; i < n; i++) {
            if(i%5==0) {
                float x = centre.x + radi1 * cos(angle);
                float y = centre.y + radi1 * sin(angle);
                char c = Integer.toString(i).charAt(0);
                Punt2D p = new Punt2D(c, x, y);
                this.setAt(i, p);
                angle += TWO_PI / n;
            }else{
                float x = centre.x + radi2 * cos(angle);
                float y = centre.y + radi2 * sin(angle);
                char c = Integer.toString(i).charAt(0);
                Punt2D p = new Punt2D(c, x, y);
                this.setAt(i, p);
                angle += TWO_PI / n;
            }
        }
    }
}