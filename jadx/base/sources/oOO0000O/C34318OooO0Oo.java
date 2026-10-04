package oOO0000O;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.security.PublicKey;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34284OooO0Oo;
import oO0oooO.InterfaceC34286OooO0o0;
import oOo00oo0.C34567OooO0o;

/* JADX INFO: renamed from: oOO0000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34318OooO0Oo implements PublicKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34567OooO0o f123205OooOo0o;

    public final boolean equals(Object obj) {
        if (obj instanceof C34318OooO0Oo) {
            C34567OooO0o c34567OooO0o = this.f123205OooOo0o;
            int i = c34567OooO0o.f123819OooOo;
            C34567OooO0o c34567OooO0o2 = ((C34318OooO0Oo) obj).f123205OooOo0o;
            if (i == c34567OooO0o2.f123819OooOo && c34567OooO0o.f123821OooOoO0 == c34567OooO0o2.f123821OooOoO0 && c34567OooO0o.f123820OooOoO.equals(c34567OooO0o2.f123820OooOoO)) {
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
        C34567OooO0o c34567OooO0o = this.f123205OooOo0o;
        try {
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123092OooO0O0), new C34284OooO0Oo(c34567OooO0o.f123819OooOo, c34567OooO0o.f123821OooOoO0, c34567OooO0o.f123820OooOoO)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        C34567OooO0o c34567OooO0o = this.f123205OooOo0o;
        return c34567OooO0o.f123820OooOoO.hashCode() + (((c34567OooO0o.f123821OooOoO0 * 37) + c34567OooO0o.f123819OooOo) * 37);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("McEliecePublicKey:\n length of the code         : ");
        C34567OooO0o c34567OooO0o = this.f123205OooOo0o;
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(C21023OooO0Oo.OooO0OO(IOUtils.LINE_SEPARATOR_UNIX, c34567OooO0o.f123821OooOoO0, C22226Oooo0oo.OooO0OO(C21023OooO0Oo.OooO0OO(IOUtils.LINE_SEPARATOR_UNIX, c34567OooO0o.f123819OooOo, sb), " error correction capability: ")), " generator matrix           : ");
        sbOooO0OO.append(c34567OooO0o.f123820OooOoO);
        return sbOooO0OO.toString();
    }
}
