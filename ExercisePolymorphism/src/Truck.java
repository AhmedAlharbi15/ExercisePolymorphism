class Truck implements Vehicle {
    private String type;
    private int weeks;
    private final double weeklyRate = 500.0;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeklyRate * weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $" + weeklyRate);
        System.out.println("Rental Cost: $" +calculateRentalCost());
    }
}