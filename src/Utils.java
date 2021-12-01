import java.util.Arrays;

class Utils {
    protected static void printTrials(Trial[] trials) {
        for (Trial trial : trials) {
            if (!(trial == null)) {
                System.out.println(trial);
            }
        }
    }

    protected static Trial[] trialsHalfAveragePassMark(Trial[] trials) {
        Trial[] temp = new Trial[trials.length];
        for (int i = 0; i < trials.length; i++) {
            if (trials[i].findAverage() >= Trial.getPassMark() / 2.0) {
                temp[i] = trials[i];
            }
        }
        return temp;
    }

    protected static void clearMarksOfFailTrials(Trial[] trials) {
        for (Trial trial : trials) {
            if (!trial.isPassed()) {
                trial.setMark1(0);
                trial.setMark2(0);
                if (trial.getClass() == ExtraTrial.class) {
                    ((ExtraTrial) trial).setMark3(0);
                }
            }
        }
    }

    protected static void findEqualTrial(Trial[] trials, Trial keyTrial) {
        for (Trial trial : trials) {
            if (trial.getClass() == Trial.class && trial.equals(keyTrial)) {
                System.out.println(trial);
            }
        }
    }
}
