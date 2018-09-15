package video;

import interfaces.VideoDecorator;
import interfaces.ICodec;
import interfaces.IVideo;

public class Video1 extends VideoDecorator{

    @Override
    public void play() {
        codec.start();
        System.out.println(" | Playing video 1 | ");
    }
}
