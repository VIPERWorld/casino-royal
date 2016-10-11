public class Casino {

    public static void main(String[] args) {
	    System.out.println("Testing:.....");
        SlotMachine sM = new SlotMachine(true);

        System.out.println("Post construction printout");
        System.out.println(sM.toString());
    }
}
