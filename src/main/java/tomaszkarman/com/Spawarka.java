package tomaszkarman.com;

public class Spawarka {
    String name;
    String model;
    Integer kod;
    Boolean status;

    public Spawarka(String name, String model, Integer kod, Boolean status) {
        this.name = name;
        this.model = model;
        this.kod = kod;
        this.status = false;
    }

    public String getName() {
        return name;
    }


    public String getModel() {
        return model;
    }


    public Integer getKod() {
        return kod;
    }


    public void spawaj () {
        this.status = true;
    }
}

