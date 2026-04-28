package practice.ch12;

//장식자 1: 내용물의 양쪽에 테두리를 붙이는 장식자
public class SideBorder extends Border {
    private char borderChar;  // 장식 문자

    // 내용물이 될 Display와 장식 문자를 지정
    public SideBorder(Display display, char ch) { // 첫 번째 인자: 장식 대상
        super(display);
        this.borderChar = ch;
    }

    // 예: "Hello, world." -> "|Hello, world.|"
    @Override
    public int getColumns() {
        // 문자 수는 내용물의 양쪽에 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1;  // 전체 컬럼에 양쪽 장식 문자, 총 2개 더하기
    }

    @Override
    public int getRows() {
        // 행수는 내용물의 행수와 같다 
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
        return borderChar + display.getRowText(row) + borderChar;
    }
}
