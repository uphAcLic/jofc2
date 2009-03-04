package jofc2.model.axis;

public class YLabel extends Label{
    private Integer y;

    public YLabel() {
    }

    public YLabel(String text, Integer y) {
        super(text);
        this.y = y;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
