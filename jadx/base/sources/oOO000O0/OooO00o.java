package oOO000O0;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import o000o0Oo.C24610OooO0O0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.o00Oo0;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34142OooO00o;
import oO0oooO.C34285OooO0o;
import oO0oooO.InterfaceC34286OooO0o0;
import oO0oooo0.C34309OooO00o;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final short[] f123209OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final short[][] f123210OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final short[] f123211OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final short[][] f123212OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C34309OooO00o[] f123213OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int[] f123214OooOoo0;

    public OooO00o(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C34309OooO00o[] c34309OooO00oArr) {
        this.f123210OooOo0o = sArr;
        this.f123209OooOo = sArr2;
        this.f123212OooOoO0 = sArr3;
        this.f123211OooOoO = sArr4;
        this.f123214OooOoo0 = iArr;
        this.f123213OooOoOO = c34309OooO00oArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        boolean zEquals = C24610OooO0O0.OooO0oo(this.f123210OooOo0o, oooO00o.f123210OooOo0o) && C24610OooO0O0.OooO0oo(this.f123212OooOoO0, oooO00o.f123212OooOoO0) && C24610OooO0O0.OooO0oO(this.f123209OooOo, oooO00o.f123209OooOo) && C24610OooO0O0.OooO0oO(this.f123211OooOoO, oooO00o.f123211OooOoO) && Arrays.equals(this.f123214OooOoo0, oooO00o.f123214OooOoo0);
        C34309OooO00o[] c34309OooO00oArr = this.f123213OooOoOO;
        int length = c34309OooO00oArr.length;
        C34309OooO00o[] c34309OooO00oArr2 = oooO00o.f123213OooOoOO;
        if (length != c34309OooO00oArr2.length) {
            return false;
        }
        for (int length2 = c34309OooO00oArr.length - 1; length2 >= 0; length2--) {
            zEquals &= c34309OooO00oArr[length2].equals(c34309OooO00oArr2[length2]);
        }
        return zEquals;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        C34285OooO0o c34285OooO0o = new C34285OooO0o();
        c34285OooO0o.f123083OooOo0o = new C34029OooOOo0(1L);
        c34285OooO0o.f123085OooOoO0 = C24610OooO0O0.OooO0OO(this.f123210OooOo0o);
        c34285OooO0o.f123084OooOoO = C24610OooO0O0.OooO00o(this.f123209OooOo);
        c34285OooO0o.f123086OooOoOO = C24610OooO0O0.OooO0OO(this.f123212OooOoO0);
        c34285OooO0o.f123088OooOoo0 = C24610OooO0O0.OooO00o(this.f123211OooOoO);
        int[] iArr = this.f123214OooOoo0;
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        c34285OooO0o.f123087OooOoo = bArr;
        c34285OooO0o.f123089OooOooO = this.f123213OooOoOO;
        try {
            return new C34116OooO0o(new C34142OooO00o(InterfaceC34286OooO0o0.f123091OooO00o, o00Oo0.f122442OooOo), c34285OooO0o, null, null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C34309OooO00o[] c34309OooO00oArr = this.f123213OooOoOO;
        int iOooO0o = C34332OooO00o.OooO0o(this.f123214OooOoo0) + ((C34332OooO00o.OooO0oO(this.f123211OooOoO) + ((C34332OooO00o.OooO0oo(this.f123212OooOoO0) + ((C34332OooO00o.OooO0oO(this.f123209OooOo) + ((C34332OooO00o.OooO0oo(this.f123210OooOo0o) + (c34309OooO00oArr.length * 37)) * 37)) * 37)) * 37)) * 37);
        for (int length = c34309OooO00oArr.length - 1; length >= 0; length--) {
            iOooO0o = (iOooO0o * 37) + c34309OooO00oArr[length].hashCode();
        }
        return iOooO0o;
    }
}
