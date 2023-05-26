class AirportDatabase {
    private static Airport vnukovo = new Airport(
            "Внуково",
            "Москва",
            "MOSCOW          ",
            "Europe/Moscow"
    );

    private static Airport pulkovo = new Airport(
            "Пулково",
            "Санкт-Петербург",
            "SAINT-PETERSBURG",
            "Europe/Moscow"
    );

    private static Airport vladivostok = new Airport(
            "Владивосток",
            "Владивосток",
            "VLADIVOSTOK     ",
            "Asia/Vladivostok"
    );

    private static Airport koltsovo = new Airport(
            "Кольцово",
            "Екатеринбург",
            "YEKATERINBURG   ",
            "Asia/Yekaterinburg"
    );

    /*
    По заданию должен выводить: Неизвестный код аэропорта: (кода аэропорта)
    у меня выводит: Неизвестный код аэропорта: zoneid
     */
    public static Airport getAirportByCode(String airportCode) {
        switch (airportCode) {
            case "VKO":
                return vnukovo;
            case "LED":
                return pulkovo;
            case "SVX":
                return koltsovo;
            case "VVO":
                return vladivostok;
            default:
                Airport dme = new Airport(null, null,null, null, null);
                try {
                    dme.setAirCode(airportCode);
                    return dme;
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                    return dme;
                }
        }
    }
}