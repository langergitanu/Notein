package oOO00o0;

import android.util.Log;
import oOO00ooo.C34407OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static RunnableC34368OooO00o f123352OooO00o;

    public static void OooO00o(C34407OooO00o c34407OooO00o) {
        String string;
        RunnableC34368OooO00o runnableC34368OooO00o = f123352OooO00o;
        if (runnableC34368OooO00o == null || (string = c34407OooO00o.toString()) == null || runnableC34368OooO00o.f123351OooOoO0 == null || runnableC34368OooO00o.f123350OooOo0o.offer(string)) {
            return;
        }
        Log.w("FileLogger", "write offer failed");
    }
}
