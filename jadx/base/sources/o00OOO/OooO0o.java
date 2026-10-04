package o00OOO;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18385v2;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static volatile OooO0o f84847OooO0oO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25009OooO0o0 f84852OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f84848OooO00o = new OooO00o("udid");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f84849OooO0O0 = new OooO00o("oaid");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f84851OooO0Oo = new OooO00o("vaid");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f84850OooO0OO = new OooO00o(C17625c.f52154a);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f84853OooO0o0 = new OooO0OO();

    public static C25008OooO0Oo OooO00o(Cursor cursor) {
        C25008OooO0Oo c25008OooO0Oo = new C25008OooO0Oo();
        c25008OooO0Oo.f84844OooO00o = null;
        c25008OooO0Oo.f84845OooO0O0 = 0;
        c25008OooO0Oo.f84846OooO0OO = System.currentTimeMillis() + C18385v2.f56338j;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                c25008OooO0Oo.f84844OooO00o = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c25008OooO0Oo.f84845OooO0O0 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c25008OooO0Oo.f84846OooO0OO = cursor.getLong(columnIndex3);
            }
        }
        return c25008OooO0Oo;
    }

    public static final OooO0o OooO0O0() {
        if (f84847OooO0oO == null) {
            synchronized (OooO0o.class) {
                try {
                    if (f84847OooO0oO == null) {
                        f84847OooO0oO = new OooO0o();
                    }
                } finally {
                }
            }
        }
        return f84847OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0OO(Context context, boolean z) {
        PackageInfo packageInfo;
        OooO0OO oooO0OO = this.f84853OooO0o0;
        boolean z2 = false;
        if (oooO0OO.OooO00o() && !z) {
            Boolean bool = oooO0OO.f84843OooO0O0;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0);
            Cursor cursorQuery = null;
            String str = (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? null : providerInfoResolveContentProvider.packageName;
            if (!TextUtils.isEmpty(str)) {
                try {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();
                }
                String str2 = packageInfo != null ? packageInfo.versionName : null;
                if (oooO0OO.OooO00o()) {
                    if (TextUtils.isEmpty(str2) ? false : TextUtils.equals(oooO0OO.f84842OooO00o, str2)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str2));
                        Boolean bool2 = oooO0OO.f84843OooO0O0;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                oooO0OO.f84842OooO00o = str2;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                    } catch (Exception e2) {
                        e2.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                        }
                        "query support, result : ".concat(String.valueOf(z2));
                        oooO0OO.f84843OooO0O0 = Boolean.valueOf(z2);
                        return z2;
                    }
                    C25008OooO0Oo c25008OooO0OoOooO00o = OooO00o(cursorQuery);
                    if (1000 == c25008OooO0OoOooO00o.f84845OooO0O0) {
                        if ("0".equals(c25008OooO0OoOooO00o.f84844OooO00o)) {
                            z2 = true;
                        }
                    }
                    "query support, result : ".concat(String.valueOf(z2));
                    oooO0OO.f84843OooO0O0 = Boolean.valueOf(z2);
                    return z2;
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z2));
                    oooO0OO.f84843OooO0O0 = Boolean.valueOf(z2);
                    return z2;
                } finally {
                }
            }
        }
        return false;
    }

    public final synchronized void OooO0Oo(Context context) {
        if (this.f84852OooO0o != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C25009OooO0o0 c25009OooO0o0 = new C25009OooO0o0();
        this.f84852OooO0o = c25009OooO0o0;
        context.registerReceiver(c25009OooO0o0, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
