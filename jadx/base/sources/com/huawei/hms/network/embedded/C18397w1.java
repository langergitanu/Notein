package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18358t1;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18397w1 extends AbstractC18384v1 {

    /* JADX INFO: renamed from: d */
    public static final String f56515d = "ProfileBase";

    public C18397w1() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79815a(String str, AbstractC18384v1 abstractC18384v1) {
        if (m79816a(C18358t1.g.f56183c, abstractC18384v1, C18358t1.g.f56181a)) {
            return true;
        }
        return m79816a(str, abstractC18384v1, C18358t1.g.f56181a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79818c(String str, AbstractC18384v1 abstractC18384v1) {
        Object objM79665a = abstractC18384v1.m79665a(C18358t1.a.f56154a);
        if (!(objM79665a instanceof Boolean)) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) objM79665a).booleanValue();
        Logger.m76958d(f56515d, "is AbTest enabled：" + zBooleanValue);
        if (zBooleanValue) {
            return m79816a(str, abstractC18384v1, C18358t1.a.f56155b);
        }
        return false;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18384v1
    /* JADX INFO: renamed from: b */
    public EnumC18436z1 mo79669b() {
        return EnumC18436z1.DEFAULT;
    }

    public C18397w1(EnumC18371u1 enumC18371u1) {
        super(enumC18371u1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79816a(String str, AbstractC18384v1 abstractC18384v1, String str2) {
        String strSubstring;
        if (!(abstractC18384v1 instanceof C18397w1)) {
            return false;
        }
        Object objM79665a = abstractC18384v1.m79665a(str2);
        if (objM79665a instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objM79665a;
            if (jSONArray.length() == 0) {
                Logger.m76967w(f56515d, "target JSONArray is null");
                return false;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    strSubstring = jSONArray.getString(i);
                } catch (JSONException e) {
                    Logger.m76967w(f56515d, "extract items error：" + e.getMessage());
                    strSubstring = null;
                }
                if (strSubstring != null && strSubstring.startsWith(C18358t1.f56147a)) {
                    strSubstring = strSubstring.substring(11);
                }
                if (TextUtils.equals(strSubstring, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79817b(String str, AbstractC18384v1 abstractC18384v1) {
        if (m79816a(C18358t1.g.f56183c, abstractC18384v1, C18358t1.g.f56182b)) {
            return true;
        }
        return m79816a(str, abstractC18384v1, C18358t1.g.f56182b);
    }
}
