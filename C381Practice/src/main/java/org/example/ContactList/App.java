package org.example.ContactList;

import org.example.ContactList.controller.ClassRosterController;
import org.example.ContactList.dao.ClassRosterDao;
import org.example.ContactList.dao.ClassRosterPersistenceException;
import org.example.ContactList.dao.ClassRosterDaoFileImpl;
import org.example.ContactList.service.ClassRosterServiceLayer;
import org.example.ContactList.service.ClassRosterServiceLayerImpl;
import org.example.ContactList.ui.ClassRosterView;
import org.example.ContactList.ui.UserIO;
import org.example.ContactList.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) throws ClassRosterPersistenceException {
        UserIO myIO = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIO);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao);

        ClassRosterController controller = new ClassRosterController(myService, myView);
        controller.run();
    }
}
