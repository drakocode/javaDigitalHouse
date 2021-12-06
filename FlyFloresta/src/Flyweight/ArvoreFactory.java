package Flyweight;
import java.util.HashMap;
import java.util.Map;

import DTO.ArvoreDTO;

public class ArvoreFactory {
    private static Map<String, ArvoreDTO> arvoreFlyweight = new HashMap<>();

    public ArvoreDTO getArvore(int altura,int largura, String cor){
        String id="cor " + cor + ": " + altura+ ": " + largura;
        System.out.println(id);

        if(!arvoreFlyweight.containsKey(id)){
            arvoreFlyweight.put(id, new ArvoreDTO(altura, largura, cor));
            System.out.println("arvore plantada");
            return arvoreFlyweight.get(id);
        }
        System.out.println("arvore obtida");
        return arvoreFlyweight.get(id);

    }


}

