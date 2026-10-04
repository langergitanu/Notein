package o0000OoO;

import android.util.Base64;
import android.view.View;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.orion.notein.global.R;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: o0000OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24224OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81466OooO00o = 0;

    public static String OooO00o(String str, Map map) {
        String str2;
        return (map == null || (str2 = (String) map.get(str)) == null) ? "" : str2;
    }

    public static boolean OooO0O0(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean OooO0OO(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static boolean OooO0Oo(String str) {
        return !OooO0O0(str);
    }

    public static String OooO0o(String str) {
        try {
            byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(str.length()).array();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] bArr = new byte[byteArrayOutputStream.toByteArray().length + 4];
            System.arraycopy(bArrArray, 0, bArr, 0, 4);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 4, byteArrayOutputStream.toByteArray().length);
            return Base64.encodeToString(bArr, 8);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String OooO0o0(String str) {
        try {
            if (OooO0O0(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final C24225OooO0O0 OooO0oO(View view) {
        C24225OooO0O0 c24225OooO0O0 = (C24225OooO0O0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c24225OooO0O0 != null) {
            return c24225OooO0O0;
        }
        C24225OooO0O0 c24225OooO0O02 = new C24225OooO0O0();
        view.setTag(R.id.pooling_container_listener_holder_tag, c24225OooO0O02);
        return c24225OooO0O02;
    }
}
