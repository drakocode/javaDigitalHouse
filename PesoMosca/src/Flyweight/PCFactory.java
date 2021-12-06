package Flyweight;

import java.util.HashMap;
import java.util.Map;

import DTOPC.PC;

public class PCFactory {

    private static Map<String,PC> pcFlyweight=new HashMap<>();
        public PC getPECE(int ram,int HD){
            String id = "id "+ram+": "+HD;
            System.out.println(id);

            if(!pcFlyweight.containsKey(id)){
                pcFlyweight.put(id, new PC(ram,HD));
                System.out.println("pc criado");
                return pcFlyweight.get(id);
            }
            System.out.println("pc obtido");
            return pcFlyweight.get(id);

        }
    //}
}











