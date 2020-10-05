package Lab1;

class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }
    String getDough() {
        return this.dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    String getSauce() {
        return this.sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    String getTopping() {
        return this.topping;
    }
}
