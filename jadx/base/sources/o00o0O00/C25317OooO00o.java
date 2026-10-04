package o00o0O00;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o0O00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25317OooO00o implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f86163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25116OooO0o f86164OooO0OO;

    public C25317OooO00o(int i, InterfaceC25116OooO0o interfaceC25116OooO0o) {
        this.f86163OooO0O0 = i;
        this.f86164OooO0OO = interfaceC25116OooO0o;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        this.f86164OooO0OO.OooO00o(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f86163OooO0O0).array());
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (obj instanceof C25317OooO00o) {
            C25317OooO00o c25317OooO00o = (C25317OooO00o) obj;
            if (this.f86163OooO0O0 == c25317OooO00o.f86163OooO0O0 && this.f86164OooO0OO.equals(c25317OooO00o.f86164OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return C25316OooOO0o.OooO0oo(this.f86163OooO0O0, this.f86164OooO0OO);
    }
}
