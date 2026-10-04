package com.huawei.agconnect.credential.obs;

import Oooo0O0.C20945OoooO00;
import com.huawei.agconnect.common.api.RandomWrapper;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.n */
/* JADX INFO: loaded from: classes8.dex */
public class C17636n {

    /* JADX INFO: renamed from: a */
    private static final int f52183a = 16;

    /* JADX INFO: renamed from: a */
    public static String m75582a(int i) {
        return C20945OoooO00.OooO0O0(RandomWrapper.generateSecureRandom(i / 2));
    }

    /* JADX INFO: renamed from: a */
    public static String m75583a(String str, int i) {
        byte[] bArrOooO0Oo = C20945OoooO00.OooO0Oo(str);
        if (bArrOooO0Oo.length == 0) {
            return null;
        }
        for (int i2 = 0; i2 < bArrOooO0Oo.length; i2++) {
            if (i < 0) {
                bArrOooO0Oo[i2] = (byte) (bArrOooO0Oo[i2] << (-i));
            } else {
                bArrOooO0Oo[i2] = (byte) (bArrOooO0Oo[i2] >> i);
            }
        }
        return C20945OoooO00.OooO0O0(bArrOooO0Oo);
    }

    /* JADX INFO: renamed from: a */
    public static String m75584a(String str, String str2) {
        byte[] bArrOooO0Oo = C20945OoooO00.OooO0Oo(str);
        byte[] bArrOooO0Oo2 = C20945OoooO00.OooO0Oo(str2);
        if (bArrOooO0Oo.length != bArrOooO0Oo2.length) {
            return null;
        }
        int length = bArrOooO0Oo.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArrOooO0Oo[i] ^ bArrOooO0Oo2[i]);
        }
        return C20945OoooO00.OooO0O0(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static SecretKey m75585a(String str, String str2, String str3, int i) {
        return new SecretKeySpec(SecretKeyFactory.getInstance(str3).generateSecret(new PBEKeySpec(str.toCharArray(), C20945OoooO00.OooO0Oo(str2), i, 128)).getEncoded(), AES256KeyLoader.AES_ALGORITHM);
    }
}
