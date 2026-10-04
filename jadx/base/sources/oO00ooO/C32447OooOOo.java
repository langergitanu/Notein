package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32447OooOOo<T> implements InterfaceC32440OooOO0<T>, Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile Object f116641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public oO0O000o.OooO00o<? extends T> f116642OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f116643OooOoO0;

    public C32447OooOOo(oO0O000o.OooO00o initializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initializer, "initializer");
        this.f116642OooOo0o = initializer;
        this.f116641OooOo = C32455OooOoO.f116659OooO00o;
        this.f116643OooOoO0 = this;
    }

    private final Object writeReplace() {
        return new C32436OooO0o(getValue());
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final T getValue() {
        T tInvoke;
        T t = (T) this.f116641OooOo;
        C32455OooOoO c32455OooOoO = C32455OooOoO.f116659OooO00o;
        if (t != c32455OooOoO) {
            return t;
        }
        synchronized (this.f116643OooOoO0) {
            tInvoke = (T) this.f116641OooOo;
            if (tInvoke == c32455OooOoO) {
                oO0O000o.OooO00o<? extends T> oooO00o = this.f116642OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
                tInvoke = oooO00o.invoke();
                this.f116641OooOo = tInvoke;
                this.f116642OooOo0o = null;
            }
        }
        return tInvoke;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return this.f116641OooOo != C32455OooOoO.f116659OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
