package com.huawei.hms.network.embedded;

import com.google.android.gms.stats.CodePackage;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o00OO0o0.C24999OooO0OO;
import o0O00Ooo.C25842OooO00o;
import o0O00o0o.C25846OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18156e4 {

    /* JADX INFO: renamed from: a */
    public static final String f54613a = "Secure";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e4$a */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e4$b */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    public static byte[] decryptBody(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            throw new a("Decrypt body is empty");
        }
        try {
            byte[] bArrOooO00o = C25842OooO00o.OooO00o(bArr, C18128c4.m78094a(false));
            if (bArrOooO00o == null || bArrOooO00o.length == 0) {
                throw new a("Decrypt body failed");
            }
            return bArrOooO00o;
        } catch (IndexOutOfBoundsException unused) {
            throw new a("The cached file is tampered, throw a indexOutOfBoundsException");
        }
    }

    public static byte[] encryptBody(byte[] bArr) throws IOException {
        byte[] bArrDoFinal;
        byte[] bArrM78094a = C18128c4.m78094a(true);
        byte[] bArrOooO00o = C25846OooO00o.OooO00o(12);
        if (bArr == null) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "encrypt 6 content is null");
            bArrDoFinal = new byte[0];
        } else if (bArr.length == 0) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "encrypt 6 content length is 0");
            bArrDoFinal = new byte[0];
        } else if (bArrM78094a == null) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "encrypt 6 key is null");
            bArrDoFinal = new byte[0];
        } else if (bArrM78094a.length < 16) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else if (bArrOooO00o.length < 12) {
            C24999OooO0OO.OooO0O0(CodePackage.GCM, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM78094a, AES256KeyLoader.AES_ALGORITHM);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArrOooO00o));
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                C24999OooO0OO.OooO0O0(CodePackage.GCM, "GCM encrypt data error" + e.getMessage());
                bArrDoFinal = new byte[0];
            } catch (GeneralSecurityException e2) {
                C24999OooO0OO.OooO0O0(CodePackage.GCM, "GCM encrypt data error" + e2.getMessage());
                bArrDoFinal = new byte[0];
            }
        }
        int length = bArrOooO00o.length + bArrDoFinal.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrOooO00o, 0, bArr2, 0, bArrOooO00o.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrOooO00o.length, bArrDoFinal.length);
        if (length != 0) {
            return bArr2;
        }
        throw new a("Encrypt body failed");
    }
}
