package o0O000oo;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static OooO00o f88135OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakReference<Context> f88136OooO00o;

    public static synchronized OooO00o OooO00o() {
        try {
            if (f88135OooO0O0 == null) {
                OooO00o oooO00o = new OooO00o();
                new HashMap();
                new HashMap();
                new HashMap();
                new HashMap();
                new HashMap();
                oooO00o.f88136OooO00o = null;
                f88135OooO0O0 = oooO00o;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f88135OooO0O0;
    }
}
