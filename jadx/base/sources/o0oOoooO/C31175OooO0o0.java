package o0oOoooO;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0oOoooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31175OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f111195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f111196OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f111197OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f111198OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f111199OooO0o0;

    public static ArrayList OooO00o(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                C31175OooO0o0 c31175OooO0o0 = new C31175OooO0o0();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                c31175OooO0o0.f111199OooO0o0 = jSONObject.has("handlerName") ? jSONObject.getString("handlerName") : null;
                c31175OooO0o0.f111195OooO00o = jSONObject.has("callbackId") ? jSONObject.getString("callbackId") : null;
                c31175OooO0o0.f111197OooO0OO = jSONObject.has("responseData") ? jSONObject.getString("responseData") : null;
                c31175OooO0o0.f111196OooO0O0 = jSONObject.has("responseId") ? jSONObject.getString("responseId") : null;
                c31175OooO0o0.f111198OooO0Oo = jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) ? jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) : null;
                arrayList.add(c31175OooO0o0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
