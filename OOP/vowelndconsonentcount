/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.javaa;


class VowelCount{
    String msg;
    
    VowelCount(String msg){
        this.msg=msg;
    }
    

 short vowelCount(){
    short v=0;
    
    for(int i=0;i<msg.length();i++)
    {
        char ch=msg.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
             v++;
         
    }
    return v;
    
}
 
 int consonentCount()
 {
    int c=0;
    for(int i=0;i<msg.length();i++)
    {
       char ch=msg.charAt(i);
       if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I'&& ch!='O' && ch!='U'){
         c++;
    }}
    return c;
 }
 
 void display()
 {
     System.out.println("Vowel Count is:"+vowelCount());
     System.out.println("Consonent Count is:"+consonentCount());
    
 }
}


class countVoCo {
    public static void main(String[] args)
    {
        String msg=args[0];
        
        VowelCount v=new VowelCount(msg);
        v.display();
        
    }
    
}

