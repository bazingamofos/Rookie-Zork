/** 
      |   | |--- |---\ |--- /|----    \  / |---| |   | |---\    |--- |---\ |--- |---   --|-- | |--- | / |--- --|--  |
      |___| |--  |___/ |__   \____     \/  |   | |   | |___/    |__  |___/ |--  |--      |   | |    |/  |--    |    |
      |   | |___ |  \  |___  ____|      |  |___| |___| |  \     |    |  \  |--- |---     |   | |___ | \ |---   |    @
 
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 |------------------------------------------------------------------------------------------------------------------------|
 |                                                                                                                        |          
 |                                               ~~~~~~~~~~~~~~~~~~~~~~~~~~                                               |
 |           **********                          WANT TO WATCH STAR WARS???                          **********           |
 |                                               ~~~~~~~~~~~~~~~~~~~~~~~~~~                                               | 
 |                                                                                                                        |
 |                              -Open Command Prompt from start.                                                          |
 |                                                                                                                        |
 |                              -Enter this:                                                                              |
 |                                              TYPE:        pkgmgr /iu:"TelnetClient"                                    | 
 |                                                                [press ENTER]                                           |
 |                                                                                                                        |
 |                                              TYPE:        telnet towel.blinkenlights.nl                                |
 |                                                                   [press ENTER]                                        |
 |                                                                                                                        |
 |                        And Voila! There you have your movie about which you don't know a thing!                        | 
 |                                                                                                                        |     
 |------------------------------------------------------------------------------------------------------------------------|
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^          
*/

import java.util.*;
public class Game
{
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int choice;
    public static void main() 
    {
        Game sc=new Game();
        sc.playerSetUp(); 
    }

    public void playerSetUp()
    {
        System.out.println("\n==================================================================\n");
        System.out.println("\t\t\t!!!TEXT ADVENTURE!!!\t\t\t");
        System.out.println("\n***MAIN MENU***\n");
        System.out.println("1: PLAY");
        System.out.println("2: HOW TO PLAY?");
        System.out.println("3: ABOUT THE GAME");
        System.out.println("4: QUIT");
        System.out.println("\n==================================================================\n");
        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1)
        {
            System.out.println("\u000c");
            types();
        }
        else if(choice==2)
        {
            System.out.println("\u000c");
            howToPlay();
        }
        else if(choice==3)
        {
            System.out.println("\u000c");
            about();
        }

        else if(choice==4)
        {
            System.out.println("\u000c");
            quit();
        }
        else
        {
            System.out.println("****Wrong choice****");
            System.out.println("\u000c");
            playerSetUp();
        }
    }

    public void types()
    {
        System.out.println("\n==================================================================\n");
        System.out.println("***SELECT LOCATION***\n\n");
        System.out.println("~Location~ \t  ~Difficulty~\n");
        System.out.println("           \t |");
        System.out.println("1: FOREST  \t | EASY");
        System.out.println("           \t |");
        System.out.println("2: CEMETERY\t |");
        System.out.println("           \t |");
        System.out.println("3: ISLAND  \t | HARD");
        System.out.println("           \t V");
        System.out.println("4: MAIN MENU");
        System.out.println("\n==================================================================\n");
        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        Game1 g1=new Game1();
        Game2 g2=new Game2();
        Game3 g3=new Game3();
        if(choice==1)
        {
            System.out.println("\u000c");
            g1.main();
        }
        else if(choice==2)
        {
            System.out.println("\u000c");
            g2.main();
        }
        else if(choice==3)
        {
            System.out.println("\u000c");
            g3.main();
        }
        else if(choice==4)
        {
            System.out.println("\u000c");
            playerSetUp();
        }
        else
        {
            System.out.println("****Wrong choice****");
            System.out.println("\u000c");
            types();
        }
    }

    public void howToPlay()
    {
        System.out.println("\n==================================================================\n");
        System.out.println("Enter numbers for the respective choices for going futher in the game.\n");	
        System.out.println("For Example:\n\n1:ATTACK\n2:RUN");
        System.out.println("[Enter the number 1 on your keyboard to attack or 2 to run]");
        System.out.println("\nYou can quit at any moment by entering 0.\nLet's start the game!");
        System.out.println("\n==================================================================\n\n");
        System.out.println("1: MAIN MENU");
        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1)
        {
            System.out.println("\u000c");
            playerSetUp();
        }
        else if(choice==2)
        {
            System.out.println("\u000c");
            types();
        }

        else
        {
            System.out.println("****Wrong choice****");
            System.out.println("\u000c");
            howToPlay();
        }
    }

    public void about()
    {
        System.out.println("\n==================================================================\n");
        System.out.println("TEXT ADVENTURE is a text-based game that uses characters instead of graphics.");
        System.out.println("This game has 3 distinct locations where you can encounter some short, fun adventures.");
        System.out.println("\t*Find a way to enter the town in search for shelter in FOREST ADVENTURE!");
        System.out.println("\t*Escape the cemetery to flee from the graveyard ghouls in CEMETERY ADVENTURE!");
        System.out.println("\t*Go in quest for the wealthy, but dead, pirate's treasure in ISLAND ADVENTURE!");
        System.out.println("\n Now go ahead and have fun!!!\n");
        System.out.println("\n==================================================================\n");
        System.out.println("1: MAIN MENU");
        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1)
        {
            System.out.println("\u000c");
            playerSetUp();
        }

        else
        {
            System.out.println("****Wrong choice****");
            System.out.println("\u000c");
            about();
        }
    }

    public void quit(){
        System.out.println("\n==================================================================\n");
        System.out.println("\nGAME OVER\n");
        System.out.println("\n==================================================================\n");
    }
}
class Game1
{
    Scanner enterScanner = new Scanner(System.in);
    Scanner myScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int monsterHP;
    int silverRing;
    Game g=new Game();
    public static void main() 
    {
        Game1 sc=new Game1();
        sc.playerSetUp(); 
        sc.townGate();
    }

