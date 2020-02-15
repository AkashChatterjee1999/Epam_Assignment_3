package com.Akash;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
        int con = 1;
        do {
            obj.print("     Welcome to Assignemnt 3\n");
            obj.print("Press 1 to run program 1\n");
            obj.print("Press 2 to run Program 2\n");
            obj.print("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Program1 obj1 = new Program1();
                    obj1.calculate();
                    break;
                case 2:
                    Program2 obj2 = new Program2();
                    obj2.calculate();
                    break;
                default:
                    obj.print("Wrong choice\n");
            }
            obj.print("Press 0 to stop\n");
            con = sc.nextInt();
        }while (con!=0);
    }
}