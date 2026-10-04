package com.huawei.hms.hwid;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ar */
/* JADX INFO: loaded from: classes8.dex */
public class C18052ar {

    /* JADX INFO: renamed from: a */
    private static final Set<Integer> f53964a;

    static {
        HashSet hashSet = new HashSet();
        f53964a = hashSet;
        hashSet.add(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m77657a(int i) {
        return f53964a.contains(Integer.valueOf(i)) ? 0 : 1;
    }
}
