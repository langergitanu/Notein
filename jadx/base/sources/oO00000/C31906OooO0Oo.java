package oO00000;

import java.lang.Throwable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: oO00000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31906OooO0Oo<T, E extends Throwable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f113733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Exception f113734OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public C31906OooO0Oo(Object obj, Exception exc) {
        this.f113733OooO00o = obj;
        this.f113734OooO0O0 = exc;
    }

    public static C31906OooO0Oo OooO00o(Exception exc) {
        return new C31906OooO0Oo(null, exc);
    }

    public static <T> C31906OooO0Oo<T, Exception> OooO0OO(Callable<T> callable) {
        try {
            return new C31906OooO0Oo<>(callable.call(), null);
        } catch (Exception e) {
            return OooO00o(e);
        }
    }

    public final T OooO0O0() throws Exception {
        T t = this.f113733OooO00o;
        if (t != null) {
            return t;
        }
        throw this.f113734OooO0O0;
    }
}
