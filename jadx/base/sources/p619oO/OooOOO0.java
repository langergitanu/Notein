package p619oO;

import java.util.Map;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOoOo.InterfaceC34201OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113653OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34032OooOo0O f113654OooO0Oo;

    public OooOOO0(C34032OooOo0O c34032OooOo0O) {
        if (c34032OooOo0O == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f113654OooO0Oo = c34032OooOo0O;
        InterfaceC34201OooO0Oo interfaceC34201OooO0OoOooO00o = OooO0o.OooO00o(c34032OooOo0O);
        String strOooO0O0 = interfaceC34201OooO0OoOooO00o.OooO0O0();
        int iOooO0OO = strOooO0O0.equals("SHAKE128") ? 32 : strOooO0O0.equals("SHAKE256") ? 64 : interfaceC34201OooO0OoOooO00o.OooO0OO();
        this.f113651OooO00o = iOooO0OO;
        int i = 16;
        this.f113652OooO0O0 = 16;
        double d = iOooO0OO * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        int iCeil = (int) Math.ceil(d / ((double) i4));
        int i5 = 15 * iCeil;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            } else {
                i2++;
            }
        }
        int iFloor = ((int) Math.floor(i6 / i2)) + 1 + iCeil;
        this.f113653OooO0OO = iFloor;
        String strOooO0O02 = interfaceC34201OooO0OoOooO00o.OooO0O0();
        if (strOooO0O02 == null) {
            Map<String, C31896OooOO0o> map = C31896OooOO0o.f113648OooO0O0;
            throw new NullPointerException("algorithmName == null");
        }
        if (C31896OooOO0o.f113648OooO0O0.get(C31896OooOO0o.OooO00o(iOooO0OO, iFloor, strOooO0O02)) != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + interfaceC34201OooO0OoOooO00o.OooO0O0());
    }
}
