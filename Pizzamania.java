import java.util.*;
class Pizzamania
{
public static void main(String args[])
{
System.out.println("Enter the type of Pizza you want: ");
System.out.println("___________________________________");
System.out.println("For Veg Pizza press '1' : ");
System.out.println("For NonVeg Pizza press '2' : ");
System.out.println("For Deluxe Veg Pizza press '3' : ");
System.out.println("For Deluxe NonVeg Pizza press '4' : ");
System.out.println("Response: ");

 
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
switch(ch)
{
case 1:
	Pizza vegpizza=new Pizza(300);


break;
case 2:
	Pizza nonvegpizza=new Pizza(400);


break;
case 3:
	DeluxePizza deluxevegpizza=new DeluxePizza(550);


break;
case 4:
	DeluxePizza deluxenonvegpizza=new DeluxePizza(650);


break;
}



}
}



class Pizza
{
int a;
Pizza(int a)
{
this.a=a;
Scanner sc=new Scanner(System.in);
System.out.println("Want to Add Extra Topping(1/0): ");
int ch1=Integer.parseInt(sc.nextLine());
if(ch1==1)
{
addExtraTopping();
}
System.out.println("Want to Add Extra Cheese(1/0): ");
int ch2=Integer.parseInt(sc.nextLine());
if(ch2==1)
{
addExtraCheese();
}
System.out.println("Wanna TakeAway(1/0): ");
int ch3=Integer.parseInt(sc.nextLine());
if(ch3==1)
{
takeAway();
}
getBill();
}
public void addExtraTopping()
{
int x=150;
a=a+x;
}
public void addExtraCheese()
{
int y=100;
a=a+y;
}


public void takeAway()
{
int z=20;
a=a+z;
}
public void getBill()
{
System.out.println("Total Bill: "+a);
System.out.println("--------------------------------------------------------------------------------------------------------");
}
}

class DeluxePizza
{
int x=150;
int y=100;
int a;
DeluxePizza(int a)
{
this.a=a;
Scanner sc=new Scanner(System.in);
System.out.println("Wanna TakeAway(1/0): ");
int ch3=Integer.parseInt(sc.nextLine());
if(ch3==1)
{
takeAway();
}
getBill();
}
public void takeAway()
{
int z=20;
a=a+z;
}
public void getBill()
{
a=a+x+y;
System.out.println("Total Bill: "+a);
System.out.println("--------------------------------------------------------------------------------------------------------");
}
}
