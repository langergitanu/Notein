package o00o0o00;

import android.util.Log;

/* JADX INFO: renamed from: o00o0o00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25439OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25439OooO0O0 f86721OooO00o = new C25439OooO0O0();

    public static void OooO0O0(int i, String str, String str2) {
        Log.println(i, "unknown:" + str, str2);
    }

    public static void OooO0OO(int i, String str, String str2, Throwable th) {
        Log.println(i, "unknown:".concat(str), str2 + '\n' + Log.getStackTraceString(th));
    }

    public final boolean OooO00o(int i) {
        return 5 <= i;
    }
}
