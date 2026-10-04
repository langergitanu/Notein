package oO0o0o0o;

import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22200OooO0o0;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33640Oooo0o0;
import oO0o0Ooo.C33836OooOOo0;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: renamed from: oO0o0o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC33872OooO00o implements Executor, Closeable {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f122018OooOooO = AtomicLongFieldUpdater.newUpdater(ExecutorC33872OooO00o.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f122019OooOooo = AtomicLongFieldUpdater.newUpdater(ExecutorC33872OooO00o.class, "controlState$volatile");

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f122020Oooo000 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC33872OooO00o.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final C33839OooOo0 f122021Oooo00O = new C33839OooOo0("NOT_IN_STACK");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122022OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122023OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f122024OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f122025OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33875OooO0Oo f122026OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33836OooOOo0<C20339OooO00o> f122027OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33875OooO0Oo f122028OooOoo0;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: oO0o0o0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C20339OooO00o extends Thread {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f122029OooOooo = AtomicIntegerFieldUpdater.newUpdater(C20339OooO00o.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C24034Oooo00O<AbstractRunnableC33878OooO0oO> f122030OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33881OooOO0O f122031OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f122032OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OooO0O0 f122033OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f122034OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public boolean f122035OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f122036OooOoo0;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C20339OooO00o() {
            throw null;
        }

        public C20339OooO00o(int i) {
            setDaemon(true);
            setContextClassLoader(ExecutorC33872OooO00o.this.getClass().getClassLoader());
            this.f122031OooOo0o = new C33881OooOO0O();
            this.f122030OooOo = new C24034Oooo00O<>();
            this.f122033OooOoO0 = OooO0O0.f122040OooOoO;
            this.nextParkedWorker = ExecutorC33872OooO00o.f122021Oooo00O;
            int iNanoTime = (int) System.nanoTime();
            this.f122036OooOoo0 = iNanoTime == 0 ? 42 : iNanoTime;
            OooO0o(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            r7 = -2;
            r23 = r6;
            r5 = r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, oO0o0o0o.OooO0oO] */
        /* JADX WARN: Type inference failed for: r7v14, types: [oO0o0o0o.OooO0oO] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [oO0o0o0o.OooO0oO] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractRunnableC33878OooO0oO OooO(int i) {
            int i2;
            long j;
            T tOooO0OO;
            long j2;
            long j3;
            T t;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC33872OooO00o.f122019OooOooo;
            ExecutorC33872OooO00o executorC33872OooO00o = ExecutorC33872OooO00o.this;
            int i3 = (int) (atomicLongFieldUpdater.get(executorC33872OooO00o) & 2097151);
            Object obj = null;
            if (i3 < 2) {
                return null;
            }
            int iOooO0Oo = OooO0Oo(i3);
            int i4 = 0;
            long jMin = LocationRequestCompat.PASSIVE_INTERVAL;
            while (i4 < i3) {
                int i5 = iOooO0Oo + 1;
                if (i5 > i3) {
                    i5 = 1;
                }
                C20339OooO00o c20339OooO00oOooO0O0 = executorC33872OooO00o.f122027OooOoo.OooO0O0(i5);
                if (c20339OooO00oOooO0O0 == null || c20339OooO00oOooO0O0 == this) {
                    i2 = i5;
                } else {
                    C33881OooOO0O c33881OooOO0O = c20339OooO00oOooO0O0.f122031OooOo0o;
                    if (i != 3) {
                        c33881OooOO0O.getClass();
                        int i6 = C33881OooOO0O.f122055OooO0Oo.get(c33881OooOO0O);
                        int i7 = C33881OooOO0O.f122054OooO0OO.get(c33881OooOO0O);
                        boolean z = i == 1;
                        while (true) {
                            if (i6 == i7) {
                                j = 0;
                                break;
                            }
                            j = 0;
                            if (!z || C33881OooOO0O.f122056OooO0o0.get(c33881OooOO0O) != 0) {
                                int i8 = i6 + 1;
                                tOooO0OO = c33881OooOO0O.OooO0OO(i6, z);
                                if (tOooO0OO != 0) {
                                    break;
                                }
                                i6 = i8;
                            } else {
                                break;
                            }
                        }
                    } else {
                        tOooO0OO = c33881OooOO0O.OooO0O0();
                        j = 0;
                    }
                    C24034Oooo00O<AbstractRunnableC33878OooO0oO> c24034Oooo00O = this.f122030OooOo;
                    Object obj2 = obj;
                    if (tOooO0OO != 0) {
                        c24034Oooo00O.f80942OooOo0o = tOooO0OO;
                        i2 = i5;
                        j3 = -1;
                        j2 = -1;
                        t = obj;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33881OooOO0O.f122053OooO0O0;
                            ?? r14 = (AbstractRunnableC33878OooO0oO) atomicReferenceFieldUpdater.get(c33881OooOO0O);
                            if (r14 == 0) {
                                j2 = -1;
                                break;
                            }
                            j2 = -1;
                            if (((r14.f122049OooOo ? 1 : 2) & i) == 0) {
                                break;
                            }
                            C33871OooO.f122016OooO0o.getClass();
                            i2 = i5;
                            long jNanoTime = System.nanoTime() - r14.f122050OooOo0o;
                            long j4 = C33871OooO.f122013OooO0O0;
                            if (jNanoTime < j4) {
                                j3 = j4 - jNanoTime;
                                t = 0;
                                break;
                            }
                            do {
                                t = 0;
                                if (atomicReferenceFieldUpdater.compareAndSet(c33881OooOO0O, r14, null)) {
                                    c24034Oooo00O.f80942OooOo0o = r14;
                                    j3 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(c33881OooOO0O) == r14);
                            i5 = i2;
                            obj2 = null;
                        }
                    }
                    if (j3 == j2) {
                        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO = c24034Oooo00O.f80942OooOo0o;
                        c24034Oooo00O.f80942OooOo0o = t;
                        return abstractRunnableC33878OooO0oO;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i4++;
                iOooO0Oo = i2;
                obj = null;
            }
            if (jMin == LocationRequestCompat.PASSIVE_INTERVAL) {
                jMin = 0;
            }
            this.f122034OooOoOO = jMin;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            r13 = oO0o0o0o.C33881OooOO0O.f122055OooO0Oo.get(r3);
            r0 = oO0o0o0o.C33881OooOO0O.f122054OooO0OO.get(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r13 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        
            if (oO0o0o0o.C33881OooOO0O.f122056OooO0o0.get(r3) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        
            r0 = r0 - 1;
            r1 = r3.OooO0OO(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            r2 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractRunnableC33878OooO0oO OooO00o(boolean z) {
            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0o0;
            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0o02;
            ExecutorC33872OooO00o executorC33872OooO00o;
            long j;
            OooO0O0 oooO0O0 = this.f122033OooOoO0;
            OooO0O0 oooO0O02 = OooO0O0.f122039OooOo0o;
            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO = null;
            C33881OooOO0O c33881OooOO0O = this.f122031OooOo0o;
            ExecutorC33872OooO00o executorC33872OooO00o2 = ExecutorC33872OooO00o.this;
            if (oooO0O0 != oooO0O02) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC33872OooO00o.f122019OooOooo;
                do {
                    executorC33872OooO00o = ExecutorC33872OooO00o.this;
                    j = atomicLongFieldUpdater.get(executorC33872OooO00o);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        c33881OooOO0O.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33881OooOO0O.f122053OooO0O0;
                            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO2 = (AbstractRunnableC33878OooO0oO) atomicReferenceFieldUpdater.get(c33881OooOO0O);
                            if (abstractRunnableC33878OooO0oO2 == null || !abstractRunnableC33878OooO0oO2.f122049OooOo) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(c33881OooOO0O, abstractRunnableC33878OooO0oO2, null)) {
                                if (atomicReferenceFieldUpdater.get(c33881OooOO0O) != abstractRunnableC33878OooO0oO2) {
                                    break;
                                }
                            }
                            abstractRunnableC33878OooO0oO = abstractRunnableC33878OooO0oO2;
                            break loop1;
                        }
                        if (abstractRunnableC33878OooO0oO != null) {
                            return abstractRunnableC33878OooO0oO;
                        }
                        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0Oo = executorC33872OooO00o2.f122028OooOoo0.OooO0Oo();
                        return abstractRunnableC33878OooO0oOOooO0Oo == null ? OooO(1) : abstractRunnableC33878OooO0oOOooO0Oo;
                    }
                } while (!ExecutorC33872OooO00o.f122019OooOooo.compareAndSet(executorC33872OooO00o, j, j - 4398046511104L));
                this.f122033OooOoO0 = OooO0O0.f122039OooOo0o;
            }
            if (z) {
                boolean z2 = OooO0Oo(executorC33872OooO00o2.f122023OooOo0o * 2) == 0;
                if (z2 && (abstractRunnableC33878OooO0oOOooO0o02 = OooO0o0()) != null) {
                    return abstractRunnableC33878OooO0oOOooO0o02;
                }
                c33881OooOO0O.getClass();
                AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0O0 = (AbstractRunnableC33878OooO0oO) C33881OooOO0O.f122053OooO0O0.getAndSet(c33881OooOO0O, null);
                if (abstractRunnableC33878OooO0oOOooO0O0 == null) {
                    abstractRunnableC33878OooO0oOOooO0O0 = c33881OooOO0O.OooO0O0();
                }
                if (abstractRunnableC33878OooO0oOOooO0O0 != null) {
                    return abstractRunnableC33878OooO0oOOooO0O0;
                }
                if (!z2 && (abstractRunnableC33878OooO0oOOooO0o0 = OooO0o0()) != null) {
                    return abstractRunnableC33878OooO0oOOooO0o0;
                }
            } else {
                AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0o03 = OooO0o0();
                if (abstractRunnableC33878OooO0oOOooO0o03 != null) {
                    return abstractRunnableC33878OooO0oOOooO0o03;
                }
            }
            return OooO(3);
        }

        public final int OooO0O0() {
            return this.indexInArray;
        }

        public final Object OooO0OO() {
            return this.nextParkedWorker;
        }

        public final int OooO0Oo(int i) {
            int i2 = this.f122036OooOoo0;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f122036OooOoo0 = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final void OooO0o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC33872OooO00o.this.f122024OooOoO);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final AbstractRunnableC33878OooO0oO OooO0o0() {
            int iOooO0Oo = OooO0Oo(2);
            ExecutorC33872OooO00o executorC33872OooO00o = ExecutorC33872OooO00o.this;
            if (iOooO0Oo == 0) {
                AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0Oo = executorC33872OooO00o.f122026OooOoOO.OooO0Oo();
                return abstractRunnableC33878OooO0oOOooO0Oo != null ? abstractRunnableC33878OooO0oOOooO0Oo : executorC33872OooO00o.f122028OooOoo0.OooO0Oo();
            }
            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0Oo2 = executorC33872OooO00o.f122028OooOoo0.OooO0Oo();
            return abstractRunnableC33878OooO0oOOooO0Oo2 != null ? abstractRunnableC33878OooO0oOOooO0Oo2 : executorC33872OooO00o.f122026OooOoOO.OooO0Oo();
        }

        public final void OooO0oO(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean OooO0oo(OooO0O0 oooO0O0) {
            OooO0O0 oooO0O02 = this.f122033OooOoO0;
            boolean z = oooO0O02 == OooO0O0.f122039OooOo0o;
            if (z) {
                ExecutorC33872OooO00o.f122019OooOooo.addAndGet(ExecutorC33872OooO00o.this, 4398046511104L);
            }
            if (oooO0O02 != oooO0O0) {
                this.f122033OooOoO0 = oooO0O0;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j;
            long j2;
            int i;
            long j3;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    ExecutorC33872OooO00o executorC33872OooO00o = ExecutorC33872OooO00o.this;
                    executorC33872OooO00o.getClass();
                    if (ExecutorC33872OooO00o.f122020Oooo000.get(executorC33872OooO00o) == 0) {
                        OooO0O0 oooO0O0 = this.f122033OooOoO0;
                        OooO0O0 oooO0O02 = OooO0O0.f122042OooOoOO;
                        if (oooO0O0 == oooO0O02) {
                            break loop0;
                        }
                        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO00o = OooO00o(this.f122035OooOoo);
                        if (abstractRunnableC33878OooO0oOOooO00o != null) {
                            this.f122034OooOoOO = 0L;
                            this.f122032OooOoO = 0L;
                            if (this.f122033OooOoO0 == OooO0O0.f122041OooOoO0) {
                                this.f122033OooOoO0 = OooO0O0.f122038OooOo;
                            }
                            boolean z2 = abstractRunnableC33878OooO0oOOooO00o.f122049OooOo;
                            ExecutorC33872OooO00o executorC33872OooO00o2 = ExecutorC33872OooO00o.this;
                            if (z2) {
                                if (OooO0oo(OooO0O0.f122038OooOo) && !executorC33872OooO00o2.Oooo000() && !executorC33872OooO00o2.OooOooo(ExecutorC33872OooO00o.f122019OooOooo.get(executorC33872OooO00o2))) {
                                    executorC33872OooO00o2.Oooo000();
                                }
                                executorC33872OooO00o2.getClass();
                                try {
                                    abstractRunnableC33878OooO0oOOooO00o.run();
                                } catch (Throwable th) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                }
                                ExecutorC33872OooO00o.f122019OooOooo.addAndGet(executorC33872OooO00o2, -2097152L);
                                if (this.f122033OooOoO0 != oooO0O02) {
                                    this.f122033OooOoO0 = OooO0O0.f122040OooOoO;
                                }
                            } else {
                                executorC33872OooO00o2.getClass();
                                try {
                                    abstractRunnableC33878OooO0oOOooO00o.run();
                                } catch (Throwable th2) {
                                    Thread threadCurrentThread2 = Thread.currentThread();
                                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                                }
                            }
                        } else {
                            this.f122035OooOoo = false;
                            if (this.f122034OooOoOO == 0) {
                                Object obj = this.nextParkedWorker;
                                C33839OooOo0 c33839OooOo0 = ExecutorC33872OooO00o.f122021Oooo00O;
                                long j4 = 2097151;
                                if (obj != c33839OooOo0) {
                                    f122029OooOooo.set(this, -1);
                                    while (this.nextParkedWorker != ExecutorC33872OooO00o.f122021Oooo00O) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f122029OooOooo;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            ExecutorC33872OooO00o executorC33872OooO00o3 = ExecutorC33872OooO00o.this;
                                            executorC33872OooO00o3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC33872OooO00o.f122020Oooo000;
                                            if (atomicIntegerFieldUpdater2.get(executorC33872OooO00o3) != 0) {
                                                break;
                                            }
                                            OooO0O0 oooO0O03 = this.f122033OooOoO0;
                                            OooO0O0 oooO0O04 = OooO0O0.f122042OooOoOO;
                                            if (oooO0O03 == oooO0O04) {
                                                break;
                                            }
                                            OooO0oo(OooO0O0.f122041OooOoO0);
                                            Thread.interrupted();
                                            if (this.f122032OooOoO == 0) {
                                                j3 = j4;
                                                this.f122032OooOoO = System.nanoTime() + ExecutorC33872OooO00o.this.f122025OooOoO0;
                                            } else {
                                                j3 = j4;
                                            }
                                            LockSupport.parkNanos(ExecutorC33872OooO00o.this.f122025OooOoO0);
                                            if (System.nanoTime() - this.f122032OooOoO >= 0) {
                                                this.f122032OooOoO = 0L;
                                                ExecutorC33872OooO00o executorC33872OooO00o4 = ExecutorC33872OooO00o.this;
                                                synchronized (executorC33872OooO00o4.f122027OooOoo) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(executorC33872OooO00o4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC33872OooO00o.f122019OooOooo;
                                                            if (((int) (atomicLongFieldUpdater2.get(executorC33872OooO00o4) & j3)) > executorC33872OooO00o4.f122023OooOo0o) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i2 = this.indexInArray;
                                                                    OooO0o(0);
                                                                    executorC33872OooO00o4.OooOOo0(this, i2, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(executorC33872OooO00o4) & j3);
                                                                    if (andDecrement != i2) {
                                                                        C20339OooO00o c20339OooO00oOooO0O0 = executorC33872OooO00o4.f122027OooOoo.OooO0O0(andDecrement);
                                                                        OooOOO0.OooO0Oo(c20339OooO00oOooO0O0);
                                                                        C20339OooO00o c20339OooO00o = c20339OooO00oOooO0O0;
                                                                        executorC33872OooO00o4.f122027OooOoo.OooO0OO(i2, c20339OooO00o);
                                                                        c20339OooO00o.OooO0o(i2);
                                                                        executorC33872OooO00o4.OooOOo0(c20339OooO00o, andDecrement, i2);
                                                                    }
                                                                    executorC33872OooO00o4.f122027OooOoo.OooO0OO(andDecrement, null);
                                                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                                                    this.f122033OooOoO0 = oooO0O04;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            j4 = j3;
                                        }
                                    }
                                } else {
                                    ExecutorC33872OooO00o executorC33872OooO00o5 = ExecutorC33872OooO00o.this;
                                    executorC33872OooO00o5.getClass();
                                    if (this.nextParkedWorker == c33839OooOo0) {
                                        do {
                                            atomicLongFieldUpdater = ExecutorC33872OooO00o.f122018OooOooO;
                                            j = atomicLongFieldUpdater.get(executorC33872OooO00o5);
                                            j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                                            i = this.indexInArray;
                                            this.nextParkedWorker = executorC33872OooO00o5.f122027OooOoo.OooO0O0((int) (j & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(executorC33872OooO00o5, j, j2 | ((long) i)));
                                    }
                                }
                            } else {
                                if (z) {
                                    OooO0oo(OooO0O0.f122041OooOoO0);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f122034OooOoOO);
                                    this.f122034OooOoOO = 0L;
                                    break;
                                }
                                z = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            OooO0oo(OooO0O0.f122042OooOoOO);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: oO0o0o0o.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f122038OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f122039OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f122040OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f122041OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO0O0 f122042OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f122043OooOoo0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                oO0o0o0o.OooO00o$OooO0O0 r0 = new oO0o0o0o.OooO00o$OooO0O0
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122039OooOo0o = r0
                oO0o0o0o.OooO00o$OooO0O0 r1 = new oO0o0o0o.OooO00o$OooO0O0
                java.lang.String r2 = "BLOCKING"
                r3 = 1
                r1.<init>(r2, r3)
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122038OooOo = r1
                oO0o0o0o.OooO00o$OooO0O0 r2 = new oO0o0o0o.OooO00o$OooO0O0
                java.lang.String r3 = "PARKING"
                r4 = 2
                r2.<init>(r3, r4)
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122041OooOoO0 = r2
                oO0o0o0o.OooO00o$OooO0O0 r3 = new oO0o0o0o.OooO00o$OooO0O0
                java.lang.String r4 = "DORMANT"
                r5 = 3
                r3.<init>(r4, r5)
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122040OooOoO = r3
                oO0o0o0o.OooO00o$OooO0O0 r4 = new oO0o0o0o.OooO00o$OooO0O0
                java.lang.String r5 = "TERMINATED"
                r6 = 4
                r4.<init>(r5, r6)
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122042OooOoOO = r4
                oO0o0o0o.OooO00o$OooO0O0[] r0 = new oO0o0o0o.ExecutorC33872OooO00o.OooO0O0[]{r0, r1, r2, r3, r4}
                oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.f122043OooOoo0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oO0o0o0o.ExecutorC33872OooO00o.OooO0O0.<clinit>():void");
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f122043OooOoo0.clone();
        }
    }

    public ExecutorC33872OooO00o(String str, int i, int i2, long j) {
        this.f122023OooOo0o = i;
        this.f122022OooOo = i2;
        this.f122025OooOoO0 = j;
        this.f122024OooOoO = str;
        if (i < 1) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(C22200OooO0o0.OooO0O0(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f122026OooOoOO = new C33875OooO0Oo();
        this.f122028OooOoo0 = new C33875OooO0Oo();
        this.f122027OooOoo = new C33836OooOOo0<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void OooOOO0(ExecutorC33872OooO00o executorC33872OooO00o, Runnable runnable, int i) {
        executorC33872OooO00o.OooO0OO(runnable, false, (i & 4) == 0);
    }

    public final int OooO00o() {
        synchronized (this.f122027OooOoo) {
            try {
                if (f122020Oooo000.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f122019OooOooo;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f122023OooOo0o) {
                    return 0;
                }
                if (i >= this.f122022OooOo) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f122027OooOoo.OooO0O0(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C20339OooO00o c20339OooO00o = new C20339OooO00o(i3);
                this.f122027OooOoo.OooO0OO(i3, c20339OooO00o);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c20339OooO00o.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC33878OooO0oO c33879OooO0oo;
        OooO0O0 oooO0O0;
        C33871OooO.f122016OooO0o.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC33878OooO0oO) {
            c33879OooO0oo = (AbstractRunnableC33878OooO0oO) runnable;
            c33879OooO0oo.f122050OooOo0o = jNanoTime;
            c33879OooO0oo.f122049OooOo = z;
        } else {
            c33879OooO0oo = new C33879OooO0oo(runnable, jNanoTime, z);
        }
        boolean z3 = c33879OooO0oo.f122049OooOo;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122019OooOooo;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C20339OooO00o c20339OooO00o = threadCurrentThread instanceof C20339OooO00o ? (C20339OooO00o) threadCurrentThread : null;
        if (c20339OooO00o == null || !OooOOO0.OooO0O0(ExecutorC33872OooO00o.this, this)) {
            c20339OooO00o = null;
        }
        if (c20339OooO00o != null && (oooO0O0 = c20339OooO00o.f122033OooOoO0) != OooO0O0.f122042OooOoOO && (c33879OooO0oo.f122049OooOo || oooO0O0 != OooO0O0.f122038OooOo)) {
            c20339OooO00o.f122035OooOoo = true;
            C33881OooOO0O c33881OooOO0O = c20339OooO00o.f122031OooOo0o;
            if (z2) {
                c33879OooO0oo = c33881OooOO0O.OooO00o(c33879OooO0oo);
            } else {
                c33881OooOO0O.getClass();
                AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO = (AbstractRunnableC33878OooO0oO) C33881OooOO0O.f122053OooO0O0.getAndSet(c33881OooOO0O, c33879OooO0oo);
                c33879OooO0oo = abstractRunnableC33878OooO0oO == null ? null : c33881OooOO0O.OooO00o(abstractRunnableC33878OooO0oO);
            }
        }
        if (c33879OooO0oo != null) {
            if (!(c33879OooO0oo.f122049OooOo ? this.f122028OooOoo0.OooO00o(c33879OooO0oo) : this.f122026OooOoOO.OooO00o(c33879OooO0oo))) {
                throw new RejectedExecutionException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.f122024OooOoO, " was terminated"));
            }
        }
        boolean z4 = z2 && c20339OooO00o != null;
        if (z3) {
            if (z4 || Oooo000() || OooOooo(jAddAndGet)) {
                return;
            }
            Oooo000();
            return;
        }
        if (z4 || Oooo000() || OooOooo(atomicLongFieldUpdater.get(this))) {
            return;
        }
        Oooo000();
    }

    public final void OooOOo0(C20339OooO00o c20339OooO00o, int i, int i2) {
        while (true) {
            long j = f122018OooOooO.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objOooO0OO = c20339OooO00o.OooO0OO();
                    while (true) {
                        if (objOooO0OO == f122021Oooo00O) {
                            i3 = -1;
                            break;
                        }
                        if (objOooO0OO == null) {
                            i3 = 0;
                            break;
                        }
                        C20339OooO00o c20339OooO00o2 = (C20339OooO00o) objOooO0OO;
                        int iOooO0O0 = c20339OooO00o2.OooO0O0();
                        if (iOooO0O0 != 0) {
                            i3 = iOooO0O0;
                            break;
                        }
                        objOooO0OO = c20339OooO00o2.OooO0OO();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f122018OooOooO.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean OooOooo(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f122023OooOo0o;
        if (i < i2) {
            int iOooO00o = OooO00o();
            if (iOooO00o == 1 && i2 > 1) {
                OooO00o();
            }
            if (iOooO00o > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean Oooo000() {
        C33839OooOo0 c33839OooOo0;
        int iOooO0O0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f122018OooOooO;
            long j = atomicLongFieldUpdater.get(this);
            C20339OooO00o c20339OooO00oOooO0O0 = this.f122027OooOoo.OooO0O0((int) (2097151 & j));
            if (c20339OooO00oOooO0O0 == null) {
                c20339OooO00oOooO0O0 = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objOooO0OO = c20339OooO00oOooO0O0.OooO0OO();
                while (true) {
                    c33839OooOo0 = f122021Oooo00O;
                    if (objOooO0OO == c33839OooOo0) {
                        iOooO0O0 = -1;
                        break;
                    }
                    if (objOooO0OO == null) {
                        iOooO0O0 = 0;
                        break;
                    }
                    C20339OooO00o c20339OooO00o = (C20339OooO00o) objOooO0OO;
                    iOooO0O0 = c20339OooO00o.OooO0O0();
                    if (iOooO0O0 != 0) {
                        break;
                    }
                    objOooO0OO = c20339OooO00o.OooO0OO();
                }
                if (iOooO0O0 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) iOooO0O0))) {
                    c20339OooO00oOooO0O0.OooO0oO(c33839OooOo0);
                }
            }
            if (c20339OooO00oOooO0O0 == null) {
                return false;
            }
            if (C20339OooO00o.f122029OooOooo.compareAndSet(c20339OooO00oOooO0O0, -1, 0)) {
                LockSupport.unpark(c20339OooO00oOooO0O0);
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0Oo;
        if (f122020Oooo000.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C20339OooO00o c20339OooO00o = threadCurrentThread instanceof C20339OooO00o ? (C20339OooO00o) threadCurrentThread : null;
            if (c20339OooO00o == null || !OooOOO0.OooO0O0(ExecutorC33872OooO00o.this, this)) {
                c20339OooO00o = null;
            }
            synchronized (this.f122027OooOoo) {
                i = (int) (f122019OooOooo.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C20339OooO00o c20339OooO00oOooO0O0 = this.f122027OooOoo.OooO0O0(i2);
                    OooOOO0.OooO0Oo(c20339OooO00oOooO0O0);
                    C20339OooO00o c20339OooO00o2 = c20339OooO00oOooO0O0;
                    if (c20339OooO00o2 != c20339OooO00o) {
                        while (c20339OooO00o2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c20339OooO00o2);
                            c20339OooO00o2.join(10000L);
                        }
                        C33881OooOO0O c33881OooOO0O = c20339OooO00o2.f122031OooOo0o;
                        C33875OooO0Oo c33875OooO0Oo = this.f122028OooOoo0;
                        c33881OooOO0O.getClass();
                        AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oO = (AbstractRunnableC33878OooO0oO) C33881OooOO0O.f122053OooO0O0.getAndSet(c33881OooOO0O, null);
                        if (abstractRunnableC33878OooO0oO != null) {
                            c33875OooO0Oo.OooO00o(abstractRunnableC33878OooO0oO);
                        }
                        while (true) {
                            AbstractRunnableC33878OooO0oO abstractRunnableC33878OooO0oOOooO0O0 = c33881OooOO0O.OooO0O0();
                            if (abstractRunnableC33878OooO0oOOooO0O0 == null) {
                                break;
                            } else {
                                c33875OooO0Oo.OooO00o(abstractRunnableC33878OooO0oOOooO0O0);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f122028OooOoo0.OooO0O0();
            this.f122026OooOoOO.OooO0O0();
            while (true) {
                if (c20339OooO00o == null) {
                    abstractRunnableC33878OooO0oOOooO0Oo = this.f122026OooOoOO.OooO0Oo();
                    if (abstractRunnableC33878OooO0oOOooO0Oo == null && (abstractRunnableC33878OooO0oOOooO0Oo = this.f122028OooOoo0.OooO0Oo()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC33878OooO0oOOooO0Oo = c20339OooO00o.OooO00o(true);
                    if (abstractRunnableC33878OooO0oOOooO0Oo == null) {
                    }
                }
                try {
                    abstractRunnableC33878OooO0oOOooO0Oo.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c20339OooO00o != null) {
                c20339OooO00o.OooO0oo(OooO0O0.f122042OooOoOO);
            }
            f122018OooOooO.set(this, 0L);
            f122019OooOooo.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooOOO0(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C33836OooOOo0<C20339OooO00o> c33836OooOOo0 = this.f122027OooOoo;
        int iOooO00o = c33836OooOOo0.OooO00o();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iOooO00o; i6++) {
            C20339OooO00o c20339OooO00oOooO0O0 = c33836OooOOo0.OooO0O0(i6);
            if (c20339OooO00oOooO0O0 != null) {
                C33881OooOO0O c33881OooOO0O = c20339OooO00oOooO0O0.f122031OooOo0o;
                c33881OooOO0O.getClass();
                int i7 = C33881OooOO0O.f122053OooO0O0.get(c33881OooOO0O) != null ? (C33881OooOO0O.f122054OooO0OO.get(c33881OooOO0O) - C33881OooOO0O.f122055OooO0Oo.get(c33881OooOO0O)) + 1 : C33881OooOO0O.f122054OooO0OO.get(c33881OooOO0O) - C33881OooOO0O.f122055OooO0Oo.get(c33881OooOO0O);
                int iOrdinal = c20339OooO00oOooO0O0.f122033OooOoO0.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C32442OooOO0o();
                    }
                    i5++;
                }
            }
        }
        long j = f122019OooOooo.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f122024OooOoO);
        sb4.append('@');
        sb4.append(C33640Oooo0o0.OooO00o(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f122023OooOo0o;
        sb4.append(i8);
        sb4.append(", max = ");
        C24472OooOoo.OooO0O0(sb4, "}, Worker States {CPU = ", ", blocking = ", this.f122022OooOo, i);
        C24472OooOoo.OooO0O0(sb4, ", parked = ", ", dormant = ", i2, i3);
        C24472OooOoo.OooO0O0(sb4, ", terminated = ", "}, running workers queues = ", i4, i5);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f122026OooOoOO.OooO0OO());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f122028OooOoo0.OooO0OO());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
