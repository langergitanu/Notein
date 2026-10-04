package o0oo0oO0;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31332OooO0O0 extends C31350OooOOOo {
    public final int OooO0oo() throws IOException {
        int iOooO0o = OooO0o();
        if (iOooO0o >= 1 && iOooO0o <= 4) {
            return iOooO0o;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO0o, "Illegal (< 1 or > 4) offSize value ", " in CFF font at position ");
        sbOooO0OO.append(this.f111942OooO0O0 - 1);
        throw new IOException(sbOooO0OO.toString());
    }
}
