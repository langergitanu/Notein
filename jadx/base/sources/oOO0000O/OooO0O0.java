package oOO0000O;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21053Oooo00o;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.security.PublicKey;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34282OooO0O0;
import oO0oooO.InterfaceC34286OooO0o0;
import oOo00oo0.C34565OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PublicKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34565OooO0OO f123203OooOo0o;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof OooO0O0)) {
            C34565OooO0OO c34565OooO0OO = this.f123203OooOo0o;
            int i = c34565OooO0OO.f123817OooOoO0;
            C34565OooO0OO c34565OooO0OO2 = ((OooO0O0) obj).f123203OooOo0o;
            if (i == c34565OooO0OO2.f123817OooOoO0 && c34565OooO0OO.f123816OooOoO == c34565OooO0OO2.f123816OooOoO && c34565OooO0OO.f123818OooOoOO.equals(c34565OooO0OO2.f123818OooOoOO)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        C34565OooO0OO c34565OooO0OO = this.f123203OooOo0o;
        try {
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123093OooO0OO), new C34282OooO0O0(c34565OooO0OO.f123817OooOoO0, c34565OooO0OO.f123816OooOoO, c34565OooO0OO.f123818OooOoOO, C21053Oooo00o.OooO0O0(c34565OooO0OO.f123809OooOo))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        C34565OooO0OO c34565OooO0OO = this.f123203OooOo0o;
        return c34565OooO0OO.f123818OooOoOO.hashCode() + (((c34565OooO0OO.f123816OooOoO * 37) + c34565OooO0OO.f123817OooOoO0) * 37);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("McEliecePublicKey:\n length of the code         : ");
        C34565OooO0OO c34565OooO0OO = this.f123203OooOo0o;
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(C21023OooO0Oo.OooO0OO(IOUtils.LINE_SEPARATOR_UNIX, c34565OooO0OO.f123816OooOoO, C22226Oooo0oo.OooO0OO(C21023OooO0Oo.OooO0OO(IOUtils.LINE_SEPARATOR_UNIX, c34565OooO0OO.f123817OooOoO0, sb), " error correction capability: ")), " generator matrix           : ");
        sbOooO0OO.append(c34565OooO0OO.f123818OooOoOO.toString());
        return sbOooO0OO.toString();
    }
}
