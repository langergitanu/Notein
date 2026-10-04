package oO0oo00o;

import java.math.BigInteger;

/* JADX INFO: renamed from: oO0oo00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34235OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BigInteger f122976OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final BigInteger f122977OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final BigInteger f122978OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34236OooO0OO f122979OooO0Oo;

    public C34235OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C34236OooO0OO c34236OooO0OO) {
        this.f122976OooO00o = bigInteger3;
        this.f122978OooO0OO = bigInteger;
        this.f122977OooO0O0 = bigInteger2;
        this.f122979OooO0Oo = c34236OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34235OooO0O0)) {
            return false;
        }
        C34235OooO0O0 c34235OooO0O0 = (C34235OooO0O0) obj;
        if (c34235OooO0O0.f122978OooO0OO.equals(this.f122978OooO0OO)) {
            if (c34235OooO0O0.f122977OooO0O0.equals(this.f122977OooO0O0)) {
                if (c34235OooO0O0.f122976OooO00o.equals(this.f122976OooO00o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f122978OooO0OO.hashCode() ^ this.f122977OooO0O0.hashCode()) ^ this.f122976OooO00o.hashCode();
    }
}
