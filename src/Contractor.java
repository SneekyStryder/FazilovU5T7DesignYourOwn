public class Contractor {
    private String name;
    private int age;
    private int idStart;

    public Contractor(String name, int age) {
        this.name = name;   //E
        this.age = age;
        idStart = ComputerLogic.getIdNum();
        ComputerLogic.newIdNum();
        ComputerLogic.setGeneration();
    }

    private String getIdNum() {
        idStart = ComputerLogic.getIdNum(); //H
        String randomCode = ComputerLogic.codeNum();
        return idStart + "--" + randomCode;
    }

    public String contractorInfo() {
        String info = "Contractor Name: " + name + "\nAge: " + age + "\nID Number: " + getIdNum();  //F
        info += "\n" + contractorRequirements();    //G
        return info;
    }

    public static String contractorRequirements() {
        return "Minimum Age: 21\nCombat Experience: 5+ Years\nGeneration: " + ComputerLogic.getGeneration();    //J
    }
}
