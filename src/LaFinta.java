public class LaFinta extends Pizza{
    private boolean hasMushrooms;

    public LaFinta( double price, double weight,boolean hasMushrooms) {
        super("Ла Финта", price, weight);
        this.hasMushrooms = hasMushrooms;
    }

    @Override
    public String Lebel() {
        return "\nТип пиццы: " + getType() + "\n" + "Ценна" + getPrice() + "\n" + "Вес: " + getWeight() + "\n" + "C грибами?:" + (hasMushrooms ? "ДА":"НЕТ");
    }
}
