package com.huawei.agconnect.abtest;

import android.content.Context;
import com.huawei.agconnect.abtest.p568a.C17567c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AGConnectABTesting {
    private static final Map<String, AGConnectABTesting> ABT_INSTANCE = new HashMap();

    public static synchronized AGConnectABTesting get(Context context, String str) {
        Map<String, AGConnectABTesting> map;
        try {
            map = ABT_INSTANCE;
            if (!map.containsKey(str)) {
                map.put(str, new C17567c(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    public abstract void removeAllExperiments();

    public abstract void replaceAllExperiments(List<Map<String, String>> list);
}
