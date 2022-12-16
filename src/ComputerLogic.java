public class ComputerLogic {
    public static int idNum = 100;
    public static int generation;

    private ComputerLogic() {}

    public static void newIdNum() {
        idNum++;
    }
    public static int getIdNum() {
        return idNum;
    }

    public static void setGeneration() {
        generation = (idNum / 100) * 100;
    }

    public static int getGeneration() {
        return generation;
    }

    public static String codeNum() {
        int randNum = generateRandNum();    //A
        return "" + randNum + "";
    }

    private static int generateRandNum() {
        return (int) ((Math.random() * 999) + 1);
    }
}
