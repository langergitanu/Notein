package oO00Oo0O;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0o.OooO0o;

/* JADX INFO: renamed from: oO00Oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32271OooO00o extends oO00Oo0.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f115974OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f115975OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO0O0 f115976OooOO0O = new OooO0O0();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final C20212OooO00o f115977OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C32271OooO00o f115978OooOOO0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o<C32271OooO00o> f115979OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C32271OooO00o f115980OooO0oo;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* JADX INFO: renamed from: oO00Oo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20212OooO00o implements OooO0o<C32271OooO00o> {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // oO00Oo0o.OooO0o
        public final C32271OooO00o o0000OoO() {
            return C32271OooO00o.f115978OooOOO0;
        }

        @Override // oO00Oo0o.OooO0o
        public final void o00o0O(C32271OooO00o c32271OooO00o) {
            C32271OooO00o instance = c32271OooO00o;
            OooOOO0.OooO0oO(instance, "instance");
            if (instance != C32271OooO00o.f115978OooOOO0) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }
    }

    /* JADX INFO: renamed from: oO00Oo0O.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements OooO0o<C32271OooO00o> {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            oO00Oo0.OooO0O0.f115950OooO00o.dispose();
        }

        @Override // oO00Oo0o.OooO0o
        public final C32271OooO00o o0000OoO() {
            return oO00Oo0.OooO0O0.f115950OooO00o.o0000OoO();
        }

        @Override // oO00Oo0o.OooO0o
        public final void o00o0O(C32271OooO00o c32271OooO00o) {
            C32271OooO00o instance = c32271OooO00o;
            OooOOO0.OooO0oO(instance, "instance");
            oO00Oo0.OooO0O0.f115950OooO00o.o00o0O(instance);
        }
    }

    static {
        C20212OooO00o c20212OooO00o = new C20212OooO00o();
        f115977OooOO0o = c20212OooO00o;
        f115978OooOOO0 = new C32271OooO00o(C32250OooO0O0.f115830OooO00o, null, c20212OooO00o);
        f115974OooO = AtomicReferenceFieldUpdater.newUpdater(C32271OooO00o.class, Object.class, "nextRef");
        f115975OooOO0 = AtomicIntegerFieldUpdater.newUpdater(C32271OooO00o.class, "refCount");
    }

    public C32271OooO00o() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32271OooO00o(ByteBuffer memory, C32271OooO00o c32271OooO00o, OooO0o oooO0o) {
        super(memory);
        OooOOO0.OooO0oO(memory, "memory");
        this.f115979OooO0oO = oooO0o;
        if (c32271OooO00o == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f115980OooO0oo = c32271OooO00o;
    }

    public final int OooO() {
        return this.refCount;
    }

    public final C32271OooO00o OooO0o() {
        return (C32271OooO00o) f115974OooO.getAndSet(this, null);
    }

    public final C32271OooO00o OooO0oO() {
        int i;
        C32271OooO00o c32271OooO00o = this.f115980OooO0oo;
        if (c32271OooO00o == null) {
            c32271OooO00o = this;
        }
        do {
            i = c32271OooO00o.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f115975OooOO0.compareAndSet(c32271OooO00o, i, i + 1));
        C32271OooO00o c32271OooO00o2 = new C32271OooO00o(this.f115944OooO00o, c32271OooO00o, this.f115979OooO0oO);
        c32271OooO00o2.f115949OooO0o0 = this.f115949OooO0o0;
        c32271OooO00o2.f115947OooO0Oo = this.f115947OooO0Oo;
        c32271OooO00o2.f115945OooO0O0 = this.f115945OooO0O0;
        c32271OooO00o2.f115946OooO0OO = this.f115946OooO0OO;
        return c32271OooO00o2;
    }

    public final C32271OooO00o OooO0oo() {
        return (C32271OooO00o) this.nextRef;
    }

    public final void OooOO0(OooO0o<C32271OooO00o> pool) {
        int i;
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        OooOOO0.OooO0oO(pool, "pool");
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i2 = i - 1;
            atomicIntegerFieldUpdater = f115975OooOO0;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
        if (i2 == 0) {
            C32271OooO00o c32271OooO00o = this.f115980OooO0oo;
            if (c32271OooO00o == null) {
                OooO0o<C32271OooO00o> oooO0o = this.f115979OooO0oO;
                if (oooO0o != null) {
                    pool = oooO0o;
                }
                pool.o00o0O(this);
                return;
            }
            if (!atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            OooO0o();
            this.f115980OooO0oo = null;
            c32271OooO00o.OooOO0(pool);
        }
    }

    public final void OooOO0O() {
        if (this.f115980OooO0oo != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        OooO0Oo(0);
        int i = this.f115948OooO0o;
        int i2 = this.f115947OooO0Oo;
        this.f115945OooO0O0 = i2;
        this.f115946OooO0OO = i2;
        this.f115949OooO0o0 = i - i2;
        this.nextRef = null;
    }

    public final void OooOO0o(C32271OooO00o c32271OooO00o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (c32271OooO00o == null) {
            OooO0o();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f115974OooO;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c32271OooO00o)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void OooOOO0() {
        int i;
        do {
            i = this.refCount;
            if (i < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f115975OooOO0.compareAndSet(this, i, 1));
    }
}
