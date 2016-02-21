package meenu.models;

/**
 *
 * @author Steffen
 */
public class Quantity {

    public String measurementUnit;
    public float amount;

    public Quantity(String unit, float amount) {
        measurementUnit = unit;
        this.amount = amount;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public float getAmount() {
        return amount;
    }

    public boolean setAmount(float amount) {
        this.amount = amount;
        return (this.amount > 0);
    }

    public void addAmount(float amount) {
        this.amount += amount;
    }

    public boolean removeAmount(float amount) {
        this.amount -= amount;
        return (this.amount > 0);
    }
}
