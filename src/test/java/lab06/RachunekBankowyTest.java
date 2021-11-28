package lab06;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RachunekBankowyTest {

    @Test
    public void shouldCalculateCorrectSaldoWith5PercentAfterMonth(){
        RachunekBankowy rachunekBankowy = new RachunekBankowy(BigDecimal.valueOf(1000));
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        rachunekBankowy.obliczMiesieczneOdsetki();
        assertEquals(BigDecimal.valueOf(1004.16), rachunekBankowy.getSaldo());
    }

}