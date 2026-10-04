package ooOOOOoo;

import OooOoo.C20593OooO0Oo;
import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Arrays;
import java.util.IllegalFormatException;

/* JADX INFO: renamed from: ooOOOOoo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35077OooOo0O {
    public static String OooO00o(String str) {
        String str2;
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : null;
        if (processName != null) {
            str2 = processName.substring(processName.lastIndexOf(".") + 1) + C18115b5.CONNECTOR;
        } else {
            str2 = "";
        }
        return C20593OooO0Oo.OooO0O0("ho_", str2, str);
    }

    public static void OooO0O0(String str, String str2, Object... objArr) {
        try {
            Log.d(OooO00o(str), String.format(str2, objArr));
        } catch (IllegalFormatException unused) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
            sbOooO0OO.append(Arrays.toString(objArr));
            Log.d(OooO00o(str), sbOooO0OO.toString());
        }
    }

    public static void OooO0OO(String str, Throwable th, String str2, Object... objArr) {
        try {
            Log.e(OooO00o(str), String.format(str2, objArr), th);
        } catch (IllegalFormatException unused) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
            sbOooO0OO.append(Arrays.toString(objArr));
            Log.e(OooO00o(str), sbOooO0OO.toString(), th);
        }
    }

    public static void OooO0Oo(String str, String str2, Throwable th) {
        Log.w(OooO00o(str), str2 + '\n' + Log.getStackTraceString(th));
    }

    public static void OooO0o(String str, String str2, Object... objArr) {
        try {
            OooO0Oo(str, String.format(str2, objArr), null);
        } catch (IllegalFormatException unused) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
            sbOooO0OO.append(Arrays.toString(objArr));
            OooO0Oo(str, sbOooO0OO.toString(), null);
        }
    }

    public static void OooO0o0(String str, String str2, Object... objArr) {
        try {
            Log.i(OooO00o(str), String.format(str2, objArr));
        } catch (IllegalFormatException unused) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
            sbOooO0OO.append(Arrays.toString(objArr));
            Log.i(OooO00o(str), sbOooO0OO.toString());
        }
    }
}
