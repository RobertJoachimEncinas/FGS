package MVC.src;

import MVC.src.Model.TaskList;
import MVC.src.View.View;
import MVC.src.Controller.Controller;

public class MVCMain {
    public static void main(String[] args) {
        View view = new View();
        TaskList list = new TaskList();
        Controller controller = new Controller(list, view);
    }
}
