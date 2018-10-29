import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //φτιαχνουμε ενα αντικειμενο τυπου scanner για να μας βοηθησει να απρουμε την εισοδο απο το πληκτρολογιο
        Scanner in = new Scanner(System.in);

        //εμφανιζιε μηνυμα στον χρηστη το μενου
        System.out.println("Please enter your choice");

        //ο χρηστης καλειτε να επιλεξει τι θελει να αγορασει
        System.out.println("[1] Pc Towers , [2] Pc screens, [3] Personal Computers ,[4] Workastations");

        //φτιαχνουμε μια μεταβλητη οπου θα αποθηκευει την επιλογη του χρηστη
        int choice=0;

        //ftiaxnoume mia logikh metavliti opoy thn arxikopoioume true,otan ginei false tha vgei apo to loop
        boolean more= true;

        while(more)
        {
            try
            {
                //pernoume thn eisodo tou xrhsth apo to plhktrologio
                choice = in.nextInt();

                //elegxoume oti exie valei swsto arithmo kai dne exie pathsei kapoion arnhtiko arithmo 0 h 5 kai panw
                //an einia swsth h epiloghtou to loop spaei logw tou false
                if(choice>0 && choice<5)
                {
                    more= false;
                }
                else//alliws tou vgazei mynhma
                {
                    System.out.println("Invalid choice ,please try again:");
                }
            }//thn epilogh thn valame mesa se try etsi wste an o xrhsths pathsei double h char h string na peftei mesa sto catch kai an tou vgazei mhnyma
            //oti pliktrologhse lathos typo dedomenvn
            catch(InputMismatchException exc)
            {
                System.out.println("Invalid data type,please try again");
                more = false;
            }
        }



        //στην συνεχεια ελεγχουμε τι επιλογη πατησε ο χρητσης και κανουμε τις αντιστοιχες ενεργειες
        if (choice==1)
        {
            //αφου επελεξε τον  tower τωρα θα βγαλουμε μηνυμα ποση ραμ θελει
            System.out.println("Please enter how many memory gb do you want:");

            //αποθηκευουμε τον επιστρεφομενο τυπο της στατικης μεθοδου και τον περναμε σαν ορισμα στον κονστρακτορα του αντικειμενου
            int mem =HelpClass.readDatascreen();

            //θα βγαλουμε μηνυμα ποσες cpu θελει
            System.out.println("Please enter how many cpu do you want:");

            ///αποθηκευουμε τον επιστρεφομενο τυπο της στατικης μεθοδου και τον περναμε σαν ορισμα στον κονστρακτορα του αντικειμενου
            int cp=HelpClass.readDatascreen();

            //και με τις παραπανω μεταβλητες τις ριχνουμε σαν οριισμα στον κονστρακτορα
            PcTower newtower = new PcTower(mem,cp);

            //τωρα εκτυπωνουμε τις πληροφοριες στον πελατη
            newtower.printInfo();

        }

        if (choice==2)
        {

            //αφου επελεξε την επιλογη screen  θα του βγαλουμε μηνυμα ποσες ιντσες θελει την οθονη
            System.out.println("Please enter the inches of the screen:");

            // στην συνεχεια καλουμε μια static method οπου μας βοηθαει να παρουμε τιμη απο τον χρηστη
            //κια αυτο το βαζουμε ως ορισμα σρον κοντρακτορα
            PcScreen newscreen = new PcScreen(HelpClass.readDatascreen());

            //εκτπυωνω τα αποτελεσματα στον πελατη
            newscreen.printInfo();

        }

        if(choice==3)
        {
            System.out.println("First of all you must build a tower");

            //καλουμε την στατικη μεθοδο οπου κατασκευαζουμε τον υπολογιστη
            PersonalComputers newcomputer =new  PersonalComputers();

            //εκτπυωνω τα αποτελεσματα στον πελατη
            newcomputer.buildPC();


        }

        //σε περιπτωση που διαλεξει ο χρηστης workstation
        if(choice==4)
        {
            System.out.println("To order a workstation first must buy personal computer");

            Workstation newworkstation = new Workstation();

            //εκτπυωνω τα αποτελεσματα στον πελατη
            newworkstation.buildPC();
        }
    }
}
