package oO0ooO0O;

import java.math.BigInteger;

/* JADX INFO: renamed from: oO0ooO0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34273OooO0o0 implements InterfaceC34269OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BigInteger f123053OooO00o;

    public C34273OooO0o0(BigInteger bigInteger) {
        this.f123053OooO00o = bigInteger;
    }

    @Override // oO0ooO0O.InterfaceC34269OooO00o
    public final BigInteger OooO00o() {
        return this.f123053OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34273OooO0o0) {
            return this.f123053OooO00o.equals(((C34273OooO0o0) obj).f123053OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123053OooO00o.hashCode();
    }
}
