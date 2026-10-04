package com.alipay.sdk.app;

import OooOO0.OooO0OO;
import OooOooO.C20741OooOOoo;
import Oooo0.OooOo00;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18143d5;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import o00OO0.C24981OooO0Oo;
import o00OOOo0.C25015OooO00o;
import o00OOOoO.C25016OooO00o;
import o00OOOoO.C25017OooO0O0;
import o00OOooO.C25019OooO00o;
import o00Oo00o.C25041OooO0o0;
import o00Oo0O.C25042OooO00o;
import o00Oo0o.C25046OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25050OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOO0;
import o00Oo0oO.OooOO0O;
import o00Oo0oO.OooOOOO;
import o00OoO0.C25066OooO00o;
import o0oOO.C30795OooO0OO;
import o0oOO.RunnableC30793OooO00o;
import o0oOO.RunnableC30794OooO0O0;
import oOo000Oo.C34449Oooo0oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PayTask {

    /* JADX INFO: renamed from: h */
    public static final Object f173h = OooOO0.class;

    /* JADX INFO: renamed from: i */
    public static long f174i;

    /* JADX INFO: renamed from: a */
    public Activity f175a;

    /* JADX INFO: renamed from: b */
    public C30795OooO0OO f176b;

    /* JADX INFO: renamed from: c */
    public final String f177c = "wappaygw.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: d */
    public final String f178d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e */
    public final String f179e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* JADX INFO: renamed from: f */
    public final String f180f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* JADX INFO: renamed from: g */
    public Map<String, OooO0O0> f181g = new HashMap();

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f66843OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ String f66844OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f66846OooOoO0;

        public OooO00o(String str, boolean z, H5PayCallback h5PayCallback) {
            this.f66844OooOo0o = str;
            this.f66843OooOo = z;
            this.f66846OooOoO0 = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PayTask payTask = PayTask.this;
            Activity activity = payTask.f175a;
            String str = this.f66844OooOo0o;
            C25066OooO00o c25066OooO00oH5Pay = payTask.h5Pay(new C25047OooO00o(activity, str, "payInterceptorWithUrl"), str, this.f66843OooOo);
            String str2 = c25066OooO00oH5Pay.f85094OooO00o;
            this.f66846OooOoO0.onPayResult(c25066OooO00oH5Pay);
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f66847OooO00o = "";

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f66848OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f66849OooO0OO = "";

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f66850OooO0Oo = "";
    }

    public PayTask(Activity activity) {
        this.f175a = activity;
        C25048OooO0O0 c25048OooO0O0OooO0O0 = C25048OooO0O0.OooO0O0();
        Activity activity2 = this.f175a;
        c25048OooO0O0OooO0O0.getClass();
        C25017OooO0O0.OooO0Oo();
        c25048OooO0O0OooO0O0.f85047OooO00o = activity2.getApplicationContext();
        this.f176b = new C30795OooO0OO(activity, "去支付宝付款");
    }

    public static void OooO0oO(C25047OooO00o c25047OooO00o, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            C25046OooO00o.OooO00o((Context) C25048OooO0O0.OooO0O0().f85047OooO00o).OooO0O0(strOptString, strOptString2);
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "ParserTidClientKeyEx", th);
        }
    }

    public static boolean OooO0oo(boolean z, boolean z2, String str, StringBuilder sb, HashMap map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty((CharSequence) map.get(str3))) {
                str2 = (String) map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            OooO0OO.OooO0o0(sb, str, "=\"", str2, "\"");
            return true;
        }
        OooO0OO.OooO0o0(sb, "&", str, "=\"", str2);
        sb.append("\"");
        return true;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            C25048OooO0O0 c25048OooO0O0OooO0O0 = C25048OooO0O0.OooO0O0();
            c25048OooO0O0OooO0O0.getClass();
            C25017OooO0O0.OooO0Oo();
            c25048OooO0O0OooO0O0.f85047OooO00o = context.getApplicationContext();
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f174i < C25016OooO00o.OooO00o().f84910OooO0Oo) {
                return false;
            }
            f174i = jElapsedRealtime;
            C25016OooO00o.OooO00o().OooO0Oo(null, context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
            return false;
        }
    }

    public final String OooO00o(String str, HashMap map) throws UnsupportedEncodingException {
        boolean zEquals = TransactionsConstants.ALIPAY_PAY_RESULT_OK.equals(map.get("resultStatus"));
        String str2 = (String) map.get("result");
        OooO0O0 oooO0O0Remove = this.f181g.remove(str);
        m229a(oooO0O0Remove != null ? oooO0O0Remove.f66849OooO0OO : "", oooO0O0Remove != null ? oooO0O0Remove.f66850OooO0Oo : "");
        if (map.containsKey("callBackUrl")) {
            return (String) map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strM229a = m229a(OooOOOO.OooO0OO("&callBackUrl=\"", "\"", str2), OooOOOO.OooO0OO("&call_back_url=\"", "\"", str2), OooOOOO.OooO0OO("&return_url=\"", "\"", str2), URLDecoder.decode(OooOOOO.OooO0OO("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(OooOOOO.OooO0OO("&callBackUrl=", "&", str2), "utf-8"), OooOOOO.OooO0OO("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strM229a)) {
                return strM229a;
            }
        }
        if (oooO0O0Remove != null) {
            String str3 = zEquals ? oooO0O0Remove.f66847OooO00o : oooO0O0Remove.f66848OooO0O0;
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return oooO0O0Remove != null ? C25016OooO00o.OooO00o().f84909OooO0OO : "";
    }

    public final String OooO0O0(String str, C25047OooO00o c25047OooO00o) {
        String strOooO00o = c25047OooO00o.OooO00o(str);
        if (strOooO00o.contains("paymethod=\"expressGateway\"")) {
            return OooO0OO(c25047OooO00o, strOooO00o);
        }
        ArrayList arrayList = C25016OooO00o.OooO00o().f84934OooOoo0;
        C25016OooO00o.OooO00o().getClass();
        List<C25016OooO00o.OooO0O0> list = o00OOOO0.OooO00o.f84883OooO0Oo;
        if (!OooOOOO.OooOO0(c25047OooO00o, this.f175a, list, true)) {
            o00OOOOo.OooO00o.OooO0O0("LogCalledH5", c25047OooO00o);
            return OooO0OO(c25047OooO00o, strOooO00o);
        }
        OooOO0 oooOO02 = new OooOO0(this.f175a, c25047OooO00o, new C24981OooO0Oo(this));
        "pay inner started: ".concat(strOooO00o);
        String strOooO0OO = oooOO02.OooO0OO(strOooO00o, false);
        if (!TextUtils.isEmpty(strOooO0OO) && strOooO0OO.contains("resultStatus={6007}")) {
            OooOOOO.OooO0oO(this.f175a, "startActivityEx", c25047OooO00o);
            strOooO0OO = C25016OooO00o.OooO00o().f84929OooOo0o ? oooOO02.OooO0OO(strOooO00o, true) : strOooO0OO.replace("resultStatus={6007}", "resultStatus={6001}");
        }
        oooOO02.f85062OooO00o = null;
        oooOO02.f85065OooO0Oo = null;
        boolean z = C25016OooO00o.OooO00o().f84927OooOo00;
        if (TextUtils.equals(strOooO0OO, TelemetryEventStrings.Value.FAILED) || TextUtils.equals(strOooO0OO, "scheme_failed") || (z && c25047OooO00o.f85040OooO0oo)) {
            o00OOOOo.OooO00o.OooO0O0("LogBindCalledH5", c25047OooO00o);
            return OooO0OO(c25047OooO00o, strOooO00o);
        }
        if (TextUtils.isEmpty(strOooO0OO)) {
            return C20741OooOOoo.OooO0O0();
        }
        if (!strOooO0OO.contains("{\"isLogin\":\"false\"}")) {
            return strOooO0OO;
        }
        o00OOOOo.OooO00o.OooO0O0("LogHkLoginByIntent", c25047OooO00o);
        return m228a(c25047OooO00o, strOooO00o, list, strOooO0OO, this.f175a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x005d, IOException -> 0x005f, TryCatch #2 {IOException -> 0x005f, blocks: (B:3:0x0004, B:11:0x002b, B:12:0x0042, B:14:0x0048, B:16:0x0053, B:21:0x0061, B:22:0x0064, B:23:0x0072, B:26:0x007a, B:28:0x0085, B:33:0x0095, B:10:0x0027), top: B:53:0x0004, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: all -> 0x005d, IOException -> 0x005f, TRY_ENTER, TryCatch #2 {IOException -> 0x005f, blocks: (B:3:0x0004, B:11:0x002b, B:12:0x0042, B:14:0x0048, B:16:0x0053, B:21:0x0061, B:22:0x0064, B:23:0x0072, B:26:0x007a, B:28:0x0085, B:33:0x0095, B:10:0x0027), top: B:53:0x0004, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO0OO(C25047OooO00o c25047OooO00o, String str) {
        JSONObject jSONObject;
        ArrayList arrayListOooO00o;
        int i;
        int i2;
        int size;
        showLoading();
        int iOooO00o = 0;
        try {
            try {
                try {
                    String str2 = (String) new C25041OooO0o0().OooO0o0(this.f175a.getApplicationContext(), str, c25047OooO00o).f85015OooO0OO;
                    if (TextUtils.isEmpty(str2)) {
                        jSONObject = null;
                        String strOptString = jSONObject.optString("end_code", null);
                        arrayListOooO00o = C25042OooO00o.OooO00o(jSONObject.optJSONObject("form").optJSONObject("onload"));
                        for (i = 0; i < arrayListOooO00o.size(); i++) {
                            if (((C25042OooO00o) arrayListOooO00o.get(i)).f85016OooO00o == 3) {
                                C25042OooO00o.OooO0O0((C25042OooO00o) arrayListOooO00o.get(i));
                            }
                        }
                        OooO0oO(c25047OooO00o, jSONObject);
                        dismissLoading();
                        o00OOOOo.OooO00o.OooO00o(this.f175a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                        i2 = 0;
                        while (true) {
                            size = arrayListOooO00o.size();
                            String str3 = c25047OooO00o.f85036OooO0Oo;
                            if (i2 < size) {
                                dismissLoading();
                                o00OOOOo.OooO00o.OooO00o(this.f175a, str, str3, c25047OooO00o);
                                break;
                            }
                            C25042OooO00o c25042OooO00o = (C25042OooO00o) arrayListOooO00o.get(i2);
                            int i3 = c25042OooO00o.f85016OooO00o;
                            if (i3 == 2) {
                                String strOooO0o0 = OooO0o0(c25047OooO00o, c25042OooO00o);
                                dismissLoading();
                                o00OOOOo.OooO00o.OooO00o(this.f175a, str, str3, c25047OooO00o);
                                return strOooO0o0;
                            }
                            if (i3 == 4) {
                                String strOooO0o = OooO0o(c25047OooO00o, c25042OooO00o, strOptString);
                                dismissLoading();
                                o00OOOOo.OooO00o.OooO00o(this.f175a, str, str3, c25047OooO00o);
                                return strOooO0o;
                            }
                            i2++;
                        }
                    } else {
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (Exception e) {
                            C25052OooO0Oo.OooO00o(e);
                            jSONObject = null;
                        }
                        String strOptString2 = jSONObject.optString("end_code", null);
                        arrayListOooO00o = C25042OooO00o.OooO00o(jSONObject.optJSONObject("form").optJSONObject("onload"));
                        while (i < arrayListOooO00o.size()) {
                        }
                        OooO0oO(c25047OooO00o, jSONObject);
                        dismissLoading();
                        o00OOOOo.OooO00o.OooO00o(this.f175a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                        i2 = 0;
                        while (true) {
                            size = arrayListOooO00o.size();
                            String str32 = c25047OooO00o.f85036OooO0Oo;
                            if (i2 < size) {
                            }
                            i2++;
                        }
                    }
                } catch (Throwable th) {
                    dismissLoading();
                    o00OOOOo.OooO00o.OooO00o(this.f175a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                    throw th;
                }
            } catch (IOException e2) {
                int iOooO00o2 = o00OOOO0.OooO0O0.OooO00o(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST);
                if (c25047OooO00o != null) {
                    String simpleName = e2.getClass().getSimpleName();
                    o00OOOOo.OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
                    oooO0OO.getClass();
                    oooO0OO.OooO0o("net", simpleName, o00OOOOo.OooO0OO.OooO0OO(e2));
                }
                dismissLoading();
                o00OOOOo.OooO00o.OooO00o(this.f175a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                iOooO00o = iOooO00o2;
            }
        } catch (Throwable th2) {
            C25052OooO0Oo.OooO00o(th2);
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "H5PayDataAnalysisError", th2);
            dismissLoading();
            o00OOOOo.OooO00o.OooO00o(this.f175a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        }
        if (iOooO00o == 0) {
            iOooO00o = o00OOOO0.OooO0O0.OooO00o(4000);
        }
        return C20741OooOOoo.OooO0OO(o00OOOO0.OooO0O0.OooO0O0(iOooO00o), o00OOOO0.OooO0O0.OooO0OO(iOooO00o), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0147 A[Catch: all -> 0x000d, PHI: r11
      0x0147: PHI (r11v18 java.lang.String) = (r11v17 java.lang.String), (r11v20 java.lang.String) binds: [B:41:0x0145, B:36:0x00f6] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x000d, blocks: (B:5:0x0009, B:8:0x0010, B:10:0x0019, B:12:0x002d, B:13:0x0031, B:15:0x0052, B:17:0x005a, B:18:0x005d, B:20:0x0061, B:22:0x0069, B:23:0x0076, B:25:0x007e, B:35:0x00b2, B:43:0x0154, B:42:0x0147, B:40:0x0101, B:47:0x0165, B:49:0x01ab, B:50:0x01b8, B:51:0x01c6, B:14:0x004d, B:39:0x00fa, B:28:0x008d, B:34:0x00a8, B:29:0x0097, B:31:0x00a1), top: B:60:0x0009, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String OooO0Oo(C25047OooO00o c25047OooO00o, String str, boolean z) {
        String strOooO0O0;
        if (z) {
            try {
                showLoading();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str.contains("payment_inst=")) {
            String strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
            int iIndexOf = strSubstring.indexOf(38);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            o00OOOO0.OooO00o.OooO00o(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            o00OOOO0.OooO00o.OooO00o("");
        }
        if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
            C25015OooO00o.f84904OooO0O0 = true;
        }
        if (C25015OooO00o.f84904OooO0O0) {
            if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
            } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
            }
        }
        strOooO0O0 = "";
        try {
            strOooO0O0 = OooO0O0(str, c25047OooO00o);
            Context applicationContext = this.f175a.getApplicationContext();
            try {
                String strOooO = OooOo00.OooO(strOooO0O0);
                if (!TextUtils.isEmpty(strOooO)) {
                    OooOO0O.OooO0OO(applicationContext, "pref_trade_token", strOooO, c25047OooO00o);
                }
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "SaveTradeTokenError", th2);
                C25052OooO0Oo.OooO00o(th2);
            }
            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
        } catch (Throwable th3) {
            try {
                strOooO0O0 = C20741OooOOoo.OooO0O0();
                C25052OooO0Oo.OooO00o(th3);
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                }
            } catch (Throwable th4) {
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                    C25016OooO00o.OooO00o().OooO0Oo(c25047OooO00o, this.f175a.getApplicationContext(), false, 3);
                }
                dismissLoading();
                o00OOOOo.OooO00o.OooO0o(this.f175a.getApplicationContext(), str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                throw th4;
            }
        }
        if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
            C25016OooO00o.OooO00o().OooO0Oo(c25047OooO00o, this.f175a.getApplicationContext(), false, 3);
        }
        dismissLoading();
        o00OOOOo.OooO00o.OooO0o(this.f175a.getApplicationContext(), str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        return strOooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r0 = r6.f85017OooO0O0;
        r11 = OooOooO.C20741OooOOoo.OooO0OO(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], o00Oo0oO.OooOOOO.OooOOOO(r0[2], r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO0o(C25047OooO00o c25047OooO00o, C25042OooO00o c25042OooO00o, String str) {
        JSONObject jSONObject;
        boolean z;
        String str2;
        JSONObject jSONObject2;
        String[] strArr = c25042OooO00o.f85017OooO0O0;
        Intent intent = new Intent(this.f175a, (Class<?>) H5PayActivity.class);
        try {
            try {
                jSONObject = new JSONObject(new String(C25019OooO00o.OooO0OO(strArr[2])));
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            intent.putExtra("url", strArr[0]);
            intent.putExtra(NoteMeta.PROPERTY_TITLE, strArr[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObject.optString("method", "POST"));
            C20741OooOOoo.f59587OooO00o = false;
            C20741OooOOoo.f59588OooO0O0 = null;
            C25047OooO00o.C19671OooO00o.OooO0O0(c25047OooO00o, intent);
            this.f175a.startActivity(intent);
            Object obj = f173h;
            synchronized (obj) {
                try {
                    obj.wait();
                    z = C20741OooOOoo.f59587OooO00o;
                    str2 = C20741OooOOoo.f59588OooO0O0;
                    C20741OooOOoo.f59587OooO00o = false;
                    C20741OooOOoo.f59588OooO0O0 = null;
                } catch (InterruptedException e) {
                    C25052OooO0Oo.OooO00o(e);
                    return C20741OooOOoo.OooO0O0();
                }
            }
            String strOooO0OO = "";
            if (z) {
                try {
                    try {
                        jSONObject2 = new JSONObject(new String(C25019OooO00o.OooO0OO(str2)));
                    } catch (Throwable unused2) {
                        jSONObject2 = new JSONObject();
                    }
                    ArrayList arrayListOooO00o = C25042OooO00o.OooO00o(jSONObject2);
                    int i = 0;
                    while (true) {
                        if (i >= arrayListOooO00o.size()) {
                            break;
                        }
                        C25042OooO00o c25042OooO00o2 = (C25042OooO00o) arrayListOooO00o.get(i);
                        if (c25042OooO00o2.f85016OooO00o == 5) {
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    C25052OooO0Oo.OooO00o(th);
                    o00OOOOo.OooO00o.OooO0o0(c25047OooO00o, "H5PayDataAnalysisError", th, str2);
                }
            }
            if (!TextUtils.isEmpty(strOooO0OO)) {
                return strOooO0OO;
            }
            try {
                return C20741OooOOoo.OooO0OO(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0o0(c25047OooO00o, "H5PayDataAnalysisError", th2, "endCode: " + str);
                return C20741OooOOoo.OooO0OO(8000, "", "");
            }
        } catch (Throwable th3) {
            C25052OooO0Oo.OooO00o(th3);
            o00OOOOo.OooO00o.OooO0o0(c25047OooO00o, "H5PayDataAnalysisError", th3, Arrays.toString(strArr));
            return C20741OooOOoo.OooO0O0();
        }
    }

    public final String OooO0o0(C25047OooO00o c25047OooO00o, C25042OooO00o c25042OooO00o) {
        String[] strArr = c25042OooO00o.f85017OooO0O0;
        Intent intent = new Intent(this.f175a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        if (strArr.length == 2) {
            bundle.putString("cookie", strArr[1]);
        }
        intent.putExtras(bundle);
        C25047OooO00o.C19671OooO00o.OooO0O0(c25047OooO00o, intent);
        this.f175a.startActivity(intent);
        Object obj = f173h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                C25052OooO0Oo.OooO00o(e);
                return C20741OooOOoo.OooO0O0();
            }
        }
        String str = C20741OooOOoo.f59588OooO0O0;
        return TextUtils.isEmpty(str) ? C20741OooOOoo.OooO0O0() : str;
    }

    public void dismissLoading() {
        C30795OooO0OO c30795OooO0OO = this.f176b;
        if (c30795OooO0OO != null) {
            Activity activity = c30795OooO0OO.f110076OooO0O0;
            if (activity != null) {
                activity.runOnUiThread(new RunnableC30794OooO0O0(c30795OooO0OO));
            }
            this.f176b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + OooOOOO.OooO0OO("<request_token>", "</request_token>", (String) OooOOOO.OooOO0O(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m227a(this.f175a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + OooOOOO.OooO0OO("<request_token>", "</request_token>", (String) OooOOOO.OooOO0O(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m227a(this.f175a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", m227a(this.f175a));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strOooO0OO = OooOOOO.OooO0OO(MsalUtils.QUERY_STRING_SYMBOL, "", str);
                    if (!TextUtils.isEmpty(strOooO0OO)) {
                        HashMap mapOooOO0O = OooOOOO.OooOO0O(strOooO0OO);
                        StringBuilder sb = new StringBuilder();
                        if (OooO0oo(false, true, "trade_no", sb, mapOooOO0O, "trade_no", "alipay_trade_no")) {
                            OooO0oo(true, false, "pay_phase_id", sb, mapOooOO0O, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = (String) mapOooOO0O.get(C18143d5.APP_NAME);
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty((CharSequence) mapOooOO0O.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty((CharSequence) mapOooOO0O.get("sid")) || !TextUtils.isEmpty((CharSequence) mapOooOO0O.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!OooO0oo(true, true, "extern_token", sb, mapOooOO0O, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            OooO0oo(true, false, "appenv", sb, mapOooOO0O, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            OooO0O0 oooO0O0 = new OooO0O0();
                            oooO0O0.f66847OooO00o = (String) mapOooOO0O.get("return_url");
                            oooO0O0.f66848OooO0O0 = (String) mapOooOO0O.get("show_url");
                            oooO0O0.f66849OooO0OO = (String) mapOooOO0O.get("pay_order_id");
                            String str3 = sb.toString() + "&bizcontext=\"" + m227a(this.f175a) + "\"";
                            this.f181g.put(str3, oooO0O0);
                            return str3;
                        }
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") || strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm")) {
                    String strM227a = m227a(this.f175a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", strTrim);
                    jSONObject2.put("bizcontext", strM227a);
                    return "new_external_info==" + jSONObject2.toString();
                }
                if (C25016OooO00o.OooO00o().f84911OooO0o && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                    Uri uri = Uri.parse(strTrim);
                    String queryParameter = uri.getQueryParameter("return_url");
                    String queryParameter2 = uri.getQueryParameter("show_url");
                    String queryParameter3 = uri.getQueryParameter("pay_order_id");
                    String strM229a = m229a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                    String strM229a2 = m229a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                    String strM229a3 = m229a(uri.getQueryParameter(C18143d5.APP_NAME), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? "tb" : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "");
                    String strM229a4 = m229a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                    String strM229a5 = m229a(uri.getQueryParameter("appenv"));
                    if (!TextUtils.isEmpty(strM229a) && !TextUtils.isEmpty(strM229a3) && !TextUtils.isEmpty(strM229a4)) {
                        String str4 = "trade_no=\"" + strM229a + "\"&pay_phase_id=\"" + strM229a2 + "\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"" + strM229a3 + "\"&extern_token=\"" + strM229a4 + "\"&appenv=\"" + strM229a5 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m227a(this.f175a) + "\"";
                        OooO0O0 oooO0O02 = new OooO0O0();
                        oooO0O02.f66847OooO00o = queryParameter;
                        oooO0O02.f66848OooO0O0 = queryParameter2;
                        oooO0O02.f66849OooO0OO = queryParameter3;
                        oooO0O02.f66850OooO0Oo = strM229a;
                        this.f181g.put(str4, oooO0O02);
                        return str4;
                    }
                }
            }
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return OooOO0O.OooO0O0(this.f175a.getApplicationContext(), "pref_trade_token", "", new C25047OooO00o(this.f175a, "", "fetchTradeToken"));
    }

    public String getVersion() {
        return "15.8.11";
    }

    public synchronized C25066OooO00o h5Pay(C25047OooO00o c25047OooO00o, String str, boolean z) {
        C25066OooO00o c25066OooO00o;
        c25066OooO00o = new C25066OooO00o();
        try {
            String[] strArrSplit = OooO0Oo(c25047OooO00o, str, z).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    String str3 = strSubstring + "={";
                    map.put(strSubstring, str2.substring(str3.length() + str2.indexOf(str3), str2.lastIndexOf("}")));
                }
            }
            if (map.containsKey("resultStatus")) {
                c25066OooO00o.f85094OooO00o = (String) map.get("resultStatus");
            }
            if (TextUtils.isEmpty(OooO00o(str, map))) {
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "H5CbUrlEmpty", "");
            }
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "H5CbEx", th);
            C25052OooO0Oo.OooO00o(th);
        }
        return c25066OooO00o;
    }

    public synchronized String pay(String str, boolean z) {
        if (C25050OooO0O0.OooO00o()) {
            return C20741OooOOoo.OooO0OO(5000, "重复请求", "");
        }
        return OooO0Oo(new C25047OooO00o(this.f175a, str, "pay"), str, z);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        try {
            strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
                new Thread(new OooO00o(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        String strOooO0Oo;
        C25047OooO00o c25047OooO00o;
        if (C25050OooO0O0.OooO00o()) {
            strOooO0Oo = C20741OooOOoo.OooO0OO(5000, "重复请求", "");
            c25047OooO00o = null;
        } else {
            C25047OooO00o c25047OooO00o2 = new C25047OooO00o(this.f175a, str, "payV2");
            strOooO0Oo = OooO0Oo(c25047OooO00o2, str, z);
            c25047OooO00o = c25047OooO00o2;
        }
        return C34449Oooo0oo.OooO0OO(strOooO0Oo, c25047OooO00o);
    }

    public void showLoading() {
        Activity activity;
        C30795OooO0OO c30795OooO0OO = this.f176b;
        if (c30795OooO0OO == null || (activity = c30795OooO0OO.f110076OooO0O0) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC30793OooO00o(c30795OooO0OO));
    }

    /* JADX INFO: renamed from: a */
    public static String m227a(Context context) {
        String str;
        String str2;
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
        } catch (Exception e) {
            e = e;
            str = "";
        }
        try {
            str2 = packageInfo.packageName;
        } catch (Exception e2) {
            e = e2;
            C25052OooO0Oo.OooO00o(e);
            str2 = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put(TranslateLanguage.SWEDISH, "h.a.3.8.11");
            jSONObject.put("an", str2);
            jSONObject.put("av", str);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m229a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m228a(C25047OooO00o c25047OooO00o, String str, List<C25016OooO00o.OooO0O0> list, String str2, Activity activity) {
        OooOOOO.OooO00o oooO00oOooO0o = OooOOOO.OooO0o(c25047OooO00o, activity, list);
        if (oooO00oOooO0o != null && !oooO00oOooO0o.OooO00o(c25047OooO00o)) {
            PackageInfo packageInfo = oooO00oOooO0o.f85078OooO00o;
            if (packageInfo.versionCode >= oooO00oOooO0o.f85079OooO0O0 && TextUtils.equals(packageInfo.packageName, "hk.alipay.wallet")) {
                String strValueOf = String.valueOf(str.hashCode());
                Object obj = new Object();
                HashMap<String, Object> map = PayResultActivity.f66839OooOo;
                map.put(strValueOf, obj);
                Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
                intent.putExtra("orderSuffix", str);
                intent.putExtra("externalPkgName", activity.getPackageName());
                intent.putExtra("phonecashier.pay.hash", strValueOf);
                C25047OooO00o.C19671OooO00o.OooO0O0(c25047OooO00o, intent);
                activity.startActivity(intent);
                synchronized (map.get(strValueOf)) {
                    try {
                        map.get(strValueOf).wait();
                    } catch (InterruptedException unused) {
                        return C20741OooOOoo.OooO0O0();
                    }
                }
                return PayResultActivity.OooO00o.f66842OooO0O0;
            }
        }
        return str2;
    }
}
