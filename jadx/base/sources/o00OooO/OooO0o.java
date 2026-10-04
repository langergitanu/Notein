package o00OooO;

import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25116OooO0o f85419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25116OooO0o f85420OooO0OO;

    public OooO0o(InterfaceC25116OooO0o interfaceC25116OooO0o, InterfaceC25116OooO0o interfaceC25116OooO0o2) {
        this.f85419OooO0O0 = interfaceC25116OooO0o;
        this.f85420OooO0OO = interfaceC25116OooO0o2;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        this.f85419OooO0O0.OooO00o(messageDigest);
        this.f85420OooO0OO.OooO00o(messageDigest);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) obj;
            if (this.f85419OooO0O0.equals(oooO0o.f85419OooO0O0) && this.f85420OooO0OO.equals(oooO0o.f85420OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return this.f85420OooO0OO.hashCode() + (this.f85419OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f85419OooO0O0 + ", signature=" + this.f85420OooO0OO + '}';
    }
}
