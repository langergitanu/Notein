package oOO0000O;

import java.io.IOException;
import java.security.PrivateKey;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34142OooO00o;
import oO0oooO.C34283OooO0OO;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO000o.C34328OooO0Oo;
import oOO000o.C34329OooO0o0;
import oOO000oO.C34332OooO00o;
import oOo00oo0.C34568OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34568OooO0o0 f123204OooOo0o;

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        C34568OooO0o0 c34568OooO0o0 = this.f123204OooOo0o;
        int i = c34568OooO0o0.f123822OooOo;
        C34568OooO0o0 c34568OooO0o02 = oooO0OO.f123204OooOo0o;
        if (i == c34568OooO0o02.f123822OooOo && c34568OooO0o0.f123824OooOoO0 == c34568OooO0o02.f123824OooOoO0 && c34568OooO0o0.f123823OooOoO.equals(c34568OooO0o02.f123823OooOoO)) {
            C34329OooO0o0 c34329OooO0o0 = c34568OooO0o0.f123825OooOoOO;
            C34568OooO0o0 c34568OooO0o03 = oooO0OO.f123204OooOo0o;
            if (c34329OooO0o0.equals(c34568OooO0o03.f123825OooOoOO) && c34568OooO0o0.f123827OooOoo0.equals(c34568OooO0o03.f123827OooOoo0) && c34568OooO0o0.f123826OooOoo.equals(c34568OooO0o03.f123826OooOoo) && c34568OooO0o0.f123828OooOooO.equals(c34568OooO0o03.f123828OooOooO)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        C34568OooO0o0 c34568OooO0o0 = this.f123204OooOo0o;
        int i = c34568OooO0o0.f123822OooOo;
        int i2 = c34568OooO0o0.f123824OooOoO0;
        oOO000o.OooO0O0 oooO0O0 = c34568OooO0o0.f123823OooOoO;
        C34329OooO0o0 c34329OooO0o0 = c34568OooO0o0.f123825OooOoOO;
        C34328OooO0Oo c34328OooO0Oo = c34568OooO0o0.f123826OooOoo;
        C34328OooO0Oo c34328OooO0Oo2 = c34568OooO0o0.f123828OooOooO;
        oOO000o.OooO00o oooO00o = c34568OooO0o0.f123827OooOoo0;
        C34283OooO0OO c34283OooO0OO = new C34283OooO0OO();
        c34283OooO0OO.f123073OooOo0o = i;
        c34283OooO0OO.f123072OooOo = i2;
        int i3 = oooO0O0.f123239OooO0O0;
        c34283OooO0OO.f123075OooOoO0 = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
        c34283OooO0OO.f123074OooOoO = c34329OooO0o0.OooO0o0();
        c34283OooO0OO.f123076OooOoOO = oooO00o.OooO00o();
        c34283OooO0OO.f123078OooOoo0 = c34328OooO0Oo.OooO00o();
        c34283OooO0OO.f123077OooOoo = c34328OooO0Oo2.OooO00o();
        try {
            return new C34116OooO0o(new C34142OooO00o(InterfaceC34286OooO0o0.f123092OooO0O0), c34283OooO0OO, null, null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C34568OooO0o0 c34568OooO0o0 = this.f123204OooOo0o;
        return c34568OooO0o0.f123827OooOoo0.hashCode() + ((C34332OooO00o.OooO0o(c34568OooO0o0.f123828OooOooO.f123241OooO00o) + ((C34332OooO00o.OooO0o(c34568OooO0o0.f123826OooOoo.f123241OooO00o) + ((c34568OooO0o0.f123825OooOoOO.hashCode() + (((((c34568OooO0o0.f123824OooOoO0 * 37) + c34568OooO0o0.f123822OooOo) * 37) + c34568OooO0o0.f123823OooOoO.f123239OooO0O0) * 37)) * 37)) * 37)) * 37);
    }
}
