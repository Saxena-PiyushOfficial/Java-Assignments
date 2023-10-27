package Day4;

public class Box {
private double height;
private double width;
private double depth;

Box(double height,double width,double depth)
{
	this.height=height;
	this.depth=depth;
	this.width=width;
	
}
public String getBoxDetails(){
	return "Box Dimensions are :width: "+ this.width +" height: "+this.height +" depth: "+this.depth;
	
}
public double getBoxVol()
{
	return  width*height*depth;
}
public void setWidth() {
	width = width*2;
}
public double getWidth() {
	return width;
}
}
