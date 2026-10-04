package o00Oo00o;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Objects;
import o00OOooO.C25020OooO0O0;
import o00Oo000.AbstractC25036OooO0OO;
import o00Oo000.C25035OooO0O0;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o00OoOoO.C25070OooO00o;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25040OooO0Oo extends AbstractC25036OooO0OO {
    @Override // o00Oo000.AbstractC25036OooO0OO
    public final String OooO0O0(C25047OooO00o c25047OooO00o, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final HashMap OooO0Oo(String str, boolean z) {
        return new HashMap();
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final C25035OooO0O0 OooO0o0(Context context, String str, C25047OooO00o c25047OooO00o) throws Throwable {
        byte[] bArrOooO00o = C25020OooO0O0.OooO00o(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", C25048OooO0O0.OooO0O0().OooO00o());
        map.put("logHeader", "RAW");
        map.put("bizCode", "alipaysdk");
        map.put("productId", "alipaysdk_android");
        map.put("Content-Encoding", "Gzip");
        map.put("productVersion", "15.8.11");
        C25070OooO00o.OooO0O0 oooO0O0OooO00o = C25070OooO00o.OooO00o(context, new C25070OooO00o.C19674OooO00o("https://loggw-exsdk.alipay.com/loggw/logUpload.do", bArrOooO00o, map));
        Objects.toString(oooO0O0OooO00o);
        if (oooO0O0OooO00o == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zOooO = AbstractC25036OooO0OO.OooO(oooO0O0OooO00o);
        try {
            byte[] bArrOooO0O0 = oooO0O0OooO00o.f85101OooO0O0;
            if (zOooO) {
                bArrOooO0O0 = C25020OooO0O0.OooO0O0(bArrOooO0O0);
            }
            return new C25035OooO0O0("", new String(bArrOooO0O0, Charset.forName("UTF-8")));
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
            return null;
        }
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final JSONObject OooO0oO() {
        return null;
    }

    @Override // o00Oo000.AbstractC25036OooO0OO
    public final boolean OooOO0O() {
        return false;
    }
}
