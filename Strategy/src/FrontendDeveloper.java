public class FrontendDeveloper {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void doAction() {
        action.doIt();
    }
}
