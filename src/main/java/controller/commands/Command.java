package controller.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

    String SIGN_IN_JSP = "/WEB-INF/views/login.jsp";
    String ROOM_LIST_JSP = "/WEB-INF/views/roomList.jsp";
    String ADMIN_HOME_JSP = "/WEB-INF/views/roomListAdmin.jsp";
    String REGISTRATION_PAGE_JSP = "/WEB-INF/views/registration.jsp";
    String ERROR_PAGE = "/WEB-INF/views/error.jsp";
    String HOME = "/index.jsp";
    String INFO_VIEW = "/WEB-INF/views/infoView.jsp";
    String USER = "/WEB-INF/views/userHomePage.jsp";
    String CREATE_ROOM = "/WEB-INF/views/createRoom.jsp";

    String APARTMENTS_FOR_ORDER = "/WEB-INF/views/apartments_selection.jsp";
    String CLIENT_BILLS_JSP = "/WEB-INF/views/bills_page.jsp";

    String execute(HttpServletRequest request, HttpServletResponse response);
}

