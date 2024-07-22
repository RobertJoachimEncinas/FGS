package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    //Top Panel and its components
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton submit;

    //Center Panel and its components
    private JPanel displayPanel;
    private JLabel taskNumber;
    private JTextArea taskText;

    //Panels to hold the buttons
    private JPanel prevPanel;
    private JPanel nextPanel;
    private JPanel deletePanel;

    //Buttons
    private JButton next;
    private JButton prev;
    private JButton delete;

    public View() {
        //Setting up the window
        this.setTitle("My Todo List");
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setSize(720, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Initialize the view
        init();

        //Make the window visible
        this.setVisible(true);
    }

    private void init() {
        //Initialize input panel
        this.inputPanel = new JPanel();
        this.inputPanel.setLayout(new FlowLayout());

        //Initialize the components and add them to the input panel
        this.inputField = new JTextField(50);
        this.submit = new JButton("Add Task");
        this.inputPanel.add(this.inputField);
        this.inputPanel.add(this.submit);

        //Add the input panel as the top most part of the border layout
        this.add(this.inputPanel, BorderLayout.NORTH);

        //Initialize display panel
        this.displayPanel = new JPanel();
        this.displayPanel.setLayout(new GridLayout(2, 1));

        //Initialize the component
        this.taskNumber = new JLabel("Task 0 / 0");
        this.taskText = new JTextArea("No Task", 75, 50);
        this.taskText.setEditable(false);

        //Add the components to the display
        this.displayPanel.add(this.taskNumber);
        this.displayPanel.add(this.taskText);

        //Add the display panel to the JFrame
        this.add(this.displayPanel, BorderLayout.CENTER);

        //Initialize the panels to hold the buttons
        this.prevPanel = new JPanel();
        this.nextPanel = new JPanel();
        this.deletePanel = new JPanel();

        //Set layouts of the panels
        this.prevPanel.setLayout(new GridBagLayout());
        this.nextPanel.setLayout(new GridBagLayout());
        this.deletePanel.setLayout(new GridBagLayout());

        //Initialize the buttons
        this.prev = new JButton("<");
        this.next = new JButton(">");
        this.delete = new JButton("Delete");

        //Add the buttons to the panels
        this.prevPanel.add(this.prev);
        this.nextPanel.add(this.next);
        this.deletePanel.add(this.delete);

        //Add the panels to the JFrame
        this.add(this.prevPanel, BorderLayout.WEST);
        this.add(this.nextPanel, BorderLayout.EAST);
        this.add(this.deletePanel, BorderLayout.SOUTH);
    }

    public void setTaskDisplay(int taskNumber, int maxTasks, String task) {
        this.taskNumber.setText("Task " + taskNumber + " / " + maxTasks);
        this.taskText.setText(task);
    }

    public String getInput() {
        return this.inputField.getText();
    }

    public void setActionListeners(ActionListener listener) {
        this.submit.addActionListener(listener);
        this.prev.addActionListener(listener);
        this.next.addActionListener(listener);
        this.delete.addActionListener(listener);
    }
}
