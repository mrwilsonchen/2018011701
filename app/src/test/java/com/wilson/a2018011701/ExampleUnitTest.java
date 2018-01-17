package com.wilson.a2018011701;

import com.wilson.a2018011701.data.Student;
import com.wilson.a2018011701.data.StudentScoreDAO;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test_add_data() throws Exception {
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1, "Bob", 95));
        dao.add(new Student(2, "Mary", 90));
        assertEquals(2, dao.getList().size());
    }

    @Test
    public void test_add_data2() throws Exception {
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1, "Bob", 95));
        dao.add(new Student(2, "Mary", 90));
        assertEquals(90, dao.getList().get(1).score);
    }
    @Test
    public void test_getStudent() throws Exception {
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1, "Bob", 95));
        dao.add(new Student(2, "Mary", 90));
        assertEquals(90, dao.getStudent(2).score);
    }
    @Test
    public void test_getStudent1() throws Exception {
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1, "Bob", 95));
        dao.add(new Student(2, "Mary", 90));
        assertEquals(null, dao.getStudent(3));
    }
}