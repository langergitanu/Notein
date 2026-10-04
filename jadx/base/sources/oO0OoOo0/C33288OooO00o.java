package oO0OoOo0;

import android.os.Handler;
import android.os.Looper;
import oO00o0oO.C32390OooO0o;

/* JADX INFO: renamed from: oO0OoOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33288OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33289OooO0O0 f120508OooO00o;

    /* JADX INFO: renamed from: oO0OoOo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20311OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C33289OooO0O0 f120509OooO00o = new C33289OooO0O0(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            C33289OooO0O0 c33289OooO0O0 = C20311OooO00o.f120509OooO00o;
            if (c33289OooO0O0 == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f120508OooO00o = c33289OooO0O0;
        } catch (Throwable th) {
            throw C32390OooO0o.OooO0OO(th);
        }
    }
}
