public class Ans9 {
    public static void main(String[] args) {
        for (SampleEnum sampleEnum : SampleEnum.values()) {
            System.out.println("Price of house " + sampleEnum + " is " + sampleEnum.getPrice() );
        }
    }
}

enum SampleEnum{
    house1("10000"),house2("20000"),house3("300000");

    String  price;

    SampleEnum(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
