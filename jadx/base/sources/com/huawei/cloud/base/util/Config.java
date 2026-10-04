package com.huawei.cloud.base.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class Config {
    public static final Map<String, Integer> EXCLUDED_FIELD_LENGTH;
    public static final List<String> EXCLUDED_FIELD_LIST;

    static {
        ArrayList arrayList = new ArrayList();
        EXCLUDED_FIELD_LIST = arrayList;
        EXCLUDED_FIELD_LENGTH = new ConcurrentHashMap();
        arrayList.add("unionid");
        arrayList.add("userid");
        arrayList.add("authorization");
        arrayList.add("x-hw-device-id");
    }
}
