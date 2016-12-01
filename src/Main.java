import processing.core.PApplet;

public class Main extends PApplet {
    private int n = 0, c = 15;
    private float angle = 137 + random(1);

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        size(720, 480);
        smooth(2);
    }

    public void setup() {
        background(51);
        colorMode(HSB, 1000, 100, 100);
    }

    public void draw() {
        for (int i = 0; i < n; i++) {
            float a = i * angle;
            float r = c * sqrt(i);
            float x = (r * cos(a)) + width/2;
            float y = (r * sin(a)) + height/2;
            fill(i%1000, 100,100);
            noStroke();
            ellipse(x, y, 10, 10);
        }
        n++;
    }
}