package o0oo000O;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: o0oo000O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31185OooO0OO {
    public static String OooO00o(String str) {
        byte[] bArrDigest;
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes();
        if (bytes == null || bytes.length <= 0) {
            bArrDigest = null;
        } else {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                bArrDigest = null;
            }
        }
        return C31184OooO0O0.OooO00o(bArrDigest);
    }
}
