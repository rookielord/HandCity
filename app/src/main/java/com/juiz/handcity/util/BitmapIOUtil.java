package com.juiz.handcity.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

/**
 * Created by juiz on 2016/4/7.
 */
public class BitmapIOUtil {
    private static Bitmap bp = null;

    public static Bitmap getBitmapByPath(String subPath) {
        try {

            String path = Constant.ADD_PRE + subPath;
            bp = BitmapFactory.decodeFile(path);
        } catch (Exception e) {
            Log.e(Constant.ERROR_LOG, e.getMessage());
        }
        return bp;
    }
}
