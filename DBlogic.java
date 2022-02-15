package com.company;

import java.sql.*;

public class DBlogic {


    String DB = "jdbc:mysql://localhost:3306/reg_schema";
    String USER = "root";
    String PASS = "Admin";

   public void insert(String user, String email, String password, double dateOfBirth){
       try(
               Connection conn = DriverManager.getConnection(DB, USER, PASS);
               Statement stmt = conn.createStatement();
       ){
           //Execute
           String sql = "INSERT INTO reg (user, email, password, birthdate) VALUES ('"+user+"','"+email+"','"+password+"', '"+dateOfBirth+"')";

           stmt.executeUpdate(sql);

           System.out.println("Dati saglabāti");


       }catch (SQLException e){
           e.printStackTrace();
       }

     }

     //delete
     public void delete(){
         try(
                 Connection conn = DriverManager.getConnection(DB, USER, PASS);
                 Statement stmt = conn.createStatement();
         ){
             //Execute
             String sql = "DELETE FROM users WHERE id=7"; //ši rindiņa tikai mainas

             stmt.executeUpdate(sql);

             System.out.println("Dati izdzēsti");


         }catch (SQLException e){
             e.printStackTrace();
         }
     }
//update
    public void update(){
        try(
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ){
            //Execute
            String sql = "UPDATE users SET username = 'Mainīts' WHERE id = 2";

            stmt.executeUpdate(sql);

            System.out.println("Dati atjaunoti");


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
//select
public void select(){
    try(
            Connection conn = DriverManager.getConnection(DB, USER, PASS); //izveidojam savienojumu
            Statement stmt = conn.createStatement(); // izveidojusi statmentu
            ResultSet resultSet = stmt.executeQuery("SELECT id, username FROM users"); //selektējam datus
    ){
        //Execute
        //while iet cauri datiem
        while (resultSet.next()){
            //display result from db table
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("Username: " + resultSet.getString("username"));
            System.out.println(" ");
        }


    }catch (SQLException e){
        e.printStackTrace();
    }
}





}




