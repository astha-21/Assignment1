public class Animal{
   public void sound(){
      System.out.println("Animal is making a sound");   
   }
}
class Question_7 extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
    	Animal obj = new Question_7();
    	obj.sound();
    }
}