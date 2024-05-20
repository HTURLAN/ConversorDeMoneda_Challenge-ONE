import java.util.ArrayList;
import java.util.List;

public class ListaOpciones {
    ParesDeMonedas par01 = new ParesDeMonedas("ARS","USD");
    ParesDeMonedas par02 = new ParesDeMonedas("USD","ARS");
    ParesDeMonedas par03 = new ParesDeMonedas("USD","BRL");
    ParesDeMonedas par04= new ParesDeMonedas("BRL","USD");
    ParesDeMonedas par05= new ParesDeMonedas("COP","USD");
    ParesDeMonedas par06= new ParesDeMonedas("USD","COP");

    public ParesDeMonedas getPar01() {
        return par01;
    }

    public ParesDeMonedas getPar02() {
        return par02;
    }

    public ParesDeMonedas getPar03() {
        return par03;
    }

    public ParesDeMonedas getPar04() {
        return par04;
    }

    public ParesDeMonedas getPar05() {
        return par05;
    }

    public ParesDeMonedas getPar06() {
        return par06;
    }
}
