package o00Oo0o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.api.ConnectionResult;
import java.util.Random;
import o000ooOO.C24741OooOO0o;
import o00OOooO.C25019OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25046OooO00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Context f85024OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static C25046OooO00o f85025OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f85026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f85027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f85028OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f85029OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f85030OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f85031OooO0o0;

    /* JADX INFO: renamed from: o00Oo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19670OooO00o {
        public static String OooO00o() {
            String packageName;
            try {
                packageName = C25046OooO00o.f85024OooO0oO.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C25052OooO0Oo.OooO00o(th);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }
    }

    public static synchronized C25046OooO00o OooO00o(Context context) {
        try {
            if (f85025OooO0oo == null) {
                C25046OooO00o c25046OooO00o = new C25046OooO00o();
                c25046OooO00o.f85030OooO0o = false;
                f85025OooO0oo = c25046OooO00o;
            }
            if (f85024OooO0oO == null) {
                f85025OooO0oo.OooO0OO(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f85025OooO0oo;
    }

    public static String OooO0Oo() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(hexString);
        sbOooO0OO.append(random.nextInt(ConnectionResult.NETWORK_ERROR) + 1000);
        return sbOooO0OO.toString();
    }

    public final void OooO0O0(String str, String str2) {
        String strOooO00o;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f85026OooO00o = str;
        this.f85027OooO0O0 = str2;
        this.f85028OooO0OO = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f85026OooO00o);
            jSONObject.put("client_key", this.f85027OooO0O0);
            jSONObject.put("timestamp", this.f85028OooO0OO);
            jSONObject.put("vimei", this.f85029OooO0Oo);
            jSONObject.put("vimsi", this.f85031OooO0o0);
            String string = jSONObject.toString();
            Context context = f85024OooO0oO;
            if (context == null) {
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("alipay_tid_storage", 0);
            try {
                strOooO00o = C25019OooO00o.OooO00o(C24741OooOO0o.OooO0O0(C19670OooO00o.OooO00o(), string, string.getBytes()));
            } catch (Exception unused) {
                strOooO00o = null;
            }
            TextUtils.isEmpty(strOooO00o);
            sharedPreferences.edit().putString("tidinfo", strOooO00o).apply();
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(Context context) {
        Exception e;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        String hexString;
        Context context2;
        String string;
        if (context != null) {
            f85024OooO0oO = context.getApplicationContext();
        }
        if (this.f85030OooO0o) {
            return;
        }
        this.f85030OooO0o = true;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            Context context3 = f85024OooO0oO;
            if (context3 == null) {
                string = null;
            } else {
                string = context3.getSharedPreferences("alipay_tid_storage", 0).getString("tidinfo", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        string = new String(C24741OooOO0o.OooO00o(C19670OooO00o.OooO00o(), string, C25019OooO00o.OooO0OO(string)));
                    } catch (Exception unused) {
                        string = null;
                    }
                    TextUtils.isEmpty(string);
                }
            }
            try {
            } catch (Exception e2) {
                e = e2;
                strOptString = null;
                strOptString2 = null;
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (!TextUtils.isEmpty(string)) {
            JSONObject jSONObject = new JSONObject(string);
            strOptString = jSONObject.optString("tid", "");
            try {
                strOptString2 = jSONObject.optString("client_key", "");
                try {
                    lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                    strOptString3 = jSONObject.optString("vimei", "");
                } catch (Exception e4) {
                    e = e4;
                    strOptString3 = null;
                }
            } catch (Exception e5) {
                e = e5;
                strOptString2 = null;
                strOptString3 = strOptString2;
            }
            try {
                strOptString4 = jSONObject.optString("vimsi", "");
            } catch (Exception e6) {
                e = e6;
                C25052OooO0Oo.OooO00o(e);
            }
            String str2 = strOptString;
            str = strOptString4;
            strOptString4 = str2;
            if (TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(str)) {
                this.f85026OooO00o = strOptString4;
                this.f85027OooO0O0 = strOptString2;
                this.f85028OooO0OO = lValueOf.longValue();
                this.f85029OooO0Oo = strOptString3;
                this.f85031OooO0o0 = str;
                return;
            }
            this.f85026OooO00o = "";
            hexString = Long.toHexString(System.currentTimeMillis());
            if (hexString.length() > 10) {
                hexString = hexString.substring(hexString.length() - 10);
            }
            this.f85027OooO0O0 = hexString;
            this.f85028OooO0OO = System.currentTimeMillis();
            this.f85029OooO0Oo = OooO0Oo();
            this.f85031OooO0o0 = OooO0Oo();
            context2 = f85024OooO0oO;
            if (context2 == null) {
                return;
            }
            context2.getSharedPreferences("alipay_tid_storage", 0).edit().remove("tidinfo").apply();
            return;
        }
        str = null;
        strOptString2 = null;
        strOptString3 = null;
        if (TextUtils.isEmpty(strOptString4)) {
        }
        this.f85026OooO00o = "";
        hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
        }
        this.f85027OooO0O0 = hexString;
        this.f85028OooO0OO = System.currentTimeMillis();
        this.f85029OooO0Oo = OooO0Oo();
        this.f85031OooO0o0 = OooO0Oo();
        context2 = f85024OooO0oO;
        if (context2 == null) {
        }
        strOptString3 = strOptString2;
        C25052OooO0Oo.OooO00o(e);
        String str22 = strOptString;
        str = strOptString4;
        strOptString4 = str22;
        if (TextUtils.isEmpty(strOptString4)) {
        }
        this.f85026OooO00o = "";
        hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
        }
        this.f85027OooO0O0 = hexString;
        this.f85028OooO0OO = System.currentTimeMillis();
        this.f85029OooO0Oo = OooO0Oo();
        this.f85031OooO0o0 = OooO0Oo();
        context2 = f85024OooO0oO;
        if (context2 == null) {
        }
    }
}
