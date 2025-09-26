public class DebugPen
{
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;  
        this.point = point;   
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}

/* 
 Just 2 problems, both in the parameterized constructor. 
 I added this. so the instance variables actually get the 
 values passed in.
*/