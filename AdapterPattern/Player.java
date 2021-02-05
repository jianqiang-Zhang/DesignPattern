package AdapterPattern;


class MkvPlayer {
    MediaPlayer mediaPlayer;
    public String player(String type){
        switch (type)
        {
            case "Mp4":
            {
                mediaPlayer = new AdapterMP4ToMkv();
                break;
            }
            case "Avi":
            {
                mediaPlayer = new AdapterAviToMkv();
                break;
            }
        }
        return mediaPlayer.play();
    }
}
