public class ClassificationOfTriangles {
    public static String getTriangles(int a, int b, int c) {
        String triangleEdge = null;
        boolean equilateralTriangle = (a == b && b == c);
        boolean isoscelesTriangle1 = (a == b && b != c);
        boolean isoscelesTriangle2 = (b == c && a != b);
        boolean isoscelesTriangle3 = (a == c && b != c);
        boolean triangle1 = a + b > c;
        boolean triangle2 = a + c > b;
        boolean triangle3 = b + c > a;
        boolean triangle4 = a + b <= c;
        boolean triangle5 = a + c <= b;
        boolean triangle6 = b + c <= a;
        if (triangle1 && triangle2 && triangle3) {
            if (equilateralTriangle) {
                triangleEdge = "equilateral triangle";
            } else if (isoscelesTriangle1 || isoscelesTriangle2 || isoscelesTriangle3) {
                triangleEdge = "isosceles triangle";
            } else{
                triangleEdge = "regular triangle";
            }
        }else if (triangle4 || triangle5 || triangle6){
            triangleEdge = "Not a triangle";
        }
        return triangleEdge;
    }
}
