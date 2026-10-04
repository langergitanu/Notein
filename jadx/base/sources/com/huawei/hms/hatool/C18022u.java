package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18240k4;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.u */
/* JADX INFO: loaded from: classes8.dex */
public class C18022u {

    /* JADX INFO: renamed from: a */
    public String f53922a;

    /* JADX INFO: renamed from: b */
    public String f53923b;

    /* JADX INFO: renamed from: c */
    public String f53924c;

    /* JADX INFO: renamed from: d */
    public List<C18014q> f53925d;

    /* JADX INFO: renamed from: e */
    public String f53926e;

    public C18022u(String str, String str2, String str3, List<C18014q> list, String str4) {
        this.f53922a = str;
        this.f53923b = str2;
        this.f53924c = str3;
        this.f53925d = list;
        this.f53926e = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m77538a(String str, String str2) {
        String str3;
        String strM77247f = AbstractC17973c.m77247f(str, str2);
        if (TextUtils.isEmpty(strM77247f)) {
            C18030y.m77581a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", strM77247f);
    }

    /* JADX INFO: renamed from: b */
    public final void m77541b() {
        if (C18015q0.m77513a(AbstractC17970b.m77230i(), "backup_event", C18240k4.f55418l)) {
            C18030y.m77588d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray jSONArrayM77542c = m77542c();
        String strM77548a = AbstractC18023u0.m77548a(this.f53922a, this.f53923b, this.f53926e);
        C18030y.m77586c("hmsSdk", "Update data cached into backup,spKey: " + strM77548a);
        C17986g0.m77334b(AbstractC17970b.m77230i(), "backup_event", strM77548a, jSONArrayM77542c.toString());
    }

    /* JADX INFO: renamed from: c */
    public final JSONArray m77542c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<C18014q> it = this.f53925d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().m77507d());
            } catch (JSONException unused) {
                C18030y.m77586c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public final C18016r m77543d() {
        return C17978d1.m77286a(this.f53925d, this.f53922a, this.f53923b, this.f53926e, this.f53924c);
    }

    /* JADX INFO: renamed from: a */
    public void m77539a() {
        String strM77538a = m77538a(this.f53922a, this.f53923b);
        if (TextUtils.isEmpty(strM77538a) && !"preins".equals(this.f53923b)) {
            C18030y.m77590e("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f53922a) && !"_openness_config_tag".equals(this.f53922a)) {
            m77541b();
        }
        C18016r c18016rM77543d = m77543d();
        if (c18016rM77543d == null) {
            C18010o0.m77487c().m77488a(new C18001l0(this.f53925d, this.f53922a, this.f53926e, this.f53923b));
            return;
        }
        byte[] bArrM77540a = m77540a(c18016rM77543d);
        if (bArrM77540a.length == 0) {
            C18030y.m77590e("hmsSdk", "request body is empty");
        } else {
            C18010o0.m77486b().m77488a(new C17992i0(bArrM77540a, strM77538a, this.f53922a, this.f53923b, this.f53926e, this.f53925d));
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m77540a(C18016r c18016r) {
        String str;
        try {
            JSONObject jSONObjectMo77296a = c18016r.mo77296a();
            if (jSONObjectMo77296a != null) {
                return C18021t0.m77537a(jSONObjectMo77296a.toString().getBytes("UTF-8"));
            }
            C18030y.m77590e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            C18030y.m77590e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            C18030y.m77590e("hmsSdk", str);
            return new byte[0];
        }
    }
}
