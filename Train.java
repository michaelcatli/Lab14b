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

  }
  public void showCars(Graphics g){
    for (RailCar railcar : cars) {
      railcar.drawCar(g);
    }
  }
}
