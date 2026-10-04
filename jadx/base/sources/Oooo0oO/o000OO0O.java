package Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O<T> implements InterfaceC21103o000O0o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f61222OooO00o;

    public o000OO0O(T t) {
        this.f61222OooO00o = t;
    }

    @Override // Oooo0oO.InterfaceC21103o000O0o0
    public final T OooO00o(o000000 o000000Var) {
        return this.f61222OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000OO0O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61222OooO00o, ((o000OO0O) obj).f61222OooO00o);
    }

    public final int hashCode() {
        T t = this.f61222OooO00o;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f61222OooO00o + ')';
    }
}
