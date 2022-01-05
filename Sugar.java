import java.util.ArrayList;
class Sugar extends Cookie{
String shape = "";
boolean decorated = false;
boolean baked = false;
String getShape(){
  return shape;
}
Boolean getDecorated(){
  return decorated;
}
Boolean getBaked(){
  return baked;
}
void setShape(String theShape){
    shape = theShape; }
void setDecorated(boolean theDecorated){
  decorated = theDecorated;
}
void setBaked(boolean theBaked){
  baked = theBaked; 
}
void print(){
  String cookieDecorated = "";
  if(decorated == true){
      cookieDecorated = "The cookies were decorated";
    }else{
      cookieDecorated = "You need to decorate cookies";
    }
  String cookieBaked = "";
  if(baked == false){
    cookieBaked = "Make sure to bake the cookies first";
  }else{
    cookieBaked = "Don't bake the cookies";
  }
    System.out.println(cookieDecorated);
    System.out.println(cookieBaked);
   
    
    
}

  
}