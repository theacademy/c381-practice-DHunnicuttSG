package org.example.FileIO;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        //writeToFile();
        readFromFile();
    }

    public static void writeToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("output.txt", true));
        out.println("001::Ada::Lovelace::Java March 2024");
        out.println("002::Charles::Babbage::Java March 2024");
        out.println("003::Alan::Turing::Java March 2024");
        out.flush();
        out.close();
    }

    public static void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("output.txt")));
        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] myData = currentLine.split("::");
            Student student = new Student();
            student.setStudentId(myData[0]);
            student.setFirstName(myData[1]);
            student.setLastName(myData[2]);
            student.setCohort(myData[3]);

            System.out.print(student.getStudentId() + " ");
            System.out.print(student.getFirstName() + " ");
            System.out.print(student.getLastName() + " ");
            System.out.print(student.getCohort() + "\n");
            //System.out.println(currentLine);
        }
    }
}