    void playerSetUp()
    {
        System.out.println("Welcome to FOREST ADVENTURE!");	
        playerHP = 10;
        monsterHP = 15;
        playerWeapon = "Knife";
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("Please enter your name:");
        playerName = myScanner.nextLine();
        System.out.println("==================================================================\n");
        System.out.println("Hello " + playerName + ", let's start the game!");	
        System.out.println("\n==================================================================\n");
        System.out.println("You can quit the game whenever you wish\n\n***TO QUIT AT ANY POINT, ENTER 0***");	

    }	

    public void townGate()
    {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are at the gate of the town.");
        System.out.println("A guard is standing in front of you.");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("1: Talk to the guard");
        System.out.println("2: Attack the guard");
        System.out.println("3: Leave");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            if(silverRing==1){
                System.out.println("\u000c");
                ending();
            }
            else{
                System.out.println("Guard: Hello there, stranger. So your name is " + playerName + "? \nSorry but we cannot let stranger enter our town.");
                System.out.println("\n------------------Press enter to start again------------------\n");
                enterScanner.nextLine();
                System.out.println("\u000c");
                townGate();
            }

        }
        else if(choice==2){
            if(playerWeapon=="Knife"){
                playerHP = playerHP-1;
                System.out.println("Guard: Hey don't be stupid.\n\nThe guard hit you so hard and you gave up.\n(You receive 1 damage)\n");
                System.out.println("Your HP: " + playerHP);
                System.out.println("\n------------------Press enter to start again------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                townGate();
            }
            else if(playerWeapon=="Long Sword")
            {
                System.out.println("\n==================================================================\n");
                System.out.println("You killed the gaurd!\nHow are you ever going to enter the town!?");
                System.out.println("\nGAME OVER\n");
                System.out.println("\n==================================================================\n");
                for(long i=0; i<=1000000000; i++)
                {
                }
                for(long i=0; i<=1000000000; i++)
                {
                }
                System.out.println("------------------Press enter to play again------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                g.main();
            }
        }
        else if(choice==3){
            System.out.println("\u000c");
            crossRoad();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            townGate();
        }

    }

    public void crossRoad(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are at a crossroad. If you go south, you will go back to the town.\n\n");
        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go south");
        System.out.println("4: Go west");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            north();
        }
        else if(choice==2){
            System.out.println("\u000c");
            east();
        }
        else if(choice==3){
            System.out.println("\u000c");
            townGate();
        }
        else if(choice==4){
            System.out.println("\u000c");
            west();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            crossRoad();
        }

    }

