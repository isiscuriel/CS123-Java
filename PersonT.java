public class PersonT {

    private String name;

    public PersonT()
    {
        name = "No Name Yet";
    }
    public PersonT(String initialName)
    {
        name = initialName;
    }
    public void setName(String newName)
    {
        newName = "";
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    public void writeOutput()
    {
        System.out.println("name: " + name);
    }
    public boolean hasSameName(PersonT otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }

}




