package oO0oOooo;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oOoO.C34179OooO0o0;
import oO0oOoO.C34194OooOo0O;
import oO0oo0OO.C34245OooO00o;
import oO0oo0oo.C34250OooO00o;
import oO0oo0oo.C34251OooO0O0;
import oO0ooOO.C34278OooO0o0;
import oO0ooOO.InterfaceC34276OooO0OO;
import oOO000oO.C34332OooO00o;
import oOo00o0O.C34552OooO00o;
import oOo00o0O.C34553OooO0O0;
import oOooo.C34617OooO0O0;
import oOooo.C34618OooO0OO;
import oOooo.C34619OooO0Oo;
import oOooo.InterfaceC34616OooO00o;

/* JADX INFO: renamed from: oO0oOooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34225OooO0o0 extends AbstractC34224OooO0o {

    /* JADX INFO: renamed from: oO0oOooo.OooO0o0$OooO00o */
    public class OooO00o implements InterfaceC34276OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Cipher f122937OooO00o;

        public OooO00o(Cipher cipher) {
            this.f122937OooO00o = cipher;
        }

        @Override // oO0ooOO.InterfaceC34276OooO0OO
        public final C34245OooO00o OooO00o(ByteArrayInputStream byteArrayInputStream) {
            return new C34245OooO00o(byteArrayInputStream, this.f122937OooO00o);
        }
    }

    public C34225OooO0o0(PrivateKey privateKey) {
        C34223OooO0Oo c34223OooO0Oo = new C34223OooO0Oo();
        this.f122934OooO0O0 = c34223OooO0Oo;
        this.f122935OooO0OO = c34223OooO0Oo;
        this.f122936OooO0Oo = new HashMap();
        this.f122933OooO00o = C34220OooO00o.OooO00o(privateKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0oOooo.AbstractC34224OooO0o
    public final C34194OooOo0O OooO00o(C34142OooO00o c34142OooO00o, C34142OooO00o c34142OooO00o2, byte[] bArr) throws C34179OooO0o0 {
        Key keyUnwrap;
        C34032OooOo0O c34032OooOo0O = c34142OooO00o.f122685OooOo0o;
        boolean zContains = C34220OooO00o.f122927OooO00o.contains(c34032OooOo0O);
        PrivateKey privateKey = this.f122933OooO00o;
        C34223OooO0Oo c34223OooO0Oo = this.f122934OooO0O0;
        if (zContains) {
            try {
                C34618OooO0OO c34618OooO0OO = bArr instanceof C34618OooO0OO ? (C34618OooO0OO) bArr : bArr != 0 ? new C34618OooO0OO(AbstractC34039OooOooO.OooOOoo(bArr)) : null;
                C34619OooO0Oo c34619OooO0Oo = c34618OooO0OO.f124012OooOo;
                KeyFactory keyFactoryOooO0OO = c34223OooO0Oo.OooO0OO(c34032OooOo0O);
                C34162OooOo00 c34162OooOo00 = c34619OooO0Oo.f124014OooOo;
                byte[] bArr2 = c34619OooO0Oo.f124016OooOoO0;
                PublicKey publicKeyGeneratePublic = keyFactoryOooO0OO.generatePublic(new X509EncodedKeySpec(c34162OooOo00.getEncoded()));
                KeyAgreement keyAgreementOooO0O0 = c34223OooO0Oo.OooO0O0(c34032OooOo0O);
                byte[] bArrOooO00o = C34332OooO00o.OooO00o(bArr2);
                C34251OooO0O0 c34251OooO0O0 = new C34251OooO0O0();
                C34332OooO00o.OooO00o(bArrOooO00o);
                keyAgreementOooO0O0.init(privateKey, c34251OooO0O0);
                keyAgreementOooO0O0.doPhase(publicKeyGeneratePublic, true);
                C34032OooOo0O c34032OooOo0O2 = InterfaceC34616OooO00o.f124000OooO0OO;
                SecretKey secretKeyGenerateSecret = keyAgreementOooO0O0.generateSecret(c34032OooOo0O2.f122357OooOo0o);
                Cipher cipherOooO00o = c34223OooO0Oo.OooO00o(c34032OooOo0O2);
                cipherOooO00o.init(4, secretKeyGenerateSecret, new C34250OooO00o(c34619OooO0Oo.f124015OooOo0o, C34332OooO00o.OooO00o(bArr2)));
                C34617OooO0O0 c34617OooO0O0 = c34618OooO0OO.f124013OooOo0o;
                byte[] bArrOooO0OO = C34332OooO00o.OooO0OO(C34332OooO00o.OooO00o(c34617OooO0O0.f124010OooOo0o), C34332OooO00o.OooO00o(c34617OooO0O0.f124011OooOoO0));
                C34032OooOo0O c34032OooOo0O3 = c34142OooO00o2.f122685OooOo0o;
                String str = (String) C34223OooO0Oo.f122931OooO00o.get(c34032OooOo0O3);
                if (str == null) {
                    str = c34032OooOo0O3.f122357OooOo0o;
                }
                keyUnwrap = cipherOooO00o.unwrap(bArrOooO0OO, str, 3);
            } catch (Exception e) {
                throw new C34179OooO0o0(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("exception unwrapping key: ")), e);
            }
        } else {
            c34223OooO0Oo.getClass();
            PrivateKey privateKeyOooO00o = C34220OooO00o.OooO00o(C34220OooO00o.OooO00o(privateKey));
            C34552OooO00o c34552OooO00o = new C34552OooO00o();
            c34552OooO00o.f123793OooO00o = c34142OooO00o;
            c34552OooO00o.f123794OooO0O0 = new C34553OooO0O0();
            c34552OooO00o.f123795OooO0OO = new HashMap();
            c34552OooO00o.f123796OooO0Oo = privateKeyOooO00o;
            HashMap map = this.f122936OooO0Oo;
            if (!map.isEmpty()) {
                for (C34032OooOo0O c34032OooOo0O4 : map.keySet()) {
                    c34552OooO00o.f123795OooO0OO.put(c34032OooOo0O4, (String) map.get(c34032OooOo0O4));
                }
            }
            try {
                C34032OooOo0O c34032OooOo0O5 = c34142OooO00o2.f122685OooOo0o;
                Object obj = (Serializable) c34552OooO00o.OooO00o(c34142OooO00o2, bArr).f90943OooO00o;
                if (obj instanceof Key) {
                    keyUnwrap = (Key) obj;
                } else {
                    if (!(obj instanceof byte[])) {
                        throw new IllegalArgumentException("unknown generic key type");
                    }
                    byte[] bArr3 = (byte[]) obj;
                    String str2 = (String) C34223OooO0Oo.f122931OooO00o.get(c34032OooOo0O5);
                    if (str2 == null) {
                        str2 = c34032OooOo0O5.f122357OooOo0o;
                    }
                    keyUnwrap = new SecretKeySpec(bArr3, str2);
                }
            } catch (C34278OooO0o0 e2) {
                throw new C34179OooO0o0("exception unwrapping key: " + e2.getMessage(), e2);
            }
        }
        C34223OooO0Oo c34223OooO0Oo2 = this.f122935OooO0OO;
        c34223OooO0Oo2.getClass();
        try {
            return new C34194OooOo0O(new OooO00o(new C34222OooO0OO(c34223OooO0Oo2, c34142OooO00o2, keyUnwrap).OooO00o()));
        } catch (InvalidAlgorithmParameterException e3) {
            throw new C34179OooO0o0("algorithm parameters invalid.", e3);
        } catch (InvalidKeyException e4) {
            throw new C34179OooO0o0("key invalid in message.", e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new C34179OooO0o0("can't find algorithm.", e5);
        } catch (NoSuchProviderException e6) {
            throw new C34179OooO0o0("can't find provider.", e6);
        } catch (InvalidParameterSpecException e7) {
            throw new C34179OooO0o0("MAC algorithm parameter spec invalid.", e7);
        } catch (NoSuchPaddingException e8) {
            throw new C34179OooO0o0("required padding not supported.", e8);
        }
    }
}
