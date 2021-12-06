package serviceTest;

import impl.implModel.DentistaDaoH2;
import model.Dentista;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.DentistaService;

import java.util.List;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DentistaServiceTest {

    private static DentistaService dentistaService=new DentistaService(new DentistaDaoH2());



    @BeforeClass
    public static void cadastrarDentistas(){

        Dentista dentista0 =  dentistaService.save(new Dentista(1,"Erik","Kayser",888));
        Dentista dentista1 =  dentistaService.save(new Dentista(2,"Ana","Baumann",333));
        Dentista dentista2 =  dentistaService.save(new Dentista(3,"Vitoria","Amabyle",444));


    }

    @Test
    public void SaveNSearch(){
        Dentista dentista=dentistaService.save(new Dentista(4,"João","Silva",555));

        Assert.assertNotNull(dentistaService.search(dentista.getId()));
    }

    @Test
    public void deleteTest(){
        dentistaService.delete(6);
        Assert.assertTrue(dentistaService.search(6).isEmpty());
    }


    @Test
    public void searchAllTest(){
        List<Dentista> dentistas = dentistaService.searchAll();
        Assert.assertTrue(!dentistas.isEmpty());

        //verifique antes a quantidade de itens na lista
        Assert.assertTrue(dentistas.size()==2);
        System.out.println(dentistas);
    }
}
