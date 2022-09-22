public class Manager {
    public void doReport(Tracker tracker) {
        if (tracker.isActiveWorkSession()) {
            System.out.println("Manager is doing report");
        } else {
            System.out.println("Manager is doing something else");
        }
    }

    public void checkReport(Tracker tracker) {
        if (tracker.isActiveWorkSession()) {
            System.out.println("Manager is checking report");
        } else {
            System.out.println("Manager is doing something else");
        }
    }

    public void sendReport(Tracker tracker) {
        if (tracker.isActiveWorkSession()) {
            System.out.println("Manager is sending a report");
        } else {
            System.out.println("Manager is doing something else");
        }
    }
}
