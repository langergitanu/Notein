package o00OOOo;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o00OOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25012OooO00o {
    public static String OooO00o(String str) {
        byte[] bArrDoFinal;
        try {
            byte[] bArrOooO0O0 = OooO0O0();
            byte[] bytes = str.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrOooO0O0, AES256KeyLoader.AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(OooO0Oo()));
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Exception unused) {
            bArrDoFinal = null;
        }
        if (bArrDoFinal == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArrDoFinal.length * 2);
        for (byte b : bArrDoFinal) {
            stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
        }
        return stringBuffer.toString();
    }

    public static byte[] OooO0O0() throws Exception {
        return C25013OooO0Oo.OooO00o(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    public static String OooO0OO(String str) {
        try {
            byte[] bArrOooO0O0 = OooO0O0();
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrOooO0O0, AES256KeyLoader.AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(OooO0Oo()));
            return new String(cipher.doFinal(bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] OooO0Oo() {
        try {
            return C25013OooO0Oo.OooO00o(OooO0O0.OooO00o("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8")));
        } catch (Exception unused) {
            return new byte[16];
        }
    }
}
