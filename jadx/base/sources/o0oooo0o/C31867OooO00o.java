package o0oooo0o;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o0oooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31867OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SecretKeySpec f113565OooO00o;

    public final String OooO00o(String str) throws C31868OooO0O0 {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, this.f113565OooO00o, new IvParameterSpec("0102030405060708".getBytes()));
                return Base64.encodeToString(cipher.doFinal(bytes), 2);
            } catch (Exception e) {
                throw new C31868OooO0O0("fail to encrypt by aescoder", e);
            }
        } catch (Exception e2) {
            throw new C31868OooO0O0("fail to encrypt by aescoder", e2);
        }
    }
}
