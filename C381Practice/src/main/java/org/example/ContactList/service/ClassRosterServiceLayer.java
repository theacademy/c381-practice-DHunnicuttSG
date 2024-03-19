package org.example.ContactList.service;

import org.example.ContactList.dao.ClassRosterPersistenceException;
import org.example.ContactList.dto.Student;
import java.util.List;

public interface ClassRosterServiceLayer {

    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;

    List<Student> getAllStudents() throws ClassRosterPersistenceException;

    Student getStudent(String studentId) throws ClassRosterPersistenceException;

    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}
