import java.*;

public class bitwise {
    private short coord;

    public bitwise (int x, int y) {
        coord = 0;
        setHigh(x);
        setLow(y);
    }

    public void setHigh(int x) {
        coord = (short)(coord & (x<<8));
    }

    public void setLow(int y) {
        coord = (short)(coord & y);
    }

    public int getHigh() {
        return (coord >> 8);
    }

    public int getLow() {
        return (coord & 0x00000000);
    }

    public static void main(String[] args) {
        bitwise test = new bitwise(200, 200);
        System.out.print(test.getHigh() + test.getLow());
    }
}