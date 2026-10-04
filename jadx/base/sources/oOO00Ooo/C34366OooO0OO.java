package oOO00Ooo;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: oOO00Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34366OooO0OO {
    public static String OooO00o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            if ((b & 255) < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }

    public static boolean OooO0O0(Context context, int i) {
        if (context != null) {
            return OooO0OO(context) < i;
        }
        C34370OooO0o0.OooO0Oo("SDKUtil", "context is null");
        return false;
    }

    public static int OooO0OO(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            C34365OooO0O0.OooO00o(context).getClass();
            int i = packageManager.getPackageInfo("com.hihonor.id", 0).versionCode;
            C34370OooO0o0.OooO0Oo("SDKUtil", "versionCode " + i);
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            C34370OooO0o0.OooO0OO("SDKUtil", "NameNotFoundException error");
            return 0;
        } catch (Exception unused2) {
            C34370OooO0o0.OooO0OO("SDKUtil", "Exception error");
            return 0;
        }
    }

    public static boolean OooO0Oo(Context context, int i) {
        if (context != null) {
            return OooO0OO(context) <= i;
        }
        C34370OooO0o0.OooO0Oo("SDKUtil", "context is null");
        return false;
    }
}
