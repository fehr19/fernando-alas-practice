package employee_app.com.hr.personnel;

public class CommissionedEmployee {
    //Variables
    private double commissionRate;
    private double[] monthlySales;

    //Constructor
    public CommissionedEmployee(double commissionRate, double[] monthlySales) {
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }


    //Methods
    public double computeMonthlyCompensation() {
        double monthlyCompensation = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            monthlyCompensation += (monthlySales[i] * commissionRate);
        }
        return monthlyCompensation;
    }

    //Setters and Getters
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double[] getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double[] monthlySales) {
        this.monthlySales = monthlySales;
    }
}
