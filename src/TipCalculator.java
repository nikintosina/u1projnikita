public class TipCalculator {
    private float totalBill;
    private int tipPercentage;
    private int numberOfPeople;

    public TipCalculator(float totalBill, int tipPercentage, int numberOfPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    public float calculateTotalTip() {
        return totalBill * tipPercentage / 100;
    }

    public float calculateTotalBill() {
        return totalBill + calculateTotalTip();
    }

    public float calculateTipPerPerson() {
        return calculateTotalTip() / numberOfPeople;
    }

    public float calculateTotalPerPerson() {
        return calculateTotalBill() / numberOfPeople;
    }
}
