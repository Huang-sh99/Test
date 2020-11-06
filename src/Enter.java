public class Enter {
  public static void main(String[] args) {

    Vehicle truck = DrinkFactory.maleVenicle(1);
    truck.move();

    Vehicle car = DrinkFactory.maleVenicle(2);
    car.move();
  }
}
