package com.passion.dataAccessObject;

import java.util.List;

/**
 * @author lsl
 * @date 2020/6/5
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
