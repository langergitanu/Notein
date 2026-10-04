package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.hatool.s0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18019s0 {
    /* JADX INFO: renamed from: a */
    public static String m77524a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return m77527a(str, str2, str3) ? str2 : str4;
        }
        C18030y.m77591f("hmsSdk", "checkStrParameter() Parameter verification failure! Parameter:" + str);
        return str4;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77525a(String str) {
        return !m77526a("eventId", str, 256);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77526a(String str, String str2, int i) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is empty : ");
        } else {
            if (str2.length() <= i) {
                return true;
            }
            sb = new StringBuilder("checkString() Failure of parameter length check! Parameter:");
        }
        sb.append(str);
        C18030y.m77591f("hmsSdk", sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77527a(String str, String str2, String str3) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder("checkString() Parameter is null! Parameter:");
        } else {
            if (Pattern.compile(str3).matcher(str2).matches()) {
                return true;
            }
            sb = new StringBuilder("checkString() Parameter verification failure! Parameter:");
        }
        sb.append(str);
        C18030y.m77591f("hmsSdk", sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77528a(Map<String, String> map) {
        String str;
        if (map == null || map.size() == 0) {
            str = "onEvent() mapValue has not data.so,The data will be empty";
        } else if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            str = "checkMap() the key can't be constants or _constants";
        } else {
            if (map.size() <= 2048 && map.toString().length() <= 204800) {
                return true;
            }
            str = "checkMap Map data is too big! size: " + map.size() + " length: " + map.toString().length();
        }
        C18030y.m77591f("hmsSdk", str);
        return false;
    }
}