    void north(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("There is a river. You drink the water and rest at the riverside.");
        System.out.println("Your HP is recovered.");
        playerHP = playerHP + 1;
        System.out.println("Your HP: " + playerHP);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            crossRoad();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            north();
        }

    }

    public void east(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walked into a forest and found a Long Sword!");
        playerWeapon = "Long Sword";
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            crossRoad();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            east();
        }
    }

    public void west(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter a goblin!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            fight();
        }
        else if(choice==2){
            System.out.println("\u000c");
            crossRoad();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            west();
        }
    }

    public void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Monster HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            attack();
        }
        else if(choice==2){
            System.out.println("\u000c");
            crossRoad();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            fight();
        }
    }

    public void attack(){
        int playerDamage =0;
        if(playerWeapon.equals("Knife")){
            playerDamage = new java.util.Random().nextInt(5); 
        }
        else if(playerWeapon.equals("Long Sword")){
            playerDamage = new java.util.Random().nextInt(8); 
        }

        System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Monster HP: " + monsterHP);

        if(monsterHP<1)
        {
            win(); 
        } 
        else if(monsterHP>0)
        {
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1)
            {
                dead(); 
            } 
            else if(playerHP>0)
            {
                fight();
            }
        }

        if(choice==0)
        {
            System.out.println("\u000c");
            quit();

        }

    }

    public void quit(){
        System.out.println("\u000c");
        g.main();
    }

    public void dead(){
        System.out.println("\n==================================================================\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER\n");
        System.out.println("\n==================================================================\n");
        for(long i=0; i<=1000000000; i++)
        {
        }
        for(long i=0; i<=1000000000; i++)
        {
        }
        System.out.println("------------------Press enter to play again------------------");
        enterScanner.nextLine();
        System.out.println("\u000c");
        g.main();
    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the monster!");
        System.out.println("The monster dropped a ring!");
        System.out.println("You obtained a silver ring!\n\n");
        System.out.println("1: Go east");
        System.out.println("\n------------------------------------------------------------------\n");
        silverRing = 1;

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1){
            System.out.println("\u000c");
            crossRoad();
        }
        else{
            System.out.println("\u000c");
            win();
        }

        if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }

    }

    public void ending(){
        System.out.println("\n==================================================================\n");
        System.out.println("Guard: Oh you killed that goblin!?? Great!");
        System.out.println("Guard: It seems you are a trustworthy person. Welcome to our town!");
        System.out.println("\n\n           THE END                   \n ");
        System.out.println("\n==================================================================\n");
        for(long i=0; i<=1000000000; i++)
        {
        }
        for(long i=0; i<=1000000000; i++)
        {
        }
        System.out.println("\n------------------Press enter to play again------------------");
        enterScanner.nextLine();
        System.out.println("\u000c");
        g.main();
    }

}
class Game2
{
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int monsterHP;
    int goldenKey;
    int choice1=0;
    Game g=new Game();
    public static void main() 
    {
        Game2 sc=new Game2();
        sc.playerSetUp(); 
        sc.cemeteryGate();
    }

    public void playerSetUp()
    {
        System.out.println("Welcome to CEMETERY ADVENTURE!");
        playerHP = 10;
        monsterHP = 15;
        playerWeapon = "Trowel";
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("Please enter your name:");
        playerName = myScanner.nextLine();
        System.out.println("==================================================================\n");
        System.out.println("Hello " + playerName + ", let's start the game!");	
        System.out.println("\n==================================================================\n");
        System.out.println("You can quit the game whenever you wish\n***TO QUIT AT ANY POINT, ENTER 0***");	
    }	

