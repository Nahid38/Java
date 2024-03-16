public class Teacher {
    String name,gender;
    int phone;

    void setInformation(String n,String g,int p){
        name=n;
        gender=g;
        phone=p;
    }
    void displayInformation(){
        System.out.println("name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone Number :"+phone);
    }
}
