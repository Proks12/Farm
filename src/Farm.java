import java.net.Proxy;
import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> barnBig = new ArrayList<>();
    private int maxBigBarn = 10;
    ArrayList<Animal> barnSmall = new ArrayList<>();
    private int maxSmallBarn = 10;
    ArrayList<Flower> field = new ArrayList<>();
    private int maxField = 5;

    public void addToBarn(Animal animal){
        switch (animal.size){
            case BIG -> {
                if (barnBig.size()<=maxBigBarn){
                    barnBig.add(animal);
                }
            }
            case SMALL -> {
                if (barnSmall.size()<=maxSmallBarn){
                    barnSmall.add(animal);
                }
            }
            }
    }
    public void addToField(Flower flower){
        if (field.size()<=maxField){
            field.add(flower);
        }
    }

}





