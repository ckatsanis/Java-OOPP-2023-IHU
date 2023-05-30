package Lesson_10;

public class AgoraParadosi implements Asfalismeno {

    private ProsPolisi sale;
    private String fragile;
    private double securePre;
    private double wg;

    AgoraParadosi() {}

    AgoraParadosi(ProsPolisi sale, String fragile, double securePre, double wg) {
        this.sale = sale;
        this.fragile = fragile;
        this.securePre = securePre;
        this.wg = wg;
    }

    public void setSale(ProsPolisi sale) { this.sale = sale; }

    public ProsPolisi getProsPolisi() { return sale; }

    public void setFragile(String fragile) { this.fragile = fragile; }

    public String getFragile() { return fragile; }

    public void setSecurePre(double securePre) { this.securePre = securePre; }

    public double getSecurePrer() { return securePre; }

    public void setWeight(double weight) { this.wg = weight; }

    public double getWeight() { return wg; }

    @Override
    public double totalReturn() {
        return sale.price()*(double)(1/10);
    }

    @Override
    public double weight() {
        if (wg >= 1) {
            return wg/100;
        } else {
            return wg;
        }
    }

    @Override
    public String isFragile() {
        return fragile;
    }
}
