package oO0o0OO;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import oO00ooO.C32460OooOooO;
import oO0o0Ooo.C33832OooOOO0;
import oO0o0Ooo.C33839OooOo0;
import oO0o0Ooo.C33847OooOoo0;
import oO0o0Ooo.InterfaceC33846OooOoo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: oO0o0OO.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33656OooooOO extends AbstractC33658OooooOo implements InterfaceC33645OoooO00 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121338OooOoo = AtomicReferenceFieldUpdater.newUpdater(AbstractC33656OooooOO.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121339OooOooO = AtomicReferenceFieldUpdater.newUpdater(AbstractC33656OooooOO.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121340OooOooo = AtomicIntegerFieldUpdater.newUpdater(AbstractC33656OooooOO.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: oO0o0OO.OooooOO$OooO00o */
    public final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C33614OooOOO0 f121342OooOoO0;

        public OooO00o(long j, C33614OooOOO0 c33614OooOOO0) {
            super(j);
            this.f121342OooOoO0 = c33614OooOOO0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f121342OooOoO0.OooOooO(AbstractC33656OooooOO.this, C32460OooOooO.f116667OooO00o);
        }

        @Override // oO0o0OO.AbstractC33656OooooOO.OooO0OO
        public final String toString() {
            return super.toString() + this.f121342OooOoO0;
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.OooooOO$OooO0O0 */
    public static final class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Runnable f121343OooOoO0;

        public OooO0O0(Runnable runnable, long j) {
            super(j);
            this.f121343OooOoO0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f121343OooOoO0.run();
        }

        @Override // oO0o0OO.AbstractC33656OooooOO.OooO0OO
        public final String toString() {
            return super.toString() + this.f121343OooOoO0;
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.OooooOO$OooO0OO */
    public static abstract class OooO0OO implements Runnable, Comparable<OooO0OO>, InterfaceC33651OoooOoO, InterfaceC33846OooOoo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121344OooOo = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public long f121345OooOo0o;
        private volatile Object _heap;

        public OooO0OO(long j) {
            this.f121345OooOo0o = j;
        }

        @Override // oO0o0Ooo.InterfaceC33846OooOoo
        public final void OooO00o(C33657OooO0Oo c33657OooO0Oo) {
            if (this._heap == C33660Oooooo0.f121347OooO00o) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c33657OooO0Oo;
        }

        public final int OooO0O0(long j, C33657OooO0Oo c33657OooO0Oo, AbstractC33656OooooOO abstractC33656OooooOO) {
            synchronized (this) {
                if (this._heap == C33660Oooooo0.f121347OooO00o) {
                    return 2;
                }
                synchronized (c33657OooO0Oo) {
                    try {
                        Object[] objArr = c33657OooO0Oo.f121963OooO00o;
                        OooO0OO oooO0OO = (OooO0OO) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC33656OooooOO.f121338OooOoo;
                        abstractC33656OooooOO.getClass();
                        if (AbstractC33656OooooOO.f121340OooOooo.get(abstractC33656OooooOO) != 0) {
                            return 1;
                        }
                        if (oooO0OO == null) {
                            c33657OooO0Oo.f121346OooO0OO = j;
                        } else {
                            long j2 = oooO0OO.f121345OooOo0o;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - c33657OooO0Oo.f121346OooO0OO > 0) {
                                c33657OooO0Oo.f121346OooO0OO = j;
                            }
                        }
                        long j3 = this.f121345OooOo0o;
                        long j4 = c33657OooO0Oo.f121346OooO0OO;
                        if (j3 - j4 < 0) {
                            this.f121345OooOo0o = j4;
                        }
                        c33657OooO0Oo.OooO00o(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            long j = this.f121345OooOo0o - oooO0OO.f121345OooOo0o;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // oO0o0OO.InterfaceC33651OoooOoO
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    C33839OooOo0 c33839OooOo0 = C33660Oooooo0.f121347OooO00o;
                    if (obj == c33839OooOo0) {
                        return;
                    }
                    C33657OooO0Oo c33657OooO0Oo = obj instanceof C33657OooO0Oo ? (C33657OooO0Oo) obj : null;
                    if (c33657OooO0Oo != null) {
                        synchronized (c33657OooO0Oo) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof C33847OooOoo0 ? (C33847OooOoo0) obj2 : null) != null) {
                                c33657OooO0Oo.OooO0O0(this.f121344OooOo);
                            }
                        }
                    }
                    this._heap = c33839OooOo0;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO0o0Ooo.InterfaceC33846OooOoo
        public final void setIndex(int i) {
            this.f121344OooOo = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f121345OooOo0o + ']';
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.OooooOO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33657OooO0Oo extends C33847OooOoo0<OooO0OO> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f121346OooO0OO;
    }

    public InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return C33641Oooo0oO.f121324OooO00o.OooOooo(j, runnable, interfaceC34415OooO0oo);
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final void o0000o0(long j, C33614OooOOO0 c33614OooOOO0) {
        long j2 = j > 0 ? j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            OooO00o oooO00o = new OooO00o(j2 + jNanoTime, c33614OooOOO0);
            o000o00(jNanoTime, oooO00o);
            c33614OooOOO0.OooOo0O(new C33652OoooOoo(oooO00o));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // oO0o0OO.AbstractC33655OooooO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o000Oo0o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C33839OooOo0 c33839OooOo0;
        Runnable runnable;
        Object obj;
        if (!o000Oo()) {
            o000OooO();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f121338OooOoo;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                c33839OooOo0 = C33660Oooooo0.f121348OooO0O0;
                if (obj2 == null) {
                    break;
                }
                if (!(obj2 instanceof C33832OooOOO0)) {
                    if (obj2 != c33839OooOo0) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj2;
                        break loop0;
                    }
                    break;
                }
                C33832OooOOO0 c33832OooOOO0 = (C33832OooOOO0) obj2;
                Object objOooO0Oo = c33832OooOOO0.OooO0Oo();
                if (objOooO0Oo != C33832OooOOO0.f121940OooO0oO) {
                    runnable = (Runnable) objOooO0Oo;
                    break;
                }
                C33832OooOOO0 c33832OooOOO0OooO0OO = c33832OooOOO0.OooO0OO();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c33832OooOOO0OooO0OO) && atomicReferenceFieldUpdater.get(this) == obj2) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C34426OooOO0o<AbstractC33647OoooOO0<?>> c34426OooOO0o = this.f121337OooOoOO;
            if (((c34426OooOO0o == null || c34426OooOO0o.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof C33832OooOOO0) {
                        long j = C33832OooOOO0.f121938OooO0o.get((C33832OooOOO0) obj3);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj3 == c33839OooOo0) {
                        return LocationRequestCompat.PASSIVE_INTERVAL;
                    }
                }
                C33657OooO0Oo c33657OooO0Oo = (C33657OooO0Oo) f121339OooOooO.get(this);
                if (c33657OooO0Oo != null) {
                    synchronized (c33657OooO0Oo) {
                        Object[] objArr = c33657OooO0Oo.f121963OooO00o;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    OooO0OO oooO0OO = (OooO0OO) obj;
                    if (oooO0OO != null) {
                        long jNanoTime = oooO0OO.f121345OooOo0o - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        }
        return 0L;
    }

    public void o000Ooo0(Runnable runnable) {
        o000OooO();
        if (!o000Oooo(runnable)) {
            RunnableC33639Oooo0o.f121321Oooo000.o000Ooo0(runnable);
            return;
        }
        Thread threadO000OoOO = o000OoOO();
        if (Thread.currentThread() != threadO000OoOO) {
            LockSupport.unpark(threadO000OoOO);
        }
    }

    public final void o000OooO() {
        OooO0OO oooO0OOOooO0O0;
        C33657OooO0Oo c33657OooO0Oo = (C33657OooO0Oo) f121339OooOooO.get(this);
        if (c33657OooO0Oo == null || C33847OooOoo0.f121962OooO0O0.get(c33657OooO0Oo) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c33657OooO0Oo) {
                try {
                    Object[] objArr = c33657OooO0Oo.f121963OooO00o;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        OooO0OO oooO0OO = (OooO0OO) obj;
                        oooO0OOOooO0O0 = ((jNanoTime - oooO0OO.f121345OooOo0o) > 0L ? 1 : ((jNanoTime - oooO0OO.f121345OooOo0o) == 0L ? 0 : -1)) >= 0 ? o000Oooo(oooO0OO) : false ? c33657OooO0Oo.OooO0O0(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (oooO0OOOooO0O0 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o000Oooo(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121338OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f121340OooOooo.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof C33832OooOOO0)) {
                        if (obj != C33660Oooooo0.f121348OooO0O0) {
                            C33832OooOOO0 c33832OooOOO0 = new C33832OooOOO0(8, true);
                            c33832OooOOO0.OooO00o((Runnable) obj);
                            c33832OooOOO0.OooO00o(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33832OooOOO0)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    C33832OooOOO0 c33832OooOOO02 = (C33832OooOOO0) obj;
                    int iOooO00o = c33832OooOOO02.OooO00o(runnable);
                    if (iOooO00o == 0) {
                        break;
                    }
                    if (iOooO00o == 1) {
                        C33832OooOOO0 c33832OooOOO0OooO0OO = c33832OooOOO02.OooO0OO();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33832OooOOO0OooO0OO) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iOooO00o == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                break;
            }
        }
        return true;
    }

    public final void o000o00(long j, OooO0OO oooO0OO) {
        int iOooO0O0;
        Thread threadO000OoOO;
        boolean z = f121340OooOooo.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121339OooOooO;
        if (z) {
            iOooO0O0 = 1;
        } else {
            C33657OooO0Oo c33657OooO0Oo = (C33657OooO0Oo) atomicReferenceFieldUpdater.get(this);
            if (c33657OooO0Oo == null) {
                C33657OooO0Oo c33657OooO0Oo2 = new C33657OooO0Oo();
                c33657OooO0Oo2.f121346OooO0OO = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c33657OooO0Oo2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                c33657OooO0Oo = (C33657OooO0Oo) obj;
            }
            iOooO0O0 = oooO0OO.OooO0O0(j, c33657OooO0Oo, this);
        }
        if (iOooO0O0 != 0) {
            if (iOooO0O0 == 1) {
                o000OoOo(j, oooO0OO);
                return;
            } else {
                if (iOooO0O0 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C33657OooO0Oo c33657OooO0Oo3 = (C33657OooO0Oo) atomicReferenceFieldUpdater.get(this);
        if (c33657OooO0Oo3 != null) {
            synchronized (c33657OooO0Oo3) {
                InterfaceC33846OooOoo[] interfaceC33846OooOooArr = c33657OooO0Oo3.f121963OooO00o;
                interfaceC33846OooOoo = interfaceC33846OooOooArr != null ? interfaceC33846OooOooArr[0] : null;
            }
            interfaceC33846OooOoo = (OooO0OO) interfaceC33846OooOoo;
        }
        if (interfaceC33846OooOoo != oooO0OO || Thread.currentThread() == (threadO000OoOO = o000OoOO())) {
            return;
        }
        LockSupport.unpark(threadO000OoOO);
    }

    public final boolean o000o000() {
        C33657OooO0Oo c33657OooO0Oo;
        C34426OooOO0o<AbstractC33647OoooOO0<?>> c34426OooOO0o = this.f121337OooOoOO;
        if (!(c34426OooOO0o != null ? c34426OooOO0o.isEmpty() : true) || ((c33657OooO0Oo = (C33657OooO0Oo) f121339OooOooO.get(this)) != null && C33847OooOoo0.f121962OooO0O0.get(c33657OooO0Oo) != 0)) {
            return false;
        }
        Object obj = f121338OooOoo.get(this);
        if (obj != null) {
            if (obj instanceof C33832OooOOO0) {
                long j = C33832OooOOO0.f121938OooO0o.get((C33832OooOOO0) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != C33660Oooooo0.f121348OooO0O0) {
                return false;
            }
        }
        return true;
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        o000Ooo0(runnable);
    }

    @Override // oO0o0OO.AbstractC33655OooooO0
    public void shutdown() {
        OooO0OO oooO0OOOooO0O0;
        o0000Ooo.f121365OooO00o.set(null);
        f121340OooOooo.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121338OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C33839OooOo0 c33839OooOo0 = C33660Oooooo0.f121348OooO0O0;
            if (obj != null) {
                if (!(obj instanceof C33832OooOOO0)) {
                    if (obj != c33839OooOo0) {
                        C33832OooOOO0 c33832OooOOO0 = new C33832OooOOO0(8, true);
                        c33832OooOOO0.OooO00o((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33832OooOOO0)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C33832OooOOO0) obj).OooO0O0();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c33839OooOo0)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (o000Oo0o() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C33657OooO0Oo c33657OooO0Oo = (C33657OooO0Oo) f121339OooOooO.get(this);
            if (c33657OooO0Oo == null) {
                return;
            }
            synchronized (c33657OooO0Oo) {
                oooO0OOOooO0O0 = C33847OooOoo0.f121962OooO0O0.get(c33657OooO0Oo) > 0 ? c33657OooO0Oo.OooO0O0(0) : null;
            }
            OooO0OO oooO0OO = oooO0OOOooO0O0;
            if (oooO0OO == null) {
                return;
            } else {
                o000OoOo(jNanoTime, oooO0OO);
            }
        }
    }
}
