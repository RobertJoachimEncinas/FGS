package Controller;

import Model.TaskList;
import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private TaskList taskList;
    private View view;

    public Controller(TaskList taskList, View view) {
        this.taskList = taskList;
        this.view = view;

        this.view.setActionListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input;
        String newText;

        if(e.getActionCommand().equals("Add Task")) {
            input = this.view.getInput();
            this.taskList.addTask(input);
            this.taskList.setCurrent(this.taskList.getLength() - 1);
            this.view.setTaskDisplay(this.taskList.getLength(), this.taskList.getLength(), input);
        } else if(e.getActionCommand().equals("<")) {
            if(this.taskList.getCurrent() > 0) {
                this.taskList.prev();
                newText = this.taskList.getTasks(this.taskList.getCurrent());
                this.view.setTaskDisplay(this.taskList.getCurrent() + 1, this.taskList.getLength(), newText);
            }
        } else if(e.getActionCommand().equals(">")) {
            if(this.taskList.getCurrent() < this.taskList.getLength() - 1) {
                this.taskList.next();
                newText = this.taskList.getTasks(this.taskList.getCurrent());
                this.view.setTaskDisplay(this.taskList.getCurrent() + 1, this.taskList.getLength(), newText);
            }
        } else if(e.getActionCommand().equals("Delete")) {
            if(this.taskList.getLength() > 0) {
                if(this.taskList.getCurrent() == this.taskList.getLength() - 1) {
                    if(this.taskList.getCurrent() == 0) {
                        this.taskList.deleteTask(this.taskList.getCurrent());
                        newText = "NO TASKS";
                        this.view.setTaskDisplay(this.taskList.getCurrent(), this.taskList.getLength(), newText);
                    } else {
                        this.taskList.deleteTask(this.taskList.getCurrent());
                        this.taskList.prev();
                        newText = this.taskList.getTasks(this.taskList.getCurrent());
                        this.view.setTaskDisplay(this.taskList.getCurrent() + 1, this.taskList.getLength(), newText);
                    }
                } else {
                    this.taskList.deleteTask(this.taskList.getCurrent());
                    newText = this.taskList.getTasks(this.taskList.getCurrent());
                    this.view.setTaskDisplay(this.taskList.getCurrent() + 1, this.taskList.getLength(), newText);
                }
            }
        }
    }
}
