import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity(new City("Edmonton", "AB")));
    }

    @Test
    public void deleteCity() {
        list.addCity(new City("Halifax", "NS"));
        list.deleteCity(new City("Halifax", "NS"));
        assertFalse(list.hasCity(new City("Halifax", "NS")));
    }

    @Test
    public void countCities() {
        list.addCity(new City("Halifax", "NS"));
        assertEquals(1, list.countCities());
    }

}
