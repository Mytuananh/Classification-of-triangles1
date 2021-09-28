import static org.junit.jupiter.api.Assertions.*;

class ClassificationOfTrianglesTest {

    @org.junit.jupiter.api.Test
    void getTriangles() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "equilateral triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getTriangles1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "isosceles triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getTriangles2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "regular triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getTriangles3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Not a triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getTriangles4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Not a triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void getTriangles5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Not a triangle";
        String result = ClassificationOfTriangles.getTriangles(a, b, c);
        assertEquals(expected, result);
    }

}