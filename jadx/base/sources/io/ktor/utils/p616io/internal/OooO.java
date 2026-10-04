package io.ktor.utils.p616io.internal;

import OooO0Oo.C20398OooO0O0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80792OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(OooO.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80793OooO0OO = AtomicIntegerFieldUpdater.newUpdater(OooO.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80794OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(OooO.class, "_pendingToFlush");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f80795OooO00o;
    public volatile /* synthetic */ int _availableForWrite$internal;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public OooO(int i) {
        this.f80795OooO00o = i;
        this._availableForWrite$internal = i;
    }

    public final boolean OooO(int i) {
        int i2;
        do {
            i2 = this._availableForRead$internal;
            if (i2 < i) {
                return false;
            }
        } while (!f80792OooO0O0.compareAndSet(this, i2, i2 - i));
        return true;
    }

    public final void OooO00o(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.f80795OooO00o) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Completed read overflow: ", i2, " + ", " = ", i);
                sbOooO0O0.append(i3);
                sbOooO0O0.append(" > ");
                sbOooO0O0.append(this.f80795OooO00o);
                throw new IllegalArgumentException(sbOooO0O0.toString());
            }
        } while (!f80793OooO0OO.compareAndSet(this, i2, i3));
    }

    public final void OooO0O0(int i) {
        int i2;
        int i3;
        do {
            i2 = this._pendingToFlush;
            i3 = i2 + i;
            if (i3 > this.f80795OooO00o) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Complete write overflow: ", i2, " + ", " > ", i);
                sbOooO0O0.append(this.f80795OooO00o);
                throw new IllegalArgumentException(sbOooO0O0.toString());
            }
        } while (!f80794OooO0Oo.compareAndSet(this, i2, i3));
    }

    public final boolean OooO0OO() {
        int andSet = f80794OooO0Oo.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f80792OooO0O0.addAndGet(this, andSet) > 0;
    }

    public final boolean OooO0Oo() {
        return this._availableForWrite$internal == 0;
    }

    public final void OooO0o() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f80795OooO00o;
    }

    public final void OooO0o0() {
        this._availableForRead$internal = this.f80795OooO00o;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final boolean OooO0oO() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.f80795OooO00o) {
                return false;
            }
        } while (!f80793OooO0OO.compareAndSet(this, i, 0));
        return true;
    }

    public final int OooO0oo(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForRead$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!f80792OooO0O0.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    public final int OooOO0(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForWrite$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!f80793OooO0OO.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    public final boolean OooOO0O(int i) {
        int i2;
        do {
            i2 = this._availableForWrite$internal;
            if (i2 < i) {
                return false;
            }
        } while (!f80793OooO0OO.compareAndSet(this, i2, i2 - i));
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingBufferCapacity[read: ");
        sb.append(this._availableForRead$internal);
        sb.append(", write: ");
        sb.append(this._availableForWrite$internal);
        sb.append(", flush: ");
        sb.append(this._pendingToFlush);
        sb.append(", capacity: ");
        return C20398OooO0O0.OooO00o(']', sb, this.f80795OooO00o);
    }
}
