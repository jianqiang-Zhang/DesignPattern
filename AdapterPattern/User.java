package AdapterPattern;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String type;
        MkvPlayer player = new MkvPlayer();
        System.out.println("使用Mkv播放器，请选择需要播放的视频格式\n " +
                "1. avi\n" +
                "2. mp4\n");
        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){
            case 1:{
                type = "Avi";
                break;
            }
            case 2:{
                type = "Mp4";
                break;
            }
            default:{
                System.out.println("使用默认播放器");
                return;
            }
        }
        System.out.println(player.player(type));
    }
}
