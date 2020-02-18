public class Ans11 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getDetails());
        SBI sbi = new SBI();
        System.out.println(sbi.getDetails());
        BOI boi = new BOI();
        System.out.println(boi.getDetails());
        ICICI icici = new ICICI();
        System.out.println(icici.getDetails());
    }

}

class Bank{
    float generalRateOfInterest = 4f;
    public float getDetails() {
        return generalRateOfInterest;
    }

}

class BOI extends Bank{
    float rateOfInterestBOI = 2.5f;

    @Override
    public float getDetails() {
        return rateOfInterestBOI;
    }
}

class SBI extends Bank{
    float rateOfInterestSBI = 3.5f;

    @Override
    public float getDetails() {
        return rateOfInterestSBI;
    }

}

class ICICI extends Bank{
    float rateOfInterestICICI = 1.5f;

    @Override
    public float getDetails() {
        return rateOfInterestICICI;
    }

}
