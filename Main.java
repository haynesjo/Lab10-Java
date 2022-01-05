import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Cookie cookie = new Cookie();
    cookie.setCookies(10);
    cookie.setTemperature(350);
    cookie.setMinutes(12);
    cookie.setCooked(true);
    //cookie.setDecorated(true);
    Sugar sugar = new Sugar();
    cookie.setCookies(10);
    cookie.setTemperature(350);
    cookie.setMinutes(12);
    cookie.setCooked(true);
    sugar.setDecorated(true);
    sugar.setBaked(false);
    cookie.print();
    sugar.print();
  }
}