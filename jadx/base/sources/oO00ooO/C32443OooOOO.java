package oO00ooO;

import java.io.Serializable;

/* JADX INFO: renamed from: oO00ooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32443OooOOO<A, B> implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final B f116637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final A f116638OooOo0o;

    public C32443OooOOO(A a, B b) {
        this.f116638OooOo0o = a;
        this.f116637OooOo = b;
    }

    public static C32443OooOOO OooO00o(C32443OooOOO c32443OooOOO) {
        A a = c32443OooOOO.f116638OooOo0o;
        B b = c32443OooOOO.f116637OooOo;
        c32443OooOOO.getClass();
        return new C32443OooOOO(a, b);
    }

    public final A OooO0O0() {
        return this.f116638OooOo0o;
    }

    public final B OooO0OO() {
        return this.f116637OooOo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32443OooOOO)) {
            return false;
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116638OooOo0o, c32443OooOOO.f116638OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116637OooOo, c32443OooOOO.f116637OooOo);
    }

    public final int hashCode() {
        A a = this.f116638OooOo0o;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f116637OooOo;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f116638OooOo0o + ", " + this.f116637OooOo + ')';
    }
}
