package o00Oo00o;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import com.alipay.share.sdk.Constant;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.security.SecureRandom;
import java.util.HashMap;
import o00Oo000.AbstractC25036OooO0OO;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25049OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOOOO;
import o00Oo0oo.C25058OooO0O0;
import o0o0Oo.C30597OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25038OooO0O0 extends AbstractC25036OooO0OO {
    @Override // o00Oo000.AbstractC25036OooO0OO
    public final String OooO0OO(C25047OooO00o c25047OooO00o, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        String strEncodeToString;
        int iMyUid;
        String str;
        HashMap map3 = new HashMap();
        try {
            C30597OooO00o c30597OooO00oOooO00o = C25049OooO00o.OooO00o();
            JSONObject jSONObject = new JSONObject();
            Context applicationContext = c25047OooO00o != null ? c25047OooO00o.f85035OooO0OO : null;
            if (applicationContext == null) {
                applicationContext = ((Context) C25048OooO0O0.OooO0O0().f85047OooO00o).getApplicationContext();
            }
            String strOooO0O0 = OooOOOO.OooO0O0(applicationContext, c25047OooO00o);
            String strOooO00o = C25058OooO0O0.OooO00o(applicationContext, c25047OooO00o);
            String strEncodeToString2 = "";
            if (c30597OooO00oOooO00o != null) {
                SecureRandom secureRandom = o00OOO0.OooO00o.f84854OooO00o;
                strEncodeToString = Base64.encodeToString(c30597OooO00oOooO00o.f109481OooO00o, 3);
            } else {
                strEncodeToString = "";
            }
            jSONObject.put("ap_q", strEncodeToString);
            jSONObject.put("ap_link_token", c25047OooO00o != null ? c25047OooO00o.f85036OooO0Oo : "");
            try {
                iMyUid = Process.myUid();
            } catch (Throwable th) {
                C25052OooO0Oo.OooO00o(th);
                iMyUid = BackupEvent.ERROR_DELETE_FAILED;
            }
            jSONObject.put("u_pd", String.valueOf(iMyUid));
            try {
                str = o00OOOO0.OooO00o.f84883OooO0Oo.get(0).f84940OooO00o;
            } catch (Throwable unused) {
                str = Constant.ZFB_PACKAGE_NAME;
            }
            jSONObject.put("u_lk", String.valueOf(OooOOOO.OooOOO0(str)));
            jSONObject.put("u_pi", String.valueOf(c25047OooO00o != null ? c25047OooO00o.f85039OooO0oO : C18115b5.CONNECTOR));
            jSONObject.put("u_fu", strOooO0O0);
            jSONObject.put("u_oi", strOooO00o);
            map3.put("ap_req", jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            if (c30597OooO00oOooO00o != null) {
                SecureRandom secureRandom2 = o00OOO0.OooO00o.f84854OooO00o;
                strEncodeToString2 = Base64.encodeToString(c30597OooO00oOooO00o.f109481OooO00o, 3);
            }
            sb.append(strEncodeToString2);
            sb.append("|");
            sb.append(strOooO0O0);
            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "ap_q", sb.toString());
        } catch (Exception e) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "APMEx1", e);
        }
        map2.putAll(map3);
        map2.toString();
        return super.OooO0OO(c25047OooO00o, map, map2);
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final JSONObject OooO0oO() throws JSONException {
        return AbstractC25036OooO0OO.OooO0oo("sdkConfig", "obtain");
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final String OooOO0() {
        return "5.0.0";
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final boolean OooOO0O() {
        return true;
    }
}
