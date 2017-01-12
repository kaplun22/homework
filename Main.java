package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try {
         FileInputStream  inFile = new FileInputStream("F:\\untitled\\hw.txt");
            byte[] str = new byte[inFile.available()];
            inFile.read(str);
            String text = new String(str);
            String[] words =text.split(" ");
            Scanner scanner = new Scanner(System.in);
            System.out.println( "Введите порядковый номер слова в документе");
            int i = scanner.nextInt();
            System.out.println(words[i-1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Слова с таким порядковым номером не существует");

        }

    }
}
