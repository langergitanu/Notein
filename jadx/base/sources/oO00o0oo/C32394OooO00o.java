package oO00o0oo;

import android.os.Handler;
import android.os.Looper;
import oO00o.AbstractC32318OooO0o;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oO00o0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32394OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AbstractC32318OooO0o f116491OooO00o;

    /* JADX INFO: renamed from: oO00o0oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20225OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C32395OooO0O0 f116492OooO00o = new C32395OooO0O0(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            C32395OooO0O0 c32395OooO0O0 = C20225OooO00o.f116492OooO00o;
            if (c32395OooO0O0 == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f116491OooO00o = c32395OooO0O0;
        } catch (Throwable th) {
            throw C34561OooO0O0.OooO0O0(th);
        }
    }

    public static AbstractC32318OooO0o OooO00o() {
        AbstractC32318OooO0o abstractC32318OooO0o = f116491OooO00o;
        if (abstractC32318OooO0o != null) {
            return abstractC32318OooO0o;
        }
        throw new NullPointerException("scheduler == null");
    }
}
