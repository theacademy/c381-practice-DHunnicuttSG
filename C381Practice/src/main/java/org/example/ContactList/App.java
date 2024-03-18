package org.example.ContactList;

import org.example.ContactList.controller.ClassRosterController;
import org.example.ContactList.dao.ClassRosterDao;
import org.example.ContactList.dao.ClassRosterDaoException;
import org.example.ContactList.dao.ClassRosterDaoFileImpl;
import org.example.ContactList.ui.ClassRosterView;
import org.example.ContactList.ui.UserIO;
import org.example.ContactList.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) throws ClassRosterDaoException {
        UserIO myIO = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIO);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();

        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
}
