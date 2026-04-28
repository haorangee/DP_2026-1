package practice.ch12;

// 중심 컴포넌트( "Hello, world." 같은 문자열을 표시하는 클래스)
public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {  // 가로 문자 수
        return string.length();
    }

    @Override
    public int getRows() {  //행의 개수
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;  //0번째 행
    }
}
