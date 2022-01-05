import java.util.ArrayList;
class Cookie{
int cookies;
int temperature; 
int minutes;
boolean cooked; 
Cookie(){
  cookies= 0;
  temperature = 0;
  minutes = 0;
  cooked = false;
}
int getCookies(){
  return cookies;
}
int getTemperature(){
  return temperature;
}
int getMinutes(){
  return minutes;
}
boolean getCooked(){
  return cooked;
}
void setCookies(int theCookies){
  cookies = theCookies;
}
void setTemperature(int theTemperature){
  temperature = theTemperature;
}
void setMinutes(int theMinutes){
  minutes = theMinutes;
}
void setCooked(boolean theCooked){
  cooked = theCooked;
}
void print(){
  System.out.println(cookies + " Cookies were cut into tree");
  System.out.println("The cookies were baked at " + temperature + " degrees F for "+ minutes+ " minutes");
  //System.out.println("Make sure they get " + cookieDecorated);
  }
}