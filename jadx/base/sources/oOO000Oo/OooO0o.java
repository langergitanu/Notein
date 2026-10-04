package oOO000Oo;

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
import o0Oo0ooo.C28476OooOOO;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34162OooOo00;
import oO0oo0o.InterfaceC34248OooO0O0;
import oO0oooO.C34289OooOO0;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34312OooO0OO;
import p619oO.C31900OooOOoo;
import p619oO.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            C34323OooO00o c34323OooO00o = new C34323OooO00o();
            c34323OooO00o.f123226OooOoO0 = c34116OooO0oOooO0oo.f122586OooOoO;
            c34323OooO00o.f123225OooOo0o = C34289OooOO0.OooO0oo(c34116OooO0oOooO0oo.f122584OooOo.f122684OooOo).f123109OooOoO.f122685OooOo0o;
            c34323OooO00o.f123224OooOo = (C31900OooOOoo) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
            return c34323OooO00o;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("unknown key specification: " + keySpec + ".");
        }
        try {
            C34162OooOo00 c34162OooOo00OooO0oo = C34162OooOo00.OooO0oo(((X509EncodedKeySpec) keySpec).getEncoded());
            C34324OooO0O0 c34324OooO0O0 = new C34324OooO0O0();
            OooOo00 oooOo00 = (OooOo00) C34312OooO0OO.OooO00o(c34162OooOo00OooO0oo);
            c34324OooO0O0.f123227OooOo = oooOo00;
            c34324OooO0O0.f123228OooOo0o = C28476OooOOO.OooO0O0(oooOo00.f113669OooOo);
            return c34324OooO0O0;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C34323OooO00o) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C34323OooO00o) key).getEncoded());
            }
        } else {
            if (!(key instanceof C34324OooO0O0)) {
                throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C34324OooO0O0) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(o0Oo0oo.OooO0OO("unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C34323OooO00o) || (key instanceof C34324OooO0O0)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
