package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32449OooOOoo<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final B f116647OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final A f116648OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C f116649OooOoO0;

    public C32449OooOOoo(A a, B b, C c) {
        this.f116648OooOo0o = a;
        this.f116647OooOo = b;
        this.f116649OooOoO0 = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32449OooOOoo)) {
            return false;
        }
        C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116648OooOo0o, c32449OooOOoo.f116648OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116647OooOo, c32449OooOOoo.f116647OooOo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116649OooOoO0, c32449OooOOoo.f116649OooOoO0);
    }

    public final int hashCode() {
        A a = this.f116648OooOo0o;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f116647OooOo;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f116649OooOoO0;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f116648OooOo0o + ", " + this.f116647OooOo + ", " + this.f116649OooOoO0 + ')';
    }
}
