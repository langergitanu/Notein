package oOO0000O;

import Oooo0oO.C21053Oooo00o;
import java.io.IOException;
import java.security.PrivateKey;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34142OooO00o;
import oO0oooO.C34281OooO00o;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO000oO.C34332OooO00o;
import oOo00oo0.C34564OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34564OooO0O0 f123202OooOo0o;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof OooO00o)) {
            C34564OooO0O0 c34564OooO0O0 = this.f123202OooOo0o;
            int i = c34564OooO0O0.f123811OooOoO0;
            C34564OooO0O0 c34564OooO0O02 = ((OooO00o) obj).f123202OooOo0o;
            if (i == c34564OooO0O02.f123811OooOoO0 && c34564OooO0O0.f123810OooOoO == c34564OooO0O02.f123810OooOoO && c34564OooO0O0.f123812OooOoOO.equals(c34564OooO0O02.f123812OooOoOO) && c34564OooO0O0.f123814OooOoo0.equals(c34564OooO0O02.f123814OooOoo0) && c34564OooO0O0.f123813OooOoo.equals(c34564OooO0O02.f123813OooOoo) && c34564OooO0O0.f123815OooOooO.equals(c34564OooO0O02.f123815OooOooO)) {
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
        try {
            C34564OooO0O0 c34564OooO0O0 = this.f123202OooOo0o;
            return new C34116OooO0o(new C34142OooO00o(InterfaceC34286OooO0o0.f123093OooO0OO), new C34281OooO00o(c34564OooO0O0.f123811OooOoO0, c34564OooO0O0.f123810OooOoO, c34564OooO0O0.f123812OooOoOO, c34564OooO0O0.f123814OooOoo0, c34564OooO0O0.f123813OooOoo, C21053Oooo00o.OooO0O0(c34564OooO0O0.f123809OooOo)), null, null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C34564OooO0O0 c34564OooO0O0 = this.f123202OooOo0o;
        return c34564OooO0O0.f123815OooOooO.hashCode() + ((C34332OooO00o.OooO0o(c34564OooO0O0.f123813OooOoo.f123241OooO00o) + ((c34564OooO0O0.f123814OooOoo0.hashCode() + (((((c34564OooO0O0.f123810OooOoO * 37) + c34564OooO0O0.f123811OooOoO0) * 37) + c34564OooO0O0.f123812OooOoOO.f123239OooO0O0) * 37)) * 37)) * 37);
    }
}
