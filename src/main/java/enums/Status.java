package enums;

enum Status {

    GOOD("Хорошист");

    private String status1;
    private Status(String status1) {
        this.status1 = status1;
    }

    public String getStatus1 () {
        return status1;
    }
}
