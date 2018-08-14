public class Parent{

private int age;
private int year;
public Parent(){
age = 1;
year = 2012;
}

public Parent(int a, int yeaar){
 age =a;
 year = yeaar;
}

public void SetYear(int yeatr){
year = yeatr;

}
public int getYear(){
return year;
}


public String toString(){
return "Year is " + year + " age " + age;
}
}