public class WorkProcessFacade {
    Manager manager = new Manager();
    Job job = new Job();
    Tracker tracker = new Tracker();

    public void work() {
        tracker.startActiveWorkSession();

        job.doJob();
        manager.doReport(tracker);
        manager.checkReport(tracker);
        manager.sendReport(tracker);

        tracker.finishActiveWorkProcess();
    }
}
