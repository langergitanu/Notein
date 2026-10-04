package o00OOOoO;

import OooOO0.OooO0OO;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import o00OOOo0.C25015OooO00o;
import o00Oo0o.C25046OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25051OooO0OO;
import o00Oo0oO.C25053OooO0o0;
import o00Oo0oO.OooOOOO;
import o00Oo0oo.C25057OooO00o;
import o00Oo0oo.C25058OooO0O0;
import o00Oo0oo.C25063OooO0o0;
import o00Oo0oo.CallableC25064OooO0oO;

/* JADX INFO: renamed from: o00OOOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25017OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile C25017OooO0O0 f84943OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f84945OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84946OooO0OO;

    public C25017OooO0O0() {
        this.f84945OooO0O0 = "sdk-and-lite";
        String str = o00OOOO0.OooO00o.f84880OooO00o;
        if (TextUtils.isEmpty(str) || TextUtils.equals("cn", o00OOOO0.OooO00o.f84880OooO00o)) {
            return;
        }
        this.f84945OooO0O0 = "sdk-and-lite_" + str;
    }

    public static synchronized void OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences((Context) C25048OooO0O0.OooO0O0().f85047OooO00o).edit().putString("trideskey", str).apply();
        C25015OooO00o.f84903OooO00o = str;
    }

    public static String OooO0OO(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder("(");
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append(packageName);
            sb.append(";");
            sb.append(packageInfo.versionCode);
            sb.append(")");
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized C25017OooO0O0 OooO0Oo() {
        try {
            if (f84943OooO0Oo == null) {
                f84943OooO0Oo = new C25017OooO0O0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f84943OooO0Oo;
    }

    public static String OooO0o0() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(hexString);
        sbOooO0OO.append(random.nextInt(ConnectionResult.NETWORK_ERROR) + 1000);
        return sbOooO0OO.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO00o(C25047OooO00o c25047OooO00o, C25046OooO00o c25046OooO00o, boolean z) {
        WifiInfo wifiInfoOooO0OO;
        String ssid;
        WifiInfo wifiInfoOooO0OO2;
        String bssid;
        Context context = (Context) C25048OooO0O0.OooO0O0().f85047OooO00o;
        C25051OooO0OO c25051OooO0OOOooO00o = C25051OooO0OO.OooO00o(context);
        if (TextUtils.isEmpty(this.f84944OooO00o)) {
            String str = "Android " + Build.VERSION.RELEASE;
            String strOooOOO = OooOOOO.OooOOO();
            String string = context.getResources().getConfiguration().locale.toString();
            TextUtils.isEmpty("https://mobilegw.alipay.com/mgw.htm");
            String strOooOOOo = OooOOOO.OooOOOo(context);
            String string2 = Float.toString(new TextView(context).getTextSize());
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Msp/15.8.11 (", str, ";", strOooOOO, ";");
            OooO0OO.OooO0o0(sbOooO0O0, string, ";https;", strOooOOOo, ";");
            sbOooO0O0.append(string2);
            this.f84944OooO00o = sbOooO0O0.toString();
        }
        int iOooO0O0 = C25051OooO0OO.OooO0O0(context);
        c25051OooO0OOOooO00o.getClass();
        Context context2 = (Context) C25048OooO0O0.OooO0O0().f85047OooO00o;
        boolean z2 = false;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("virtualImeiAndImsi", 0);
        String string3 = sharedPreferences.getString("virtual_imsi", null);
        String strOooO0o0 = "000000000000000";
        if (TextUtils.isEmpty(string3)) {
            if (TextUtils.isEmpty(C25046OooO00o.OooO00o(context2).f85026OooO00o)) {
                String strOooO00o = C25048OooO0O0.OooO0O0().OooO00o();
                string3 = (TextUtils.isEmpty(strOooO00o) || strOooO00o.length() < 18) ? OooO0o0() : strOooO00o.substring(3, 18);
            } else {
                C25051OooO0OO.OooO00o(context2).getClass();
                string3 = "000000000000000";
            }
            sharedPreferences.edit().putString("virtual_imsi", string3).apply();
        }
        Context context3 = (Context) C25048OooO0O0.OooO0O0().f85047OooO00o;
        SharedPreferences sharedPreferences2 = context3.getSharedPreferences("virtualImeiAndImsi", 0);
        String string4 = sharedPreferences2.getString("virtual_imei", null);
        if (TextUtils.isEmpty(string4)) {
            if (TextUtils.isEmpty(C25046OooO00o.OooO00o(context3).f85026OooO00o)) {
                strOooO0o0 = OooO0o0();
            } else {
                C25051OooO0OO.OooO00o(context3).getClass();
            }
            sharedPreferences2.edit().putString("virtual_imei", strOooO0o0).apply();
            string4 = strOooO0o0;
        }
        this.f84946OooO0OO = c25046OooO00o.f85027OooO0O0;
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        int i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            if (new File(strArr[i]).exists()) {
                z2 = true;
                break;
            }
            i++;
        }
        if (!z) {
            try {
                wifiInfoOooO0OO = C25058OooO0O0.OooO0OO(context, c25047OooO00o);
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "lacking_per_1", th);
            }
            ssid = wifiInfoOooO0OO != null ? wifiInfoOooO0OO.getSSID() : "-1";
        }
        String str2 = ssid;
        if (!z) {
            try {
                wifiInfoOooO0OO2 = C25058OooO0O0.OooO0OO(context, c25047OooO00o);
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "lacking_per_2", th2);
            }
            bssid = wifiInfoOooO0OO2 != null ? wifiInfoOooO0OO2.getBSSID() : "00";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f84944OooO00o);
        sb.append(";");
        sb.append(C25053OooO0o0.OooO00o(iOooO0O0));
        sb.append(";-1;-1;1;000000000000000;000000000000000;");
        OooO0OO.OooO0o0(sb, this.f84946OooO0OO, ";", strReplace, ";");
        sb.append(strReplace2);
        sb.append(";");
        sb.append(z2);
        sb.append(";");
        sb.append((String) c25051OooO0OOOooO00o.f85053OooO00o);
        sb.append(";-1;-1;");
        OooO0OO.OooO0o0(sb, this.f84945OooO0O0, ";", string3, ";");
        OooO0OO.OooO0o0(sb, string4, ";", str2, ";");
        sb.append(bssid);
        String strOooO0O0 = C25058OooO0O0.OooO0O0(context, c25047OooO00o);
        String str3 = C25046OooO00o.OooO00o(context).f85026OooO00o;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String str4 = (String) C25057OooO00o.OooO0O0(4, 10L, timeUnit, new C25063OooO0o0(), new CallableC25064OooO0oO(applicationContext, str3, strOooO0O0, c25047OooO00o), true, 3L, timeUnit, c25047OooO00o, true);
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";;;");
            sb.append(str4);
        }
        sb.append(")");
        return sb.toString();
    }
}
