package o0oO0O0o;

import android.content.Context;
import android.content.pm.PackageManager;
import o0O0oooO.o00oO0O;

/* JADX INFO: renamed from: o0oO0O0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30784OooO0OO {
    public static String OooO00o(String str) {
        Context context = o00oO0O.f90432OooO0OO;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            o00OOOo.OooO0OO.OooO0OO("g", "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            o00OOOo.OooO0OO.OooO0OO("g", "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            o00OOOo.OooO0OO.OooO0OO("g", "throwable");
            return "";
        }
    }
}
