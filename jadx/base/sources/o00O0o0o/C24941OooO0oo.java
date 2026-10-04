package o00O0o0o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o00O0o0o.C24934OooO00o;
import o00O0o0o.C24935OooO0O0;

/* JADX INFO: renamed from: o00O0o0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24941OooO0oo<TResult> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C24941OooO0oo<Boolean> f84620OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ExecutorService f84621OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C24935OooO0O0.OooO00o f84622OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C24941OooO0oo<Boolean> f84623OooOO0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f84625OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f84626OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TResult f84627OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Exception f84629OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f84624OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f84628OooO0o = new ArrayList();

    static {
        C24935OooO0O0 c24935OooO0O0 = C24935OooO0O0.f84607OooO0Oo;
        f84621OooO0oO = c24935OooO0O0.f84608OooO00o;
        f84622OooO0oo = c24935OooO0O0.f84610OooO0OO;
        C24934OooO00o.ExecutorC19659OooO00o executorC19659OooO00o = C24934OooO00o.f84603OooO0O0.f84606OooO00o;
        new C24941OooO0oo((Boolean) null);
        f84620OooO = new C24941OooO0oo<>(Boolean.TRUE);
        f84623OooOO0 = new C24941OooO0oo<>(Boolean.FALSE);
        new C24941OooO0oo(0);
    }

    public C24941OooO0oo() {
    }

    public static <TResult> C24941OooO0oo<TResult> OooO00o(Callable<TResult> callable, Executor executor) {
        o00000O0.OooO00o oooO00o = new o00000O0.OooO00o();
        try {
            executor.execute(new RunnableC24940OooO0oO(oooO00o, callable));
        } catch (Exception e) {
            oooO00o.OooO00o(new C24937OooO0Oo(e));
        }
        return (C24941OooO0oo) oooO00o.f81237OooO00o;
    }

    public static <TResult> C24941OooO0oo<TResult> OooO0O0(Exception exc) {
        C24941OooO0oo<TResult> c24941OooO0oo = new C24941OooO0oo<>();
        synchronized (c24941OooO0oo.f84624OooO00o) {
            try {
                if (c24941OooO0oo.f84625OooO0O0) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                c24941OooO0oo.f84625OooO0O0 = true;
                c24941OooO0oo.f84629OooO0o0 = exc;
                c24941OooO0oo.f84624OooO00o.notifyAll();
                c24941OooO0oo.OooO0o0();
                return c24941OooO0oo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Exception OooO0OO() {
        Exception exc;
        synchronized (this.f84624OooO00o) {
            exc = this.f84629OooO0o0;
        }
        return exc;
    }

    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f84624OooO00o) {
            z = OooO0OO() != null;
        }
        return z;
    }

    public final boolean OooO0o() {
        synchronized (this.f84624OooO00o) {
            try {
                if (this.f84625OooO0O0) {
                    return false;
                }
                this.f84625OooO0O0 = true;
                this.f84626OooO0OO = true;
                this.f84624OooO00o.notifyAll();
                OooO0o0();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o0() {
        synchronized (this.f84624OooO00o) {
            Iterator it = this.f84628OooO0o.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC24936OooO0OO) it.next()).OooO00o(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f84628OooO0o = null;
        }
    }

    public final boolean OooO0oO(TResult tresult) {
        synchronized (this.f84624OooO00o) {
            try {
                if (this.f84625OooO0O0) {
                    return false;
                }
                this.f84625OooO0O0 = true;
                this.f84627OooO0Oo = tresult;
                this.f84624OooO00o.notifyAll();
                OooO0o0();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24941OooO0oo(Boolean bool) {
        OooO0oO(bool);
    }

    public C24941OooO0oo(int i) {
        OooO0o();
    }
}
