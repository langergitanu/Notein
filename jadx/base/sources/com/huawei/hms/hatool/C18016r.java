package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.r */
/* JADX INFO: loaded from: classes8.dex */
public class C18016r implements InterfaceC18018s {

    /* JADX INFO: renamed from: a */
    public List<C18014q> f53912a;

    /* JADX INFO: renamed from: b */
    public AbstractC18009o f53913b;

    /* JADX INFO: renamed from: c */
    public AbstractC18012p f53914c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18018s f53915d;

    /* JADX INFO: renamed from: e */
    public String f53916e = "";

    /* JADX INFO: renamed from: f */
    public String f53917f;

    public C18016r(String str) {
        this.f53917f = str;
    }

    @Override // com.huawei.hms.hatool.InterfaceC18018s
    /* JADX INFO: renamed from: a */
    public JSONObject mo77296a() throws JSONException {
        String str;
        List<C18014q> list = this.f53912a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f53913b == null || this.f53914c == null || this.f53915d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f53913b.mo77296a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectMo77296a = this.f53915d.mo77296a();
            jSONObjectMo77296a.put("properties", this.f53914c.mo77296a());
            try {
                jSONObjectMo77296a.put("events_global_properties", new JSONObject(this.f53916e));
            } catch (JSONException unused) {
                jSONObjectMo77296a.put("events_global_properties", this.f53916e);
            }
            jSONObject2.put("events_common", jSONObjectMo77296a);
            JSONArray jSONArray = new JSONArray();
            Iterator<C18014q> it = this.f53912a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo77296a2 = it.next().mo77296a();
                if (jSONObjectMo77296a2 != null) {
                    jSONArray.put(jSONObjectMo77296a2);
                } else {
                    C18030y.m77590e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String strM77271a = C17976d.m77271a(C18021t0.m77537a(jSONObject2.toString().getBytes("UTF-8")), this.f53917f);
                if (TextUtils.isEmpty(strM77271a)) {
                    C18030y.m77590e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, strM77271a);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        C18030y.m77590e("hmsSdk", str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m77515a(C17981e1 c17981e1) {
        this.f53915d = c17981e1;
    }

    /* JADX INFO: renamed from: a */
    public void m77516a(AbstractC18009o abstractC18009o) {
        this.f53913b = abstractC18009o;
    }

    /* JADX INFO: renamed from: a */
    public void m77517a(AbstractC18012p abstractC18012p) {
        this.f53914c = abstractC18012p;
    }

    /* JADX INFO: renamed from: a */
    public void m77518a(String str) {
        if (str != null) {
            this.f53916e = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77519a(List<C18014q> list) {
        this.f53912a = list;
    }
}
