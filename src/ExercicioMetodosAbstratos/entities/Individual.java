package ExercicioMetodosAbstratos.entities;

public class Individual extends TaxPayer {

    public Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double baseTax;
        if (getAnualIncome() < 20000.00) {
            baseTax = getAnualIncome() * 0.15;
        }
        else {
            baseTax = getAnualIncome() * 0.25;
        }
        baseTax -= getHealthExpenditures() * 0.5;
        if (baseTax < 0) {
            baseTax = 0;
        }
        return baseTax;
    }
}