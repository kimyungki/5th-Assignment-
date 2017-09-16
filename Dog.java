package d0916;

public class Dog extends Animal{
Dog(){
	System.out.println("A new dog has been created!");
}
@Override
public void sleep(){
	System.out.println("A dog sleeps...");
}
@Override
public void eat(){
	System.out.println("A dog eats...");
}
}
