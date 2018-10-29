import java.util.InputMismatchException;
import java.util.Scanner;

public class HelpClass {

    //static μεθοδος η οποια μας βοηθαει να περνουμε εισοδο ακεραιο αριθμο απο τον χρηστη
    public static int readDatascreen()
    {
        int variable=0;

        //φτιαχνουμε ενα αντικειμενο τυπου Scanner οπου θα παρουμε εισοδο απο το πληκτρολογιο
        Scanner inscr = new Scanner(System.in);


        // ελεγχουμε οτι παλι ο χρηστης δεν θα βαλει κατι αλλο περα απο int
        try{
            variable = inscr.nextInt();
        }
        catch(InputMismatchException exc)
        {
            //αν βαλει κατι αλλο περα απο ακεραιο θα τυπωθει το παρακατω μηνυμα
            System.out.println("Invalid data type,please try again");
        }

        //και μας επιστρεφει τον ακεραιο,ετσιωστε θα τον ριξουμε σαν ορισμα στον κονστρακτορα
        return  variable;
    }
}
