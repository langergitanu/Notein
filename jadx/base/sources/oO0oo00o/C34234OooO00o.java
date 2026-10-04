package oO0oo00o;

import java.math.BigInteger;

/* JADX INFO: renamed from: oO0oo00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34234OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BigInteger f122973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public BigInteger f122974OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BigInteger f122975OooO0OO;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34234OooO00o)) {
            return false;
        }
        C34234OooO00o c34234OooO00o = (C34234OooO00o) obj;
        BigInteger bigInteger = this.f122975OooO0OO;
        if (bigInteger != null) {
            if (!bigInteger.equals(c34234OooO00o.f122975OooO0OO)) {
                return false;
            }
        } else if (c34234OooO00o.f122975OooO0OO != null) {
            return false;
        }
        if (c34234OooO00o.f122974OooO0O0.equals(this.f122974OooO0O0)) {
            if (c34234OooO00o.f122973OooO00o.equals(this.f122973OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f122974OooO0O0.hashCode() ^ this.f122973OooO00o.hashCode();
        BigInteger bigInteger = this.f122975OooO0OO;
        return iHashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
