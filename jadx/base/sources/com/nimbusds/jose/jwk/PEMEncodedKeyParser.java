package com.nimbusds.jose.jwk;

import OooOO0.OooO0OO;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.nimbusds.jose.JOSEException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import o00ooOo.C25785OooO0oO;
import oO0oOOOO.C34116OooO0o;
import oO0oOo.C34140OooO0o0;
import oO0oOo0.C34162OooOo00;
import oO0ooO.C34252OooO00o;
import oO0ooO.C34253OooO0O0;
import oO0ooO.C34255OooO0Oo;
import oO0ooOO0.C34279OooO00o;

/* JADX INFO: loaded from: classes9.dex */
class PEMEncodedKeyParser {
    private static final C34279OooO00o pemConverter;

    static {
        C34279OooO00o c34279OooO00o = new C34279OooO00o();
        c34279OooO00o.f123058OooO00o = new C25785OooO0oO();
        pemConverter = c34279OooO00o;
    }

    private PEMEncodedKeyParser() {
    }

    public static List<KeyPair> parseKeys(String str) throws JOSEException {
        Object object;
        C34255OooO0Oo c34255OooO0Oo = new C34255OooO0Oo(new StringReader(str));
        ArrayList arrayList = new ArrayList();
        do {
            try {
                object = c34255OooO0Oo.readObject();
                if (object instanceof C34162OooOo00) {
                    arrayList.add(toKeyPair((C34162OooOo00) object));
                } else if (object instanceof C34140OooO0o0) {
                    arrayList.add(toKeyPair((C34140OooO0o0) object));
                } else if (object instanceof C34253OooO0O0) {
                    arrayList.add(toKeyPair((C34253OooO0O0) object));
                } else if (object instanceof C34116OooO0o) {
                    arrayList.add(toKeyPair((C34116OooO0o) object));
                }
            } catch (Exception e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } while (object != null);
        return arrayList;
    }

    private static KeyPair toKeyPair(C34140OooO0o0 c34140OooO0o0) throws C34252OooO00o {
        return new KeyPair(pemConverter.OooO0O0(c34140OooO0o0.f122681OooOo0o.f122692OooOo.f122760OooOooo), null);
    }

    private static KeyPair toKeyPair(C34162OooOo00 c34162OooOo00) throws C34252OooO00o {
        return new KeyPair(pemConverter.OooO0O0(c34162OooOo00), null);
    }

    private static KeyPair toKeyPair(C34253OooO0O0 c34253OooO0O0) throws C34252OooO00o {
        C34279OooO00o c34279OooO00o = pemConverter;
        c34279OooO00o.getClass();
        try {
            KeyFactory keyFactoryOooO00o = c34279OooO00o.OooO00o(c34253OooO0O0.f123005OooO0O0.f122584OooOo);
            return new KeyPair(keyFactoryOooO00o.generatePublic(new X509EncodedKeySpec(c34253OooO0O0.f123004OooO00o.getEncoded())), keyFactoryOooO00o.generatePrivate(new PKCS8EncodedKeySpec(c34253OooO0O0.f123005OooO0O0.getEncoded())));
        } catch (Exception e) {
            throw new C34252OooO00o(OooO0OO.OooO0Oo(e, new StringBuilder("unable to convert key pair: ")), e);
        }
    }

    private static KeyPair toKeyPair(C34116OooO0o c34116OooO0o) throws C34252OooO00o, InvalidKeySpecException, NoSuchAlgorithmException {
        C34279OooO00o c34279OooO00o = pemConverter;
        c34279OooO00o.getClass();
        try {
            PrivateKey privateKeyGeneratePrivate = c34279OooO00o.OooO00o(c34116OooO0o.f122584OooOo).generatePrivate(new PKCS8EncodedKeySpec(c34116OooO0o.getEncoded()));
            if (privateKeyGeneratePrivate instanceof RSAPrivateCrtKey) {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKeyGeneratePrivate;
                return new KeyPair(KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent())), privateKeyGeneratePrivate);
            }
            return new KeyPair(null, privateKeyGeneratePrivate);
        } catch (Exception e) {
            throw new C34252OooO00o(OooO0OO.OooO0Oo(e, new StringBuilder("unable to convert key pair: ")), e);
        }
    }
}
