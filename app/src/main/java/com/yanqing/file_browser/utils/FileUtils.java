package com.yanqing.file_browser.utils;

/**
 * Created by yanqing on 2018/4/11.
 */

public class FileUtils {
    private static final String[] TEXT = new String[]{
            "txt"
    };

    private static final String[] VIDEO = new String[]{
            "mpeg",
            "mp4",
            "avi",
            "wmv",
            "3gp",
            "mkv",
            "rmvb",
            "mov"
    };

    private static final String[] MUSIC = new String[]{
            "wave",
            "mp3",
            "wma",
            "flac",
            "aac",
            "ape",
            "amr",
            "vqf",
            "aiff"
    };

    private static final String[] IMAGE = new String[]{
            "jpg",
            "bmp",
            "png",
            "tiff",
            "gif",
            "webp"
    };

    public static boolean isText(String suffix) {
        for(String s : TEXT) {
            if(s.equalsIgnoreCase(suffix)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVideo(String suffix) {
        for(String s : VIDEO) {
            if(s.equalsIgnoreCase(suffix)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMusic(String suffix) {
        for(String s : MUSIC) {
            if(s.equalsIgnoreCase(suffix)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isImage(String suffix) {
        for(String s : IMAGE) {
            if(s.equalsIgnoreCase(suffix)) {
                return true;
            }
        }
        return false;
    }

}
