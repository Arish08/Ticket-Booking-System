/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;


/**
 *
 * @author anonymous
 */
public class Filing {
//    String[] MovieList= new String[5];
    
    String[] readlinedetails(String File, int i) {
        try {
            
            File file=new File(File);
            if(file.exists()==false)
            {
                file.createNewFile();
            }
            
            FileReader fr = new FileReader(File);
            Scanner sc = new Scanner(fr);
            String[] s = new String[i];
            int j=0;
            while (sc.hasNext()==true) {
                s[j] = sc.nextLine();
                j++;
            }
            return s;
        } catch (IOException ex) {
            
            System.out.println("Filing Error in Reading Movie Details");
        }
        return null;
    }
    
    String[][] readworddetails(String File,int m, int l, int k) {
        try {

            File file = new File(File);
            if (file.exists() == false) {
                file.createNewFile();
            }

            FileReader fr = new FileReader(File);
            Scanner sc = new Scanner(fr);
            String[][] s = new String[l][k];
//            int j=0,i=0;
            for (int i = 0; i < m; i++) {
                sc.nextLine();
            }
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < k; j++) {
                    s[i][j]=sc.next();
//                    System.out.println(s[i][j]);
                }
                
            }
            
            return s;
        } catch (IOException ex) {

            System.out.println("Filing Error in Reading Movie Details");
        }
        return null;
    }
    void adddetails(String name,String File)
    {
        try {
         
//         
         BufferedWriter b1 = new BufferedWriter(
        new FileWriter(File, true)); 
       
            b1.write(name);   
            b1.close(); 
        } 
        catch (IOException ex) {
            
            System.out.println("Errors in Addmoviename");
        }
             
    }
    int checklength(String File)
    {
        try {
            FileReader fr = new FileReader(File);
            BufferedReader br = new BufferedReader(fr);
            String s;
            int linecount = 0;
            while ((s=br.readLine())!=null) {
                linecount++;
            }
            return linecount;
        } catch (FileNotFoundException ex) {
            System.out.println("Errors in CheckLength");
        } catch (IOException ex) {
           System.out.println("Errors in ReadLine CheckLength");
        }
        return 0;
    }
    void addtempdetails(String num, String File)
    {
        try {
        
         FileWriter b1 = new FileWriter(File); 
//            b1.newLine();
            b1.write(num);    
            b1.close(); 
        } 
        catch (IOException ex) {
            
            System.out.println("Errors in Addmoviename");
        }
             
    }
     int[] readtempdetails() {
        try {
            File file=new File("tmp");
            if(file.exists()==false)
            {
                file.createNewFile();
            }
            
            FileReader fr = new FileReader("tmp");
            Scanner sc = new Scanner(fr);
            int[] s= new int[3];
            for (int i = 0; i < 3; i++) {
                String j=sc.next();
                s[i] = Integer.parseInt(j);
            }
                
            return s;
        } catch (IOException ex) {
            
            System.out.println("Filing Error in Reading Movie Details");
        }
        return null;
    }
     String[] readtempdetailing(String File,int k,int l) {
        try {
            File file=new File(File);
            if(file.exists()==false)
            {
                file.createNewFile();
            }
            
            FileReader fr = new FileReader(File);
            Scanner sc = new Scanner(fr);
            int j=checklength(File);
            String[][] s= new String[j][l];
            String[] line= new String[5];
            for (int a = 0; a < j; a++) {
            for (int i = 0; i < l; i++) {
                s[a][i]=sc.next();
            }    
            }
            return line=s[j-k];
            
        } catch (IOException ex) {
            
            System.out.println("Filing Error in Reading Movie Details");
        }
        return null;
    }

       void replacedetails(String a, String total, String File)
       {
           try{
               
            BufferedWriter b1 = new BufferedWriter(
            new FileWriter(File, true)); 
            
               b1.write(total+"\n");   
            b1.close(); 
           }
           catch (IOException ex) {
            
            System.out.println("Filing Error in Reading Movie Details");
        }
               
       }
       String[][][] readworddetails3(String File,int m, int l, int k) {
        try {

            File file = new File(File);
            if (file.exists() == false) {
                file.createNewFile();
            }

            FileReader fr = new FileReader(File);
            Scanner sc = new Scanner(fr);
            String[][][] s = new String[m][l][k];
//            int j=0,i=0;
            for (int p = 0; p < m; p++) {
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < k; j++) {
                    s[p][i][j]=sc.next();
                    System.out.print(s[p][i][j]+" ");
                }
                System.out.println("");
            }
            }
            
            return s;
        } catch (IOException ex) {

            System.out.println("Filing Error in Reading Movie Details");
        }
        return null;
    }
     
}
