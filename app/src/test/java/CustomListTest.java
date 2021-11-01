import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        City city = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(city);
        assertEquals(size + 1, list.getCount());
    }
}
