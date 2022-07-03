import java.util.Scanner;
class Grade {
  private String ID;
  private double score;
  private double weight;

  public  Grade (String id, double s, double w){
    ID = id;
    score = s;
    weight = w ;
  }
  public void enterInfo(){
    Scanner input = new Scanner(System.in);
    ID = input.nextLine();
    score = input.nextDouble();
    input.nextLine();
    weight = input.nextDouble();
    input.nextLine();
  }
  public void showInfo(){
    System.out.println("ID: "+ID+
                       " Score: "+score+
                       " Weight: "+weight);
  }
}