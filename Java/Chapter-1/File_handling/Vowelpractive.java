import java.util.Scanner;
import java.io.FileWriter;
 //this is one of the easiest program in java that is to find the vowels and consonants.
 public class Vowelpractive{
  public static void main(String[] args){

    Scanner input=new Scanner(System.in);
    System.out.println("Enter a word:");
    String word=input.nextLine().toLowerCase();
        try{
          FileWriter vowelFile=new FileWriter("vowel.txt", true);
          FileWriter consonentFile=new FileWriter("consonent.txt", true);

          for(int i=0;i<word.length();i++){
            char chh=word.charAt(i);

            if(Character.isLetter(chh)){
              if(chh=='a'|| chh=='e'||chh=='i'||chh=='o'||chh=='u'){
                vowelFile.write(chh+"\n");
              }else{
                consonentFile.write(chh+"\n");
              }
              
            }
          }
          vowelFile.close();
              consonentFile.close();
        }catch(Exception e){
          System.out.println("error writing to file:"+e.getMessage());
        }
        input.close();
  }
 }