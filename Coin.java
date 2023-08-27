package assingment_8;

public class Coin {
    private double coinValue;
    private String coinName;
    public Coin(double coinValue , String coinName){
        this.coinName = coinName;
        this.coinValue = coinValue;
    }
    public double getCoinValue(){
        return coinValue;
    }
}
