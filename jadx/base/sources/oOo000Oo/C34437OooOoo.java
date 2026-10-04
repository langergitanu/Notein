package oOo000Oo;

/* JADX INFO: renamed from: oOo000Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34437OooOoo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f123456OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f123457OooO0O0;

    public C34437OooOoo(int i, T t) {
        this.f123456OooO00o = i;
        this.f123457OooO0O0 = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34437OooOoo)) {
            return false;
        }
        C34437OooOoo c34437OooOoo = (C34437OooOoo) obj;
        return this.f123456OooO00o == c34437OooOoo.f123456OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123457OooO0O0, c34437OooOoo.f123457OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f123456OooO00o) * 31;
        T t = this.f123457OooO0O0;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f123456OooO00o + ", value=" + this.f123457OooO0O0 + ')';
    }
}
