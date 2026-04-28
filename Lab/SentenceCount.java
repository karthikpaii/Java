/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//4. Write a Java program that analyzes a given text string and provides statistics on characters, words,
//and sentences.
class SentenceCount{
    String msg;
    
    SentenceCount(String msg){
        this.msg=msg;
    }
    
    byte wordCount(){
    byte w=0;
    
    for(int i=0;i<msg.length();i++)
    {
        char ch=msg.charAt(i);
        if(ch==' ')
             w++;
    }
    return w;
    
}

 short sentenceCount(){
    short s=0;
    
    for(int i=0;i<msg.length();i++)
    {
        char ch=msg.charAt(i);
        if(ch=='.' || ch=='?' || ch=='!')
             s++;
         
    }
    return s;
    
}
 
 int charCount()
 {
     return (msg.length());
 }
 
 void display()
 {
     System.out.println("Word Count is:"+wordCount());
     System.out.println("Sentence Count is:"+sentenceCount());
     System.out.println("Character Count is:"+charCount());
 }
}



public class SentenceMain {

    public static void main(String[] args) {
        String msg=args[0];
        SentenceCount count= new SentenceCount(msg);
        count.display();
                
    }
    
}
