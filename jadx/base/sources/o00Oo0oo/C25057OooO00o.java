package o00Oo0oo;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import o00Oo0o0.C25047OooO00o;

/* JADX INFO: renamed from: o00Oo0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25057OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f85081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ExecutorService f85082OooO0O0 = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: o00Oo0oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19672OooO00o<T, R> {
        /* JADX INFO: renamed from: a */
        Boolean mo80621a(Object obj);
    }

    public static Pair OooO00o(int i, long j, TimeUnit timeUnit) {
        Pair<Long, ?> pair;
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f85081OooO00o;
        if (concurrentHashMap != null && (pair = concurrentHashMap.get(Integer.valueOf(i))) != null) {
            Long l = (Long) pair.first;
            return (l == null || SystemClock.elapsedRealtime() - l.longValue() > TimeUnit.MILLISECONDS.convert(j, timeUnit)) ? new Pair(Boolean.FALSE, null) : new Pair(Boolean.TRUE, pair.second);
        }
        return new Pair(Boolean.FALSE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T OooO0O0(int i, long j, TimeUnit timeUnit, InterfaceC19672OooO00o<Object, Boolean> interfaceC19672OooO00o, Callable<T> callable, boolean z, long j2, TimeUnit timeUnit2, C25047OooO00o c25047OooO00o, boolean z2) {
        T tCall;
        try {
            Pair pairOooO00o = OooO00o(i, j, timeUnit);
            if (((Boolean) pairOooO00o.first).booleanValue() && interfaceC19672OooO00o.mo80621a(pairOooO00o.second).booleanValue()) {
                Objects.toString(pairOooO00o.second);
                return (T) pairOooO00o.second;
            }
            if (z2) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "ch_get_main", "" + i);
                    tCall = null;
                }
            } else {
                tCall = z ? f85082OooO0O0.submit(callable).get(j2, timeUnit2) : callable.call();
                OooO0OO(i, tCall);
            }
            Objects.toString(tCall);
            return tCall;
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "ch_get_e|" + i, th);
            return null;
        }
    }

    public static synchronized void OooO0OO(int i, Object obj) {
        try {
            if (f85081OooO00o == null) {
                f85081OooO00o = new ConcurrentHashMap<>();
            }
            f85081OooO00o.put(Integer.valueOf(i), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        } catch (Throwable th) {
            throw th;
        }
    }
}
