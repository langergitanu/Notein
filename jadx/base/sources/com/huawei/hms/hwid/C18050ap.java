package com.huawei.hms.hwid;

import java.util.Collection;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ap */
/* JADX INFO: loaded from: classes8.dex */
public class C18050ap {
    /* JADX INFO: renamed from: a */
    public static Boolean m77649a(Collection collection) {
        return (collection == null || collection.size() == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m77650b(Collection collection) {
        return Boolean.valueOf(!m77649a(collection).booleanValue());
    }
}
