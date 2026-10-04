package org.opencv.android;

import android.util.Log;
import com.huawei.hms.network.embedded.C18101a5;
import java.util.StringTokenizer;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes10.dex */
class StaticHelper {
    public static boolean OooO00o() {
        String libraryList;
        boolean zOooO0O0;
        Log.d("OpenCV/StaticHelper", "Trying to get library list");
        try {
            System.loadLibrary("opencv_info");
            libraryList = getLibraryList();
        } catch (UnsatisfiedLinkError unused) {
            Log.e("OpenCV/StaticHelper", "OpenCV error: Cannot load info library for OpenCV");
            libraryList = "";
        }
        Log.d("OpenCV/StaticHelper", "Library list: \"" + libraryList + "\"");
        Log.d("OpenCV/StaticHelper", "First attempt to load libs");
        Log.d("OpenCV/StaticHelper", "Trying to init OpenCV libs");
        if (libraryList == null || libraryList.length() == 0) {
            zOooO0O0 = OooO0O0("opencv_java4");
        } else {
            Log.d("OpenCV/StaticHelper", "Trying to load libs by dependency list");
            StringTokenizer stringTokenizer = new StringTokenizer(libraryList, ";");
            zOooO0O0 = true;
            while (stringTokenizer.hasMoreTokens()) {
                zOooO0O0 &= OooO0O0(stringTokenizer.nextToken());
            }
        }
        if (!zOooO0O0) {
            Log.d("OpenCV/StaticHelper", "First attempt to load libs fails");
            return false;
        }
        Log.d("OpenCV/StaticHelper", "First attempt to load libs is OK");
        for (String str : Core.OooO00o().split(System.getProperty(C18101a5.f54156e))) {
            Log.i("OpenCV/StaticHelper", str);
        }
        return true;
    }

    public static boolean OooO0O0(String str) {
        Log.d("OpenCV/StaticHelper", "Trying to load library " + str);
        try {
            System.loadLibrary(str);
            Log.d("OpenCV/StaticHelper", "Library " + str + " loaded");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d("OpenCV/StaticHelper", "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }

    private static native String getLibraryList();
}
