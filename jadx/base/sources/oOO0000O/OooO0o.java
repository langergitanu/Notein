package oOO0000O;

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
import oO0oooO.C34283OooO0OO;
import oO0oooO.C34284OooO0Oo;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO000o.C34328OooO0Oo;
import oOO000o.C34329OooO0o0;
import oOo00oo0.C34567OooO0o;
import oOo00oo0.C34568OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC34286OooO0o0.f123092OooO0O0.OooOO0o(c34116OooO0oOooO0oo.f122584OooOo.f122685OooOo0o)) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                C34283OooO0OO c34283OooO0OOOooO0oo = C34283OooO0OO.OooO0oo(c34116OooO0oOooO0oo.OooO());
                int i = c34283OooO0OOOooO0oo.f123073OooOo0o;
                int i2 = c34283OooO0OOOooO0oo.f123072OooOo;
                oOO000o.OooO0O0 oooO0O0 = new oOO000o.OooO0O0(c34283OooO0OOOooO0oo.f123075OooOoO0);
                C34329OooO0o0 c34329OooO0o0 = new C34329OooO0o0(new oOO000o.OooO0O0(c34283OooO0OOOooO0oo.f123075OooOoO0), c34283OooO0OOOooO0oo.f123074OooOoO);
                C34328OooO0Oo c34328OooO0Oo = new C34328OooO0Oo(c34283OooO0OOOooO0oo.f123078OooOoo0);
                C34328OooO0Oo c34328OooO0Oo2 = new C34328OooO0Oo(c34283OooO0OOOooO0oo.f123077OooOoo);
                oOO000o.OooO00o oooO00o = new oOO000o.OooO00o(c34283OooO0OOOooO0oo.f123076OooOoOO);
                C34568OooO0o0 c34568OooO0o0 = new C34568OooO0o0(2);
                c34568OooO0o0.f123824OooOoO0 = i2;
                c34568OooO0o0.f123822OooOo = i;
                c34568OooO0o0.f123823OooOoO = oooO0O0;
                c34568OooO0o0.f123825OooOoOO = c34329OooO0o0;
                c34568OooO0o0.f123827OooOoo0 = oooO00o;
                c34568OooO0o0.f123826OooOoo = c34328OooO0Oo;
                c34568OooO0o0.f123828OooOooO = c34328OooO0Oo2;
                o00OO00O.OooO0O0.OooO0OO(oooO0O0, c34329OooO0o0);
                new oOO000o.OooO0o(oooO0O0, c34329OooO0o0);
                OooO0OO oooO0OO = new OooO0OO();
                oooO0OO.f123204OooOo0o = c34568OooO0o0;
                return oooO0OO;
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
                if (!InterfaceC34286OooO0o0.f123092OooO0O0.OooOO0o(c34162OooOo00OooO0oo.f122751OooOo0o.f122685OooOo0o)) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00OooO0oo.OooO();
                C34284OooO0Oo c34284OooO0Oo = abstractC34036OooOoOOOooO != null ? new C34284OooO0Oo(AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO)) : null;
                int i = c34284OooO0Oo.f123080OooOo0o;
                int i2 = c34284OooO0Oo.f123079OooOo;
                oOO000o.OooO00o oooO00o = new oOO000o.OooO00o(c34284OooO0Oo.f123081OooOoO0);
                C34567OooO0o c34567OooO0o = new C34567OooO0o(2);
                c34567OooO0o.f123819OooOo = i;
                c34567OooO0o.f123821OooOoO0 = i2;
                c34567OooO0o.f123820OooOoO = new oOO000o.OooO00o(oooO00o);
                C34318OooO0Oo c34318OooO0Oo = new C34318OooO0Oo();
                c34318OooO0Oo.f123205OooOo0o = c34567OooO0o;
                return c34318OooO0Oo;
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
