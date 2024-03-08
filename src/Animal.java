public abstract class Animal {
    public Animal(String type, String name, Size size, String specialCare, int price) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
        this.price  =price;
    }

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    protected int price;


    public String getType() {
        return type;
    }
    public String petAnimal(){
        return this.name+" is now happy.";
    }

    public int getPrice() {
        return price;
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
