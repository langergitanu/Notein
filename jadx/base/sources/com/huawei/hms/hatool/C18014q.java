package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.network.embedded.C18437z2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.q */
/* JADX INFO: loaded from: classes8.dex */
public class C18014q implements InterfaceC18018s {

    /* JADX INFO: renamed from: a */
    public String f53906a;

    /* JADX INFO: renamed from: b */
    public String f53907b;

    /* JADX INFO: renamed from: c */
    public String f53908c;

    /* JADX INFO: renamed from: d */
    public String f53909d;

    /* JADX INFO: renamed from: e */
    public String f53910e;

    /* JADX INFO: renamed from: f */
    public String f53911f;

    @Override // com.huawei.hms.hatool.InterfaceC18018s
    /* JADX INFO: renamed from: a */
    public JSONObject mo77296a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C18437z2.f56754h, this.f53906a);
        jSONObject.put("eventtime", this.f53909d);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f53907b);
        jSONObject.put("event_session_name", this.f53910e);
        jSONObject.put("first_session_event", this.f53911f);
        if (TextUtils.isEmpty(this.f53908c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f53908c));
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public String m77503b() {
        return this.f53909d;
    }

    /* JADX INFO: renamed from: c */
    public String m77505c() {
        return this.f53906a;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m77507d() throws JSONException {
        JSONObject jSONObjectMo77296a = mo77296a();
        jSONObjectMo77296a.put("properties", C17976d.m77272b(this.f53908c, C17977d0.m77273f().m77275a()));
        return jSONObjectMo77296a;
    }

    /* JADX INFO: renamed from: e */
    public void m77509e(String str) {
        this.f53911f = str;
    }

    /* JADX INFO: renamed from: f */
    public void m77510f(String str) {
        this.f53910e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77501a(String str) {
        this.f53908c = str;
    }

    /* JADX INFO: renamed from: b */
    public void m77504b(String str) {
        this.f53907b = str;
    }

    /* JADX INFO: renamed from: c */
    public void m77506c(String str) {
        this.f53909d = str;
    }

    /* JADX INFO: renamed from: d */
    public void m77508d(String str) {
        this.f53906a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77502a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f53907b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
        this.f53908c = jSONObject.optString("properties");
        this.f53908c = C17976d.m77270a(this.f53908c, C17977d0.m77273f().m77275a());
        this.f53906a = jSONObject.optString(C18437z2.f56754h);
        this.f53909d = jSONObject.optString("eventtime");
        this.f53910e = jSONObject.optString("event_session_name");
        this.f53911f = jSONObject.optString("first_session_event");
    }
}
