package controller.commands.mainCommand.util;

public enum Util {

    SIGN_IN("login_submit"),
    LOGIN_PAGE("login"),
    ERROR_PAGE("error"),
    REGISTRATION("registration"),
    SHOW_REGISTRATION("show_registration"),
    LOG_OUT("log_out"),
    INFO_PAGE("info_page"),
    USER_HOME_PAGE("user_home_page"),
    ROOM_LIST("room_list"),
    ADMIN_ROOM_LIST("admin_home_list"),
    CREATE_ROOM("create_room"),
    SHOW_CREATE("show_create"),

    CHOSE_APARTMENT_BY_ADMIN("chose_apartment"),
    SEND_BILL_TO_CLIENT("create_bill"),
    CLIENT_BILLS_PAGE("bills-page"),
    CHANGE_LOCALE("change-locale"),
    BILL_PAYMENT("billPayment"),
    REJECT_ORDER("reject-order");


    private String path;

    Util(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

