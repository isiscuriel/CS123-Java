public class vehicle extends Person  {
  
 String mName;
 int cylinders;
 Person owner = new Person();
public vehicle (String m, int c, Person owner){
this.mName = m;
this.cylinders = c;
this.owner = owner;
}
public void setCylinders (int x) {
this.cylinders=x; 
}
public int getCylinders(){
return cylinders;
}
public void setmName (String y) {
this.mName=y; 
}
public String getmName(){
return mName;
}

/*
public boolean equals(other vehicle) {


}
*/
}


