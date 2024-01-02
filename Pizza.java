class Pizza {
    private String name;
    private double price;
    private int quantity;

    public Pizza(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    // Recalculate the price on the fly
    public double getRecalculatedPrice() {
        return getTotalPrice() / quantity;
    }

    // Set the total price directly
    public void setTotalPrice(double newTotalPrice) {
        if (quantity != 0) {
            this.price = newTotalPrice / quantity;
        } else {
            // Handle the case where quantity is 0 to avoid division by zero
            this.price = 0;
        }
    }
}
