package lab07.pl.imiajd.Rozwadowski;

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int width, int height) {
        super(width,height);
        setLocation(0, 0);
        setSize(width, height);
    }

    public int getArea(){
        return super.width * super.height;
    }

    public int getPerimeter(){
        return  (2 * super.width) * (2 * super.height);
    }


}
