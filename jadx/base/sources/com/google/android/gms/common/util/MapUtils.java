package com.google.android.gms.common.util;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = map.get(str);
            androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
            } else {
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
