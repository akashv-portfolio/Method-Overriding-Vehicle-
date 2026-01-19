public class vstart{
  public static void main(String args[]){
    bike b1=new bike();
    car c1=new car();
    b1.start();
    c1.start();
  }
}

class vehicle{
  void start(){
    System.out.println("Vehicle starts");
  }
}

class car extends vehicle{
  void start(){
    System.out.println("Car Starts");
  }
}

class bike extends vehicle{
  void start(){
    System.out.println("Bike Starts");
  }
}