package o00Oo00o;

import android.content.Context;
import java.util.HashMap;
import o00Oo000.AbstractC25036OooO0OO;
import o00Oo000.C25035OooO0O0;
import o00Oo0o0.C25047OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25039OooO0OO extends AbstractC25036OooO0OO {
    @Override // o00Oo000.AbstractC25036OooO0OO
    public final String OooO00o(C25047OooO00o c25047OooO00o) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put("api_version", "1.0.0");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("log_v", "1.0");
        return OooO0OO(c25047OooO00o, map, map2);
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final String OooO0O0(C25047OooO00o c25047OooO00o, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final HashMap OooO0Oo(String str, boolean z) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z));
        map.put("content-type", "application/octet-stream");
        map.put("des-mode", "CBC");
        return map;
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final C25035OooO0O0 OooO0o0(Context context, String str, C25047OooO00o c25047OooO00o) throws Throwable {
        return OooO0o(null, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final JSONObject OooO0oO() throws JSONException {
        return null;
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final boolean OooOO0O() {
        return false;
    }
}
