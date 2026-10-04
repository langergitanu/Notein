package o00OOOoO;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import o00Oo000.C25035OooO0O0;
import o00Oo00o.C25038OooO0O0;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOO0O;
import o00Oo0oO.OooOOO;
import o00Oo0oO.OooOOOO;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00OOOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25016OooO00o {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static C25016OooO00o f84905OooOooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f84906OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f84907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f84908OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84909OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f84910OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f84911OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f84912OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f84913OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f84914OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f84915OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f84916OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f84917OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f84918OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f84919OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f84920OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f84921OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f84922OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f84923OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f84924OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f84925OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f84926OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f84927OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f84928OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f84929OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public JSONObject f84930OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f84931OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f84932OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f84933OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList f84934OooOoo0;

    /* JADX INFO: renamed from: o00OOOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class RunnableC19667OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Context f84935OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C25047OooO00o f84936OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f84937OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f84938OooOoO0;

        public RunnableC19667OooO00o(C25047OooO00o c25047OooO00o, Context context, boolean z, int i) {
            this.f84936OooOo0o = c25047OooO00o;
            this.f84935OooOo = context;
            this.f84938OooOoO0 = z;
            this.f84937OooOoO = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25016OooO00o c25016OooO00o = C25016OooO00o.this;
            C25047OooO00o c25047OooO00o = this.f84936OooOo0o;
            try {
                C25035OooO0O0 c25035OooO0O0OooO0o0 = new C25038OooO0O0().OooO0o0(this.f84935OooOo, "", c25047OooO00o);
                if (c25035OooO0O0OooO0o0 != null) {
                    C25016OooO00o.OooO0OO(c25016OooO00o, c25047OooO00o, (String) c25035OooO0O0OooO0o0.f85015OooO0OO);
                    try {
                        OooOO0O.OooO0OO((Context) C25048OooO0O0.OooO0O0().f85047OooO00o, "alipay_cashier_dynamic_config", c25016OooO00o.OooO0O0().toString(), null);
                    } catch (Exception e) {
                        C25052OooO0Oo.OooO00o(e);
                    }
                    o00OOOOo.OooO00o.OooO0O0("offcfg|" + this.f84938OooOoO0 + "|" + this.f84937OooOoO, c25047OooO00o);
                }
            } catch (Throwable th) {
                C25052OooO0Oo.OooO00o(th);
            }
        }
    }

    /* JADX INFO: renamed from: o00OOOoO.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f84940OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f84941OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f84942OooO0OO;

        public OooO0O0(String str, int i, String str2) {
            this.f84940OooO00o = str;
            this.f84941OooO0O0 = i;
            this.f84942OooO0OO = str2;
        }

        public static JSONObject OooO00o(OooO0O0 oooO0O0) {
            if (oooO0O0 == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", oooO0O0.f84940OooO00o).put("v", oooO0O0.f84941OooO0O0).put("pk", oooO0O0.f84942OooO0OO);
            } catch (JSONException e) {
                C25052OooO0Oo.OooO00o(e);
                return null;
            }
        }

        public final String toString() {
            return String.valueOf(OooO00o(this));
        }
    }

    public static C25016OooO00o OooO00o() {
        if (f84905OooOooO == null) {
            C25016OooO00o c25016OooO00o = new C25016OooO00o();
            c25016OooO00o.f84907OooO00o = 10000;
            c25016OooO00o.f84908OooO0O0 = false;
            c25016OooO00o.f84909OooO0OO = "https://h5.m.taobao.com/mlapp/olist.html";
            c25016OooO00o.f84910OooO0Oo = 10;
            c25016OooO00o.f84912OooO0o0 = true;
            c25016OooO00o.f84911OooO0o = true;
            c25016OooO00o.f84913OooO0oO = false;
            c25016OooO00o.f84914OooO0oo = false;
            c25016OooO00o.f84906OooO = true;
            c25016OooO00o.f84915OooOO0 = true;
            c25016OooO00o.f84916OooOO0O = "";
            c25016OooO00o.f84917OooOO0o = false;
            c25016OooO00o.f84919OooOOO0 = false;
            c25016OooO00o.f84918OooOOO = false;
            c25016OooO00o.f84920OooOOOO = false;
            c25016OooO00o.f84921OooOOOo = true;
            c25016OooO00o.f84923OooOOo0 = "";
            c25016OooO00o.f84922OooOOo = "";
            c25016OooO00o.f84924OooOOoo = false;
            c25016OooO00o.f84927OooOo00 = false;
            c25016OooO00o.f84926OooOo0 = false;
            c25016OooO00o.f84928OooOo0O = false;
            c25016OooO00o.f84929OooOo0o = false;
            c25016OooO00o.f84925OooOo = 1000;
            c25016OooO00o.f84931OooOoO0 = false;
            c25016OooO00o.f84932OooOoOO = true;
            c25016OooO00o.f84934OooOoo0 = null;
            c25016OooO00o.f84933OooOoo = -1;
            f84905OooOooO = c25016OooO00o;
            Context context = (Context) C25048OooO0O0.OooO0O0().f85047OooO00o;
            String strOooO0O0 = OooOO0O.OooO0O0(context, "alipay_cashier_dynamic_config", null, null);
            try {
                c25016OooO00o.f84933OooOoo = Integer.parseInt(OooOO0O.OooO0O0(context, "utdid_factor", "-1", null));
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(strOooO0O0)) {
                try {
                    c25016OooO00o.OooO0o0(new JSONObject(strOooO0O0));
                } catch (Throwable th) {
                    C25052OooO0Oo.OooO00o(th);
                }
            }
        }
        return f84905OooOooO;
    }

    public static void OooO0OO(C25016OooO00o c25016OooO00o, C25047OooO00o c25047OooO00o, String str) {
        c25016OooO00o.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("st_sdk_config");
            String strOptString = jSONObject.optString("ap_resp");
            JSONObject jSONObject2 = null;
            try {
                if (!TextUtils.isEmpty(strOptString)) {
                    jSONObject2 = new JSONObject(strOptString);
                }
            } catch (JSONException e) {
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "APMEx2", e);
            }
            if (jSONObjectOptJSONObject != null && jSONObject2 != null) {
                try {
                    jSONObjectOptJSONObject.putOpt("ap_args", jSONObject2);
                } catch (JSONException e2) {
                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "APMEx2", e2);
                }
            }
            if (jSONObjectOptJSONObject != null) {
                c25016OooO00o.OooO0o0(jSONObjectOptJSONObject);
            }
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
        }
    }

    public final JSONObject OooO0O0() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", OooO0oO());
        jSONObject.put("h5_port_degrade", this.f84908OooO0O0);
        jSONObject.put("tbreturl", this.f84909OooO0OO);
        jSONObject.put("configQueryInterval", this.f84910OooO0Oo);
        ArrayList arrayList = this.f84934OooOoo0;
        if (arrayList == null) {
            jSONArray = null;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray2.put(OooO0O0.OooO00o((OooO0O0) it.next()));
            }
            jSONArray = jSONArray2;
        }
        jSONObject.put("launchAppSwitch", jSONArray);
        jSONObject.put("scheme_pay_2", this.f84912OooO0o0);
        jSONObject.put("intercept_batch", this.f84911OooO0o);
        jSONObject.put("deg_log_mcgw", this.f84914OooO0oo);
        jSONObject.put("deg_start_srv_first", this.f84906OooO);
        jSONObject.put("prev_jump_dual", this.f84915OooOO0);
        jSONObject.put("use_sc_only", this.f84916OooOO0O);
        jSONObject.put("bind_use_imp", this.f84917OooOO0o);
        jSONObject.put("retry_bnd_once", this.f84919OooOOO0);
        jSONObject.put("skip_trans", this.f84918OooOOO);
        jSONObject.put("start_trans", this.f84920OooOOOO);
        jSONObject.put("up_before_pay", this.f84921OooOOOo);
        jSONObject.put("use_sc_lck_a", this.f84928OooOo0O);
        jSONObject.put("lck_k", this.f84923OooOOo0);
        jSONObject.put("bind_with_startActivity", this.f84922OooOOo);
        jSONObject.put("startActivity_InsteadOf_Scheme", this.f84924OooOOoo);
        jSONObject.put("retry_aidl_activity_not_start", this.f84929OooOo0o);
        jSONObject.put("cfg_max_time", this.f84925OooOo);
        jSONObject.put("get_oa_id", this.f84932OooOoOO);
        jSONObject.put("notifyFailApp", this.f84931OooOoO0);
        jSONObject.put("enableStartActivityFallback", this.f84927OooOo00);
        jSONObject.put("enableBindExFallback", this.f84926OooOo0);
        jSONObject.put("startactivity_in_ui_thread", this.f84913OooO0oO);
        jSONObject.put("ap_args", this.f84930OooOoO);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo(C25047OooO00o c25047OooO00o, Context context, boolean z, int i) {
        boolean zBlock;
        o00OOOOo.OooO00o.OooO0O0("oncfg|" + z + "|" + i, c25047OooO00o);
        RunnableC19667OooO00o runnableC19667OooO00o = new RunnableC19667OooO00o(c25047OooO00o, context, z, i);
        if (!z || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Thread thread = new Thread(runnableC19667OooO00o);
            thread.setName("AlipayDCP");
            thread.start();
            return;
        }
        int i2 = this.f84925OooOo;
        long j = i2;
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread2 = new Thread(new OooOOO(runnableC19667OooO00o, conditionVariable));
        if (!TextUtils.isEmpty("AlipayDCPBlok")) {
            thread2.setName("AlipayDCPBlok");
        }
        thread2.start();
        if (j <= 0) {
            conditionVariable.block();
            zBlock = true;
            if (zBlock) {
                o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "LogAppFetchConfigTimeout", "" + i2);
                return;
            }
            return;
        }
        zBlock = conditionVariable.block(j);
        if (zBlock) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final boolean OooO0o(Context context, int i) {
        boolean z;
        boolean z2 = false;
        int i2 = -1;
        if (this.f84933OooOoo == -1) {
            String strOooO00o = C25048OooO0O0.OooO0O0().OooO00o();
            if (TextUtils.isEmpty(strOooO00o)) {
                z = false;
            } else {
                String strReplaceAll = strOooO00o.replaceAll("=", "");
                if (strReplaceAll.length() >= 5) {
                    strReplaceAll = strReplaceAll.substring(0, 5);
                }
                int iPow = (int) Math.pow(2.0d, 6);
                int length = strReplaceAll.length();
                long j = 0;
                int i3 = 0;
                int i4 = length;
                while (i3 < length) {
                    int i5 = i3 + 1;
                    String strSubstring = strReplaceAll.substring(i3, i5);
                    ?? r11 = z2;
                    while (true) {
                        if (r11 >= 64) {
                            r11 = z2;
                            break;
                        }
                        if (strSubstring.equals(String.valueOf(OooOOOO.f85077OooO0O0[r11 == true ? 1 : 0]))) {
                            break;
                        }
                        r11 = (r11 == true ? 1 : 0) + 1;
                    }
                    j += ((long) Integer.parseInt(String.valueOf((int) r11))) * ((long) Math.pow(iPow, i4 - 1));
                    i4--;
                    i3 = i5;
                    z2 = z2;
                    i2 = i2;
                }
                z = z2;
                i2 = (int) (j % 10000);
                if (i2 < 0) {
                    i2 *= -1;
                }
            }
            this.f84933OooOoo = i2;
            OooOO0O.OooO0OO(context, "utdid_factor", String.valueOf(i2), null);
        } else {
            z = false;
        }
        if (this.f84933OooOoo < i) {
            return true;
        }
        return z;
    }

    public final void OooO0o0(JSONObject jSONObject) {
        this.f84907OooO00o = jSONObject.optInt("timeout", 10000);
        this.f84908OooO0O0 = jSONObject.optBoolean("h5_port_degrade", false);
        this.f84909OooO0OO = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f84910OooO0Oo = jSONObject.optInt("configQueryInterval", 10);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("launchAppSwitch");
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                OooO0O0 oooO0O0 = jSONObjectOptJSONObject == null ? null : new OooO0O0(jSONObjectOptJSONObject.optString("pn"), jSONObjectOptJSONObject.optInt("v", 0), jSONObjectOptJSONObject.optString("pk"));
                if (oooO0O0 != null) {
                    arrayList2.add(oooO0O0);
                }
            }
            arrayList = arrayList2;
        }
        this.f84934OooOoo0 = arrayList;
        this.f84912OooO0o0 = jSONObject.optBoolean("scheme_pay_2", true);
        this.f84911OooO0o = jSONObject.optBoolean("intercept_batch", true);
        this.f84914OooO0oo = jSONObject.optBoolean("deg_log_mcgw", false);
        this.f84906OooO = jSONObject.optBoolean("deg_start_srv_first", true);
        this.f84915OooOO0 = jSONObject.optBoolean("prev_jump_dual", true);
        this.f84916OooOO0O = jSONObject.optString("use_sc_only", "");
        this.f84917OooOO0o = jSONObject.optBoolean("bind_use_imp", false);
        this.f84919OooOOO0 = jSONObject.optBoolean("retry_bnd_once", false);
        this.f84918OooOOO = jSONObject.optBoolean("skip_trans", false);
        this.f84920OooOOOO = jSONObject.optBoolean("start_trans", false);
        this.f84921OooOOOo = jSONObject.optBoolean("up_before_pay", true);
        this.f84923OooOOo0 = jSONObject.optString("lck_k", "");
        this.f84928OooOo0O = jSONObject.optBoolean("use_sc_lck_a", false);
        this.f84929OooOo0o = jSONObject.optBoolean("retry_aidl_activity_not_start", false);
        this.f84931OooOoO0 = jSONObject.optBoolean("notifyFailApp", false);
        this.f84922OooOOo = jSONObject.optString("bind_with_startActivity", "");
        this.f84924OooOOoo = jSONObject.optBoolean("startActivity_InsteadOf_Scheme", false);
        this.f84925OooOo = jSONObject.optInt("cfg_max_time", 1000);
        this.f84932OooOoOO = jSONObject.optBoolean("get_oa_id", true);
        this.f84927OooOo00 = jSONObject.optBoolean("enableStartActivityFallback", false);
        this.f84926OooOo0 = jSONObject.optBoolean("enableBindExFallback", false);
        this.f84913OooO0oO = jSONObject.optBoolean("startactivity_in_ui_thread", false);
        this.f84930OooOoO = jSONObject.optJSONObject("ap_args");
    }

    public final int OooO0oO() {
        int i = this.f84907OooO00o;
        if (i < 1000 || i > 20000) {
            return 10000;
        }
        return i;
    }
}
