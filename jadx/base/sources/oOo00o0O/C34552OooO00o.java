package oOo00o0O;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import o0OO00o.C26470OooO00o;
import oO0oOo0.C34142OooO00o;
import oO0ooOO.C34278OooO0o0;

/* JADX INFO: renamed from: oOo00o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34552OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34142OooO00o f123793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C34553OooO0O0 f123794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HashMap f123795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PrivateKey f123796OooO0Oo;

    public final C26470OooO00o OooO00o(C34142OooO00o c34142OooO00o, byte[] bArr) throws C34278OooO0o0 {
        C34142OooO00o c34142OooO00o2 = this.f123793OooO00o;
        C34553OooO0O0 c34553OooO0O0 = this.f123794OooO0O0;
        try {
            Cipher cipherOooO0O0 = c34553OooO0O0.OooO0O0(c34142OooO00o2.f122685OooOo0o, this.f123795OooO0OO);
            AlgorithmParameters algorithmParametersOooO00o = c34553OooO0O0.OooO00o(c34142OooO00o2);
            PrivateKey privateKey = this.f123796OooO0Oo;
            Key secretKeySpec = null;
            try {
                if (algorithmParametersOooO00o != null) {
                    cipherOooO0O0.init(4, privateKey, algorithmParametersOooO00o);
                } else {
                    cipherOooO0O0.init(4, privateKey);
                }
                secretKeySpec = cipherOooO0O0.unwrap(bArr, C34553OooO0O0.OooO0OO(c34142OooO00o.f122685OooOo0o), 3);
            } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException unused) {
            }
            if (secretKeySpec == null) {
                cipherOooO0O0.init(2, privateKey);
                secretKeySpec = new SecretKeySpec(cipherOooO0O0.doFinal(bArr), c34142OooO00o.f122685OooOo0o.f122357OooOo0o);
            }
            byte[] encoded = secretKeySpec.getEncoded();
            if (encoded != null) {
                secretKeySpec = encoded;
            }
            C26470OooO00o c26470OooO00o = new C26470OooO00o();
            c26470OooO00o.f90943OooO00o = secretKeySpec;
            return c26470OooO00o;
        } catch (InvalidKeyException e) {
            throw new C34278OooO0o0("key invalid: " + e.getMessage(), e);
        } catch (BadPaddingException e2) {
            throw new C34278OooO0o0("bad padding: " + e2.getMessage(), e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C34278OooO0o0("illegal blocksize: " + e3.getMessage(), e3);
        }
    }
}
