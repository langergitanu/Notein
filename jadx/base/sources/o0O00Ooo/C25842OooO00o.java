package o0O00Ooo;

import com.google.android.gms.stats.CodePackage;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o00OO0o0.C24999OooO0OO;

/* JADX INFO: renamed from: o0O00Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25842OooO00o {
    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArr, 0, bArr3, 0, 12);
        int length = bArr.length - 12;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 12, bArr4, 0, bArr.length - 12);
        if (length == 0) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, AES256KeyLoader.AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr3));
            return cipher.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "GCM decrypt data exception: " + e.getMessage());
            return new byte[0];
        }
    }
}
