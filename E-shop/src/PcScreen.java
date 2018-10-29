public class PcScreen {

    private int screen;
    private boolean correctscreen=false;

    public PcScreen(int screen) {
        //θεωρω οτι η οθονες που πουλαει το μαγαζι ειναι απο 14 εως 34 ιντσες
        if(screen >=14 && screen <= 34)
        {
            this.screen = screen;
            //εφοσον πληρει τις προυποθεσεις περνει την τιμη true
            correctscreen=true;
        }
        else
        {
            System.out.println("Invalid input of inches");
        }

    }

    //μεθοδος που επιστρεφει το μεγεθος της οθονης
    public int getScreen() {

        return screen;
    }

    //τυπωνει το αποτελεσμα της αγορας στον πελατη

    public void printInfo() {

        //για να τυπωθει το μηνυμα της παραγγελιας πρεπει να πληρει τις προυποθεσεις αλλιως βγαζει οτι η παραγγελεια δεν ειναι σωστη
        if(correctscreen==true){
            System.out.println("------------------------------------");
            System.out.println("Your order is: ");
            System.out.println("------------------------------------");
            System.out.println("The screen is: " + screen + " inches");
        }
        else
        {
            System.out.println("------------------");
            System.out.println("Invalid order!");
            System.out.println("------------------");
        }
    }

    //μεθοδος που μας επιστρεφει την τιμη της λογικης μεταβλητης
    public boolean isCorrectscreen() {
        return correctscreen;
    }
}
