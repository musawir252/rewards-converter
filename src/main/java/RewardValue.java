public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }
    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue / 0.0035;
        }
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

}
