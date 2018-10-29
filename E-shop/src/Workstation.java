import java.util.InputMismatchException;
import java.util.Scanner;

//εφοσον ειναι προαπαιτουμενο το λειτουργικο να εχεις αγορασει ενα ολοκληρο υπολογιστη ετσι και εμεις θα φτιαξουμε μια κλασση
// η οποια θα κληρονομει τα χαρακτηριστικα του υπολογιστη και επιπλεον θα εχει και λειτουργικο μεσα το αντικειμενο αυτου του τυπου που θα φτιαξουμε
public class Workstation extends PersonalComputers {
    private  String name;
    private boolean correctwrkst=false;

    public Workstation(PcTower pctower, PcScreen pcscreen, int harddisk,String name) {
        super(pctower,pcscreen,harddisk);
        if(name == "Windows")
        {
            this.name = name;
        }
        else if (name == "Linux")
        {
            this.name = name;
        }
        else
        {
            System.out.println("Invalid Operation System");
        }

    }

    //ο κοντσρακτορας αυτος παιρνει σαν ορισμα ενα στρινγκ και συγκρινει αν ειναι το κταλληλο ονομα του λειοτυργικου
    public Workstation(String name)
    {
        if(name.equals("Windows") || name.equals("Linux"))
        {
            this.name = name;
            //εφοσον πληρει τις προυποθεσεις περνει την τιμη true
            correctwrkst=true;
        }
        else
        {
            System.out.println("Invalid Operation System");
        }
    }

    //default κοντρακτορας
    public Workstation()
    {

    }

    //μεθοδος η οποια μας επιστρεφει το ονομα του λειτουργικου
    public String getName() {
        return name;
    }

    //μεθοδος η οποια εκτυπωνει τα αποτελεσματα στον χρηστη τι αγορασε
    public void printInfo()
    {
        //για να τυπωθει το μηνυμα της παραγγελιας πρεπει να πληρει τις προυποθεσεις αλλιως βγαζει οτι η παραγγελεια δεν ειναι σωστη
        if(correctwrkst)
        {
            System.out.println("------------------------------------");
            System.out.println("The operation system is: "+ name);
        }
        else
        {
            System.out.println("-------------------------------------------");
            System.out.println("Please select the correct operation system");
        }


    }

    //μεθοδος η οποια μας βοηθαει ωστε ο χρηστης να φτιαξει υπολογιστη
    public  void buildPC()
    {

        String userstring = null;

        System.out.println("Please select operation system: Windows or Linux ?");

        Scanner instring = new Scanner(System.in);

        // ελεγχουμε οτι παλι ο χρηστης δεν θα βαλει κατι αλλο περα απο int
        try{
            userstring = instring.nextLine();
        }
        catch(InputMismatchException exc)
        {
            //αν βαλει κατι αλλο περα απο ακεραιο θα τυπωθει το παρακατω μηνυμα
            System.out.println("Invalid data type,please try again");
        }

        //φτιαχνουμε ενα αντικειμενο τυπου workstation
        Workstation wkst = new Workstation(userstring);


        //εκμεταλευομενη την κληρονομικοτητα δεν χρειαζεται να ξαναγραψουμε ξανα την λειτουργηκοττητα
        //για την κατασκευη υπολογιστη,ετσι λοιπον καλουμε την μεθοδο της superclass  πλεον
        super.buildPC();

        //εκτυπωνει στην συνεχεια τα αποτελεσματα της αγορας στον πελατη
        wkst.printInfo();



    }
}
