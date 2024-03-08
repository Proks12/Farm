public abstract class Animal {
    public Animal(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;


    public String getType() {
        return type;
    }
    public String petAnimal(){

        return this.name+" is now happy.";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
