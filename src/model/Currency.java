package model;

public class Currency {
    private String code;
    private String name;
    private String[] conversioRates;

    public Currency(String code, String name, String[] conversioRates) {
        this.code = code;
        this.name = name;
        this.conversioRates = conversioRates;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getConversioRates() {
        return conversioRates;
    }

    public void setConversioRates(String[] conversioRates) {
        this.conversioRates = conversioRates;
    }
}
