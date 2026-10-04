package o00OO00O;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: renamed from: o00OO00O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24983OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f84750OooO00o = new OooO0OO();

    public static void OooO00o() {
        f84750OooO00o.getClass();
    }

    public static void OooO0O0(String str) {
        f84750OooO00o.getClass();
        HashSet hashSet = OooO0OO.f84749OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void OooO0OO(String str, Throwable th) {
        f84750OooO00o.getClass();
        HashSet hashSet = OooO0OO.f84749OooO00o;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
