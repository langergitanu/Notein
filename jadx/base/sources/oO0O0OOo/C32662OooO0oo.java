package oO0O0OOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oO0O0OOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32662OooO0oo<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f117366OooO00o = AtomicReferenceFieldUpdater.newUpdater(C32662OooO0oo.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new OooO(8);

    public final boolean OooO00o(OooOO0O element) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        while (true) {
            OooO oooO = (OooO) this._cur;
            int iOooO00o = oooO.OooO00o(element);
            if (iOooO00o == 0) {
                return true;
            }
            if (iOooO00o == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f117366OooO00o;
                OooO<E> oooOOooO0Oo = oooO.OooO0Oo();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oooO, oooOOooO0Oo) && atomicReferenceFieldUpdater.get(this) == oooO) {
                }
            } else if (iOooO00o == 2) {
                return false;
            }
        }
    }

    public final void OooO0O0() {
        while (true) {
            OooO oooO = (OooO) this._cur;
            if (oooO.OooO0O0()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f117366OooO00o;
            OooO<E> oooOOooO0Oo = oooO.OooO0Oo();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oooO, oooOOooO0Oo) && atomicReferenceFieldUpdater.get(this) == oooO) {
            }
        }
    }

    public final boolean OooO0OO() {
        return ((OooO) this._cur).OooO0OO();
    }

    public final E OooO0Oo() {
        while (true) {
            OooO oooO = (OooO) this._cur;
            E e = (E) oooO.OooO0o0();
            if (e != OooO.f117329OooO0o) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f117366OooO00o;
            OooO<E> oooOOooO0Oo = oooO.OooO0Oo();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oooO, oooOOooO0Oo) && atomicReferenceFieldUpdater.get(this) == oooO) {
            }
        }
    }
}
