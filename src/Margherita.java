public class Margherita extends Pizza{
    private boolean inMeat;

    public Margherita( double price, double weight,boolean inMeat) {
        super("Маргарита",price, weight);
        this.inMeat = inMeat;
    }

    @Override
    public String Lebel() {
        return "\nТип пиццы: " + getType() + "\n" + "Ценна" + getPrice() + "\n" + "Вес: " + getWeight() + "\n" + "C мясом?:" + (inMeat ? "ДА":"НЕТ");
    }
}
