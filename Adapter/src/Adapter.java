public class Adapter extends DailyRoutine implements JavaDeveloper {
    @Override
    public void checkEmail() {
        checkSocialMedia();
    }

    @Override
    public void writeJavaCode() {
        writeCode();
    }

    @Override
    public void havingBreak() {
        takingRest();
    }

    @Override
    public void doCodeReview() {
        checkWork();
    }
}