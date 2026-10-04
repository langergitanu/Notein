package Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO<T> implements InterfaceC21103o000O0o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0O<T> f61247OooO00o;

    public o000oOoO(o00oO0O<T> o00oo0o) {
        this.f61247OooO00o = o00oo0o;
    }

    @Override // Oooo0oO.InterfaceC21103o000O0o0
    public final T OooO00o(o000000 o000000Var) {
        return this.f61247OooO00o.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000oOoO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61247OooO00o, ((o000oOoO) obj).f61247OooO00o);
    }

    public final int hashCode() {
        return this.f61247OooO00o.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f61247OooO00o + ')';
    }
}
