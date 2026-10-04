package o00O00oO;

import java.util.List;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o00O00oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24822OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f84186OooO00o;

    public C24822OooOO0o(List<? extends InterfaceC24813OooO00o> list) {
        this.f84186OooO00o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C24822OooOO0o.class.equals(obj.getClass())) {
            return false;
        }
        return this.f84186OooO00o.equals(((C24822OooOO0o) obj).f84186OooO00o);
    }

    public final int hashCode() {
        return this.f84186OooO00o.hashCode();
    }

    public final String toString() {
        return OooOo.o000oOoO((Iterable) this.f84186OooO00o, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
