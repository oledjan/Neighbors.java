package day24_loops;

public class YuoTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        int second = 0;
        // video is 1 min 57 seconds from YuoTube
        while (second <= 117) {
            System.out.println("Watching YouTube video: " + second);
            second++;
            Thread.sleep(1000); // this option showing like video going on. need ADD EXECUTION


        }
        System.out.println("Finished watching the video");
        System.out.println("Let's start watch other one");
    }
}
