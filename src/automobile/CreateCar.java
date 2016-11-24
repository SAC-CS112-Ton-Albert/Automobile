package automobile;

/**
*
* @author albertton
*/
public class CreateCar {
   
 private int Caryear;
 private String Carmake;
 private String Carmodel;
 private String Carname;
 private int CarnumberOfGears;
 private String Carcolor;

 public void CarAttributes(int year, String make, String model, String name, int numberOfGears, String color, int cycle)
 {
  Caryear = year;
  Carmake = make;
  Carmodel = model;
  Carname = name;
  CarnumberOfGears = numberOfGears;
  Carcolor = color;

 }
 public int  returnYear(){
  return Caryear;  
 } 
public String returnMake(){
  return Carmake;  
 }
public String  returnModel(){
 return Carmodel; 
}
public String returnName  (){
 return Carname; 
}
public int  returnCarGears(){
 return CarnumberOfGears;
} 
public String returnColor(){
 return Carcolor; 
} 
 
 
 
}
