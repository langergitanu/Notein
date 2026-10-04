package com.alipay.sdk.app;

import OooOooO.C20741OooOOoo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.microsoft.identity.common.internal.p590ui.webview.ProcessUtil;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import o00OOOO0.OooO00o;
import o00OOOO0.OooO0O0;
import o00OOOOo.OooO0OO;
import o00OOOoO.C25016OooO00o;
import o00OOOoO.C25017OooO0O0;
import o00Oo00o.C25037OooO00o;
import o00Oo0O.C25042OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOO0;
import o00Oo0oO.OooOOOO;
import o0oOO.C30795OooO0OO;
import o0oOO.RunnableC30793OooO00o;
import o0oOO.RunnableC30794OooO0O0;
import oOo000Oo.C34449Oooo0oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c */
    public static final Object f170c = OooOO0.class;

    /* JADX INFO: renamed from: a */
    public Activity f171a;

    /* JADX INFO: renamed from: b */
    public C30795OooO0OO f172b;

    public AuthTask(Activity activity) {
        this.f171a = activity;
        C25048OooO0O0 c25048OooO0O0OooO0O0 = C25048OooO0O0.OooO0O0();
        Activity activity2 = this.f171a;
        c25048OooO0O0OooO0O0.getClass();
        C25017OooO0O0.OooO0Oo();
        c25048OooO0O0OooO0O0.f85047OooO00o = activity2.getApplicationContext();
        this.f172b = new C30795OooO0OO(activity, "去支付宝授权");
    }

    public final String OooO00o(Activity activity, String str, C25047OooO00o c25047OooO00o) {
        String strOooO00o = c25047OooO00o.OooO00o(str);
        ArrayList arrayList = C25016OooO00o.OooO00o().f84934OooOoo0;
        C25016OooO00o.OooO00o().getClass();
        if (!OooOOOO.OooOO0(c25047OooO00o, this.f171a, OooO00o.f84883OooO0Oo, true)) {
            o00OOOOo.OooO00o.OooO0O0("LogCalledH5", c25047OooO00o);
            return OooO0Oo(activity, strOooO00o, c25047OooO00o);
        }
        OooOO0 oooOO02 = new OooOO0(activity, c25047OooO00o, new o00OO0.OooO00o(this));
        String strOooO0OO = oooOO02.OooO0OO(strOooO00o, false);
        oooOO02.f85062OooO00o = null;
        oooOO02.f85065OooO0Oo = null;
        if (!TextUtils.equals(strOooO0OO, TelemetryEventStrings.Value.FAILED) && !TextUtils.equals(strOooO0OO, "scheme_failed")) {
            return TextUtils.isEmpty(strOooO0OO) ? C20741OooOOoo.OooO0O0() : strOooO0OO;
        }
        o00OOOOo.OooO00o.OooO0O0("LogBindCalledH5", c25047OooO00o);
        return OooO0Oo(activity, strOooO00o, c25047OooO00o);
    }

    public final String OooO0O0(C25047OooO00o c25047OooO00o, C25042OooO00o c25042OooO00o) {
        String[] strArr = c25042OooO00o.f85017OooO0O0;
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        Intent intent = new Intent(this.f171a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        C25047OooO00o.C19671OooO00o.OooO0O0(c25047OooO00o, intent);
        this.f171a.startActivity(intent);
        Object obj = f170c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return C20741OooOOoo.OooO0O0();
            }
        }
        String str = C20741OooOOoo.f59588OooO0O0;
        return TextUtils.isEmpty(str) ? C20741OooOOoo.OooO0O0() : str;
    }

    public final void OooO0OO() {
        Activity activity;
        C30795OooO0OO c30795OooO0OO = this.f172b;
        if (c30795OooO0OO == null || (activity = c30795OooO0OO.f110076OooO0O0) == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC30794OooO0O0(c30795OooO0OO));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO0Oo(Activity activity, String str, C25047OooO00o c25047OooO00o) {
        ArrayList arrayListOooO00o;
        int i;
        Activity activity2;
        C30795OooO0OO c30795OooO0OO = this.f172b;
        if (c30795OooO0OO != null && (activity2 = c30795OooO0OO.f110076OooO0O0) != null) {
            activity2.runOnUiThread(new RunnableC30793OooO00o(c30795OooO0OO));
        }
        int iOooO00o = 0;
        try {
            try {
                try {
                    String str2 = (String) new C25037OooO00o().OooO0o0(activity, str, c25047OooO00o).f85015OooO0OO;
                    JSONObject jSONObject = null;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (Exception e) {
                            C25052OooO0Oo.OooO00o(e);
                        }
                    }
                    arrayListOooO00o = C25042OooO00o.OooO00o(jSONObject.optJSONObject("form").optJSONObject("onload"));
                    OooO0OO();
                } catch (Throwable th) {
                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "H5AuthDataAnalysisError", th);
                }
            } catch (IOException e2) {
                iOooO00o = OooO0O0.OooO00o(AuthCode.StatusCode.AUTH_INFO_NOT_EXIST);
                if (c25047OooO00o != null) {
                    String simpleName = e2.getClass().getSimpleName();
                    OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
                    oooO0OO.getClass();
                    oooO0OO.OooO0o("net", simpleName, OooO0OO.OooO0OO(e2));
                }
            }
            for (i = 0; i < arrayListOooO00o.size(); i++) {
                if (((C25042OooO00o) arrayListOooO00o.get(i)).f85016OooO00o == 2) {
                    String strOooO0O0 = OooO0O0(c25047OooO00o, (C25042OooO00o) arrayListOooO00o.get(i));
                    OooO0OO();
                    return strOooO0O0;
                }
                OooO0OO();
                if (iOooO00o == 0) {
                    iOooO00o = OooO0O0.OooO00o(4000);
                }
                return C20741OooOOoo.OooO0OO(OooO0O0.OooO0O0(iOooO00o), OooO0O0.OooO0OO(iOooO00o), "");
            }
            OooO0OO();
            if (iOooO00o == 0) {
            }
            return C20741OooOOoo.OooO0OO(OooO0O0.OooO0O0(iOooO00o), OooO0O0.OooO0OO(iOooO00o), "");
        } catch (Throwable th2) {
            OooO0OO();
            throw th2;
        }
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new C25047OooO00o(this.f171a, str, ProcessUtil.AuthServiceProcess), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        C25047OooO00o c25047OooO00o;
        c25047OooO00o = new C25047OooO00o(this.f171a, str, "authV2");
        return C34449Oooo0oo.OooO0OO(innerAuth(c25047OooO00o, str, z), c25047OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2 A[Catch: all -> 0x0083, PHI: r10
      0x00d2: PHI (r10v12 java.lang.String) = (r10v3 java.lang.String), (r10v14 java.lang.String) binds: [B:23:0x00d0, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000d, B:9:0x0011, B:10:0x0019, B:13:0x003c, B:25:0x00db, B:24:0x00d2, B:28:0x00e7, B:30:0x012d, B:31:0x0136, B:32:0x0140, B:22:0x008c, B:12:0x0036, B:21:0x0089), top: B:35:0x0009, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.app.Activity, android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized String innerAuth(C25047OooO00o c25047OooO00o, String str, boolean z) {
        Activity activity;
        String strOooO0O0;
        String str2 = "";
        synchronized (this) {
            if (z) {
                C30795OooO0OO c30795OooO0OO = this.f172b;
                if (c30795OooO0OO != null && (activity = c30795OooO0OO.f110076OooO0O0) != null) {
                    activity.runOnUiThread(new RunnableC30793OooO00o(c30795OooO0OO));
                }
                C25048OooO0O0 c25048OooO0O0OooO0O0 = C25048OooO0O0.OooO0O0();
                Activity activity2 = this.f171a;
                c25048OooO0O0OooO0O0.getClass();
                C25017OooO0O0.OooO0Oo();
                c25048OooO0O0OooO0O0.f85047OooO00o = activity2.getApplicationContext();
                strOooO0O0 = C20741OooOOoo.OooO0O0();
                OooO00o.OooO00o("");
                try {
                    try {
                        strOooO0O0 = OooO00o(this.f171a, str, c25047OooO00o);
                        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                    } catch (Throwable th) {
                        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", str2 + SystemClock.elapsedRealtime());
                        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                        if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                            C25016OooO00o.OooO00o().OooO0Oo(c25047OooO00o, this.f171a, false, 1);
                        }
                        OooO0OO();
                        o00OOOOo.OooO00o.OooO0o(this.f171a, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                        throw th;
                    }
                } catch (Exception e) {
                    C25052OooO0Oo.OooO00o(e);
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                    if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                    }
                }
                if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                    C25016OooO00o.OooO00o().OooO0Oo(c25047OooO00o, this.f171a, false, 1);
                }
                OooO0OO();
                str2 = this.f171a;
                o00OOOOo.OooO00o.OooO0o(str2, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
            } else {
                C25048OooO0O0 c25048OooO0O0OooO0O02 = C25048OooO0O0.OooO0O0();
                Activity activity22 = this.f171a;
                c25048OooO0O0OooO0O02.getClass();
                C25017OooO0O0.OooO0Oo();
                c25048OooO0O0OooO0O02.f85047OooO00o = activity22.getApplicationContext();
                strOooO0O0 = C20741OooOOoo.OooO0O0();
                OooO00o.OooO00o("");
                strOooO0O0 = OooO00o(this.f171a, str, c25047OooO00o);
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgReturnV", C34449Oooo0oo.OooO00o(strOooO0O0, "resultStatus") + "|" + C34449Oooo0oo.OooO00o(strOooO0O0, "memo"));
                if (!C25016OooO00o.OooO00o().f84921OooOOOo) {
                }
                OooO0OO();
                str2 = this.f171a;
                o00OOOOo.OooO00o.OooO0o(str2, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
            }
        }
        return strOooO0O0;
    }
}
