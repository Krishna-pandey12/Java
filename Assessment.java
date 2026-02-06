
public class Assessment {
  int length;
  int breadth;
  void setDimensions(int l, int b){
    length = l;
    breadth = b;

  }
  void displayArea(){
    int area = length * breadth;
    System.out.println("Area of reactangle: " + area);

  }
  public static void main(String[] args){
    Assessment rect = new Assessment();
    rect.setDimensions(5, 10);
    rect.displayArea();
  }
}

// Output:
// Area of reactangle: