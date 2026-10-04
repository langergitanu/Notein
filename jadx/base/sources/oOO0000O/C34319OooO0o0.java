package oOO0000O;

import Oooo0oO.C21053Oooo00o;
import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34162OooOo00;
import oO0oo0o.InterfaceC34248OooO0O0;
import oO0oooO.C34281OooO00o;
import oO0oooO.C34282OooO0O0;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO000o.C34328OooO0Oo;
import oOO000o.C34329OooO0o0;
import oOo00oo0.C34564OooO0O0;
import oOo00oo0.C34565OooO0OO;

/* JADX INFO: renamed from: oOO0000O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34319OooO0o0 extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC34286OooO0o0.f123093OooO0OO.OooOO0o(c34116OooO0oOooO0oo.f122584OooOo.f122685OooOo0o)) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                C34281OooO00o c34281OooO00oOooO0oo = C34281OooO00o.OooO0oo(c34116OooO0oOooO0oo.OooO());
                C34564OooO0O0 c34564OooO0O0 = new C34564OooO0O0(c34281OooO00oOooO0oo.f123063OooOo0o, c34281OooO00oOooO0oo.f123062OooOo, new oOO000o.OooO0O0(c34281OooO00oOooO0oo.f123065OooOoO0), new C34329OooO0o0(new oOO000o.OooO0O0(c34281OooO00oOooO0oo.f123065OooOoO0), c34281OooO00oOooO0oo.f123064OooOoO), new C34328OooO0Oo(c34281OooO00oOooO0oo.f123066OooOoOO), C21053Oooo00o.OooO0OO(c34281OooO00oOooO0oo.f123067OooOoo0).OooO0O0());
                OooO00o oooO00o = new OooO00o();
                oooO00o.f123202OooOo0o = c34564OooO0O0;
                return oooO00o;
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34162OooOo00 c34162OooOo00OooO0oo = C34162OooOo00.OooO0oo(AbstractC34036OooOoOO.OooOOO(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC34286OooO0o0.f123093OooO0OO.OooOO0o(c34162OooOo00OooO0oo.f122751OooOo0o.f122685OooOo0o)) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00OooO0oo.OooO();
                C34282OooO0O0 c34282OooO0O0 = abstractC34036OooOoOOOooO != null ? new C34282OooO0O0(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
                C34565OooO0OO c34565OooO0OO = new C34565OooO0OO(c34282OooO0O0.f123069OooOo0o, c34282OooO0O0.f123068OooOo, c34282OooO0O0.f123071OooOoO0, C21053Oooo00o.OooO0OO(c34282OooO0O0.f123070OooOoO).OooO0O0());
                OooO0O0 oooO0O0 = new OooO0O0();
                oooO0O0.f123203OooOo0o = c34565OooO0OO;
                return oooO0O0;
            } catch (IOException e) {
                throw new InvalidKeySpecException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to decode X509EncodedKeySpec: ")));
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
