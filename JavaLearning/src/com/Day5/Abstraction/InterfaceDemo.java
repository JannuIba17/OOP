package com.Day5.Abstraction;
interface Payable{
    void generatePayslip();
}
interface Bonus{
    void calculateBonus();
}

class Contractor implements Payable,Bonus{

    @Override
    public void generatePayslip() {
        System.out.println("Contractor salary will be calculated on day basis");
    }

    @Override
    public void calculateBonus() {

    }
}
class FullTimeEmployee implements Payable{
    public void generatePayslip(){
        System.out.println("Full time employees salary will be calculated on month basis");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payable contractor=new Contractor();
        contractor.generatePayslip();
        Payable FTE=new FullTimeEmployee();
        FTE.generatePayslip();
    }
}
