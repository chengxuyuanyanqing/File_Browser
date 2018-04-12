package com.yanqing.file_browser.utils;

import android.content.Context;
import android.text.format.Formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by yanqing on 2018/4/11.
 */

public class Utils {
    public static String changeTimeToString(long time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:MM:ss", Locale.CHINA);
        return dateFormat.format(new Date(time));
    }

    public static String changeFileSizeToString(Context context, int size) {
        return Formatter.formatFileSize(context, size);
    }

}
