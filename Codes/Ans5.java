

public class Ans5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        showingCopyConstructor obj = new showingCopyConstructor("Shiva","Tiwari");
        showingCopyConstructor obj1 = new showingCopyConstructor(obj);
        System.out.println(obj1.toString());

        // using clonable
        showingClone clone = new showingClone();
        clone.name="Shiva";
        showingClone clone2 = (showingClone) clone.clone();
        System.out.println(clone2.name);
    }

}

class showingCopyConstructor{
    public String firstName = "Shiva";
    public String lastName = "Tiwari";
    showingCopyConstructor(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //this is copy constructor
    showingCopyConstructor(showingCopyConstructor copyConstructor){
        System.out.println("inside copy constructor");
        firstName = copyConstructor.firstName;
        lastName = copyConstructor.lastName;
    }

    @Override
    public String toString() {
        return firstName + lastName;
    }
}

class showingClone implements Cloneable {
    String name;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
