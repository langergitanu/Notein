package androidx.concurrent.futures;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.google.common.util.concurrent.ListenableFuture;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO<V> implements ListenableFuture<V> {
    static final OooO00o ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile OooO0Oo listeners;
    volatile Object value;
    volatile C21616OooO0oo waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", TelemetryEventStrings.Value.FALSE));
    private static final Logger log = Logger.getLogger(OooO0OO.class.getName());

    public static abstract class OooO00o {
        public abstract boolean OooO00o(OooO0OO<?> oooO0OO, OooO0Oo oooO0Oo, OooO0Oo oooO0Oo2);

        public abstract boolean OooO0O0(OooO0OO<?> oooO0OO, Object obj, Object obj2);

        public abstract boolean OooO0OO(OooO0OO<?> oooO0OO, C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2);

        public abstract void OooO0Oo(C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2);

        public abstract void OooO0o0(C21616OooO0oo c21616OooO0oo, Thread thread);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f63579OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f63580OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f63581OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CancellationException f63582OooO0O0;

        static {
            if (OooO0OO.GENERATE_CANCELLATION_CAUSES) {
                f63580OooO0Oo = null;
                f63579OooO0OO = null;
            } else {
                f63580OooO0Oo = new OooO0O0(false, null);
                f63579OooO0OO = new OooO0O0(true, null);
            }
        }

        public OooO0O0(boolean z, CancellationException cancellationException) {
            this.f63581OooO00o = z;
            this.f63582OooO0O0 = cancellationException;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C19000OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C19000OooO0OO f63583OooO0O0 = new C19000OooO0OO(new OooO00o("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f63584OooO00o;

        /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0OO$OooO0OO$OooO00o */
        public class OooO00o extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C19000OooO0OO(Throwable th) {
            this.f63584OooO00o = (Throwable) OooO0OO.checkNotNull(th);
        }
    }

    public static final class OooO0Oo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0Oo f63585OooO0Oo = new OooO0Oo(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f63586OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f63587OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0Oo f63588OooO0OO;

        public OooO0Oo(Runnable runnable, Executor executor) {
            this.f63586OooO00o = runnable;
            this.f63587OooO0O0 = executor;
        }
    }

    public static final class OooO0o<V> implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ListenableFuture<? extends V> f63589OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0OO<V> f63590OooOo0o;

        public OooO0o(OooO0OO<V> oooO0OO, ListenableFuture<? extends V> listenableFuture) {
            this.f63590OooOo0o = oooO0OO;
            this.f63589OooOo = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f63590OooOo0o.value != this) {
                return;
            }
            if (OooO0OO.ATOMIC_HELPER.OooO0O0(this.f63590OooOo0o, this, OooO0OO.getFutureValue(this.f63589OooOo))) {
                OooO0OO.complete(this.f63590OooOo0o);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C21614OooO0o0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<C21616OooO0oo, Thread> f63591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<C21616OooO0oo, C21616OooO0oo> f63592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO0OO, C21616OooO0oo> f63593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO0OO, OooO0Oo> f63594OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO0OO, Object> f63595OooO0o0;

        public C21614OooO0o0(AtomicReferenceFieldUpdater<C21616OooO0oo, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C21616OooO0oo, C21616OooO0oo> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<OooO0OO, C21616OooO0oo> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<OooO0OO, OooO0Oo> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<OooO0OO, Object> atomicReferenceFieldUpdater5) {
            this.f63591OooO00o = atomicReferenceFieldUpdater;
            this.f63592OooO0O0 = atomicReferenceFieldUpdater2;
            this.f63593OooO0OO = atomicReferenceFieldUpdater3;
            this.f63594OooO0Oo = atomicReferenceFieldUpdater4;
            this.f63595OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO00o(OooO0OO<?> oooO0OO, OooO0Oo oooO0Oo, OooO0Oo oooO0Oo2) {
            AtomicReferenceFieldUpdater<OooO0OO, OooO0Oo> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f63594OooO0Oo;
                if (atomicReferenceFieldUpdater.compareAndSet(oooO0OO, oooO0Oo, oooO0Oo2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(oooO0OO) == oooO0Oo);
            return false;
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO0O0(OooO0OO<?> oooO0OO, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<OooO0OO, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f63595OooO0o0;
                if (atomicReferenceFieldUpdater.compareAndSet(oooO0OO, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(oooO0OO) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO0OO(OooO0OO<?> oooO0OO, C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2) {
            AtomicReferenceFieldUpdater<OooO0OO, C21616OooO0oo> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f63593OooO0OO;
                if (atomicReferenceFieldUpdater.compareAndSet(oooO0OO, c21616OooO0oo, c21616OooO0oo2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(oooO0OO) == c21616OooO0oo);
            return false;
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final void OooO0Oo(C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2) {
            this.f63592OooO0O0.lazySet(c21616OooO0oo, c21616OooO0oo2);
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final void OooO0o0(C21616OooO0oo c21616OooO0oo, Thread thread) {
            this.f63591OooO00o.lazySet(c21616OooO0oo, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public static final class C21615OooO0oO extends OooO00o {
        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO00o(OooO0OO<?> oooO0OO, OooO0Oo oooO0Oo, OooO0Oo oooO0Oo2) {
            synchronized (oooO0OO) {
                try {
                    if (oooO0OO.listeners != oooO0Oo) {
                        return false;
                    }
                    oooO0OO.listeners = oooO0Oo2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO0O0(OooO0OO<?> oooO0OO, Object obj, Object obj2) {
            synchronized (oooO0OO) {
                try {
                    if (oooO0OO.value != obj) {
                        return false;
                    }
                    oooO0OO.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final boolean OooO0OO(OooO0OO<?> oooO0OO, C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2) {
            synchronized (oooO0OO) {
                try {
                    if (oooO0OO.waiters != c21616OooO0oo) {
                        return false;
                    }
                    oooO0OO.waiters = c21616OooO0oo2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final void OooO0Oo(C21616OooO0oo c21616OooO0oo, C21616OooO0oo c21616OooO0oo2) {
            c21616OooO0oo.f63598OooO0O0 = c21616OooO0oo2;
        }

        @Override // androidx.concurrent.futures.OooO0OO.OooO00o
        public final void OooO0o0(C21616OooO0oo c21616OooO0oo, Thread thread) {
            c21616OooO0oo.f63597OooO00o = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    public static final class C21616OooO0oo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C21616OooO0oo f63596OooO0OO = new C21616OooO0oo();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile Thread f63597OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile C21616OooO0oo f63598OooO0O0;

        public C21616OooO0oo() {
            OooO0OO.ATOMIC_HELPER.OooO0o0(this, Thread.currentThread());
        }
    }

    static {
        OooO00o c21615OooO0oO;
        try {
            c21615OooO0oO = new C21614OooO0o0(AtomicReferenceFieldUpdater.newUpdater(C21616OooO0oo.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(C21616OooO0oo.class, C21616OooO0oo.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(OooO0OO.class, C21616OooO0oo.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(OooO0OO.class, OooO0Oo.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(OooO0OO.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c21615OooO0oO = new C21615OooO0oO();
        }
        ATOMIC_HELPER = c21615OooO0oO;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(uninterruptibly));
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

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    private OooO0Oo clearListeners(OooO0Oo oooO0Oo) {
        OooO0Oo oooO0Oo2;
        do {
            oooO0Oo2 = this.listeners;
        } while (!ATOMIC_HELPER.OooO00o(this, oooO0Oo2, OooO0Oo.f63585OooO0Oo));
        OooO0Oo oooO0Oo3 = oooO0Oo;
        OooO0Oo oooO0Oo4 = oooO0Oo2;
        while (oooO0Oo4 != null) {
            OooO0Oo oooO0Oo5 = oooO0Oo4.f63588OooO0OO;
            oooO0Oo4.f63588OooO0OO = oooO0Oo3;
            oooO0Oo3 = oooO0Oo4;
            oooO0Oo4 = oooO0Oo5;
        }
        return oooO0Oo3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void complete(OooO0OO<?> oooO0OO) {
        OooO0Oo oooO0Oo = null;
        while (true) {
            oooO0OO.releaseWaiters();
            oooO0OO.afterDone();
            OooO0Oo oooO0OoClearListeners = oooO0OO.clearListeners(oooO0Oo);
            while (oooO0OoClearListeners != null) {
                oooO0Oo = oooO0OoClearListeners.f63588OooO0OO;
                Runnable runnable = oooO0OoClearListeners.f63586OooO00o;
                if (runnable instanceof OooO0o) {
                    OooO0o oooO0o = (OooO0o) runnable;
                    oooO0OO = oooO0o.f63590OooOo0o;
                    if (oooO0OO.value == oooO0o) {
                        if (ATOMIC_HELPER.OooO0O0(oooO0OO, oooO0o, getFutureValue(oooO0o.f63589OooOo))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, oooO0OoClearListeners.f63587OooO0O0);
                }
                oooO0OoClearListeners = oooO0Oo;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((OooO0O0) obj).f63582OooO0O0);
        }
        if (obj instanceof C19000OooO0OO) {
            throw new ExecutionException(((C19000OooO0OO) obj).f63584OooO00o);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof OooO0OO) {
            Object obj = ((OooO0OO) listenableFuture).value;
            if (!(obj instanceof OooO0O0)) {
                return obj;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return oooO0O0.f63581OooO00o ? oooO0O0.f63582OooO0O0 != null ? new OooO0O0(false, oooO0O0.f63582OooO0O0) : OooO0O0.f63580OooO0Oo : obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return OooO0O0.f63580OooO0Oo;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new OooO0O0(false, e);
            }
            return new C19000OooO0OO(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new C19000OooO0OO(e2.getCause());
        } catch (Throwable th) {
            return new C19000OooO0OO(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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

    private void releaseWaiters() {
        C21616OooO0oo c21616OooO0oo;
        do {
            c21616OooO0oo = this.waiters;
        } while (!ATOMIC_HELPER.OooO0OO(this, c21616OooO0oo, C21616OooO0oo.f63596OooO0OO));
        while (c21616OooO0oo != null) {
            Thread thread = c21616OooO0oo.f63597OooO00o;
            if (thread != null) {
                c21616OooO0oo.f63597OooO00o = null;
                LockSupport.unpark(thread);
            }
            c21616OooO0oo = c21616OooO0oo.f63598OooO0O0;
        }
    }

    private void removeWaiter(C21616OooO0oo c21616OooO0oo) {
        c21616OooO0oo.f63597OooO00o = null;
        while (true) {
            C21616OooO0oo c21616OooO0oo2 = this.waiters;
            if (c21616OooO0oo2 == C21616OooO0oo.f63596OooO0OO) {
                return;
            }
            C21616OooO0oo c21616OooO0oo3 = null;
            while (c21616OooO0oo2 != null) {
                C21616OooO0oo c21616OooO0oo4 = c21616OooO0oo2.f63598OooO0O0;
                if (c21616OooO0oo2.f63597OooO00o != null) {
                    c21616OooO0oo3 = c21616OooO0oo2;
                } else if (c21616OooO0oo3 != null) {
                    c21616OooO0oo3.f63598OooO0O0 = c21616OooO0oo4;
                    if (c21616OooO0oo3.f63597OooO00o == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.OooO0OO(this, c21616OooO0oo2, c21616OooO0oo4)) {
                    break;
                }
                c21616OooO0oo2 = c21616OooO0oo4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        OooO0Oo oooO0Oo = this.listeners;
        OooO0Oo oooO0Oo2 = OooO0Oo.f63585OooO0Oo;
        if (oooO0Oo != oooO0Oo2) {
            OooO0Oo oooO0Oo3 = new OooO0Oo(runnable, executor);
            do {
                oooO0Oo3.f63588OooO0OO = oooO0Oo;
                if (ATOMIC_HELPER.OooO00o(this, oooO0Oo, oooO0Oo3)) {
                    return;
                } else {
                    oooO0Oo = this.listeners;
                }
            } while (oooO0Oo != oooO0Oo2);
        }
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof OooO0o)) {
            return false;
        }
        OooO0O0 oooO0O0 = GENERATE_CANCELLATION_CAUSES ? new OooO0O0(z, new CancellationException("Future.cancel() was called.")) : z ? OooO0O0.f63579OooO0OO : OooO0O0.f63580OooO0Oo;
        OooO0OO<V> oooO0OO = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.OooO0O0(oooO0OO, obj, oooO0O0)) {
                if (z) {
                    oooO0OO.interruptTask();
                }
                complete(oooO0OO);
                if (!(obj instanceof OooO0o)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((OooO0o) obj).f63589OooOo;
                if (!(listenableFuture instanceof OooO0OO)) {
                    listenableFuture.cancel(z);
                    break;
                }
                oooO0OO = (OooO0OO) listenableFuture;
                obj = oooO0OO.value;
                if (!(obj == null) && !(obj instanceof OooO0o)) {
                    break;
                }
                z2 = true;
            } else {
                obj = oooO0OO.value;
                if (!(obj instanceof OooO0o)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof OooO0o))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C21616OooO0oo c21616OooO0oo = this.waiters;
            C21616OooO0oo c21616OooO0oo2 = C21616OooO0oo.f63596OooO0OO;
            if (c21616OooO0oo != c21616OooO0oo2) {
                C21616OooO0oo c21616OooO0oo3 = new C21616OooO0oo();
                z = true;
                do {
                    OooO00o oooO00o = ATOMIC_HELPER;
                    oooO00o.OooO0Oo(c21616OooO0oo3, c21616OooO0oo);
                    if (oooO00o.OooO0OO(this, c21616OooO0oo, c21616OooO0oo3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(c21616OooO0oo3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof OooO0o))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(c21616OooO0oo3);
                    } else {
                        c21616OooO0oo = this.waiters;
                    }
                } while (c21616OooO0oo != c21616OooO0oo2);
            }
            return getDoneValue(this.value);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof OooO0o))) {
                return getDoneValue(obj3);
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

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof OooO0o)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof OooO0o) {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("setFuture=["), userObjectToString(((OooO0o) obj).f63589OooOo), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.OooO0O0(this, null, v)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.OooO0O0(this, null, new C19000OooO0OO((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        C19000OooO0OO c19000OooO0OO;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof OooO0O0) {
                listenableFuture.cancel(((OooO0O0) obj).f63581OooO00o);
            }
        } else if (listenableFuture.isDone()) {
            if (ATOMIC_HELPER.OooO0O0(this, null, getFutureValue(listenableFuture))) {
                complete(this);
                return true;
            }
        } else {
            OooO0o oooO0o = new OooO0o(this, listenableFuture);
            if (ATOMIC_HELPER.OooO0O0(this, null, oooO0o)) {
                try {
                    listenableFuture.addListener(oooO0o, EnumC21620OooO0oo.f63607OooOo0o);
                    return true;
                } catch (Throwable th) {
                    try {
                        c19000OooO0OO = new C19000OooO0OO(th);
                    } catch (Throwable unused) {
                        c19000OooO0OO = C19000OooO0OO.f63583OooO0O0;
                    }
                    ATOMIC_HELPER.OooO0O0(this, oooO0o, c19000OooO0OO);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof OooO0O0) {
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "PENDING, info=[", strPendingToString, "]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append(MaterialPurchaseStatusResponse.STATUS_PENDING);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof OooO0O0) && ((OooO0O0) obj).f63581OooO00o;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof OooO0o))) {
                return getDoneValue(obj2);
            }
            C21616OooO0oo c21616OooO0oo = this.waiters;
            C21616OooO0oo c21616OooO0oo2 = C21616OooO0oo.f63596OooO0OO;
            if (c21616OooO0oo != c21616OooO0oo2) {
                C21616OooO0oo c21616OooO0oo3 = new C21616OooO0oo();
                do {
                    OooO00o oooO00o = ATOMIC_HELPER;
                    oooO00o.OooO0Oo(c21616OooO0oo3, c21616OooO0oo);
                    if (oooO00o.OooO0OO(this, c21616OooO0oo, c21616OooO0oo3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(c21616OooO0oo3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooO0o))));
                        return getDoneValue(obj);
                    }
                    c21616OooO0oo = this.waiters;
                } while (c21616OooO0oo != c21616OooO0oo2);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }
}
