package meilishuo.gridlistadapter;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * weichenglin create in 15/9/17
 */
public class Utils {
    private static int mScreenWidth = 0;
    private static int mScreenHeight = 0;

    public static int getScreenWidth(Context context) {
        if (mScreenWidth <= 0) {
            initDisplayMetrics(context);
        }
        return mScreenWidth;
    }

    private static void initDisplayMetrics(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        if (dm.heightPixels > 0 && dm.widthPixels > 0) {
            mScreenWidth = dm.widthPixels;
            mScreenHeight = dm.heightPixels;
        }
    }

    public static int getScreenHeight(Context context) {
        if (mScreenHeight <= 0) {
            initDisplayMetrics(context);
        }
        return mScreenHeight;
    }
}
