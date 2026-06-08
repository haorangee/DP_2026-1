package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();

    // Undo 시 삭제된 명령을 임시 보관하는 Deque
    private Deque<Command> commandsForRedo = new ArrayDeque<>();


    // 실행 
    @Override
    public void execute() {
        for (Iterator<Command> iterator = commands.descendingIterator(); iterator.hasNext(); ) {
            iterator.next().execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
        commandsForRedo.clear();
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd); // 삭제된 명령을 redo용 Deque에 추가
        } // commands가 비어있으면 아무것도 하지 않음
    }

    // 마지막으로 삭제된 명령을 다시 추가
    public void redo(){
        if(!commandsForRedo.isEmpty()){
            Command cmd = commandsForRedo.pop();
            commands.push(cmd); // redo용 Deque에서 명령을 꺼내서 다시 commands에 추가
        } // commandsForRedo가 비어있으면 아무것도 하지 않음
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
