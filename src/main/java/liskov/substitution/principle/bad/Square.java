package liskov.substitution.principle.bad;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        setBothSides(width);
    }

    @Override
    public void setHeight(int height) {
        setBothSides(height);
    }

    private void setBothSides(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

}
