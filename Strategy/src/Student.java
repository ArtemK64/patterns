public class Student {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void doAction() {
        action.doIt();
    }
}
