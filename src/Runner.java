class Runner {
    public static void main(String[] args) {
        Trial[] trials = {
                new Trial("Sakovich", 45, 93),
                new Trial("Kerkashin", 100, 100),
                new Trial("Zhylinsky", 51, 35),
                new LiteTrial("Barkou", 29, 95),
                new LiteTrial("Lisoniana", 35, 68),
                new StrongTrial("Astapenka", 30, 57),
                new StrongTrial("Vapenka", 90, 80),
                new ExtraTrial("Megabrain", 90, 90, 60),
                new ExtraTrial("Smartguy", 89, 90, 80)
        };

        Utils.printTrials(trials);
        System.out.println();
        Utils.printTrials((Utils.trialsHalfAveragePassMark(trials)));
        System.out.println();
        Utils.clearMarksOfFailTrials(trials);
        Utils.printTrials(trials);
        System.out.println();
        if (args.length == 3) {
            Trial argsTrial = new Trial(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            Utils.findEqualTrial(trials, argsTrial);
        }
    }
}
