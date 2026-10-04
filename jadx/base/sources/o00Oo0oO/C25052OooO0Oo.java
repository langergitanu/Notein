package o00Oo0oO;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o00Oo0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25052OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f85054OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f85055OooO0O0 = 0;

    public static void OooO00o(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        } catch (Throwable unused) {
        }
    }

    public static final String OooO0O0(String str) {
        char cCharAt;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (oO0o0O0o.C33599OooOo0O.OooOoOO(r0, "flyme", false) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OooO0OO(Activity activity) throws Throwable {
        Class cls;
        String strOooO0o0 = C25050OooO0O0.OooO0o0("ro.build.display.id");
        if (!TextUtils.isEmpty(strOooO0o0)) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(strOooO0o0);
            if (!C33599OooOo0O.OooOoOO(strOooO0o0, "flyme", false)) {
                String lowerCase = strOooO0o0.toLowerCase();
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "(this as java.lang.String).toLowerCase()");
            }
            AppOpsManager appOpsManager = (AppOpsManager) activity.getSystemService("appops");
            try {
                cls = Integer.TYPE;
            } catch (Exception e) {
                Log.e("MeizuUtils", Log.getStackTraceString(e));
            }
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), activity.getPackageName())).intValue() == 0;
        }
        try {
            Method declaredMethod = Settings.class.getDeclaredMethod("canDrawOverlays", Context.class);
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredMethod, "clazz.getDeclaredMethod(…ys\", Context::class.java)");
            Object objInvoke = declaredMethod.invoke(null, activity);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e2) {
            Log.e("PermissionUtils--->", Log.getStackTraceString(e2));
            return true;
        }
    }

    public static final void OooO0Oo(o0O0OO0O.OooO0O0 oooO0O0) {
        try {
            Field declaredField = Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION");
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredField, "clazz.getDeclaredField(\"…NAGE_OVERLAY_PERMISSION\")");
            Intent intent = new Intent(declaredField.get(null).toString());
            intent.setData(Uri.parse(kotlin.jvm.internal.OooOOO0.OooOOO0(oooO0O0.getActivity().getPackageName(), "package:")));
            oooO0O0.startActivityForResult(intent, 199);
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    public static final String OooO0o(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "builder.toString()");
        return string;
    }

    public static final boolean OooO0o0(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }
}
