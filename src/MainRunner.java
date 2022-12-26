public class MainRunner {
    public static void main(String[] args) {
        System.out.println(standardGreeting());             //K
        System.out.println(ComputerLogic.getIdNum());       //K
        ComputerLogic.newIdNum();                           //K
        System.out.println(ComputerLogic.getIdNum());       //K
        ComputerLogic.setGeneration();                      //K
        System.out.println(ComputerLogic.getGeneration());  //K
        System.out.println(ComputerLogic.codeNum());        //K

        System.out.println(Contractor.contractorRequirements());    //L

        Contractor contractor1 = new Contractor("Stryder", 24);
        System.out.println(contractor1.contractorInfo());

    }

    public static String standardGreeting() {
        return "Hello there!";
    }
}
