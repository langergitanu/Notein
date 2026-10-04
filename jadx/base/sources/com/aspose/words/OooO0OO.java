package com.aspose.words;

import android.content.res.Resources;
import java.util.HashMap;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooO0OO {
    public static String OooO00o(Resources resources, String str, int i, String str2) {
        OooOOO0.OooO0oO(resources, str);
        String string = resources.getString(i);
        OooOOO0.OooO0o(string, str2);
        return string;
    }

    public static void OooO0O0(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }
}
