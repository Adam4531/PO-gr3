package lab06;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RachunekBankowy {

    static double rocznaStopaProcentowa = 0; //default value

    private BigDecimal saldo;

    public RachunekBankowy(BigDecimal aSaldo){
        saldo = aSaldo;
    }

    public void obliczMiesieczneOdsetki(){
        this.saldo = this.saldo.add(this.saldo.multiply(BigDecimal.valueOf(rocznaStopaProcentowa))
                .divide(BigDecimal.valueOf(12), RoundingMode.DOWN));
    }

    public static void setRocznaStopaProcentowa(double aRocznaStopaProcentowa){
        rocznaStopaProcentowa = aRocznaStopaProcentowa;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    @Override
    public String toString(){
        return "saldo = " + saldo.setScale(2, RoundingMode.DOWN) + ", roczna stopa procentowa: " + rocznaStopaProcentowa;
    }
}
