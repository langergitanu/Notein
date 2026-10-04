package oOO000O0;

import java.security.PublicKey;
import o000o0Oo.C24610OooO0O0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.o00Oo0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34287OooO0oO;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PublicKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final short[][] f123215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final short[][] f123216OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f123217OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final short[] f123218OooOoO0;

    public OooO0O0(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f123217OooOoO = i;
        this.f123216OooOo0o = sArr;
        this.f123215OooOo = sArr2;
        this.f123218OooOoO0 = sArr3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof OooO0O0)) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f123217OooOoO == oooO0O0.f123217OooOoO && C24610OooO0O0.OooO0oo(this.f123216OooOo0o, oooO0O0.f123216OooOo0o)) {
                short[][] sArr = oooO0O0.f123215OooOo;
                short[][] sArr2 = new short[sArr.length][];
                for (int i = 0; i != sArr.length; i++) {
                    sArr2[i] = C34332OooO00o.OooO0O0(sArr[i]);
                }
                if (C24610OooO0O0.OooO0oo(this.f123215OooOo, sArr2)) {
                    if (C24610OooO0O0.OooO0oO(this.f123218OooOoO0, C34332OooO00o.OooO0O0(oooO0O0.f123218OooOoO0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        C34287OooO0oO c34287OooO0oO = new C34287OooO0oO();
        c34287OooO0oO.f123100OooOo0o = new C34029OooOOo0(0L);
        c34287OooO0oO.f123102OooOoO0 = new C34029OooOOo0(this.f123217OooOoO);
        c34287OooO0oO.f123101OooOoO = C24610OooO0O0.OooO0OO(this.f123216OooOo0o);
        c34287OooO0oO.f123103OooOoOO = C24610OooO0O0.OooO0OO(this.f123215OooOo);
        c34287OooO0oO.f123104OooOoo0 = C24610OooO0O0.OooO00o(this.f123218OooOoO0);
        try {
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123091OooO00o, o00Oo0.f122442OooOo), c34287OooO0oO).OooO0oO();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0oO(this.f123218OooOoO0) + ((C34332OooO00o.OooO0oo(this.f123215OooOo) + ((C34332OooO00o.OooO0oo(this.f123216OooOo0o) + (this.f123217OooOoO * 37)) * 37)) * 37);
    }
}
