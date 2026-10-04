package o0O00O0;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.text.TextUtils;
import com.hihonor.honorid.core.data.HonorAccount;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0O00.C25827OooO0Oo;
import oOO00Ooo.C34367OooO0Oo;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o {
    public static String OooO00o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static boolean OooO0O0(HonorAccount honorAccount) {
        if (honorAccount == null) {
            return false;
        }
        if (!TextUtils.isEmpty(honorAccount.f68862Oooo)) {
            return true;
        }
        if (!TextUtils.isEmpty(honorAccount.f68855OooOoO) && !TextUtils.isEmpty(honorAccount.f68857OooOoOO) && !TextUtils.isEmpty(honorAccount.f68853OooOo) && !TextUtils.isEmpty(honorAccount.f68856OooOoO0)) {
            return true;
        }
        C34370OooO0o0.OooO0Oo("BaseUtil", "addHonorAccount is invalid");
        return false;
    }

    public static byte[] OooO0OO(String str) {
        if (TextUtils.isEmpty(str)) {
            C34370OooO0o0.OooO0OO("BaseUtil", "getUTF8Bytes, str is empty");
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            C34370OooO0o0.OooO0OO("BaseUtil", "getBytes error");
            return new byte[0];
        }
    }

    public static String OooO0Oo(Context context) {
        String strOooO00o = C34367OooO0Oo.OooO00o(context, 0);
        if (TextUtils.isEmpty(strOooO00o) || "NULL".equals(strOooO00o)) {
            C34370OooO0o0.OooO0Oo("BaseUtil", "TransID get imei is null");
            return null;
        }
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO00o, new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date(System.currentTimeMillis())));
        if (TextUtils.isEmpty(strOooO0Oo) || TextUtils.isEmpty(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            C34370OooO0o0.OooO0o("SHA256", "content or algorithm is null.");
            return "";
        }
        String[] strArr = C25827OooO0Oo.f88110OooO00o;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
                    messageDigest.update(strOooO0Oo.getBytes("UTF-8"));
                    return OooO00o(messageDigest.digest());
                } catch (UnsupportedEncodingException unused) {
                    C34370OooO0o0.OooO0o("SHA256", "Error in generate SHA UnsupportedEncodingException");
                    return "";
                } catch (NoSuchAlgorithmException unused2) {
                    C34370OooO0o0.OooO0o("SHA256", "Error in generate SHA NoSuchAlgorithmException");
                    return "";
                }
            }
        }
        C34370OooO0o0.OooO0o("SHA256", "algorithm is not safe or legal");
        return "";
    }

    public static boolean OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (byte b : str.getBytes("UTF-8")) {
                int i = b & 255;
                int i2 = (i > 31 && i < 127) ? i2 + 1 : 0;
                C34370OooO0o0.OooO0Oo("BaseUtil", "byte not printable");
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            C34370OooO0o0.OooO0Oo("BaseUtil", "UnsupportedEncodingException");
            return true;
        }
    }
}
