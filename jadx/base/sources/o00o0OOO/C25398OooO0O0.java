package o00o0OOO;

import android.util.Base64;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00o0OOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25398OooO0O0 {
    public static final ArrayList OooO00o(InterfaceC25397OooO00o key) {
        OooOOO0.OooO0oO(key, "key");
        try {
            if (key instanceof C25399OooO0OO) {
                OooOOO0.OooO0o(null, "getCacheKeys(...)");
                throw null;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(key.OooO0O0() ? key.OooO00o() : OooO0O0(key));
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String OooO0O0(InterfaceC25397OooO00o interfaceC25397OooO00o) throws UnsupportedEncodingException {
        String strOooO00o = interfaceC25397OooO00o.OooO00o();
        OooOOO0.OooO0o(strOooO00o, "getUriString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        OooOOO0.OooO0o(charsetForName, "forName(...)");
        byte[] bytes = strOooO00o.getBytes(charsetForName);
        OooOOO0.OooO0o(bytes, "getBytes(...)");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1);
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            OooOOO0.OooO0o(strEncodeToString, "makeSHA1HashBase64(...)");
            return strEncodeToString;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
