package o00Oo0o0;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18143d5;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import o00OOOOo.OooO00o;
import o00OOOOo.OooO0OO;
import o00OOOoO.C25016OooO00o;
import o00Oo0o.C25046OooO00o;
import o00Oo0oO.C25051OooO0OO;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.C25053OooO0o0;
import o00Oo0oO.OooOOOO;
import o00Oo0oo.C25058OooO0O0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25047OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f85033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f85034OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f85035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f85036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f85037OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f85038OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f85039OooO0oO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ActivityInfo f85042OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO0OO f85043OooOO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f85040OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f85032OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f85041OooOO0 = false;

    /* JADX INFO: renamed from: o00Oo0o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19671OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final HashMap<UUID, C25047OooO00o> f85044OooO00o = new HashMap<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final HashMap<String, C25047OooO00o> f85045OooO0O0 = new HashMap<>();

        public static C25047OooO00o OooO00o(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f85044OooO00o.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static void OooO0O0(C25047OooO00o c25047OooO00o, Intent intent) {
            if (c25047OooO00o != null) {
                UUID uuidRandomUUID = UUID.randomUUID();
                f85044OooO00o.put(uuidRandomUUID, c25047OooO00o);
                intent.putExtra("i_uuid_b_c", uuidRandomUUID);
            }
        }
    }

    public C25047OooO00o(Context context, String str, String str2) {
        String string;
        String packageName;
        long jOooO00o;
        long j;
        String str3;
        int iMyUid;
        ActivityInfo activityInfo;
        this.f85033OooO00o = "";
        this.f85034OooO0O0 = "";
        String str4 = null;
        this.f85035OooO0OO = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f84895OooO0oO = "";
        oooO0OO.f84896OooO0oo = "";
        Context applicationContext = context != null ? context.getApplicationContext() : context;
        String str5 = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
        try {
            string = UUID.randomUUID().toString();
        } catch (Throwable unused) {
            string = "12345678uuid";
        }
        oooO0OO.f84889OooO00o = o0Oo0oo.OooO0Oo(string, ",", str5);
        String str6 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        if (applicationContext != null) {
            try {
                Context applicationContext2 = applicationContext.getApplicationContext();
                packageName = applicationContext2.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext2.getPackageManager().getPackageInfo(packageName, 64);
                    str6 = packageInfo.versionName + "|" + OooO0OO.OooO00o(packageInfo);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                packageName = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            }
        } else {
            packageName = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
        oooO0OO.f84890OooO0O0 = OooO0O0.OooO00o.OooO0O0(OooO0OO.OooO0Oo(packageName), ",", OooO0OO.OooO0Oo(str6), ",-,-,-");
        if (zIsEmpty) {
            j = 0;
        } else {
            synchronized (OooO00o.C25011OooO0o0.class) {
                jOooO00o = OooO00o.C25010OooO0Oo.OooO00o(applicationContext, "alipay_cashier_statistic_v");
            }
            j = jOooO00o;
        }
        oooO0OO.f84891OooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("android,3,", OooO0OO.OooO0Oo("15.8.11"), ",", OooO0OO.OooO0Oo("h.a.3.8.11"), ",com.alipay.mcpay,5.0,-,"), androidx.concurrent.futures.OooO00o.OooO0O0(j, "~"), ",-");
        oooO0OO.f84892OooO0Oo = OooO0O0.OooO00o.OooO0O0(OooO0OO.OooO0Oo(C25046OooO00o.OooO00o((Context) C25048OooO0O0.OooO0O0().f85047OooO00o).f85026OooO00o), ",", OooO0OO.OooO0Oo(C25048OooO0O0.OooO0O0().OooO00o()), ",-,-,-");
        String string2 = "";
        if (applicationContext != null) {
            try {
                string2 = applicationContext.getResources().getConfiguration().locale.toString();
            } catch (Throwable unused4) {
            }
        }
        String strOooO0Oo = OooO0OO.OooO0Oo(string2);
        String strOooO0Oo2 = OooO0OO.OooO0Oo(Build.VERSION.RELEASE);
        String strOooO0Oo3 = OooO0OO.OooO0Oo(Build.MODEL);
        String strOooO0Oo4 = OooO0OO.OooO0Oo(C25053OooO0o0.OooO00o(C25051OooO0OO.OooO0O0(applicationContext)));
        String strOooO0Oo5 = OooO0OO.OooO0Oo(C25058OooO0O0.OooO00o(applicationContext, null));
        StringBuilder sb = new StringBuilder();
        sb.append(strOooO0Oo);
        sb.append(",android,");
        sb.append(strOooO0Oo2);
        sb.append(",");
        sb.append(strOooO0Oo3);
        OooOO0.OooO0OO.OooO0o0(sb, ",-,0,", strOooO0Oo4, ",gw,", strOooO0Oo5);
        sb.append(",-");
        oooO0OO.f84894OooO0o0 = sb.toString();
        oooO0OO.f84893OooO0o = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        oooO0OO.f84888OooO = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        this.f85043OooOO0o = oooO0OO;
        String str7 = this.f85034OooO0O0;
        try {
            str3 = "EP1" + OooOOOO.OooOOo0(String.format(Locale.getDefault(), "%s%s%d%s", str == null ? "" : str, str7 == null ? "" : str7, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())) + C18115b5.CONNECTOR + System.currentTimeMillis();
        } catch (Throwable unused5) {
            str3 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
        this.f85036OooO0Oo = str3;
        this.f85038OooO0o0 = SystemClock.elapsedRealtime();
        int iMyUid2 = BackupEvent.ERROR_DELETE_FAILED;
        try {
            iMyUid = Process.myUid();
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
            iMyUid = -200;
        }
        this.f85037OooO0o = iMyUid;
        try {
        } catch (Throwable th2) {
            C25052OooO0Oo.OooO00o(th2);
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            int length = activityInfoArr.length;
            for (int i = 0; i < length; i++) {
                activityInfo = activityInfoArr[i];
                if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                    break;
                }
            }
            activityInfo = null;
        } else {
            activityInfo = null;
        }
        this.f85042OooOO0O = activityInfo;
        this.f85039OooO0oO = str2;
        if (!zIsEmpty) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str2, "|");
            sbOooO0OO.append(this.f85036OooO0Oo);
            o00OOOOo.OooO00o.OooO0OO(this, "biz", "eptyp", sbOooO0OO.toString());
            o00OOOOo.OooO00o.OooO0OO(this, "biz", "actInfo", activityInfo != null ? activityInfo.name + "|" + activityInfo.launchMode : CloudMetaExtra.DEFINE_NON_PARENT_ID);
            try {
                str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.build.fingerprint");
            } catch (Exception e) {
                o00OOOOo.OooO00o.OooO0oO(this, "biz", "rflex", e.getClass().getSimpleName());
            }
            o00OOOOo.OooO00o.OooO0OO(this, "biz", NotificationCompat.CATEGORY_SYSTEM, str4);
            o00OOOOo.OooO00o.OooO0OO(this, "biz", "sdkv", "5c4d8f1-clean");
        }
        try {
            this.f85035OooO0OO = context.getApplicationContext();
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f85033OooO00o = packageInfo2.versionName;
            this.f85034OooO0O0 = packageInfo2.packageName;
        } catch (Exception e2) {
            C25052OooO0Oo.OooO00o(e2);
        }
        if (!zIsEmpty) {
            StringBuilder sb2 = new StringBuilder("u");
            try {
                iMyUid2 = Process.myUid();
            } catch (Throwable th3) {
                C25052OooO0Oo.OooO00o(th3);
            }
            sb2.append(iMyUid2);
            o00OOOOo.OooO00o.OooO0O0(sb2.toString(), this);
            o00OOOOo.OooO00o.OooO0OO(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            o00OOOOo.OooO00o.OooO00o(context, str, this.f85036OooO0Oo, this);
        }
        if (zIsEmpty || !C25016OooO00o.OooO00o().f84921OooOOOo) {
            return;
        }
        C25016OooO00o.OooO00o().OooO0Oo(this, this.f85035OooO0OO, true, 2);
    }

    public static String OooO0O0(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i]) && strArrSplit[i].startsWith(str3)) {
                return strArrSplit[i];
            }
        }
        return null;
    }

    public static HashMap<String, String> OooO0Oo(C25047OooO00o c25047OooO00o) {
        HashMap<String, String> map = new HashMap<>();
        if (c25047OooO00o != null) {
            map.put(HiAnalyticsConstant.BI_KEY_SDK_VER, "15.8.11");
            map.put(C18143d5.APP_NAME, c25047OooO00o.f85034OooO0O0);
            map.put(ResponseType.TOKEN, c25047OooO00o.f85036OooO0Oo);
            map.put("call_type", c25047OooO00o.f85039OooO0oO);
            map.put("ts_api_invoke", String.valueOf(c25047OooO00o.f85038OooO0o0));
            JSONObject jSONObject = C25016OooO00o.OooO00o().f84930OooOoO;
            if (jSONObject != null) {
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "ap_r", jSONObject.optString("ap_r"));
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map2.put(next, jSONObject.optString(next));
                    } catch (Throwable th) {
                        C25052OooO0Oo.OooO00o(th);
                    }
                }
                map.putAll(map2);
            }
        }
        return map;
    }

    public final String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            try {
                JSONObject jSONObject = new JSONObject(str.substring(19));
                jSONObject.put("bizcontext", OooO0OO(new JSONObject(jSONObject.optString("bizcontext"))));
                return "new_external_info==" + jSONObject.toString();
            } catch (Throwable unused) {
            }
        } else if (str.contains("\"&")) {
            try {
                String strOooO0O0 = OooO0O0(str, "\"&", "bizcontext=\"");
                if (TextUtils.isEmpty(strOooO0O0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("&");
                    sb.append("bizcontext=\"" + OooO0OO(new JSONObject()) + "\"");
                    return sb.toString();
                }
                if (!strOooO0O0.endsWith("\"")) {
                    strOooO0O0 = strOooO0O0.concat("\"");
                }
                int iIndexOf = str.indexOf(strOooO0O0);
                return str.substring(0, iIndexOf) + OooO0o0(strOooO0O0, "bizcontext=\"", "\"") + str.substring(iIndexOf + strOooO0O0.length());
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0o0(this, "fmt2", th, str);
            }
        } else {
            try {
                String strOooO0O02 = OooO0O0(str, "&", "bizcontext=");
                if (TextUtils.isEmpty(strOooO0O02)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    sb2.append("bizcontext=" + OooO0OO(new JSONObject()) + "");
                    return sb2.toString();
                }
                int iIndexOf2 = str.indexOf(strOooO0O02);
                return str.substring(0, iIndexOf2) + OooO0o0(strOooO0O02, "bizcontext=", "") + str.substring(iIndexOf2 + strOooO0O02.length());
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0o0(this, "fmt1", th2, str);
            }
        }
        return str;
    }

    public final String OooO0OO(JSONObject jSONObject) {
        Object obj;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", "2014052600006128");
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has(TranslateLanguage.SWEDISH)) {
                jSONObject.put(TranslateLanguage.SWEDISH, "h.a.3.8.11");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.f85034OooO0O0);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f85033OooO00o);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ap_link_token", this.f85036OooO0Oo);
                } catch (Throwable unused) {
                }
                jSONObject.put("extInfo", jSONObject2);
            }
            if (!jSONObject.has("act_info")) {
                ActivityInfo activityInfo = this.f85042OooOO0O;
                if (activityInfo != null) {
                    obj = activityInfo.name + "|" + activityInfo.launchMode;
                } else {
                    obj = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                }
                jSONObject.put("act_info", obj);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0o0(this, "fmt3", th, String.valueOf(jSONObject));
            C25052OooO0Oo.OooO00o(th);
            return jSONObject.toString();
        }
    }

    public final String OooO0o0(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            z = true;
            jSONObject = new JSONObject(androidx.core.content.OooO0OO.OooO00o(1, 1, strSubstring2));
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strOooO0OO = OooO0OO(jSONObject);
        if (z) {
            strOooO0OO = C20593OooO0Oo.OooO0O0("\"", strOooO0OO, "\"");
        }
        return o0Oo0oo.OooO0Oo(str2, strOooO0OO, str3);
    }
}
