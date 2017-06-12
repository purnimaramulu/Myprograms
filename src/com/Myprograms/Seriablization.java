package com.Myprograms;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Seriablization
{
    public static void main( String[] args )
    {
       char[] chars = "Puri".toCharArray();
       int i = 0;
        
       for ( char a : chars )
       {
           for ( char b: chars )
           {
               for ( char c : chars )
               {
                   for ( char d: chars )
                 
                   
                   { 
                       System.out.println( ++i + " " + a + b + c + d );
                   }
               }
           }
       }
    }
    
  
}