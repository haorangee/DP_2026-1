package hw.ch22;

import hw.ch22.command.*;
import hw.ch22.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    
    // 그리기 이력 
    private MacroCommand history = new MacroCommand();
    // 그리는 영역 
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear");
    // 빨간 버튼
    private JButton redButton  = new JButton("red");
    // 초록 버튼
    private JButton greenButton  = new JButton("green");
    // 파란 버튼
    private JButton blueButton  = new JButton("blue");
    //Undo 버튼
    private JButton undoButton = new JButton("undo");
    //Redo 버튼
    private JButton redoButton = new JButton("redo");

    // 생성자 
    public Main(String title) {
        super(title);

        this.addWindowListener(this);

        canvas.addMouseMotionListener(this);  // canvas에 마우스 모션 리스너 등록


    

        redButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        });

        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });

        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });

        //undo 버튼
        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        //redo 버튼
        redoButton.addActionListener(e -> {
            history.redo();
            canvas.repaint();
        });

        //clear 버튼
         clearButton.addActionListener(e -> {
            history.clear();
            canvas.init();
            canvas.repaint();
        });
        
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);
        buttonBox.add(redoButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener용
    @Override
    public void mouseMoved(MouseEvent e) {
    }


    // 커맨드 패턴의 핵심
    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint()); //명령어 객체가 생성됨
        history.append(cmd); // 명령어가 이력에 추가됨
        cmd.execute(); // 명령어가 실행됨 -> canvas에 점이 그려짐
    }

    // WindowListener용 
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
