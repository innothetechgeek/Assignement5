package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.LivingArea;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class LivingAreaFactory {

    //singleton
    private static LivingAreaFactory instance=null;

    public LivingAreaFactory(){}

    public static LivingAreaFactory getInstance(){
        if (instance == null) {
            instance = new LivingAreaFactory();
        }
        return instance;
    }
    public static LivingArea createLivingArea(int livingAreaId,
            String name,
            String code,
            List<Animal> animals){
        return new LivingArea.Builder(name)
                .code(code)
                .livingAreaId(livingAreaId)
                .animals(animals)
                .build();
    }
}
