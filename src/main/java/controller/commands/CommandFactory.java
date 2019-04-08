package controller.commands;

import controller.commands.mainCommand.*;
import controller.commands.mainCommand.util.Util;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static volatile CommandFactory commandFactory;
//private static final Logger logger = Logger.getLogger(CommandFactory.class);

    private static Map<String, Command> commands = new HashMap<>();

    static {
        commands.put(Util.LOGIN_PAGE.getPath(), new SignInCommand());
        commands.put(Util.REGISTRATION.getPath(), new RegistrationCommand());
        commands.put(Util.LOG_OUT.getPath(), new LogOutCommand());
        commands.put(Util.ERROR_PAGE.getPath(), new ErrorCommand());
        commands.put(Util.SIGN_IN.getPath(), new UserCommand());
        commands.put(Util.SHOW_REGISTRATION.getPath(), new ShowRegistrationPageCommand());
        commands.put(Util.LOG_OUT.getPath(), new LogOutCommand());
        commands.put(Util.INFO_PAGE.getPath(), new InfoCommand());
        commands.put(Util.ROOM_LIST.getPath(), new RoomListCommand());
        commands.put(Util.ADMIN_ROOM_LIST.getPath(), new AdminRoomListCommand());
    }

    public static Command getCommand(String url) {
        Command command = commands.getOrDefault(url, (r,response) ->"/index.jsp");
//        Command command = commands.get(url);
//        logger.info(String.format("get command by url = %s", url));

        if( command == null){
            return new ErrorCommand();
        }

        return command;

    }
}
