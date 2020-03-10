public class Train{
  int xPos;
  int yPos;
  private final int xRefer;
  ArrayList<RailCar> cars = new ArrayList<RailCar>();
  public Train(int x, int y){
    xPos = x; yPos = y; xRefer = xPos;
  }
  public void addCar(String carName, Color carColor){
    int size = cars.size();
    switch (carName){
      case "Locomotive":
        RailCar loco = new Locomotive(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(loco);
      case "Freight Car":
        
    }

  }
  public void showCars(Graphics g){

  }
}
