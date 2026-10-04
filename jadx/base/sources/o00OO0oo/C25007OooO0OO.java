package o00OO0oo;

import android.content.Context;

/* JADX INFO: renamed from: o00OO0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25007OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84834OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84835OooO0O0 = 0;

    public static o00OOO0O.OooO00o OooO00o(Context context, String str) {
        C25006OooO0O0 c25006OooO0O0;
        if (context == null) {
            return null;
        }
        if (o00OOO0O.OooO00o.f84873OooO00o == null) {
            synchronized (C25006OooO0O0.class) {
                try {
                    if (C25006OooO0O0.f84830OooO0OO == null) {
                        C25006OooO0O0.f84830OooO0OO = new C25006OooO0O0(context, str);
                    }
                    c25006OooO0O0 = C25006OooO0O0.f84830OooO0OO;
                } catch (Throwable th) {
                    throw th;
                }
            }
            o00OOO0O.OooO00o.f84874OooO0O0 = c25006OooO0O0;
            o00OOO0O.OooO00o.f84873OooO00o = new o00OOO0O.OooO00o();
        }
        return o00OOO0O.OooO00o.f84873OooO00o;
    }
}
