public class Pepperoni extends Pizza {
    private boolean isSpicy;

    public Pepperoni(double price, double weight, boolean isSpicy) {
        super("Пепперони", price, weight);
        this.isSpicy = isSpicy;

    }
    @Override
    public String Lebel() {
        return "\nВид Пиццы: " + getType() + "\n" + "Ценна: " +getPrice()+ "\n" + "Вес: " + getWeight()+"\n" + "Острая?:" + (isSpicy ? "Да" : "Нет") ;

}
}



