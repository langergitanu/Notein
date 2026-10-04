package o0O00;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import oOO00Ooo.C34364OooO00o;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o {
    public static String OooO00o(Context context, String str) {
        int i;
        String str2;
        byte[] bArr;
        try {
            i = Integer.parseInt(C34364OooO00o.OooO00o(context));
        } catch (Exception unused) {
            C34370OooO0o0.OooO0Oo("HnIdEncrypter", "get version of encrypted is null, use GRADE_VERSION_KEYSTORE directory");
            i = 3;
        }
        if (i >= 3) {
            String str3 = context.getPackageName() + ".hnidsdk";
            if (str == null) {
                bArr = new byte[0];
            } else {
                int length = str.length();
                if (length % 2 != 0) {
                    bArr = new byte[0];
                } else {
                    String upperCase = str.toUpperCase(Locale.ENGLISH);
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = upperCase.charAt(i2);
                        if (('0' > cCharAt || cCharAt > '9') && ('A' > cCharAt || cCharAt > 'F')) {
                            bArr = new byte[0];
                            break;
                        }
                    }
                    int i3 = length / 2;
                    byte[] bArr2 = new byte[i3];
                    byte[] bArr3 = new byte[2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = i4 + 1;
                        bArr3[0] = (byte) upperCase.charAt(i4);
                        i4 += 2;
                        bArr3[1] = (byte) upperCase.charAt(i6);
                        for (int i7 = 0; i7 < 2; i7++) {
                            byte b = bArr3[i7];
                            if (65 > b || b > 70) {
                                bArr3[i7] = (byte) (b - 48);
                            } else {
                                bArr3[i7] = (byte) (b - 55);
                            }
                        }
                        bArr2[i5] = (byte) ((bArr3[0] << 4) | bArr3[1]);
                    }
                    bArr = bArr2;
                }
            }
            if (bArr.length <= 16) {
                C34370OooO0o0.OooO0OO("KeyStoreEncryptAndDecrypt", "Decrypt source data is invalid.");
            } else {
                byte[] bArrDoFinal = new byte[0];
                try {
                    SecretKey secretKeyOooO00o = OooO0O0.OooO00o(str3);
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    cipher.init(2, secretKeyOooO00o, new IvParameterSpec(bArrCopyOf));
                    bArrDoFinal = cipher.doFinal(bArr, 16, bArr.length - 16);
                } catch (RuntimeException unused2) {
                    C34370OooO0o0.OooO0Oo("KeyStoreEncryptAndDecrypt", "RuntimeException");
                } catch (Exception unused3) {
                    C34370OooO0o0.OooO0OO("KeyStoreEncryptAndDecrypt", "Decrypt exception");
                }
                try {
                    str2 = new String(bArrDoFinal, "UTF-8");
                } catch (UnsupportedEncodingException unused4) {
                    C34370OooO0o0.OooO0Oo("KeyStoreEncryptAndDecrypt", "unreachable UnsupportedEncodingException");
                    str2 = "";
                }
            }
            str2 = "";
        } else {
            str2 = null;
        }
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    public static String OooO0O0(Context context, String str) {
        byte[] bArrDoFinal;
        byte[] iv;
        String str2 = context.getPackageName() + ".hnidsdk";
        byte[] bArrCopyOf = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, OooO0O0.OooO00o(str2));
            bArrDoFinal = cipher.doFinal(str.getBytes("UTF-8"));
            iv = cipher.getIV();
        } catch (RuntimeException unused) {
            C34370OooO0o0.OooO0Oo("KeyStoreEncryptAndDecrypt", "RuntimeException");
        } catch (Exception unused2) {
            C34370OooO0o0.OooO0OO("KeyStoreEncryptAndDecrypt", "Encrypt exception");
        }
        if (iv != null && iv.length == 16) {
            bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
            System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
            StringBuffer stringBuffer = new StringBuffer();
            if (bArrCopyOf == null) {
                return null;
            }
            for (byte b : bArrCopyOf) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                stringBuffer.append(hexString.toUpperCase(Locale.ENGLISH));
            }
            return stringBuffer.toString();
        }
        C34370OooO0o0.OooO0OO("KeyStoreEncryptAndDecrypt", "IV is invalid.");
        return "";
    }
}
