package Lesson_10;

public class Photograph implements ProsPolisi {

    private double cents;
    private String description;
    private String haveColor;

    Photograph() {}

    Photograph(String description, double cents, String  haveColor) {
        this.cents = cents;
        this.description = description;
        this.haveColor = haveColor;
    }

    public void setCents(double cents) { this.cents = cents; }

    public Double getCents() { return cents; }

    public void setDescription(String description) { this.description = description; }

    public String getDescription() { return description; }

    public void setColor(String haveColor) { this.haveColor = haveColor; }

    public String getHaveColor() { return haveColor; }

    @Override
    public double price() {
        if (cents >= 1) {
            return cents/1;
        } else {
            return cents;
        }
    }

    @Override
    public double pricePre(double pre) {
        return cents*(pre/100);
    }

    @Override
    public String toString() {
        return this.getClass() + " have price " + this.price() + " with " + this.pricePre(20) + "%";
    }
}
