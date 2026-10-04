package o00Oo0oo;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import o00OO0o.C24991OooO00o;
import o00OOOo.C25014OooO0o0;
import o00OOOoO.C25016OooO00o;
import o00OOooo.C25021OooO00o;
import o00OOooo.C25022OooO0O0;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oo.C25057OooO00o;

/* JADX INFO: renamed from: o00Oo0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25058OooO0O0 {

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO00o */
    public static class OooO00o implements Callable<WifiInfo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Context f85083OooOo0o;

        public OooO00o(Context context) {
            this.f85083OooOo0o = context;
        }

        @Override // java.util.concurrent.Callable
        public final WifiInfo call() throws Exception {
            return ((WifiManager) this.f85083OooOo0o.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        }
    }

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19673OooO0O0 implements C25057OooO00o.InterfaceC19672OooO00o<Object, Boolean> {
        @Override // o00Oo0oo.C25057OooO00o.InterfaceC19672OooO00o
        /* JADX INFO: renamed from: a */
        public final Boolean mo80621a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO0OO */
    public static class OooO0OO implements Callable<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Context f85084OooOo0o;

        public OooO0OO(Context context) {
            this.f85084OooOo0o = context;
        }

        @Override // java.util.concurrent.Callable
        public final String call() throws Exception {
            Context context = this.f85084OooOo0o;
            synchronized (o00OO0OO.OooO0O0.class) {
                if (context == null) {
                    throw new RuntimeException("Context is null");
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                if (o00OO0OO.OooO0O0.f84794OooO00o == null && !o00OO0OO.OooO0O0.f84795OooO0O0) {
                    synchronized (o00OO0OO.OooO0O0.class) {
                        try {
                            if (o00OO0OO.OooO0O0.f84794OooO00o == null && !o00OO0OO.OooO0O0.f84795OooO0O0) {
                                o00OO0OO.OooO0O0.f84794OooO00o = C24991OooO00o.OooO0O0();
                                o00OO0OO.OooO0O0.f84795OooO0O0 = true;
                            }
                        } finally {
                        }
                    }
                }
                o00OO0OO.OooO00o oooO00o = o00OO0OO.OooO0O0.f84794OooO00o;
                if (oooO00o != null) {
                    try {
                        return oooO00o.mo1a(context);
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25059OooO0Oo implements C25057OooO00o.InterfaceC19672OooO00o<Object, Boolean> {
        @Override // o00Oo0oo.C25057OooO00o.InterfaceC19672OooO00o
        /* JADX INFO: renamed from: a */
        public final Boolean mo80621a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO0o */
    public static class OooO0o implements C25057OooO00o.InterfaceC19672OooO00o<Object, Boolean> {
        @Override // o00Oo0oo.C25057OooO00o.InterfaceC19672OooO00o
        /* JADX INFO: renamed from: a */
        public final Boolean mo80621a(Object obj) {
            return Boolean.valueOf((obj instanceof WifiInfo) || obj == null);
        }
    }

    /* JADX INFO: renamed from: o00Oo0oo.OooO0O0$OooO0o0 */
    public static class OooO0o0 implements Callable<String> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C25047OooO00o f85085OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Context f85086OooOo0o;

        public OooO0o0(Context context, C25047OooO00o c25047OooO00o) {
            this.f85086OooOo0o = context;
            this.f85085OooOo = c25047OooO00o;
        }

        @Override // java.util.concurrent.Callable
        public final String call() throws Exception {
            C25021OooO00o c25021OooO00oOooO00o;
            try {
                Context context = this.f85086OooOo0o;
                synchronized (C25022OooO0O0.class) {
                    try {
                        c25021OooO00oOooO00o = C25022OooO0O0.f84958OooO00o;
                        if (c25021OooO00oOooO00o == null) {
                            if (context != null) {
                                c25021OooO00oOooO00o = C25022OooO0O0.OooO00o(context);
                                C25022OooO0O0.f84958OooO00o = c25021OooO00oOooO00o;
                            } else {
                                c25021OooO00oOooO00o = null;
                            }
                        }
                    } finally {
                    }
                }
                if (c25021OooO00oOooO00o != null && !C25014OooO0o0.OooO0O0(c25021OooO00oOooO00o.f84956OooO0Oo)) {
                    return c25021OooO00oOooO00o.f84956OooO0Oo;
                }
                return "ffffffffffffffffffffffff";
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0oO(this.f85085OooOo, "third", "GetUtdidEx", th.getClass().getName());
                return "";
            }
        }
    }

    public static String OooO00o(Context context, C25047OooO00o c25047OooO00o) {
        if (!C25016OooO00o.OooO00o().f84932OooOoOO) {
            return "";
        }
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = C25057OooO00o.f85081OooO00o;
        return (String) C25057OooO00o.OooO0O0(1, 1L, TimeUnit.DAYS, new C19673OooO0O0(), new OooO0OO(context == null ? null : context.getApplicationContext()), true, 200L, TimeUnit.MILLISECONDS, c25047OooO00o, true);
    }

    public static String OooO0O0(Context context, C25047OooO00o c25047OooO00o) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = C25057OooO00o.f85081OooO00o;
        return (String) C25057OooO00o.OooO0O0(3, 1L, TimeUnit.DAYS, new C25059OooO0Oo(), new OooO0o0(context == null ? null : context.getApplicationContext(), c25047OooO00o), true, 3L, TimeUnit.SECONDS, c25047OooO00o, false);
    }

    public static WifiInfo OooO0OO(Context context, C25047OooO00o c25047OooO00o) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = C25057OooO00o.f85081OooO00o;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (WifiInfo) C25057OooO00o.OooO0O0(5, 10L, timeUnit, new OooO0o(), new OooO00o(applicationContext), false, 10L, timeUnit, c25047OooO00o, false);
    }
}
