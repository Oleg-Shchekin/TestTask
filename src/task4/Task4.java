package task4;

public class Task4 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(0, 0, 50, 100);
        Rectangle rectangle2 = new Rectangle(40, -90, 100, 20);
        System.out.println("Is rectangles collission - " + checkCollission(rectangle1, rectangle2));

    }

    private static boolean checkCollission(Rectangle rectangle1, Rectangle rectangle2) {
        double rec1XcoordLeftCorner = rectangle1.getUpperLeftXCoord();
        double rec2XcoordLeftCorner = rectangle2.getUpperLeftXCoord();

        double rec1XcoordRightCorner = rectangle1.getUpperLeftXCoord() + rectangle1.getWidth();
        double rec2XcoordRightCorner = rectangle2.getUpperLeftXCoord() + rectangle2.getWidth();

        double rec1YcoordLeftCorner = rectangle1.getUpperLeftYCoord();
        double rec2YcoordLeftCorner = rectangle2.getUpperLeftYCoord();

        double rec1YcoordRightCorner = rectangle1.getUpperLeftYCoord() - rectangle1.getHeight();
        double rec2YcoordRightCorner = rectangle2.getUpperLeftYCoord() - rectangle2.getHeight();

        if ((rec1XcoordLeftCorner <= rec2XcoordLeftCorner && rec1XcoordRightCorner >= rec2XcoordLeftCorner) &&
                (rec1YcoordLeftCorner >= rec2YcoordLeftCorner && rec1YcoordRightCorner <= rec2YcoordLeftCorner)) {
            return true;
        }
        else if ((rec1XcoordLeftCorner <= rec1XcoordRightCorner && rec1XcoordRightCorner >= rec2XcoordRightCorner) &&
                (rec1YcoordLeftCorner >= rec2YcoordLeftCorner && rec1YcoordRightCorner <= rec2YcoordLeftCorner)) {
            return true;
        }
        else if ((rec1XcoordLeftCorner <= rec1XcoordLeftCorner && rec1XcoordRightCorner >= rec2XcoordLeftCorner) &&
                (rec1YcoordLeftCorner >= rec2YcoordRightCorner && rec1YcoordRightCorner <= rec2YcoordRightCorner)) {
            return true;
        }
        else if ((rec1XcoordLeftCorner <= rec1XcoordRightCorner && rec1XcoordRightCorner >= rec2XcoordRightCorner) &&
                (rec1YcoordRightCorner >= rec2YcoordRightCorner && rec1YcoordRightCorner <= rec2YcoordRightCorner)) {
            return true;
        }
        return false;
    }

}

class Rectangle {
    double upperLeftXCoord;
    double upperLeftYCoord;
    double width;
    double height;

    public Rectangle(double upperLeftXCoord, double upperLeftYCoord, double width, double height ) {
        this.upperLeftXCoord = upperLeftXCoord;
        this.upperLeftYCoord = upperLeftYCoord;
        this.width = width;
        this.height = height;
    }

    public double getUpperLeftXCoord() {
        return upperLeftXCoord;
    }

    public double getUpperLeftYCoord() {
        return upperLeftYCoord;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}