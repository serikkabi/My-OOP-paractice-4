package com.company;
import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String QUERY1 = "SELECT * FROM public.\"Fishes\"";
    static final String QUERY2= "SELECT * FROM public.\"Reptilies\"";
    static final String QUERY3 = "SELECT * FROM public.\"Aquariums\"";
    static final String QUERY4 = "SELECT * FROM public.\"Filters\"";
    static final String QUERY5 = "SELECT * FROM public.\"Feed\"";
    static final String QUERY6 = "SELECT * FROM public.\"Toys\"";
    static final String QUERY7 = "SELECT * FROM public.\"Sand\"";

    public static void main(String[] args) throws SQLException {
        // write your code here
        ResultSet rs = null, rs2 = null, rs3 = null, rs4 = null, rs5 = null, rs6 = null ,rs7 = null;
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "715132004")) {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt3 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt4 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt5 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt6 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement stmt7 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(QUERY1);
            rs2 = stmt2.executeQuery(QUERY2);
            rs3 = stmt3.executeQuery(QUERY3);
            rs4 = stmt4.executeQuery(QUERY4);
            rs5 = stmt5.executeQuery(QUERY5);
            rs6 = stmt6.executeQuery(QUERY6);
            rs7 = stmt7.executeQuery(QUERY7);
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        while (rs.next()) {
//            //Display values
//            System.out.print("Fish " + rs.getString("Name"));
//            System.out.print(" is cost " + rs.getInt("Prices")+"tg\n");
//        }
        int i;
        System.out.print(" 1.Fishes\n 2.Reptilies\n 3.Aquariums\n 4.Filters\n 5.Feed\n 6.Toys\n 7.Sand\n");

        System.out.print("Choose number: ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        int io;
        switch (i){
            case 1:
                System.out.print(" 1.Сельд\n 2.Немо\n 3.Пиранья\n 4.Сазан\n");

                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs.absolute(io);
                System.out.println("Fish " + rs.getString(1)+" is cost "+ rs.getString(2));
                break;
            case 2:
                System.out.print(" 1.Snike\n 2.Ящерица\n 3.Turtle\n");
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs2.absolute(io);
                System.out.println("Reptilia " + rs2.getString(1)+" is cost "+ rs2.getString(2));
                break;
            case 3:
                System.out.println(" 1.100 литровой\n 2.50 литровой\n 3.20 литровой\n 4.10 литровой\n" );
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs3.absolute(io);
                System.out.println("Aquarium " + rs3.getString(1)+" is cost "+ rs3.getString(2));
                break;
            case 4:
                System.out.println(" 1.Аквафор WD 1345\n 2.Aquafor GD 5454\n 3.Ecofilter LK 2332\n" );
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs4.absolute(io);
                System.out.println("Filter " + rs4.getString(1)+" is cost "+ rs4.getInt(2));
                break;
            case 5:
                System.out.println(" 1.корм для рыб 2кг\n 2.корм для рыб 5кг\n 3.корм для змей\n 4.корм для черепах\n" );
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs5.absolute(io);
                System.out.println("Feed " + rs5.getString(1)+" is cost "+ rs5.getString(2));
                break;
            case 6:
                System.out.println(" 1.Домик\n 2.Машинка\n 3.Мячик\n 4.Кольцо\n" );
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs6.absolute(io);
                System.out.println("Toy " + rs6.getString(1)+" is cost "+ rs6.getString(2));
                break;
            case 7:
                System.out.println(" 1.Песок речной 1кг\n 2.Песок морской 1кг\n 3.Песок морской 2кг\n 4.Песок речной 2кг\n" );
                System.out.print("Choose number: ");
                io = scanner.nextInt();
                rs7.absolute(io);
                System.out.println("Filter " + rs7.getString(1)+" is cost "+ rs7.getString(2));
                break;
        }
    }
    }

