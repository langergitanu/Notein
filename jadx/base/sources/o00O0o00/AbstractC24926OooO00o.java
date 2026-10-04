package o00O0o00;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.google.common.util.concurrent.ListenableFuture;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: o00O0o00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24926OooO00o<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final boolean f84568OooOoO = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", TelemetryEventStrings.Value.FALSE));

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final Logger f84569OooOoOO = Logger.getLogger(AbstractC24926OooO00o.class.getName());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final Object f84570OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final AbstractC19657OooO00o f84571OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile C24927OooO0Oo f84572OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f84573OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile C24930OooO0oo f84574OooOoO0;

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC19657OooO00o {
        public abstract boolean OooO00o(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24927OooO0Oo c24927OooO0Oo, C24927OooO0Oo c24927OooO0Oo2);

        public abstract boolean OooO0O0(AbstractC24926OooO00o<?> abstractC24926OooO00o, Object obj, Object obj2);

        public abstract boolean OooO0OO(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2);

        public abstract void OooO0Oo(C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2);

        public abstract void OooO0o0(C24930OooO0oo c24930OooO0oo, Thread thread);
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f84575OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f84576OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f84577OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CancellationException f84578OooO0O0;

        static {
            if (AbstractC24926OooO00o.f84568OooOoO) {
                f84576OooO0Oo = null;
                f84575OooO0OO = null;
            } else {
                f84576OooO0Oo = new OooO0O0(false, null);
                f84575OooO0OO = new OooO0O0(true, null);
            }
        }

        public OooO0O0(boolean z, CancellationException cancellationException) {
            this.f84577OooO00o = z;
            this.f84578OooO0O0 = cancellationException;
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f84579OooO0O0 = new OooO0OO(new C19658OooO00o("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f84580OooO00o;

        /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public class C19658OooO00o extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public OooO0OO(Throwable th) {
            boolean z = AbstractC24926OooO00o.f84568OooOoO;
            th.getClass();
            this.f84580OooO00o = th;
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24927OooO0Oo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C24927OooO0Oo f84581OooO0Oo = new C24927OooO0Oo(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f84582OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f84583OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C24927OooO0Oo f84584OooO0OO;

        public C24927OooO0Oo(Runnable runnable, Executor executor) {
            this.f84582OooO00o = runnable;
            this.f84583OooO0O0 = executor;
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0o */
    public static final class OooO0o<V> implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ListenableFuture<? extends V> f84585OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24932OooO0OO f84586OooOo0o;

        public OooO0o(C24932OooO0OO c24932OooO0OO, ListenableFuture listenableFuture) {
            this.f84586OooOo0o = c24932OooO0OO;
            this.f84585OooOo = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f84586OooOo0o.f84573OooOo0o != this) {
                return;
            }
            if (AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this.f84586OooOo0o, this, AbstractC24926OooO00o.OooO0o0(this.f84585OooOo))) {
                AbstractC24926OooO00o.OooO0O0(this.f84586OooOo0o);
            }
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C24928OooO0o0 extends AbstractC19657OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<C24930OooO0oo, Thread> f84587OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<C24930OooO0oo, C24930OooO0oo> f84588OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24930OooO0oo> f84589OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24927OooO0Oo> f84590OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC24926OooO00o, Object> f84591OooO0o0;

        public C24928OooO0o0(AtomicReferenceFieldUpdater<C24930OooO0oo, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C24930OooO0oo, C24930OooO0oo> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24930OooO0oo> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24927OooO0Oo> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC24926OooO00o, Object> atomicReferenceFieldUpdater5) {
            this.f84587OooO00o = atomicReferenceFieldUpdater;
            this.f84588OooO0O0 = atomicReferenceFieldUpdater2;
            this.f84589OooO0OO = atomicReferenceFieldUpdater3;
            this.f84590OooO0Oo = atomicReferenceFieldUpdater4;
            this.f84591OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO00o(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24927OooO0Oo c24927OooO0Oo, C24927OooO0Oo c24927OooO0Oo2) {
            AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24927OooO0Oo> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f84590OooO0Oo;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC24926OooO00o, c24927OooO0Oo, c24927OooO0Oo2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC24926OooO00o) == c24927OooO0Oo);
            return false;
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO0O0(AbstractC24926OooO00o<?> abstractC24926OooO00o, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC24926OooO00o, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f84591OooO0o0;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC24926OooO00o, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC24926OooO00o) == obj);
            return false;
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO0OO(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2) {
            AtomicReferenceFieldUpdater<AbstractC24926OooO00o, C24930OooO0oo> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f84589OooO0OO;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC24926OooO00o, c24930OooO0oo, c24930OooO0oo2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC24926OooO00o) == c24930OooO0oo);
            return false;
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final void OooO0Oo(C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2) {
            this.f84588OooO0O0.lazySet(c24930OooO0oo, c24930OooO0oo2);
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final void OooO0o0(C24930OooO0oo c24930OooO0oo, Thread thread) {
            this.f84587OooO00o.lazySet(c24930OooO0oo, thread);
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0oO, reason: case insensitive filesystem */
    public static final class C24929OooO0oO extends AbstractC19657OooO00o {
        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO00o(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24927OooO0Oo c24927OooO0Oo, C24927OooO0Oo c24927OooO0Oo2) {
            synchronized (abstractC24926OooO00o) {
                try {
                    if (abstractC24926OooO00o.f84572OooOo != c24927OooO0Oo) {
                        return false;
                    }
                    abstractC24926OooO00o.f84572OooOo = c24927OooO0Oo2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO0O0(AbstractC24926OooO00o<?> abstractC24926OooO00o, Object obj, Object obj2) {
            synchronized (abstractC24926OooO00o) {
                try {
                    if (abstractC24926OooO00o.f84573OooOo0o != obj) {
                        return false;
                    }
                    abstractC24926OooO00o.f84573OooOo0o = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final boolean OooO0OO(AbstractC24926OooO00o<?> abstractC24926OooO00o, C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2) {
            synchronized (abstractC24926OooO00o) {
                try {
                    if (abstractC24926OooO00o.f84574OooOoO0 != c24930OooO0oo) {
                        return false;
                    }
                    abstractC24926OooO00o.f84574OooOoO0 = c24930OooO0oo2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final void OooO0Oo(C24930OooO0oo c24930OooO0oo, C24930OooO0oo c24930OooO0oo2) {
            c24930OooO0oo.f84594OooO0O0 = c24930OooO0oo2;
        }

        @Override // o00O0o00.AbstractC24926OooO00o.AbstractC19657OooO00o
        public final void OooO0o0(C24930OooO0oo c24930OooO0oo, Thread thread) {
            c24930OooO0oo.f84593OooO00o = thread;
        }
    }

    /* JADX INFO: renamed from: o00O0o00.OooO00o$OooO0oo, reason: case insensitive filesystem */
    public static final class C24930OooO0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C24930OooO0oo f84592OooO0OO = new C24930OooO0oo();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile Thread f84593OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile C24930OooO0oo f84594OooO0O0;

        public C24930OooO0oo() {
            AbstractC24926OooO00o.f84571OooOoo0.OooO0o0(this, Thread.currentThread());
        }
    }

    static {
        AbstractC19657OooO00o c24929OooO0oO;
        try {
            c24929OooO0oO = new C24928OooO0o0(AtomicReferenceFieldUpdater.newUpdater(C24930OooO0oo.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(C24930OooO0oo.class, C24930OooO0oo.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC24926OooO00o.class, C24930OooO0oo.class, "OooOoO0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC24926OooO00o.class, C24927OooO0Oo.class, "OooOo"), AtomicReferenceFieldUpdater.newUpdater(AbstractC24926OooO00o.class, Object.class, "OooOo0o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c24929OooO0oO = new C24929OooO0oO();
        }
        f84571OooOoo0 = c24929OooO0oO;
        if (th != null) {
            f84569OooOoOO.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f84570OooOoo = new Object();
    }

    public static void OooO0O0(AbstractC24926OooO00o<?> abstractC24926OooO00o) {
        C24927OooO0Oo c24927OooO0Oo;
        C24927OooO0Oo c24927OooO0Oo2;
        C24927OooO0Oo c24927OooO0Oo3 = null;
        while (true) {
            C24930OooO0oo c24930OooO0oo = abstractC24926OooO00o.f84574OooOoO0;
            if (f84571OooOoo0.OooO0OO(abstractC24926OooO00o, c24930OooO0oo, C24930OooO0oo.f84592OooO0OO)) {
                while (c24930OooO0oo != null) {
                    Thread thread = c24930OooO0oo.f84593OooO00o;
                    if (thread != null) {
                        c24930OooO0oo.f84593OooO00o = null;
                        LockSupport.unpark(thread);
                    }
                    c24930OooO0oo = c24930OooO0oo.f84594OooO0O0;
                }
                do {
                    c24927OooO0Oo = abstractC24926OooO00o.f84572OooOo;
                } while (!f84571OooOoo0.OooO00o(abstractC24926OooO00o, c24927OooO0Oo, C24927OooO0Oo.f84581OooO0Oo));
                while (true) {
                    c24927OooO0Oo2 = c24927OooO0Oo3;
                    c24927OooO0Oo3 = c24927OooO0Oo;
                    if (c24927OooO0Oo3 == null) {
                        break;
                    }
                    c24927OooO0Oo = c24927OooO0Oo3.f84584OooO0OO;
                    c24927OooO0Oo3.f84584OooO0OO = c24927OooO0Oo2;
                }
                while (c24927OooO0Oo2 != null) {
                    c24927OooO0Oo3 = c24927OooO0Oo2.f84584OooO0OO;
                    Runnable runnable = c24927OooO0Oo2.f84582OooO00o;
                    if (runnable instanceof OooO0o) {
                        OooO0o oooO0o = (OooO0o) runnable;
                        abstractC24926OooO00o = oooO0o.f84586OooOo0o;
                        if (abstractC24926OooO00o.f84573OooOo0o == oooO0o) {
                            if (f84571OooOoo0.OooO0O0(abstractC24926OooO00o, oooO0o, OooO0o0(oooO0o.f84585OooOo))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        OooO0OO(runnable, c24927OooO0Oo2.f84583OooO0O0);
                    }
                    c24927OooO0Oo2 = c24927OooO0Oo3;
                }
                return;
            }
        }
    }

    public static void OooO0OO(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f84569OooOoOO.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object OooO0Oo(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            CancellationException cancellationException = ((OooO0O0) obj).f84578OooO0O0;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof OooO0OO) {
            throw new ExecutionException(((OooO0OO) obj).f84580OooO00o);
        }
        if (obj == f84570OooOoo) {
            return null;
        }
        return obj;
    }

    public static Object OooO0o(ListenableFuture listenableFuture) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = listenableFuture.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static Object OooO0o0(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractC24926OooO00o) {
            Object obj = ((AbstractC24926OooO00o) listenableFuture).f84573OooOo0o;
            if (!(obj instanceof OooO0O0)) {
                return obj;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return oooO0O0.f84577OooO00o ? oooO0O0.f84578OooO0O0 != null ? new OooO0O0(false, oooO0O0.f84578OooO0O0) : OooO0O0.f84576OooO0Oo : obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f84568OooOoO) && zIsCancelled) {
            return OooO0O0.f84576OooO0Oo;
        }
        try {
            Object objOooO0o = OooO0o(listenableFuture);
            return objOooO0o == null ? f84570OooOoo : objOooO0o;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new OooO0O0(false, e);
            }
            return new OooO0OO(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new OooO0OO(e2.getCause());
        } catch (Throwable th) {
            return new OooO0OO(th);
        }
    }

    public final void OooO00o(StringBuilder sb) {
        try {
            Object objOooO0o = OooO0o(this);
            sb.append("SUCCESS, result=[");
            sb.append(objOooO0o == this ? "this future" : String.valueOf(objOooO0o));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO0oO() {
        Object obj = this.f84573OooOo0o;
        if (obj instanceof OooO0o) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((OooO0o) obj).f84585OooOo;
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void OooO0oo(C24930OooO0oo c24930OooO0oo) {
        c24930OooO0oo.f84593OooO00o = null;
        while (true) {
            C24930OooO0oo c24930OooO0oo2 = this.f84574OooOoO0;
            if (c24930OooO0oo2 == C24930OooO0oo.f84592OooO0OO) {
                return;
            }
            C24930OooO0oo c24930OooO0oo3 = null;
            while (c24930OooO0oo2 != null) {
                C24930OooO0oo c24930OooO0oo4 = c24930OooO0oo2.f84594OooO0O0;
                if (c24930OooO0oo2.f84593OooO00o != null) {
                    c24930OooO0oo3 = c24930OooO0oo2;
                } else if (c24930OooO0oo3 != null) {
                    c24930OooO0oo3.f84594OooO0O0 = c24930OooO0oo4;
                    if (c24930OooO0oo3.f84593OooO00o == null) {
                        break;
                    }
                } else if (!f84571OooOoo0.OooO0OO(this, c24930OooO0oo2, c24930OooO0oo4)) {
                    break;
                }
                c24930OooO0oo2 = c24930OooO0oo4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C24927OooO0Oo c24927OooO0Oo = this.f84572OooOo;
        C24927OooO0Oo c24927OooO0Oo2 = C24927OooO0Oo.f84581OooO0Oo;
        if (c24927OooO0Oo != c24927OooO0Oo2) {
            C24927OooO0Oo c24927OooO0Oo3 = new C24927OooO0Oo(runnable, executor);
            do {
                c24927OooO0Oo3.f84584OooO0OO = c24927OooO0Oo;
                if (f84571OooOoo0.OooO00o(this, c24927OooO0Oo, c24927OooO0Oo3)) {
                    return;
                } else {
                    c24927OooO0Oo = this.f84572OooOo;
                }
            } while (c24927OooO0Oo != c24927OooO0Oo2);
        }
        OooO0OO(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        Object obj = this.f84573OooOo0o;
        if (!(obj == null) && !(obj instanceof OooO0o)) {
            return false;
        }
        OooO0O0 oooO0O0 = f84568OooOoO ? new OooO0O0(z, new CancellationException("Future.cancel() was called.")) : z ? OooO0O0.f84575OooO0OO : OooO0O0.f84576OooO0Oo;
        AbstractC24926OooO00o<V> abstractC24926OooO00o = this;
        boolean z2 = false;
        while (true) {
            if (f84571OooOoo0.OooO0O0(abstractC24926OooO00o, obj, oooO0O0)) {
                OooO0O0(abstractC24926OooO00o);
                if (!(obj instanceof OooO0o)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((OooO0o) obj).f84585OooOo;
                if (!(listenableFuture instanceof AbstractC24926OooO00o)) {
                    listenableFuture.cancel(z);
                    break;
                }
                abstractC24926OooO00o = (AbstractC24926OooO00o) listenableFuture;
                obj = abstractC24926OooO00o.f84573OooOo0o;
                if (!(obj == null) && !(obj instanceof OooO0o)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractC24926OooO00o.f84573OooOo0o;
                if (!(obj instanceof OooO0o)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f84573OooOo0o;
        if ((obj != null) && (!(obj instanceof OooO0o))) {
            return (V) OooO0Oo(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C24930OooO0oo c24930OooO0oo = this.f84574OooOoO0;
            C24930OooO0oo c24930OooO0oo2 = C24930OooO0oo.f84592OooO0OO;
            if (c24930OooO0oo != c24930OooO0oo2) {
                C24930OooO0oo c24930OooO0oo3 = new C24930OooO0oo();
                z = true;
                do {
                    AbstractC19657OooO00o abstractC19657OooO00o = f84571OooOoo0;
                    abstractC19657OooO00o.OooO0Oo(c24930OooO0oo3, c24930OooO0oo);
                    if (abstractC19657OooO00o.OooO0OO(this, c24930OooO0oo, c24930OooO0oo3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OooO0oo(c24930OooO0oo3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f84573OooOo0o;
                            if ((obj2 != null) && (!(obj2 instanceof OooO0o))) {
                                return (V) OooO0Oo(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooO0oo(c24930OooO0oo3);
                    } else {
                        c24930OooO0oo = this.f84574OooOoO0;
                    }
                } while (c24930OooO0oo != c24930OooO0oo2);
            }
            return (V) OooO0Oo(this.f84573OooOo0o);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.f84573OooOo0o;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof OooO0o))) {
                return (V) OooO0Oo(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "Waited ", " ");
        sbOooO00o.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbOooO00o.toString();
        if (nanos + 1000 < 0) {
            String strOooO0Oo = C21111o0ooOoO.OooO0Oo(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strOooO0Oo2 = strOooO0Oo + jConvert + " " + lowerCase;
                if (z2) {
                    strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(strOooO0Oo2, ",");
                }
                strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo2, " ");
            }
            if (z2) {
                strOooO0Oo = strOooO0Oo + nanos2 + " nanoseconds ";
            }
            string3 = C21111o0ooOoO.OooO0Oo(strOooO0Oo, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C21111o0ooOoO.OooO0Oo(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(o0Oo0oo.OooO0Oo(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f84573OooOo0o instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof OooO0o)) & (this.f84573OooOo0o != null);
    }

    public final String toString() {
        String strOooO0oO;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f84573OooOo0o instanceof OooO0O0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO00o(sb);
        } else {
            try {
                strOooO0oO = OooO0oO();
            } catch (RuntimeException e) {
                strOooO0oO = "Exception thrown from implementation: " + e.getClass();
            }
            if (strOooO0oO != null && !strOooO0oO.isEmpty()) {
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "PENDING, info=[", strOooO0oO, "]");
            } else if (isDone()) {
                OooO00o(sb);
            } else {
                sb.append(MaterialPurchaseStatusResponse.STATUS_PENDING);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f84573OooOo0o;
            if ((obj2 != null) & (!(obj2 instanceof OooO0o))) {
                return (V) OooO0Oo(obj2);
            }
            C24930OooO0oo c24930OooO0oo = this.f84574OooOoO0;
            C24930OooO0oo c24930OooO0oo2 = C24930OooO0oo.f84592OooO0OO;
            if (c24930OooO0oo != c24930OooO0oo2) {
                C24930OooO0oo c24930OooO0oo3 = new C24930OooO0oo();
                do {
                    AbstractC19657OooO00o abstractC19657OooO00o = f84571OooOoo0;
                    abstractC19657OooO00o.OooO0Oo(c24930OooO0oo3, c24930OooO0oo);
                    if (abstractC19657OooO00o.OooO0OO(this, c24930OooO0oo, c24930OooO0oo3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f84573OooOo0o;
                            } else {
                                OooO0oo(c24930OooO0oo3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooO0o))));
                        return (V) OooO0Oo(obj);
                    }
                    c24930OooO0oo = this.f84574OooOoO0;
                } while (c24930OooO0oo != c24930OooO0oo2);
            }
            return (V) OooO0Oo(this.f84573OooOo0o);
        }
        throw new InterruptedException();
    }
}
