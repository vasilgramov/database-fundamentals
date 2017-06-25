package massdefect.domains.dtos.json;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class SolarSystemImportDto implements Serializable {

    @Expose
    private String name;

    public SolarSystemImportDto() {
        super();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
