package AdapterPattern;

public interface MediaPlayer {
    public String play();
}

class AdapterMP4ToMkv implements MediaPlayer{
    @Override
    public String play() {
        return "视频从MP4转为Mkv并播放视频";
    }
}

class AdapterAviToMkv implements MediaPlayer{
    @Override
    public String play() {
        return "视频从Avi转为Mkv并播放视频";
    }
}
