package tomaszkarman.com;

import java.util.ArrayList;
import java.util.List;

public class CRUDSpawarki {

    List<Spawarka> listaSpawarek = new ArrayList<>();


    public void addSpawarka(Spawarka spawarka) {

        listaSpawarek.add(spawarka);
    }

    public void removeSpawarka(Spawarka spawarka) {
        listaSpawarek.remove(spawarka);
    }

    public void renameSpawarka(int id, String name) {
        for (Spawarka spawarka : listaSpawarek) {
            if (spawarka.kod == id) {
                spawarka.name = name;
            }
        }
    }

    public Spawarka getByID (int id) {
        try {
            for (Spawarka s : listaSpawarek) {
                if (s.kod == id)
                    return s;
            }
        }
        catch ( IllegalArgumentException e) {
                //System.out.println("Exception thrown  :" + e);
            }
            //.out.println("Not found");
        throw new IllegalArgumentException("Not found");
        }
    }

