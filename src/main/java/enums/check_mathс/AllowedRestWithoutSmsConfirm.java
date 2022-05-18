package enums.check_mathс;

public enum AllowedRestWithoutSmsConfirm {

    CHANGE_PASSWORD("change-password"),
    OTP_SOURCES("otp-sources"),
    SEND_OTP_SMS("send-otp-sms"),
    OTP_CHECK("otp-check"),
    ;

    private String api;

    AllowedRestWithoutSmsConfirm(String api) {
        this.api = api;
    }

    public String getApi() {
        return api;
    }

    public static Boolean isApiAllowed(String api) {
        for (AllowedRestWithoutSmsConfirm nameApi : AllowedRestWithoutSmsConfirm.values()) {
            if (nameApi.getApi().equals(api)) {
                System.out.println("YES!!!!!!!!!!!");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String rest = "otp-check";

        isApiAllowed(rest);
    }
}