    public void cemeteryGate()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are locked inside a cemetery and there is no one else to be seen and no settlements nearby.");
        System.out.println("You need to find the golden key to get out.\n");
        System.out.println("What do you want to do?\n");
        System.out.println("1: Shout for help");
        System.out.println("2: Inspect other graves");
        if(goldenKey==0)
            System.out.println("3: Use the "+playerWeapon+" to break the lock");
        else
            System.out.println("3: Escape using the golden key");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1)
        {
            System.out.println("Who do you think is going to listen to you when there are no settlements nearby? ");
            System.out.println("It's better to keep shush and avoid grabbing the attention of the lurking ghouls.");
            System.out.println("\n------------------Press enter to start again------------------");
            enterScanner.nextLine();
            System.out.println("\u000c");
            cemeteryGate();
        }
        else if(choice==2)
        {
            System.out.println("\u000c");
            otherGraves();
        }
        else if(choice==3)
        {
            if(goldenKey==1)
            {
                System.out.println("\u000c");
                ending();
            }
            else
            {
                playerHP = playerHP-1;
                System.out.println("You can't break the lock using a "+playerWeapon+".\nInstead you get injured while trying to do so.\n(You receive one damage)");
                System.out.println("Your HP: "+playerHP);
                System.out.println("\n------------------Press enter to start again------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                cemeteryGate();
            }
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            cemeteryGate();
        }
    }

    public void otherGraves(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("The path further divides into three parts. If you turn back, you will go back to the cemetery gate.\n\n");
        System.out.println("1: Go straight");
        System.out.println("2: Turn left");
        System.out.println("3: Turn right");
        System.out.println("4: Go back");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            straight();
        }
        else if(choice==2){
            System.out.println("\u000c");
            left();
        }
        else if(choice==3){
            System.out.println("\u000c");
            right();
        }
        else if(choice==4){
            System.out.println("\u000c");
            cemeteryGate();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else
        {
            System.out.println("\u000c");
            otherGraves();
        }

    }

    public void straight()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You found a shovel!");
        playerWeapon="Shovel";
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("\n\n1: Go back to the path turning");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1)
        {
            System.out.println("\u000c");
            otherGraves();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else
        {
            System.out.println("\u000c");
            straight();
        }

    }

    public void right()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You found a 'x' mark on the ground.");
        System.out.println("\n1: Dig");
        System.out.println("2: Go back to the path turning");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1)
        {
            if(playerWeapon.equals("Shovel"))
            {
                playerWeapon="Shot Gun";
                System.out.println("You found a shot gun!"); 
                System.out.println("Your Weapon: "+playerWeapon);
                System.out.println("\n\n1: Go back to the path turning");
                System.out.println("2: Dig more");
                do
                {
                    while(!myScanner.hasNextInt())
                    {
                        System.out.println("Invalid input\n<Try again>\n");
                        myScanner.next();
                    }
                    choice1=myScanner.nextInt();
                }while(choice1<0);
                if(choice1==1)
                {
                    System.out.println("\u000c");
                    otherGraves();
                }
                else if(choice1==2)
                {
                    goldenKey++;
                    System.out.println("You found the golden key!");
                    System.out.println("\n------------------Press enter to go back to the path turning------------------");
                    enterScanner.nextLine();
                    System.out.println("\u000c");
                    otherGraves();
                }
                else
                {
                    playerWeapon="Shovel";
                    System.out.println("\u000c");
                    right();
                }
            }
            else
            {
                System.out.println("You can't dig using a "+playerWeapon+".");
                System.out.println("1: Go back to the path turning");
                do
                {
                    while(!myScanner.hasNextInt())
                    {
                        System.out.println("Invalid input\n<Try again>\n");
                        myScanner.next();
                    }
                    choice1=myScanner.nextInt();
                }while(choice1<0);
                if(choice1==1)
                {
                    System.out.println("\u000c");
                    otherGraves();
                }
                else
                {
                    System.out.println("\u000c");
                    right();
                }
            }
        }
        else if(choice==2)
        {
            System.out.println("\u000c");
            otherGraves();
        }
        else if(choice==0){
            System.out.println("\u000c");
            quit();
        }
        else
        {
            System.out.println("\u000c");
            right();
        }

    }

    public void left(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter a ghoul!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            fight();
        }
        else if(choice==2){
            System.out.println("\u000c");
            otherGraves();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();

        }
        else{
            System.out.println("\u000c");
            left();
        }
    }

    public void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Ghoul HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            attack();
        }
        else if(choice==2){
            System.out.println("\u000c");
            otherGraves();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            fight();
        }
    }

    public void attack(){
        int playerDamage =0;
        System.out.println("Your Weapon: "+playerWeapon);
        if(playerWeapon.equals("Trowel")){
            playerDamage = new java.util.Random().nextInt(2); 
        }
        if(playerWeapon.equals("Shovel")){
            playerDamage = new java.util.Random().nextInt(5); 
        }
        if(playerWeapon.equals("Shot Gun")){
            playerDamage = new java.util.Random().nextInt(8); 
        }

        System.out.println("You attacked the ghoul and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Ghoul HP: " + monsterHP);

        if(monsterHP<1)
        { 
            win(); 
        } 
        else if(monsterHP>0)
        {
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The Ghoul attacked you and gave " + monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1)
            {
                dead(); 
            }
            else if(playerHP>0)
            {
                fight();
            }
        }

        if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
    }

    public void quit(){
        System.out.println("\u000c");
        g.main();
    }

    public void dead(){
        System.out.println("\n==================================================================\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n==================================================================\n");
        for(long i=0; i<=1000000000; i++)
        {
        }
        for(long i=0; i<=1000000000; i++)
        {
        }
        System.out.println("\n------------------Press enter to play again------------------");
        enterScanner.nextLine();
        System.out.println("\u000c");
        g.main();
    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the Ghoul!");
        System.out.println("1: Go back to the path turning");
        System.out.println("\n------------------------------------------------------------------\n");
        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1)
        {
            System.out.println("\u000c");
            otherGraves();
        }
        else{
            System.out.println("\u000c");
            win();
        }

        if(choice==0)
        {
            System.out.println("\u000c");
            quit();

        }

    }

    public void ending(){
        System.out.println("\n==================================================================\n");
        System.out.println("You found the golden key and successfully escaped!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n==================================================================\n");
        for(long i=0; i<=1000000000; i++)
        {
        }
        for(long i=0; i<=1000000000; i++)
        {
        }
        System.out.println("\n------------------Press enter to play again------------------");
        enterScanner.nextLine();
        System.out.println("\u000c");
        g.main();
    }

}
class Game3
{
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerResource;
    String playerTool;
    String playerWeapon;
    int water=2;
    int food=1;
    int choice;
    int monsterHP;
    int treasure;
    int fixed;
    int choice1;
    int choice3;
    int damage;
    String choice2="";
    String ans;
    int f;
    int random;
    int tries=4; 
    int clue=0; 
    int j=0;
    Game g=new Game();
    public static void main() 
    {
        Game3 sc=new Game3();
        sc.playerSetUp(); 
        sc.beach();
    }

