package oOO0000;

import Oooo0oO.o0Oo0oo;
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
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34162OooOo00;
import oO0oo0o.InterfaceC34248OooO0O0;
import oO0oooOO.AbstractC34303OooO0oO;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34312OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            OooO00o oooO00o = new OooO00o();
            oooO00o.f123197OooOo = c34116OooO0oOooO0oo.f122586OooOoO;
            oooO00o.f123198OooOo0o = (AbstractC34303OooO0oO) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
            return oooO00o;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString(), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
        }
        try {
            C34162OooOo00 c34162OooOo00OooO0oo = C34162OooOo00.OooO0oo(((X509EncodedKeySpec) keySpec).getEncoded());
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f123199OooOo0o = (AbstractC34303OooO0oO) C34312OooO0OO.OooO00o(c34162OooOo00OooO0oo);
            return oooO0O0;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString(), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof OooO00o) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((OooO00o) key).getEncoded());
            }
        } else {
            if (!(key instanceof OooO0O0)) {
                throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((OooO0O0) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(o0Oo0oo.OooO0OO("unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof OooO00o) || (key instanceof OooO0O0)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
