import java.time.LocalDate;

public class Admin extends User {
    public Admin(String name,int year,int month , int day){
        super(name,year,month,day);
    }

    //Override
     public void displayInfo(){
         super.displayInfo();
         System.out.println("User type: admin.");
     }

    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - getDob().getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

     //OverLoading
     public void displayInfo(boolean full){

        if(full){
            displayInfo();
            System.out.println("Today's Date: " + LocalDate.now());
        }else{
            System.out.println("Admin Name: " + this.name);

        }
     }
 }