package canogromear;

import java.util.Random;
import java.util.Scanner;
 class CanoGromear {
    
     private static int Physical1;
     private static int cast1;
     private static int heal1;
     private static int health1;
     private static int MagikaPoints1;
     private static int heal2;
     private static int cast2;
     private static int Physical2;
     private static int health2;
     private static int MagikaPoints2;
    public static void main(String[]args) {
        
        System.out.println("Monokuma, Yurogonomea, Shilmauk, Celty, Hieru, Argono");
                System.out.println("Please select a character player 1");
        String Command3;
            Scanner reader3 = new Scanner(System.in);
            Command3 = reader3.nextLine();
        String name1 = "Unknown";
        String description1 = "Unknown";

        if (Command3.equals("Monokuma")) {
            name1 = "Monokuma";
            description1 = "This is a sick twisted Principal that hides there identity and allows there students to commit murder. If you want to know more watch Danganronpa.";
        }
        if (Command3.equals("Yurogonomea")) {
            name1 = "Yurogonomea";
            description1 = "This is a student who doesnt care for society and doesnt do all that much. He is very smart and could tecnically quit school at any point, but he is a troubled man that thinks very twisted thoughts and kill people to stay happy.";
        }
        if (Command3.equals("Shilmauk")) {
            name1 = "Shilmauk";
            description1 = "This is a Dark Spirt that isn`t known by many, but who ever does know about it will know and kill that person.";
        }
        if (Command3.equals("Celty")) {
            name1 = "Celty";
            description1 = "This is a known as the black rider who lost its head. If you want to know more watch Durarara!!";
        }
        if (Command3.equals("Hieru")) {
            name1 = "Hieru";
            description1 = "This is a person who thinks he can get away with everything when in reality he keeps getting put in jail. Its almost like hes in another word.";
        }
        if (Command3.equals("Argono")) {
            name1 = "Argono";
            description1 = "This is a janitor that gotten an intire school closed down because he kills children in the laundry room after school hours.";
        }
        if (Command3.equals("Yourmom")) {
            name1 = "Yourmom";
            description1 = "This is your mom, welcome to the real world you say to her one day.";
        }
        if (Command3.equals("Yourdad")) {
            name1 = "Yourdad";
            description1 = "This is your dad, he came along with all his bad jokes.";
        }
        if (Command3.equals("Cobblestone")) {
            name1 = "Cobblestone";
            description1 = "This is well... Its stone... What did you expect?";
        }
                System.out.println("Please select a character player 2");
        String Command4;
            Scanner reader4 = new Scanner(System.in);
            Command4 = reader4.nextLine();
        String name2 = "Unknown";
        String description2 = "Unknown";

        if (Command4.equals("Monokuma")) {
            name2 = "Monokuma";
            description2 = "This is a sick twisted Principal that hides there identity and allows there students to commit murder. If you want to know more watch Danganronpa.";
        }
        if (Command4.equals("Yurogonomea")) {
            name2 = "Yurogonomea";
            description2 = "This is a student who doesnt care for society and doesnt do all that much. He is very smart and could tecnically quit school at any point, but he is a troubled man that thinks very twisted thoughts and kill people to stay happy.";
        }
        if (Command4.equals("Shilmauk")) {
            name2 = "Shilmauk";
            description2 = "This is a Dark Spirt that isn`t known by many, but who ever does know about it will know and kill that person.";
        }
        if (Command4.equals("Celty")) {
            name2 = "Celty";
            description2 = "This is a known as the black rider who lost its head. If you want to know more watch Durarara!!";
        }
        if (Command4.equals("Hieru")) {
            name2 = "Hieru";
            description2 = "This is a person who thinks he can get away with everything when in reality he keeps getting put in jail. Its almost like hes in another word.";
        }
        if (Command4.equals("Argono")) {
            name2 = "Argono";
            description2 = "This is a janitor that gotten an intire school closed down because he kills children in the laundry room after school hours.";
        }
        if (Command4.equals("Yourmom")) {
            name2 = "Yourmom";
            description2 = "This is your mom, welcome to the real world you say to her one day.";
        }    
            if (Command4.equals("Yourdad")) {
            name2 = "Yourdad";
            description2 = "This is your dad, he came along with all his bad jokes.";
        }
        if (Command4.equals("Cobblestone")) {
            name2 = "Cobblestone";
            description2 = "This is well... Its stone... What did you expect?";
        }
        Random rg = new Random();
        //card1
            Physical1 = rg.nextInt(15);//Physical
        cast1 = rg.nextInt(35);//cast
        heal1 = rg.nextInt(15);//heal
        health1 = rg.nextInt(200) + 200;//health
        MagikaPoints1 = rg.nextInt(180) + 20;//magika points
        //card2
            Physical2 = rg.nextInt(15);//Physical
        cast2 = rg.nextInt(35);//cast
        heal2 = rg.nextInt(15);//heal
        health2 = rg.nextInt(200) + 200;//health
        MagikaPoints2 = rg.nextInt(180) + 20;//magika points

        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("CanoGromear                                     Here`s the cards");
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("Commands are      Punch,Cast,Heal");
        System.out.println("Rules are      Play the game and have fun!");       
        System.out.println("_____________________________________________________________________________________________________________");        
        
        while (true) {
            MagikaPoints1 = MagikaPoints1 + 7;
            MagikaPoints2 = MagikaPoints2 + 7;
                //card1
        System.out.println("Player1 - " + name1);
        
        System.out.println(health1);
        System.out.println("Level of Health");
        
        System.out.println(MagikaPoints1);
        System.out.println("Level of Magika Points");
        
        System.out.println(Physical1);
        System.out.println("Punch - Physical damage");
        
        System.out.println(cast1);
        System.out.println("Cast - Fire damage");
        
        System.out.println(heal1);
        System.out.println("Heal - Magika");

        System.out.println(description1);
            
        
        //scanner
                    System.out.println("enter your Command player 1");
            
            String Command1;
            Scanner reader1 = new Scanner(System.in);
            boolean successful = false;
            while (!successful) {
            Command1 = reader1.nextLine();
            
            // All of the Commands here.
            if (Command1.equals("Punch")) {
                Punch1();
                successful = true;
                
            }
            
            if (Command1.equals("Cast") && MagikaPoints1 >=cast1) {
                Cast1();
                successful = true;
            }
            
            if (Command1.equals("Heal") && MagikaPoints1 >=heal1) {
                Heal1();
                successful = true;
            }
            }
            
            if ((health1 <=0)) {
                System.out.println("Player2 Wins");
                break;
                
            }
            
            System.out.println("_____________________________________________________________________________________________________________");    

            //card2
                            
                 
        System.out.println("Player2 - " + name2);
        
        System.out.println(health2);
        System.out.println("Level of Health");
        
        System.out.println(MagikaPoints2);
        System.out.println("Level of Magika Points");
        
        System.out.println(Physical2);
        System.out.println("Punch - Physical damage");
        
        System.out.println(cast2);
        System.out.println("Cast - Void damage");
        
        System.out.println(heal2);
        System.out.println("Heal - Magika");
    
        
        System.out.println(description2);
        
        
        //scanner
                    System.out.println("enter your Command player 2");
            
            String Command2;
            Scanner reader2 = new Scanner(System.in);
            boolean successful2 = false;
            while (!successful2) {
            Command2 = reader2.nextLine();
 
            // All of the Commands here.
            if (Command2.equals("Punch")) {
                Punch2();
                successful2 = true;
            }
            
            if (Command2.equals("Cast") && MagikaPoints2 >=cast2) {
                Cast2();
                successful2 = true;
            }
            
            if (Command2.equals("Heal") && MagikaPoints2 >=heal2) {
                Heal2();
                successful2 = true;
            }
            
            if ((health2 <=0)) {
                System.out.println("Player1 Wins");
                break;
                
            }
        }
    }

        //main command selections
         
    }
    public static void Punch1() {
        health2 = health2 - Physical1;
                      
    }
    public static void Cast1() {
        health2 = health2 - cast1;
                MagikaPoints1 = MagikaPoints1 - cast1;
    }
    public static void Heal1() {
        health1 = health1 + heal1;
                MagikaPoints1 = MagikaPoints1 - heal1;
    }

            

       
            
        //main command selections
    
    public static void Punch2() {
        health1 = health1 - Physical2;
                      
    }
    public static void Cast2() {
        health1 = health1 - cast2;
                MagikaPoints2 = MagikaPoints2 - cast2;
    }
    public static void Heal2() {
        health2 = health2 + heal2;
                MagikaPoints2 = MagikaPoints2 - heal2;
                
    }
    
}