package tomaszkarman.com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class SpawarkaTest {


        CRUDSpawarki crud = new CRUDSpawarki();

        @Before
        public void before() {

                Spawarka spawarka1 = new Spawarka("Dunlop", "TIG", 1234, false);
                Spawarka spawarka2 = new Spawarka("Avanger", "TIG", 1235, false);
                crud.listaSpawarek.add(spawarka1);
                crud.listaSpawarek.add(spawarka2);
        }

        @Test
        public void doesListaSpawarekExists() {
                assertNotNull(crud);
        }

        @Test
        public void howManyElement() {
                assertEquals(2, crud.listaSpawarek.size());
        }

        @Test
        public void getByID(){
                //assertNotNull (crud.listaSpawarek.get(0));
                assertNotNull(crud.getByID(1234));
        }


        @Test(expected = IllegalArgumentException.class)
        public void deletingElement() {
                crud.removeSpawarka(crud.getByID(1235));
                 Spawarka s2 = crud.getByID(1235);
        }


        @Test
        public void renameElement() {
                crud.renameSpawarka(1234, "Zmiana");
                assertEquals("Zmiana",crud.getByID(1234).getName());
        }
}


