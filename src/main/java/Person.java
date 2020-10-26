public class Person {
    private String firstName;
    private String lastName;

    public Person(String a, String b){
        firstName = a;
        lastName = b;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String firstName){
        if (firstName.trim().length() != 0){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName){
        if (lastName.trim().length() != 0){
            this.lastName = lastName;
        }
    }

    public void doSomething(){
        System.out.println("I am watching Netflix");
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}













