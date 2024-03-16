public class Test {
    public static void main(String[] args){
        Teacher teacher1=new Teacher();

        teacher1.setInformation("Nahid","Male",15748557);
        teacher1.displayInformation();


        System.out.println();
        Teacher teacher2=new Teacher();
        teacher2.setInformation("Boss","Male",15748557);
        teacher2.displayInformation();

    }
}
