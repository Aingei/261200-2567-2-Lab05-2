import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob; //date of birth

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name,int year ,int month , int day){
        setName(name);
        setDob(year, month, day);
    }

    //Getter

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    //Setter

    public void setDob(int year ,int month , int day) {
        this.dob = LocalDate.of(year, month, day);    }

    public void setName(String name) {
        this.name = name;
    }

    //Method

     public void displayInfo(){
         System.out.println("name: " + getName());
         System.out.println("birthday: " + getDob());
     }

     public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == getDob().getMonth() && today.getDayOfMonth() == getDob().getDayOfMonth();
     }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

}
