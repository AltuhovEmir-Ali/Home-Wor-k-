abstract class Pizza {
    private String type;
    private double price;
    private double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Pizza(String type, double price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;



    }
    public abstract String Lebel();
    public  void prepare(){
        System.out.println("Пицца готовиться " + type);
    }
    public void  deliver(){
        System.out.println("Доставка пиццы: " + Lebel());
    }



}

