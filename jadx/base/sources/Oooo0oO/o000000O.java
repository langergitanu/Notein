package Oooo0oO;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import o00OOO.C25008OooO0Oo;
import oO00oOo0.C32430OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO0o0OO.C33634Oooo000;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61053OooO00o = 0;

    public static final void OooO00o(Throwable th, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            C32430OooO00o.OooO00o(th);
        } catch (Throwable th2) {
            C32435OooO0Oo.OooO00o(th, th2);
            C33634Oooo000.OooO00o(th, interfaceC34415OooO0oo);
        }
    }

    public static final void OooO0O0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void OooO0OO(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[PHI: r1 r5
      0x00de: PHI (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:56:0x00dc, B:48:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r5v6 android.database.Cursor) = (r5v5 android.database.Cursor), (r5v8 android.database.Cursor) binds: [B:56:0x00dc, B:48:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo1a(Context context) throws Throwable {
        Context context2;
        Exception exc;
        String str;
        Throwable th;
        ?? r1;
        Cursor cursorQuery;
        String str2;
        String strValueOf;
        String str3 = null;
        str = null;
        str3 = null;
        String str4 = null;
        Cursor cursor = null;
        if (context != null) {
            try {
                if (o00OOO.OooO0O0.f84839OooO00o == null) {
                    Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                    o00OOO.OooO0O0.f84839OooO00o = method;
                    method.setAccessible(true);
                }
                context2 = (Context) o00OOO.OooO0O0.f84839OooO00o.invoke(null, new Object[0]);
            } catch (Exception e) {
                Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e.toString());
                context2 = null;
            }
            if (context2 == null ? false : o00OOO.OooO0o.OooO0O0().OooO0OO(context2, false)) {
                o00OOO.OooO0o oooO0oOooO0O0 = o00OOO.OooO0o.OooO0O0();
                Context applicationContext = context.getApplicationContext();
                o00OOO.OooO00o oooO00o = oooO0oOooO0O0.f84849OooO0O0;
                if (oooO00o.f84836OooO00o > System.currentTimeMillis()) {
                    return oooO00o.f84837OooO0O0;
                }
                if (!oooO0oOooO0O0.OooO0OO(applicationContext, true)) {
                    return null;
                }
                try {
                    try {
                        cursorQuery = applicationContext.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{oooO00o.f84838OooO0OO}, null);
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = str3;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    str = null;
                }
                try {
                } catch (Exception e3) {
                    exc = e3;
                    str = str4;
                    cursor = cursorQuery;
                    exc.getMessage();
                    if (cursor == null) {
                        str3 = str;
                        return str3;
                    }
                    cursorQuery = cursor;
                    str3 = str;
                } catch (Throwable th3) {
                    th = th3;
                    r1 = cursorQuery;
                    if (r1 == 0) {
                        throw th;
                    }
                    r1.close();
                    throw th;
                }
                if (cursorQuery != null) {
                    C25008OooO0Oo c25008OooO0OoOooO00o = o00OOO.OooO0o.OooO00o(cursorQuery);
                    String str5 = c25008OooO0OoOooO00o.f84844OooO00o;
                    oooO00o.f84837OooO0O0 = str5;
                    oooO00o.f84836OooO00o = c25008OooO0OoOooO00o.f84846OooO0OO;
                    str3 = str5;
                    if (c25008OooO0OoOooO00o.f84845OooO0O0 != 1000) {
                        oooO0oOooO0O0.OooO0Oo(applicationContext);
                        str3 = str5;
                        if (!oooO0oOooO0O0.OooO0OO(applicationContext, false)) {
                            boolean zOooO0OO = oooO0oOooO0O0.OooO0OO(applicationContext, true);
                            str2 = "not support, forceQuery isSupported: ";
                            strValueOf = String.valueOf(zOooO0OO);
                            str4 = str5;
                            str2.concat(strValueOf);
                            str3 = str4;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (oooO0oOooO0O0.OooO0OO(applicationContext, false)) {
                        boolean zOooO0OO2 = oooO0oOooO0O0.OooO0OO(applicationContext, true);
                        str2 = "forceQuery isSupported : ";
                        strValueOf = String.valueOf(zOooO0OO2);
                        str2.concat(strValueOf);
                        str3 = str4;
                    }
                    if (cursorQuery != null) {
                    }
                }
                return str3;
            }
        }
        return null;
    }
}
