package java8_Concepts.OptionalClass;

public class Insurance {

    private String policyNumber;
    private String policyHolderName;
    private String providerName;
    private String type; // e.g., Health, Life, Car, Home
    private double coverageAmount;
    private double premiumAmount;
    private String startDate;
    private String endDate;
    private boolean isActive;

    // Constructor
    public Insurance(String policyNumber, String policyHolderName, String providerName,
                     String type, double coverageAmount, double premiumAmount,
                     String startDate, String endDate, boolean isActive) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.providerName = providerName;
        this.type = type;
        this.coverageAmount = coverageAmount;
        this.premiumAmount = premiumAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getPolicyHolderName() { return policyHolderName; }
    public void setPolicyHolderName(String policyHolderName) { this.policyHolderName = policyHolderName; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getCoverageAmount() { return coverageAmount; }
    public void setCoverageAmount(double coverageAmount) { this.coverageAmount = coverageAmount; }

    public double getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(double premiumAmount) { this.premiumAmount = premiumAmount; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName +
               ", providerName=" + providerName + ", type=" + type + ", coverageAmount=" + coverageAmount +
               ", premiumAmount=" + premiumAmount + ", startDate=" + startDate + ", endDate=" + endDate +
               ", isActive=" + isActive + "]";
    }
}
