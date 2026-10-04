package androidx.fragment.app;

import com.aspose.slides.Collections.Generic.Dictionary;
import java.util.HashMap;
import oO0oO0Oo.C34032OooOo0O;
import p619oO.C31898OooOOo;

/* JADX INFO: renamed from: androidx.fragment.app.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21893OooOOOo {
    public static String OooO00o(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static void OooO0O0(int i, int i2, C34032OooOo0O c34032OooOo0O, HashMap map, Integer num) {
        map.put(num, new C31898OooOOo(i, i2, c34032OooOo0O));
    }

    public static void OooO0OO(int i, Dictionary dictionary, String str, int i2, String str2) {
        dictionary.set_Item(str, Integer.valueOf(i));
        dictionary.set_Item(str2, Integer.valueOf(i2));
    }
}
