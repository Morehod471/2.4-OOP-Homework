package Transport;

public class Mechanic {
    private String nameSurname;
    private String company;

    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public String setDiagnostic (Transport carA) {
        return "Транспорт " + carA + " прошла диагностику";
    }

    public String repairTransport(Transport carB) {
        return "Транспорт " + carB + " починили";
    }
}
