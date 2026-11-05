package Puck;

public class Hockey 
{
	public static void main(String[] args) 
	{
		Puck youthPuck = new Puck(4);
		Puck adultPuck = new Puck(5.5);
		
		//Youth Puck
		System.out.println(youthPuck.getDivision());
		System.out.println("The Youth Puck has weight " + youthPuck.getWeight() + " ounces");
		
		System.out.println("The Youth puck has radius " + youthPuck.getRadius() + " and thickness " + youthPuck.getThickness());
		
		//Adult Puck
		System.out.println(adultPuck.getDivision());
		System.out.println("The adult Puck has weight " + adultPuck.getWeight() + " ounces");
		
		System.out.println("The adult puck has radius " + adultPuck.getRadius() + " and thickness " + adultPuck.getThickness());
		
		
		if(youthPuck.compareTo(adultPuck) < 0) 
		{
			System.out.println("The youth puck is smaller than the adult puck");
		}
		else if(youthPuck.compareTo(adultPuck) == 0) 
		{
			System.out.println("The youth puck is the same size as the adult puck");
		}
		else 
		{
			System.out.println("The youth puck is larger than the adult puck");
		}
		
		//true or false if youth puck is equal to adult puck
		System.out.println(youthPuck.equals(adultPuck));
	}
}
