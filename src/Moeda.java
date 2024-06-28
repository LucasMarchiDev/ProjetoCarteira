public class Moeda {

    public static double converterMoeda(double moedas, String tmoeda) {
        if(tmoeda == "real") {
            Real real = new Real();
            real.converterReal(moedas);
        }
        if(tmoeda == "dolar") {
            Dolar dolar = new Dolar();
            return dolar.converterReal(moedas);
        }
        if(tmoeda == "euro") {
            Euro euro = new Euro();
            return euro.converterReal(moedas);
        }
        return moedas;
    }
}
