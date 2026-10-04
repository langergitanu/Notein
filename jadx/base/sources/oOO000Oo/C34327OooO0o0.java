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
import oO0oooO.C34280OooO;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34312OooO0OO;
import p619oO.C31905OooOoO0;
import p619oO.OooOo;

/* JADX INFO: renamed from: oOO000Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34327OooO0o0 extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            C34325OooO0OO c34325OooO0OO = new C34325OooO0OO();
            c34325OooO0OO.f123231OooOoO0 = c34116OooO0oOooO0oo.f122586OooOoO;
            c34325OooO0OO.f123229OooOo = C34280OooO.OooO0oo(c34116OooO0oOooO0oo.f122584OooOo.f122684OooOo).f123061OooOoO0.f122685OooOo0o;
            c34325OooO0OO.f123230OooOo0o = (OooOo) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
            return c34325OooO0OO;
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
            C34326OooO0Oo c34326OooO0Oo = new C34326OooO0Oo();
            C31905OooOoO0 c31905OooOoO0 = (C31905OooOoO0) C34312OooO0OO.OooO00o(c34162OooOo00OooO0oo);
            c34326OooO0Oo.f123233OooOo0o = c31905OooOoO0;
            c34326OooO0Oo.f123232OooOo = C28476OooOOO.OooO0O0(c31905OooOoO0.f113663OooOo);
            return c34326OooO0Oo;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C34325OooO0OO) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C34325OooO0OO) key).getEncoded());
            }
        } else {
            if (!(key instanceof C34326OooO0Oo)) {
                throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C34326OooO0Oo) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(o0Oo0oo.OooO0OO("unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C34325OooO0OO) || (key instanceof C34326OooO0Oo)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
