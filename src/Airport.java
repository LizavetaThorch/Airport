class Airport {
    private final String name;
    private final String city;
    private final String cityForTicket;
    private final String zoneName;
    private String airCode;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCityForTicket() {
        return cityForTicket;
    }

    public String getZone() {
        return zoneName;
    }

    public Airport(String name, String city, String cityForTicket, String zoneName) {
        this.name = name;
        this.city = city;
        this.cityForTicket = cityForTicket;
        this.zoneName = zoneName;
    }

    public Airport(String name, String city, String cityForTicket, String zoneName, String airCode) {
        this.name = name;
        this.city = city;
        this.cityForTicket = cityForTicket;
        this.zoneName = zoneName;
        this.airCode = airCode;
    }

    public String getAirCode() {
        return airCode;
    }
    public void setAirCode(String airCode) {
        this.airCode = "dme";
    }
}