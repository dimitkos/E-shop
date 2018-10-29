public class PcTower {

    private int memory;
    private int cpu;
    //με αυτες τις λογικες μεταβλητες θα ελεγξουμε ποσο ορθα φτιαχτηκε μια κλαση,και αντιστοιχα να τυπωνει μηνυματα
    private boolean correctmem =false;
    private boolean correctcpu =false;

    public PcTower(int memory, int cpu) {


        //θεωρουμε οτι ο χρηστης μπορει να βαλει απο 2 εως 16 gb ram
           if (memory >= 2 && memory <= 16) {
               this.memory = memory;
               //εφοσον πληρει τις προυποθεσεις περνει την τιμη true
               correctmem =true;
           }
           else {
               System.out.println("Invalid number of gb ram");
           }


        //θεωρουμε οτι ο χρηστης μπορει να βαλει απο 2 εως 8 cpu  στον υπολογιστη του
           if (cpu >= 2 && cpu <= 8) {
               this.cpu = cpu;
               //εφοσον πληρει τις προυποθεσεις περνει την τιμη true
               correctcpu =true;

           }
           else {
               System.out.println("Invalid number of cpus");
           }

    }

    //επιστρεφει την τιμη της μεμορυ αυτη η μεθοδος
    public int getMemory() {
        return memory;
    }

    //επιστρεφει την τιμη της cpu αυτη η μεθοδος
    public int getCpu() {
        return cpu;
    }

    //μεθοδος η οποια εκτυπωνει το αποτελεσμα της συναλλαγης με το πελατη
    public void printInfo()
    {
        //για να τυπωθει το μηνυμα της παραγγελιας πρεπει να πληρει τις προυποθεσεις αλλιως βγαζει οτι η παραγγελεια δεν ειναι σωστη
        if(correctmem ==true && correctcpu==true)
        {
            System.out.println("------------------------------------");
            System.out.println("Your order is: ");
            System.out.println("------------------------------------");
            System.out.println("The tower has memory: "+memory+" and cpus: "+cpu);
        }
        else
        {
            System.out.println("------------------");
            System.out.println("Invalid order!");
            System.out.println("------------------");
        }

    }

    //μεθοδοι που μας επισρεφουν τις τιμες των δυο λογικων μεταβλητων
    public boolean isCorrectmem() {
        return correctmem;
    }

    public boolean isCorrectcpu() {
        return correctcpu;
    }
}
