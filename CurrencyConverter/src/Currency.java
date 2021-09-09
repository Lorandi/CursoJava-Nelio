public class Currency {


    public static final double  IOF = 0.06;

    public static double exchange;

    public static double amountDollar;

    public static double convert( double exchange, double amountDollar){
        return exchange * amountDollar + (exchange * amountDollar * IOF);
    }

}
