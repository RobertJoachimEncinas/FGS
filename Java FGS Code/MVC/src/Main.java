import Model.TaskList;
import View.View;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        TaskList list = new TaskList();
        Controller controller = new Controller(list, view);
    }
}
