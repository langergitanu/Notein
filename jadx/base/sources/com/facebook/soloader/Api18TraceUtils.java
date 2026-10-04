package com.facebook.soloader;

import Oooo0oO.o0Oo0oo;
import android.os.Trace;
import com.aspose.slides.C22218Oooo;
import com.aspose.words.internal.C22246OooO0oo;

/* JADX INFO: loaded from: classes5.dex */
class Api18TraceUtils {
    public static void OooO00o(String str, String str2, String str3) {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(str, str2, str3);
        if (strOooO0Oo.length() > 127 && str2 != null) {
            strOooO0Oo = C22246OooO0oo.OooO00o(C22218Oooo.OooO0OO(str), str2, str3, 0, (127 - str.length()) - str3.length());
        }
        Trace.beginSection(strOooO0Oo);
    }
}
