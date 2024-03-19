package org.example.ContactList.controller;

import org.example.ContactList.dao.ClassRosterDao;
import org.example.ContactList.dao.ClassRosterPersistenceException;
import org.example.ContactList.dto.Student;
import org.example.ContactList.service.ClassRosterDataValidationException;
import org.example.ContactList.service.ClassRosterDuplicateIdException;
import org.example.ContactList.service.ClassRosterServiceLayer;
import org.example.ContactList.ui.ClassRosterView;

import java.util.List;

public class ClassRosterController {

//    private UserIO io = new UserIOConsoleImpl();
    private ClassRosterView view;
    private ClassRosterServiceLayer service;



    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }


    public void run() throws ClassRosterPersistenceException {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }
        }
        exitMessage();
        } catch (ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createStudent() throws ClassRosterPersistenceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {
            Student currentStudent = view.getNewStudentInfo();
            try{
                service.createStudent(currentStudent);
                view.displayCreateStudentSuccessBanner();
                hasErrors = false;
            } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }

    private void listStudents() throws ClassRosterPersistenceException {
        view.displayDisplayAllBanner();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }

    private void viewStudent() throws ClassRosterPersistenceException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = service.getStudent(studentId);
        view.displayStudent(student);
    }

    private void removeStudent() throws ClassRosterPersistenceException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = service.removeStudent(studentId);
        view.displayRemoveStudentBanner();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
