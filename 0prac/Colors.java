/*
June 8

*/

public enum Colors {

RED(255,0,0,0),  BLUE(0,0,255,0), GREEN(255,23,12,1), YELLOW(255,255,0,0) ;

private int red;
private int green;
private int yellow;
private int blue;

private Colors(int r, int g, int b, int y){
   red =r;
   green=g;
   yellow=y;
   blue=b;
}

public String rgbValue(){

return String.format("(%d, %d, %d)", red, green, blue);
}

@Override
public String toString(){
   String constantName = super.toString();
   return constantName.substring(0,1) + constantName.substring(1).toLowerCase();
}

}