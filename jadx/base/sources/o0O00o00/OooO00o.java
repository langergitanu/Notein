package o0O00o00;

import android.text.TextUtils;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f88192OooO00o = {KeyUtil.HMAC_KEY_HASH_ALGORITHM, "SHA-384", "SHA-512"};

    public static String OooO00o(String str) {
        boolean z;
        byte[] bytes;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            C24999OooO0OO.OooO0O0("SHA", "content or algorithm is null.");
            return "";
        }
        String[] strArr = f88192OooO00o;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            if (strArr[i].equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            C24999OooO0OO.OooO0O0("SHA", "algorithm is not safe or legal");
            return "";
        }
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = new byte[0];
            C24999OooO0OO.OooO0O0("SHA", "Error in generate SHA UnsupportedEncodingException");
        }
        if (bytes != null && !TextUtils.isEmpty(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    C24999OooO0OO.OooO0O0("SHA", "algorithm is not safe or legal");
                    bArrDigest = new byte[0];
                    break;
                }
                if (strArr[i2].equals(KeyUtil.HMAC_KEY_HASH_ALGORITHM)) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
                        messageDigest.update(bytes);
                        bArrDigest = messageDigest.digest();
                        break;
                    } catch (NoSuchAlgorithmException unused2) {
                        C24999OooO0OO.OooO0O0("SHA", "Error in generate SHA NoSuchAlgorithmException");
                        bArrDigest = new byte[0];
                    }
                } else {
                    i2++;
                }
            }
        } else {
            C24999OooO0OO.OooO0O0("SHA", "content or algorithm is null.");
            bArrDigest = new byte[0];
        }
        return C24998OooO0O0.OooO0OO(bArrDigest);
    }
}
