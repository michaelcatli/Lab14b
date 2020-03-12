import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Train{
  int xRefer;
  int yPos;
  ArrayList<RailCar> cars;
  public Train(int x, int y){
    xRefer = x; yPos = y; cars = new ArrayList<RailCar>();
  }
  public void addCar(String carName, Color carColor){
    int size = cars.size();
    switch (carName){
      case "Locomotive":
        RailCar loco = new Locomotive(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(loco);
        break;
      case "Freight Car":
        RailCar freight = new FreightCar(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(freight);
        break;
      case "PassengerCar":
        RailCar passenger = new PassengerCar(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(passenger);
        break;
      case "Caboose":
        RailCar caboose = new Caboose(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(caboose);
        break;
      default:
        RailCar railc = new RailCar(carColor,(xRefer + (150*size) + (25*size)),yPos);
        cars.add(railc);
        break;
    }

  public void addCar(int index, String carName, Color carColor){
    int size = cars.size();
    int largestindex = size - 1;
    if (largestindex >= (index)){ //writing it this way will always assume there are cars to the right of the new placement so we don't have to make an if statement to check if there are cars to the right.. then we can make an elif and call on the other version of this method
      for (int x = index; x<=largestindex; x++){
        cars[x].//access attributes of the cars and everything and change the positions and all... then do the adding in array
      }
    }
  }


  public void showCars(Graphics g){
    for (RailCar railcar : cars) {
      railcar.drawCar(g);
    }
  }
}