    public void playerSetUp()
    {
        playerHP = 10;
        monsterHP = 15;
        playerResource = "2 WATER\t1 FOOD PACKET";
        playerTool="Null";
        playerWeapon="Null";
        System.out.println("Welcome to ISLAND ADVENTURE!");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Your Resources: "+ playerResource);
        System.out.println("Your Tool: "+ playerTool);
        System.out.println("Your Weapon: "+ playerWeapon);
        System.out.println("Please enter your name:");
        playerName = myScanner.nextLine();
        System.out.println("==================================================================\n");
        System.out.println("Hello " + playerName + ", let's start the game!");	
        System.out.println("\n==================================================================\n");
        System.out.println("You can quit the game whenever you wish\n***To quit, enter 0***");	

    }	

    public void beach()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Last night's storm has washed up your ship on a deserted island and your ship doesn't seem to be in a condition to sail");
        System.out.println("There is nothing else seen till far, just vast expanse of water surrounding the island.");
        System.out.println("You have heard that a dead pirate's treasure is dug up on such an island.\n");
        System.out.println("What do you want to do?\n");
        System.out.println("1: Wait for another ship to arrive");
        if(fixed==0)
            System.out.println("2: Try to fix your ship");
        else{
            System.out.println("2: Set on sail");
        }
        System.out.println("3: Go in search for the treasure");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);
        if(choice==1)
        {
            playerHP = playerHP-1;
            System.out.println("A day has passed and no help has arrived.\nYou have no food and are starving.\n(You receive 1 damage)\n");
            System.out.println("Your HP: " + playerHP);
            System.out.println("To utilize your resources: Enter 1\n<Any other number to dismiss>");
            do
            {
                while(!myScanner.hasNextInt())
                {
                    System.out.println("Invalid input\n<Try again>\n");
                    myScanner.next();
                }
                choice1=myScanner.nextInt();
            }while(choice1<0);
            if(choice1==1)
            {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Enter 'W' for water and 'F' for food\n<Any other letter to dismiss>") ;
                System.out.println("\n------------------------------------------------------------------\n");
                while(!myScanner.hasNext("[A-Za-z]+"))
                {
                    System.out.println("Invalid input\n<Try again>");
                    myScanner.next();
                }
                choice2=myScanner.next();
                if(choice2.equalsIgnoreCase("W"))
                {
                    if(water>0)
                    {
                        water-=1;
                        playerHP=playerHP+1;
                        System.out.println("Your Resources: "+water+"WATER\t"+food+"FOOD PACKET");
                        System.out.println("Your HP: "+ playerHP);
                        System.out.println("\n------------------Press enter to start again------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        beach();
                    }
                    else
                    {
                        System.out.println("You don't have enough resources\n");
                        System.out.println("\n------------------Press enter to go back to the diversion------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        diversion();
                    }
                }
                else if(choice2.equalsIgnoreCase("F"))
                {
                    if(food>0)
                    {
                        food-=1;
                        playerHP=playerHP+2;
                        System.out.println("Your Resources: "+water+"WATER\t"+food+"FOOD PACKET");
                        System.out.println("Your HP: "+ playerHP);
                        System.out.println("\n------------------Press enter to start again------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        beach();
                    }
                    else
                    {
                        System.out.println("You don't have enough resources\n");
                        System.out.println("\n------------------Press enter to go back to the diversion------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        diversion();
                    }
                }
                else
                {

                    System.out.println("\n------------------Press enter to go back to the diversion------------------");
                    enterScanner.nextLine();
                    System.out.println("\u000c");
                    diversion();
                }
            }
            else
            {

                System.out.println("\n------------------Press enter to start again------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                beach();
            }
        }
        else if(choice==2)
        {
            if(fixed==1)
            {
                System.out.println("\u000c");
                ending();
            }
            if(playerTool=="Null")
            {
                System.out.println("Your ship lacks a certain tool.\nYou need to find it first to fix the ship.\n");
                System.out.println("\n------------------Press enter to start again------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                beach();
            }
            else if(playerTool=="Wrench")
            {
                fixed++;
                System.out.println("Voila!\nTightened some bolts and we're good to go.\n");
                System.out.println("Do you want to leave or stay and go in quest for the treasure?\n");  
                System.out.println("1: Stay");
                System.out.println("2: Leave");
                do
                {
                    while(!myScanner.hasNextInt())
                    {
                        System.out.println("Invalid input\n<Try again>\n");
                        myScanner.next();
                    }
                    choice3=myScanner.nextInt();
                }while(choice3<=0);
                if(choice3==1)
                {
                    System.out.println("Great!");
                    System.out.println("\n------------------Press enter to go to the diversion------------------");
                    enterScanner.nextLine();
                    System.out.println("\u000c");
                    diversion();
                }
                else if(choice3==2)
                {
                    System.out.println("\u000c");
                    ending();
                }
                else
                {
                    System.out.println("\u000c");
                    beach();
                }
            }
        }
        else if(choice==3){
            System.out.println("\u000c");
            diversion();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            beach();
        }

    }

    public void diversion(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are at a diversion. If you go south, you will go back to the beach.\n\n");
        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go south");
        System.out.println("4: Go west");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            north();
        }
        else if(choice==2){
            System.out.println("\u000c");
            east();
        }
        else if(choice==3){
            System.out.println("\u000c");
            beach();
        }
        else if(choice==4){
            System.out.println("\u000c");
            west();
        }

        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            diversion();
        }

    }

    public void north(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walked into the jungle and found a wrench!");
        playerTool="Wrench";
        System.out.println("Player Tool: "+playerTool);
        System.out.println("\n\n1: Go back to the diversion");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1)
        {
            System.out.println("\u000c");
            diversion();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else
        {
            System.out.println("\u000c");
            north();
        }
    }

    public void east()
    {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter a giant spider!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            fight();
        }
        else if(choice==2){
            System.out.println("\u000c");
            diversion();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();

        }
        else{
            System.out.println("\u000c");
            east();
        }

    }

    public void west(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("There is a coconut tree. You drink the sweet water and rest in the shade.");
        System.out.println("Your HP is recovered.");
        playerHP = playerHP + 1;
        System.out.println("Your HP: " + playerHP);
        System.out.println("\n\n1: Go back to the diversion");
        System.out.println("2: Try to make a weapon out of the available wood and other resources on the ship\n(You might receive some damage in the process) ");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            diversion();
        }
        else if(choice==2)
        {
            damage = (int)((Math.random()*(5-2))+2);
            playerHP=playerHP-damage;
            playerWeapon="Sharp knife";
            System.out.println("Amazing! Now you have a weapon for yourself.");
            System.out.println("Player Weapon: "+playerWeapon);
            System.out.println("Damage received: "+damage);
            System.out.println("Player HP: "+playerHP);
            int choice1;
            System.out.println("To utilize your resources: Enter 1\n<Any other number to dismiss>");

            do
            {
                while(!myScanner.hasNextInt())
                {
                    System.out.println("Invalid input\n<Try again>\n");
                    myScanner.next();
                }
                choice1=myScanner.nextInt();
            }while(choice1<0);
            String choice2;
            if(choice1==1)
            {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Enter 'W' for water and 'F' for food\n<Any other letter to dismiss>") ;
                System.out.println("\n------------------------------------------------------------------\n");
                while(!myScanner.hasNext("[A-Za-z]+"))
                {
                    System.out.println("Invalid input\n<Try again>");
                    myScanner.next();
                }
                choice2=myScanner.next();
                if(choice2.equalsIgnoreCase("W"))
                {
                    if(water>0)
                    {
                        water-=1;
                        playerHP=playerHP+1;
                        System.out.println("Your Resources: "+water+"WATER\t"+food+"FOOD PACKET");
                        System.out.println("Your HP: "+ playerHP);
                        System.out.println("\n------------------Press enter to start again------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        beach();
                    }
                    else
                    {
                        System.out.println("You don't have enough resources\n");
                        System.out.println("\n------------------Press enter to go back to the diversion------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        diversion();
                    }
                }
                else if(choice2.equalsIgnoreCase("F"))
                {
                    if(food>0)
                    {
                        food-=1;
                        playerHP=playerHP+2;
                        System.out.println("Your Resources: "+water+"WATER\t"+food+"FOOD PACKET");
                        System.out.println("Your HP: "+ playerHP);
                        System.out.println("\n------------------Press enter to start again------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        beach();
                    }
                    else
                    {
                        System.out.println("You don't have enough resources\n");
                        System.out.println("\n------------------Press enter to go back to the diversion------------------");
                        enterScanner.nextLine();
                        System.out.println("\u000c");
                        diversion();
                    }
                }
                else
                {

                    System.out.println("\n------------------Press enter to go back to the diversion------------------");
                    enterScanner.nextLine();
                    System.out.println("\u000c");
                    diversion();
                }
            }
            else{
                System.out.println("\n------------------Press enter to go back to the diversion------------------");
                enterScanner.nextLine();
                System.out.println("\u000c");
                diversion();

            }
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            north();
        }
    }

    public void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println("Giant spider HP: " + monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        do
        {
            while(!myScanner.hasNextInt())
            {
                System.out.println("Invalid input\n<Try again>\n");
                myScanner.next();
            }
            choice=myScanner.nextInt();
        }while(choice<0);

        if(choice==1){
            System.out.println("\u000c");
            attack();
        }
        else if(choice==2){
            System.out.println("\u000c");
            diversion();
        }
        else if(choice==0)
        {
            System.out.println("\u000c");
            quit();
        }
        else{
            System.out.println("\u000c");
            fight();
        }

    }
    public void attack(){
        int playerDamage =0;

        if(playerWeapon.equals("Null")){
            playerDamage = new java.util.Random().nextInt(1); 
        }
        else if(playerWeapon.equals("Sharp knife")){
            playerDamage = new java.util.Random().nextInt(8); 
        }

        System.out.println("You attacked the giant spider and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Giant spider HP: " + monsterHP);

        if(monsterHP<1){ win(); } else if(monsterHP>0){
            int monsterDamage =0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The giant spider attacked you and gave " + monsterDamage + " damage!");

            playerHP = playerHP - monsterDamage;

            System.out.println("Player HP: " + playerHP);

            if(playerHP<1){ dead(); } else if(playerHP>0){

                fight();
            }
        }

        if(choice==0)
        {
            System.out.println("\u000c");
            quit();

        }

    }

    public void quit()
    {
        System.out.println("\u000c");
        g.main();
    }

    public void dead(){
        System.out.println("\n==================================================================\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n==================================================================\n");
        for(long i=0; i<=1000000000; i++)
        {
        }
        for(long i=0; i<=1000000000; i++)
        {
        }
        System.out.println("\n------------------Press enter to play again------------------");
        enterScanner.nextLine();
        System.out.println("\u000c");
        g.main();
    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed the monster!");
        System.out.println("Across the giant spider's web there is the treasure!");
        System.out.println("\n------------------------------------------------------------------\n");
        treasure=1;
        System.out.println("\nThere is a letter on the chest...\nOh! It's a riddle! Solving which will give the number for the lock on the treasure chest. ");
        System.out.println("Let's see what it says...\n");
        System.out.println("\n------------------Press enter to see the riddle------------------");

        enterScanner.nextLine();
        System.out.println("\u000c");
        riddle();

    }

    void riddle()
    {
        String str1="There is a 4 digit number.\nThe second digit is four times as big as the third digit,\nwhile the first digit is three less than the second digit and half of the fourth digit.\nWhat is the number?";
        String str2="I am a 4 digit number.\nMy first digit is of no use as I still remain same without it.\nMy second and third digits are mirror images.\nMy fourth digit is half of second.\nCan you guess the number?";
        String str3="There is a 4 digit number, in which the first digit is one-third the second,\nthe third digit is the sum of the first two, and the last is three times the second.\nWhat is the number?";
        String str4="What is the 4 digit number in which the first digit is one-fifth of the last,\nand the second and third digits are the last digit multiplied by 3?";
        String str5="Find the 4 digit number in which the first digit is one-fourth of the last digit,\nthe second digit is six times the first digit,\nand the third digit is the second digit plus 3.";
        String ans1="1412";
        String ans2="0884";
        String ans3="1349";
        String ans4="1155";
        String ans5="1694";
        String clue1="The fourth digit is 2.";
        String clue2="The third digit is 8.";
        String clue3="The second digit is 3.";
        String clue4="The first digit is 1.";
        String clue5="The fourth digit is 4.";
        String s[]={str1, str2, str3, str4, str5};
        String a[]={ans1, ans2, ans3, ans4, ans5};
        String c[]={clue1, clue2, clue3, clue4, clue5};
        random=(int)((Math.random()*(4-0))+0);
        System.out.println("\n==================================================================\n");
        System.out.println("\n"+s[random]+"\n");
        System.out.println("\n==================================================================\n");
        for(f=1; f<=5; f++)
        {
            if(tries==0)
            {
                System.out.println("\n<<<<<<>>>>>>\n");           
                System.out.println("Your answer:");
                System.out.println("\n<<<<<<>>>>>>\n"); 
                ans=myScanner.next();
                if(ans.equals(a[random])==true)
                {
                    System.out.println("\nWell done! You've unlocked the chest.\n");j++;
                    break;
                }
                else{
                    System.out.println("Oops! Looks like all your chances are over.\nCome back again the next time.\n");
                    break;
                }
            }
            else
            {
                System.out.println("\n<<<<<<>>>>>>\n");           
                System.out.println("Your answer:");
                System.out.println("\n<<<<<<>>>>>>\n"); 
                ans=myScanner.next();
                if(ans.equals(a[random])==true)
                {
                    System.out.println("\nWell done! You've unlocked the chest.\n");j++;
                    break;
                }
                else
                {
                    if(tries==1)
                    {
                        System.out.println("\nWrong! But don't be low. You have got "+tries+" more try left with you \n");tries--;
                        if(clue!=1)
                        {
                            System.out.println("\nEnter 1: To reveal one digit\n      2: Skip the clue");
                            do
                            {
                                while(!myScanner.hasNextInt())
                                {
                                    System.out.println("Invalid input\n<Try again>\n");
                                    myScanner.next();
                                }
                                clue=myScanner.nextInt();
                            }while(clue<0);
                            if(clue==1)
                            {
                                System.out.println("\n==================================================================\n");
                                System.out.println("\n"+c[random]+"\n");
                                System.out.println("\n==================================================================\n");
                                continue;
                            }
                            else if(clue==2)
                                continue;
                            else
                                continue;
                        }
                    }
                    else
                    {
                        System.out.println("\nWrong! But don't be low. You have got "+tries+" more tries left with you \n");tries--;
                        if(clue!=1)
                        {
                            System.out.println("\nEnter 1: To reveal one digit\n      2: Skip the clue");
                            clue=myScanner.nextInt();
                            if(clue==1)
                            {
                                System.out.println("\n==================================================================\n");
                                System.out.println("\n"+c[random]+"\n");
                                System.out.println("\n==================================================================\n");
                                continue;
                            }
                            else if(clue==2)
                                continue;
                            else
                                continue;
                        }
                    }
                }
            }
        }
        if(j==1)
        {
            System.out.println("\n------------------Press enter to go back to the diversion------------------");
            enterScanner.nextLine();
            System.out.println("\u000c");
            diversion();
        }
        else
        {
            System.out.println("\n------------------Press enter to play again------------------");
            enterScanner.nextLine();
            System.out.println("\u000c");
            g.main();

        }
    }

    public void ending()
    {
        if(treasure==1)
        {
            System.out.println("\n==================================================================\n");
            System.out.println("Bravo!\n Look who got lucky.\n You found the treasure and now your ship's on sail!");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n==================================================================\n");
            for(long i=0; i<=1000000000; i++)
            {
            }
            for(long i=0; i<=1000000000; i++)
            {
            }
            System.out.println("\n------------------Press enter to play again------------------");
            enterScanner.nextLine();
            System.out.println("\u000c");
            g.main();
        }
        else
        {
            System.out.println("\n==================================================================\n");
            System.out.println("Alas! Remember to take your chances and come back again to find the treasure!");
            System.out.println("\n\n           THE END                    ");
            System.out.println("\n==================================================================\n");
            for(long i=0; i<=1000000000; i++)
            {
            }
            for(long i=0; i<=1000000000; i++)
            {
            }
            System.out.println("\n------------------Press enter to play again------------------");
            enterScanner.nextLine();
            System.out.println("\u000c");
            g.main();
        }
    }
}


