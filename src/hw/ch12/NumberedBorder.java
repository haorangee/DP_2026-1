package hw.ch12;

public class NumberedBorder extends Border {
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    
    // 각 행 앞에 번호를 붙여 출력하는 Decorator
    @Override
    public String getRowText(int row) {
    return String.format("%2d| %s", row + 1, display.getRowText(row));
    }
}
