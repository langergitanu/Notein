package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18292o0 {

    /* JADX INFO: renamed from: a */
    public static final String f55798a = "BaseConfig";
    public JSONObject configObj;

    public C18292o0(String str) {
        try {
            this.configObj = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "call method set options occur JSONException");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79261a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76969w(f55798a, "network config key : %s is null", str);
            return;
        }
        try {
            if (!str.startsWith(PolicyNetworkService.NETWORK_CONFIG_PRE)) {
                str = PolicyNetworkService.NETWORK_CONFIG_PRE.concat(str);
            }
            if (CheckConfigUtils.checkIsCorrect(str, obj)) {
                this.configObj.put(str, obj);
            }
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "setValue error " + str);
        }
    }

    public void appendOption(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f55798a, "appendOption options == null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!this.configObj.has(next)) {
                    this.configObj.put(next, jSONObject.get(next));
                }
            }
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "appendOption error " + str);
        }
    }

    public String get(String str) {
        try {
            if (!this.configObj.has(str)) {
                return "";
            }
            Object obj = this.configObj.get(str);
            return obj instanceof String ? (String) obj : String.valueOf(obj);
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getInt error " + str);
            return "";
        }
    }

    public boolean getBoolean(String str) {
        try {
            if (this.configObj.has(str)) {
                if (this.configObj.getBoolean(str)) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getBoolean error " + str);
            return false;
        }
    }

    public double getDouble(String str) {
        try {
            if (this.configObj.has(str)) {
                return this.configObj.getDouble(str);
            }
            return 0.0d;
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getDouble error " + str);
            return 0.0d;
        }
    }

    public int getInt(String str) {
        try {
            if (this.configObj.has(str)) {
                return this.configObj.getInt(str);
            }
            return 0;
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getInt error " + str);
            return 0;
        }
    }

    public long getLong(String str) {
        try {
            if (this.configObj.has(str)) {
                return this.configObj.getLong(str);
            }
            return 0L;
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getLong error " + str);
            return 0L;
        }
    }

    public Map<String, String> getMap(String str) {
        HashMap map = new HashMap();
        try {
            if (this.configObj.has(str)) {
                JSONObject jSONObject = new JSONObject(this.configObj.getString(str));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getmap error " + StringUtils.anonymizeMessage(str));
        }
        return map;
    }

    public String getString(String str) {
        try {
            return this.configObj.has(str) ? this.configObj.getString(str) : "";
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "getString error " + str);
            return "";
        }
    }

    public void setOption(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                m79261a(next.trim(), jSONObject.get(next));
            }
        } catch (JSONException unused) {
            Logger.m76967w(f55798a, "setOption error " + str);
        }
    }

    public void setValue(String str, double d) {
        m79261a(str, Double.valueOf(d));
    }

    public String toString() {
        return this.configObj.toString();
    }

    public void setValue(String str, int i) {
        m79261a(str, Integer.valueOf(i));
    }

    public void setValue(String str, long j) {
        m79261a(str, Long.valueOf(j));
    }

    public void setValue(String str, Object obj) {
        m79261a(str, obj);
    }

    public void setValue(String str, boolean z) {
        m79261a(str, Boolean.valueOf(z));
    }
}
