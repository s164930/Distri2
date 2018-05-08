package UserInterface;

import Logic.Login;
import Logic.GetInfo;

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args){
        Print_Ting ting = new Print_Ting();
        GetInfo getinfo = new GetInfo();
        Login login = new Login();
        Scanner reader = new Scanner(System.in);
        boolean loggedIn = false;
        String token = "";
        String user = "";
        while(!loggedIn){
            System.out.println("Indtast brugernavn til dtu inside");
            user = reader.nextLine();
            System.out.println("Indtast password");
            String pass = reader.nextLine();
            token = login.loginOnDtu(user, pass);
            if(!token.equals("false")){
                loggedIn = true;
            } else {
                System.out.println("Forkert brugernavn eller password, prøv igen");
            }
        }
        int index1 = token.indexOf("\"") + 1;
        int index2 = token.indexOf("\"", index1);
        token = token.substring(index1,index2);


        while(true){
            ting.printMenu();
            System.out.println("Indtast tal for menuvalg");
            int valg = reader.nextInt();
            reader.nextLine();

            switch(valg) {
                case 1:
                    System.out.println(getinfo.getUserInfo(user, token));
                    break;
                case 2:
                    System.out.println("Indtast fra hvornår til hvornår i dette format:");
                    System.out.println("yyyy-mm-dd");
                    System.out.println("Fra hvornår");
                    String from = reader.nextLine();
                    System.out.println("Til hvornår");
                    String to = reader.nextLine();
                    System.out.println(getinfo.getCalendar(user, token, from, to));
                    break;

                case 3:
                    System.out.println(getinfo.getGrades(user, token));
                    break;

                case 4:
                    System.out.println("Indast brugernavn til javabog.dk");
                    String javabogUser = reader.nextLine();
                    System.out.println("Indtast password til javabog.dk");
                    String javabogPass = reader.nextLine();
                    System.out.println(getinfo.loginOnJavabog(javabogUser, javabogPass));
                    break;
                case 5:
                    System.exit(1);
                    break;
            }

        }
    }



}
