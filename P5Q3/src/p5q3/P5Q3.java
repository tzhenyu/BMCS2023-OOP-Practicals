/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q3;

/**
 *
 * @author TAR UMT
 */
public class P5Q3 {

    public static void main(String[] args) {
        String title = args[args.length - 1];
        String fullName = "";
        String fullName1 = "";
        //System.out.println(title);
        for(int i = 0; i<args.length; i++){
            fullName = args[i].toLowerCase();
            
            if(fullName.charAt(0) == '['){
                fullName = fullName.replace(fullName.charAt(1), Character.toUpperCase(fullName.charAt(1)));
            }
            else
                fullName = fullName.replace(fullName.charAt(0), Character.toUpperCase(fullName.charAt(0)));
            fullName1 += fullName + " ";
        }
         System.out.println("To: " + fullName1);
         System.out.println("Wishing you merry chrismas, " + title);
         
         
    }
    
}
