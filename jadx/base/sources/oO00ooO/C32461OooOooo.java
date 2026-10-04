package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32461OooOooo<T> implements InterfaceC32440OooOO0<T>, Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f116668OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public oO0O000o.OooO00o<? extends T> f116669OooOo0o;

    private final Object writeReplace() {
        return new C32436OooO0o(getValue());
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final T getValue() {
        if (this.f116668OooOo == C32455OooOoO.f116659OooO00o) {
            oO0O000o.OooO00o<? extends T> oooO00o = this.f116669OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
            this.f116668OooOo = oooO00o.invoke();
            this.f116669OooOo0o = null;
        }
        return (T) this.f116668OooOo;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return this.f116668OooOo != C32455OooOoO.f116659OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
