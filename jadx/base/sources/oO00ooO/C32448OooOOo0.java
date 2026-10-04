package oO00ooO;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oO00ooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32448OooOOo0<T> implements InterfaceC32440OooOO0<T>, Serializable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<C32448OooOOo0<?>, Object> f116644OooOoO0 = AtomicReferenceFieldUpdater.newUpdater(C32448OooOOo0.class, Object.class, "OooOo");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile Object f116645OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile oO0O000o.OooO00o<? extends T> f116646OooOo0o;

    public C32448OooOOo0() {
        throw null;
    }

    private final Object writeReplace() {
        return new C32436OooO0o(getValue());
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final T getValue() {
        T t = (T) this.f116645OooOo;
        C32455OooOoO c32455OooOoO = C32455OooOoO.f116659OooO00o;
        if (t != c32455OooOoO) {
            return t;
        }
        oO0O000o.OooO00o<? extends T> oooO00o = this.f116646OooOo0o;
        if (oooO00o != null) {
            T tInvoke = oooO00o.invoke();
            AtomicReferenceFieldUpdater<C32448OooOOo0<?>, Object> atomicReferenceFieldUpdater = f116644OooOoO0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c32455OooOoO, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c32455OooOoO) {
                }
            }
            this.f116646OooOo0o = null;
            return tInvoke;
        }
        return (T) this.f116645OooOo;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return this.f116645OooOo != C32455OooOoO.f116659OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
