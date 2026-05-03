/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class SentenceCount{
    String msg;
    
    SentenceCount(String msg){
        this.msg=msg;
    }
    
    short wordCount(){
    short w=0;
    
    for(int i=0;i<msg.length();i++)
    {
        char ch=msg.charAt(i);
        if(ch==' ')
             w++;
    }
    if(msg.length()>0){
      w++;
    }
    return w;
}

 byte sentenceCount(){
    byte s=0;
    
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
    int c=0;
    for(int i=0;i<msg.length();i++)
    {
        char ch=msg.charAt(i);
        if(ch!=' ')
             c++;
         
    }
    return c;
 }
 
 void display()
 {
     System.out.println("Word Count is:"+wordCount());
     System.out.println("Sentence Count is:"+sentenceCount());
     System.out.println("Character Count Without Space is:"+charCount());
     System.out.println("Character Count With Space is:"+msg.length());
 }
}



public class PracticePython {

    public static void main(String[] args) {
        String msg=args[0];
        SentenceCount count1= new SentenceCount(msg);
        SentenceCount count2 = new SentenceCount(args[1]);
        SentenceCount count3 = new SentenceCount(args[2]);
        count1.display();
        count2.display();
        count3.display();
                
    }
    
}
