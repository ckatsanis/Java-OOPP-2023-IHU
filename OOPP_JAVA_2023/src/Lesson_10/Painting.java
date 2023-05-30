package Lesson_10;

public class Painting implements ProsPolisi {

    private double cents;
    private String description;
    private String texnotropoia;

    Painting() {}

    Painting(String description, double cents, String texnotropoia) {
        this.cents = cents;
        this.description = description;
        this.texnotropoia = texnotropoia;
    }
    public void setCents(double cents) { this.cents = cents; }

    public Double getCents() { return cents; }

    public void setDescription(String description) { this.description = description; }

    public String getDescription() { return description; }

    public void setTexnotropoia(String texnotropoia) { this.texnotropoia = texnotropoia; }

    public String getTexnotropoia() { return texnotropoia; }

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
