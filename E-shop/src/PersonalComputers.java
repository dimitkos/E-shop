public class PersonalComputers {

    private PcTower pctower;
    private PcScreen pcscreen;
    private int harddisk;
    private boolean correctdisk=false;

    public PersonalComputers(PcTower pctower, PcScreen pcscreen, int harddisk) {
        this.pctower = pctower;
        this.pcscreen = pcscreen;
        //θεωρουμε οτι ο σκληρος δισκος μπορει να παριε τιμες απο 80 εως 1000 gb
        if (harddisk >=80 && harddisk<=1000)
        {
            this.harddisk = harddisk;
            //εφοσον πληρει τις προυποθεσεις περνει την τιμη true
            correctdisk=true;

        }
        else{
            System.out.println("Invalid data");
        }

    }

    //μεθοδος η οποια εκτυπωνει στον χρηστη την συναλλαγη
    public void printInfo()
    {
        //για να τυπωθει το μηνυμα της παραγγελιας πρεπει να πληρει τις προυποθεσεις αλλιως βγαζει οτι η παραγγελεια δεν ειναι σωστη
        if(correctdisk && pctower.isCorrectmem() && pctower.isCorrectcpu() && pcscreen.isCorrectscreen())
        {
            System.out.println("------------------------------------");
            System.out.println("Your order is: ");
            System.out.println("------------------------------------");
            System.out.println("The tower has memory: "+pctower.getMemory()+" and cpus: "+pctower.getCpu());
            System.out.println("The screen is: "+pcscreen.getScreen()+ " inches");
            System.out.println("The hard disk is: "+ harddisk + " GB");
        }
        else
        {
            System.out.println("------------------");
            System.out.println("Invalid order!");
            System.out.println("------------------");
        }

    }

    //μεθοδος η οποια φτιαχνει τον υπολογιστη που του λεει ο χρηστης
    public  void buildPC()
    {
        System.out.println("Please enter how many memory gb do you want:");

        //αποθηκευουμε τον επιστρεφομενο τυπο της στατικης μεθοδου και τον περναμε σαν ορισμα στον κονστρακτορα του αντικειμενου
        int mem =HelpClass.readDatascreen();

        //θα βγαλουμε μηνυμα ποσες cpu θελει
        System.out.println("Please enter how many cpu do you want:");

        ///αποθηκευουμε τον επιστρεφομενο τυπο της στατικης μεθοδου και τον περναμε σαν ορισμα στον κονστρακτορα του αντικειμενου
        int cp=HelpClass.readDatascreen();

        //φτιαχνουμε ενα αντικειμενο τυπου tower
        PcTower pctower = new PcTower(mem,cp);

        //θα του βγαλουμε μηνυμα ποσες ιντσες θελει την οθονη
        System.out.println("Please enter the inches of the screen:");

        // στην συνεχεια καλουμε μια static method οπου μας βοηθαει να παρουμε τιμη απο τον χρηστη
        //κai αυτο το βαζουμε ως ορισμα σρον κοντρακτορα
        PcScreen pcscreen = new PcScreen(HelpClass.readDatascreen());

        //στην συνεχεια του ζηταμε ποσο μεγεθος σκληρου δισκου θελει
        System.out.println("Please enter the Hard Disk Size Capacity:");

        int hdcapacity= HelpClass.readDatascreen();

        //τωρα αφου ο πελατης εχει συπληρωσει ολα τα στοιχεια φτιαχνουμε το αντικειμενο τυπου personal computer
        PersonalComputers pc = new PersonalComputers(pctower,pcscreen,hdcapacity);

        //εκτυπωνει τα αποτελεσματα του πελατη που παραγγειλε3
        pc.printInfo();
    }

    //εχω τον defualt  κονστρακτορ ωστε να φτιαχνω αντικειμενο χωρις τις παραμετρους θα το χρησιμοποιησω στην μαιν στην επιλογη 3
    public PersonalComputers() {

    }
}
