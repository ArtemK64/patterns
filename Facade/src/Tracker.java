public class Tracker {
    private boolean activeWorkSession;

    public boolean isActiveWorkSession() {
        return activeWorkSession;
    }

    public void startActiveWorkSession() {
        System.out.println("The work session is active");
        activeWorkSession = true;
    }

    public void finishActiveWorkProcess() {
        System.out.println("The work session is not active");
        activeWorkSession = false;
    }
}