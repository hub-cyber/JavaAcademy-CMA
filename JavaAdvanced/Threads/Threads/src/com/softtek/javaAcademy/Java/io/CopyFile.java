package com.softtek.javaAcademy.Java.io;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\Usuario\\Documents\\GitHub\\JavaAcademy-CMA\\JavaAdvanced\\Threads\\Threads\\src\\com\\softtek\\javaAcademy\\Java\\io\\Input.txt\\");
         out = new FileOutputStream("C:\\Users\\Usuario\\Documents\\GitHub\\JavaAcademy-CMA\\JavaAdvanced\\Threads\\Threads\\src\\com\\softtek\\javaAcademy\\Java\\io\\Output.txt\\");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}