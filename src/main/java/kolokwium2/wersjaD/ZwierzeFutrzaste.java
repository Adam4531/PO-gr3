package kolokwium2.wersjaD;

import java.util.Objects;

public class ZwierzeFutrzaste extends Zwierze implements Cloneable{
    private String color;

    public ZwierzeFutrzaste(double oto_masa, double oto_dlugosc, String aColor) {
        super(oto_masa, oto_dlugosc);
        color = aColor;
    }

    public ZwierzeFutrzaste() {
        super(10,10);
        this.color = "brązowy";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String aColor) {
        color = aColor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ZwierzeFutrzaste zwierzeFutrzaste = (ZwierzeFutrzaste) super.clone();
        zwierzeFutrzaste.setColor("bardzo " + getColor());

        return zwierzeFutrzaste;
    }

    @Override
    public String toString() {
        if(getMasa() > 100){
            return "Masa jest większa od 100 i wynosi ona: " + getMasa();
        }
        return "kolokwium2.wersjaD.ZwierzeFutrzaste{masa=" + super.getMasa() + ", dlugosc=" + super.getDlugosc() + ", " +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        ZwierzeFutrzaste that = (ZwierzeFutrzaste) aO;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
