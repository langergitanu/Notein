package o0oooo0o;

import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: o0oooo0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31871OooO0o0 {
    public static byte[] OooO00o(byte[] bArr, PublicKey publicKey) throws C31869OooO0OO {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new C31869OooO0OO(e.getCause());
        } catch (NoSuchAlgorithmException e2) {
            throw new C31869OooO0OO(e2.getCause());
        } catch (BadPaddingException e3) {
            throw new C31869OooO0OO(e3.getCause());
        } catch (IllegalBlockSizeException e4) {
            throw new C31869OooO0OO(e4.getCause());
        } catch (NoSuchPaddingException e5) {
            throw new C31869OooO0OO(e5.getCause());
        }
    }

    public static PublicKey OooO0O0(byte[] bArr) throws C31869OooO0OO {
        if (bArr == null) {
            throw new IllegalStateException("public key bytes should not be empty");
        }
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
        } catch (CertificateException e) {
            throw new C31869OooO0OO("getPublicKey", e.getCause());
        }
    }
}
