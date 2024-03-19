package org.example.ContactList.service;

import org.example.ContactList.dao.ClassRosterDao;
import org.example.ContactList.dao.ClassRosterPersistenceException;
import org.example.ContactList.dto.Student;

import java.util.List;

public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer{
    ClassRosterDao dao;

    public ClassRosterServiceLayerImpl(ClassRosterDao dao) {
        this.dao = dao;
    }

    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException,
            ClassRosterDataValidationException, ClassRosterPersistenceException {
        if (dao.getStudent(student.getStudentId()) != null) {
            throw new ClassRosterDuplicateIdException(
                    "ERROR: Could not create student.  Student Id "
                            + student.getStudentId()
                            + " already exists");
        }
        validateStudentData(student);
        dao.addStudent(student.getStudentId(), student);
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.removeStudent(studentId);
    }

    private void validateStudentData(Student student) throws ClassRosterDataValidationException {
        if (student.getFirstName() == null
        || student.getFirstName().trim().isEmpty()
        || student.getLastName() == null
        || student.getLastName().trim().isEmpty()
        || student.getCohort() == null
        || student.getCohort().trim().isEmpty()) {
            throw new ClassRosterDataValidationException(
                    "ERROR: All fields [First Name, Last Name, Cohort] are required");
        }
    }
}
