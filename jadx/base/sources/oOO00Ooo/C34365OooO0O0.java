package oOO00Ooo;

import android.content.Context;

/* JADX INFO: renamed from: oOO00Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34365OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile C34365OooO0O0 f123346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f123347OooO0O0 = new Object();

    public static C34365OooO0O0 OooO00o(Context context) {
        synchronized (f123347OooO0O0) {
            try {
                if (f123346OooO00o == null) {
                    if (context.getApplicationContext() != null) {
                        Context applicationContext = context.getApplicationContext();
                        C34365OooO0O0 c34365OooO0O0 = new C34365OooO0O0();
                        applicationContext.getPackageManager();
                        f123346OooO00o = c34365OooO0O0;
                    } else {
                        C34365OooO0O0 c34365OooO0O02 = new C34365OooO0O0();
                        context.getPackageManager();
                        f123346OooO00o = c34365OooO0O02;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f123346OooO00o;
    }
}
