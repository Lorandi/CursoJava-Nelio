package entities;

public class OutsorceEmployee extends Employee {
    public Double adicionalCharge;

    public OutsorceEmployee() {
    }

    public OutsorceEmployee(String name, Integer hours, Double valuePerHour, double adicionalCharge) {
        super(name, hours, valuePerHour);
        this.adicionalCharge = adicionalCharge;
    };

    @Override
    public double payment(){
        return super.payment() + adicionalCharge * 1.1;
    }
}
