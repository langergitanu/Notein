package com.alipay.apmobilesecuritysdk.p005a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.common.C0179a;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.p006b.C0176a;
import com.alipay.apmobilesecuritysdk.p007c.C0177a;
import com.alipay.apmobilesecuritysdk.p007c.C0178b;
import com.alipay.apmobilesecuritysdk.p008d.C0184e;
import com.alipay.apmobilesecuritysdk.p009e.C0185a;
import com.alipay.apmobilesecuritysdk.p009e.C0186b;
import com.alipay.apmobilesecuritysdk.p009e.C0187c;
import com.alipay.apmobilesecuritysdk.p009e.C0188d;
import com.alipay.apmobilesecuritysdk.p009e.C0191g;
import com.alipay.apmobilesecuritysdk.p009e.C0192h;
import com.alipay.apmobilesecuritysdk.p009e.C0193i;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import o0000OoO.C24224OooO00o;
import o00OO0O.OooO00o;
import o00OO0oO.C25003OooO0O0;
import o00OO0oO.OooO0OO;
import o00OO0oo.C25007OooO0OO;
import o00OOO00.OooO0O0;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0175a {

    /* JADX INFO: renamed from: a */
    public Context f126a;

    /* JADX INFO: renamed from: b */
    public C0176a f127b = C0176a.m129a();

    /* JADX INFO: renamed from: c */
    public int f128c = 4;

    public C0175a(Context context) {
        this.f126a = context;
    }

    /* JADX INFO: renamed from: b */
    public static String m125b(Context context) {
        try {
            String strM202b = C0193i.m202b();
            if (!C24224OooO00o.OooO0O0(strM202b)) {
                return strM202b;
            }
            C0187c c0187cM162b = C0188d.m162b(context);
            if (c0187cM162b != null) {
                C0193i.m199a(c0187cM162b);
                String str = c0187cM162b.f136a;
                if (C24224OooO00o.OooO0Oo(str)) {
                    return str;
                }
            }
            C0186b c0186bM155b = C0185a.m155b(context);
            if (c0186bM155b == null) {
                return "";
            }
            C0193i.m198a(c0186bM155b);
            String str2 = c0186bM155b.f133a;
            return C24224OooO00o.OooO0Oo(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m128a(Map<String, String> map) {
        boolean z;
        String str;
        try {
            C0177a.m134a(this.f126a, C24224OooO00o.OooO00o("tid", map), C24224OooO00o.OooO00o("utdid", map), m122a(this.f126a));
            String strOooO00o = C24224OooO00o.OooO00o("appName", map);
            m127b();
            m125b(this.f126a);
            m123a(this.f126a, strOooO00o);
            C0193i.m197a();
            int i = 0;
            if (m124a() || C0179a.m138a(this.f126a)) {
                z = C24224OooO00o.OooO0O0(m123a(this.f126a, strOooO00o)) || C24224OooO00o.OooO0O0(m125b(this.f126a));
            } else {
                C0184e.m147a();
                if (C24224OooO00o.OooO0OO(C0184e.m148b(this.f126a, map), C0193i.m204c())) {
                    String strOooO00o2 = C24224OooO00o.OooO00o("tid", map);
                    String strOooO00o3 = C24224OooO00o.OooO00o("utdid", map);
                    if ((C24224OooO00o.OooO0Oo(strOooO00o2) && !strOooO00o2.equals(C0193i.m206d())) || ((C24224OooO00o.OooO0Oo(strOooO00o3) && !strOooO00o3.equals(C0193i.m208e())) || !C0193i.m201a(this.f126a, strOooO00o) || C24224OooO00o.OooO0O0(m123a(this.f126a, strOooO00o)) || C24224OooO00o.OooO0O0(m125b(this.f126a)))) {
                    }
                }
            }
            C0192h.m185b(this.f126a, String.valueOf(OooO00o.OooOO0()));
            if (z) {
                new C0178b();
                UmidSdkWrapper.startUmidTaskSync(this.f126a, C0176a.m129a().m132b());
                o00OOO00.OooO00o oooO00oM126b = m126b(map);
                char c = 2;
                if (oooO00oM126b != null) {
                    if (oooO00oM126b.f84856OooO00o) {
                        if (!C24224OooO00o.OooO0O0(oooO00oM126b.f84858OooO0OO)) {
                            c = 1;
                        }
                    } else if ("APPKEY_ERROR".equals(oooO00oM126b.f84857OooO0O0)) {
                        c = 3;
                    }
                }
                if (c == 1) {
                    C0192h.m183a(this.f126a, "1".equals(oooO00oM126b.f84861OooO0o0));
                    Context context = this.f126a;
                    String str2 = oooO00oM126b.f84860OooO0o;
                    if (str2 == null) {
                        str2 = "0";
                    }
                    C0192h.m189d(context, str2);
                    C0192h.m191e(this.f126a, oooO00oM126b.f84862OooO0oO);
                    C0192h.m180a(this.f126a, oooO00oM126b.f84863OooO0oo);
                    C0192h.m193f(this.f126a, oooO00oM126b.f84855OooO);
                    C0192h.m194g(this.f126a, oooO00oM126b.f84865OooOO0O);
                    C0193i.m205c(C0184e.m148b(this.f126a, map));
                    C0193i.m200a(strOooO00o, oooO00oM126b.f84859OooO0Oo);
                    C0193i.m203b(oooO00oM126b.f84858OooO0OO);
                    C0193i.m207d(oooO00oM126b.f84864OooOO0);
                    String strOooO00o4 = C24224OooO00o.OooO00o("tid", map);
                    if (!C24224OooO00o.OooO0Oo(strOooO00o4) || strOooO00o4.equals(C0193i.m206d())) {
                        strOooO00o4 = C0193i.m206d();
                    } else {
                        C0193i.m209e(strOooO00o4);
                    }
                    C0193i.m209e(strOooO00o4);
                    String strOooO00o5 = C24224OooO00o.OooO00o("utdid", map);
                    if (!C24224OooO00o.OooO0Oo(strOooO00o5) || strOooO00o5.equals(C0193i.m208e())) {
                        strOooO00o5 = C0193i.m208e();
                    } else {
                        C0193i.m211f(strOooO00o5);
                    }
                    C0193i.m211f(strOooO00o5);
                    C0193i.m197a();
                    C0188d.m160a(this.f126a, C0193i.m212g());
                    C0188d.m158a();
                    C0185a.m153a(this.f126a, new C0186b(C0193i.m202b(), C0193i.m204c(), C0193i.m210f()));
                    C0185a.m151a();
                    C0191g.m178a(this.f126a, strOooO00o, C0193i.m196a(strOooO00o));
                    C0191g.m176a();
                    C0192h.m181a(this.f126a, strOooO00o, System.currentTimeMillis());
                } else if (c != 3) {
                    if (oooO00oM126b != null) {
                        str = "Server error, result:" + oooO00oM126b.f84857OooO0O0;
                    } else {
                        str = "Server error, returned null";
                    }
                    C0177a.m135a(str);
                    if (C24224OooO00o.OooO0O0(m123a(this.f126a, strOooO00o))) {
                        i = 4;
                    }
                } else {
                    i = 1;
                }
            }
            this.f128c = i;
            o00OOO0O.OooO00o OooO00o2 = C25007OooO0OO.OooO00o(this.f126a, this.f127b.m133c());
            Context context2 = this.f126a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1 && C0192h.m187c(context2)) {
                String str3 = context2.getFilesDir().getAbsolutePath() + "/log/ap";
                C25003OooO0O0 c25003OooO0O0 = new C25003OooO0O0();
                c25003OooO0O0.f84821OooO00o = null;
                c25003OooO0O0.f84822OooO0O0 = null;
                c25003OooO0O0.f84821OooO00o = new File(str3);
                c25003OooO0O0.f84822OooO0O0 = OooO00o2;
                new Thread(new OooO0OO(c25003OooO0O0)).start();
            }
        } catch (Exception e) {
            C0177a.m136a(e);
        }
        return this.f128c;
    }

    /* JADX INFO: renamed from: b */
    private o00OOO00.OooO00o m126b(Map<String, String> map) {
        C0186b c0186bM154b;
        C0186b c0186bM156c;
        try {
            Context context = this.f126a;
            OooO0O0 oooO0O0 = new OooO0O0();
            String strOooO00o = C24224OooO00o.OooO00o("appName", map);
            String strOooO00o2 = C24224OooO00o.OooO00o("sessionId", map);
            String strOooO00o3 = C24224OooO00o.OooO00o("rpcVersion", map);
            String strM123a = m123a(context, strOooO00o);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strM188d = C0192h.m188d(context);
            if (C24224OooO00o.OooO0Oo(strOooO00o2)) {
                oooO0O0.f84868OooO0OO = strOooO00o2;
            } else {
                oooO0O0.f84868OooO0OO = strM123a;
            }
            oooO0O0.f84869OooO0Oo = securityToken;
            oooO0O0.f84871OooO0o0 = strM188d;
            oooO0O0.f84866OooO00o = TelemetryEventStrings.C18741Os.OS_NAME;
            C0187c c0187cM163c = C0188d.m163c(context);
            String str = c0187cM163c != null ? c0187cM163c.f136a : "";
            if (C24224OooO00o.OooO0O0(str) && (c0186bM156c = C0185a.m156c(context)) != null) {
                str = c0186bM156c.f133a;
            }
            C0187c c0187cM161b = C0188d.m161b();
            String str2 = c0187cM161b != null ? c0187cM161b.f136a : "";
            if (C24224OooO00o.OooO0O0(str2) && (c0186bM154b = C0185a.m154b()) != null) {
                str2 = c0186bM154b.f133a;
            }
            oooO0O0.f84872OooO0oO = strOooO00o3;
            if (C24224OooO00o.OooO0O0(str)) {
                oooO0O0.f84867OooO0O0 = str2;
            } else {
                oooO0O0.f84867OooO0O0 = str;
            }
            oooO0O0.f84870OooO0o = C0184e.m146a(context, map);
            return C25007OooO0OO.OooO00o(this.f126a, this.f127b.m133c()).OooO00o(oooO0O0);
        } catch (Throwable th) {
            th.printStackTrace();
            C0177a.m136a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m127b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m122a(Context context) {
        String strM125b = m125b(context);
        return C24224OooO00o.OooO0O0(strM125b) ? C0192h.m192f(context) : strM125b;
    }

    /* JADX INFO: renamed from: a */
    public static String m123a(Context context, String str) {
        try {
            m127b();
            String strM196a = C0193i.m196a(str);
            if (!C24224OooO00o.OooO0O0(strM196a)) {
                return strM196a;
            }
            String strM175a = C0191g.m175a(context, str);
            C0193i.m200a(str, strM175a);
            return !C24224OooO00o.OooO0O0(strM175a) ? strM175a : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m124a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] strArrSplit = strArr[i].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
