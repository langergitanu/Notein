package oO0ooO0O;

import java.math.BigInteger;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0ooO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34272OooO0Oo implements InterfaceC34269OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34273OooO0o0 f123051OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34271OooO0OO f123052OooO0O0;

    public C34272OooO0Oo(C34273OooO0o0 c34273OooO0o0, C34271OooO0OO c34271OooO0OO) {
        this.f123051OooO00o = c34273OooO0o0;
        this.f123052OooO0O0 = c34271OooO0OO;
    }

    @Override // oO0ooO0O.InterfaceC34269OooO00o
    public final BigInteger OooO00o() {
        return this.f123051OooO00o.f123053OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34272OooO0Oo)) {
            return false;
        }
        C34272OooO0Oo c34272OooO0Oo = (C34272OooO0Oo) obj;
        return this.f123051OooO00o.equals(c34272OooO0Oo.f123051OooO00o) && this.f123052OooO0O0.equals(c34272OooO0Oo.f123052OooO0O0);
    }

    public final int hashCode() {
        return this.f123051OooO00o.f123053OooO00o.hashCode() ^ Integer.rotateLeft(C34332OooO00o.OooO0o(this.f123052OooO0O0.f123050OooO00o), 16);
    }
}
