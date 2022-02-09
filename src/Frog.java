public class Frog extends myPets
{
    //1.)Instance Variables
    private boolean isPoisionus;
    //2.)Constructors
    public Frog(boolean isPoisionus, boolean isFriendly, String foodType,double amtSleep, String name)
    {
        super (isFriendly, foodType, amtSleep, name);
        this.isPoisionus = isPoisionus;
    }
    //3.)toString
    public String toString()
    {
        String output = super.toString() +
                "\nIs Poisionus: " + isPoisionus;
        return output;
    }
}
