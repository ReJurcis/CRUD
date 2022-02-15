package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DBlogic dBlogic = new DBlogic();
        Scanner scanner = new Scanner(System.in);

//      dBlogic.insert();
//        dBlogic.delete();
//        dBlogic.update();
//        dBlogic.select();

        //Ko tu vēlies darīt? (i)=ievadīt datus (d)=dzēst datus (u)=update datus (s)=select datus

        System.out.println("Esi sveicināc lietotāj");
        System.out.println("Lai reģistretos ievadi savu username");
        String user_username = scanner.nextLine();
        System.out.println("Ievadi savu e-pastu");
        String user_email = scanner.nextLine();
        System.out.println("Ievadi savu paroli");
        String user_password = scanner.nextLine();
        System.out.println("Ievadi savu dzimšanas gadu");
        double user_dateOfBirth = scanner.nextInt();

        dBlogic.insert(user_username, user_email, user_password, user_dateOfBirth);


//        while (true){
//
//
//            String user_choice = scanner.nextLine();
//
//            if(user_choice.equals("i")){
//                dBlogic.insert();
//
//            }else if(user_choice.equals("d")){
//                dBlogic.delete();
//
//            }else if(user_choice.equals("u")){
//                dBlogic.update();
//
//            }else if(user_choice.equals("s")){
//                dBlogic.select();
//
//            }else{
//                System.out.println("Nepareiza darbība");
//                break;
//
//            }
//
//
//        }

    }
}
