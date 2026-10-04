package o0O00o0o;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;
import oO0oOoo.C34205OooO00o;
import oO0oo0.C34227OooO00o;
import oO0oo0.C34228OooO0O0;
import oO0oo0.C34229OooO0OO;
import oO0oo0.C34230OooO0Oo;

/* JADX INFO: renamed from: o0O00o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25846OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f88194OooO00o = false;

    public static byte[] OooO00o(int i) {
        SecureRandom c34229OooO0OO;
        SecureRandom secureRandom = null;
        if (!f88194OooO00o) {
            byte[] bArr = new byte[i];
            try {
                secureRandom = SecureRandom.getInstanceStrong();
            } catch (NoSuchAlgorithmException unused) {
                C24999OooO0OO.OooO0O0("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            }
            if (secureRandom == null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                } catch (NoSuchAlgorithmException unused2) {
                    C24999OooO0OO.OooO0O0("EncryptUtil", "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                    return new byte[0];
                } catch (Exception e) {
                    C24999OooO0OO.OooO0O0("EncryptUtil", "getSecureRandomBytes getInstance: exception : " + e.getMessage());
                    return new byte[0];
                }
            }
            secureRandom.nextBytes(bArr);
            return bArr;
        }
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused3) {
            C24999OooO0OO.OooO0O0("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused4) {
                C24999OooO0OO.OooO0O0("EncryptUtil", "NoSuchAlgorithmException");
                c34229OooO0OO = secureRandom;
            } catch (Throwable unused5) {
                c34229OooO0OO = secureRandom;
            }
        }
        C34205OooO00o c34205OooO00o = new C34205OooO00o();
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        c34229OooO0OO = new C34229OooO0OO(secureRandom, new C34227OooO00o(new C34228OooO0O0(secureRandom)), new C34230OooO0Oo(c34205OooO00o, bArr2));
        if (c34229OooO0OO == null) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[i];
        c34229OooO0OO.nextBytes(bArr3);
        return bArr3;
    }

    public static String OooO0O0(int i) {
        return C24998OooO0O0.OooO0OO(OooO00o(i));
    }
}
