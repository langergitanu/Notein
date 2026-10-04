package com.huawei.hms.network;

/* JADX INFO: loaded from: classes9.dex */
public class DynamicLoaderHelper {

    /* JADX INFO: renamed from: b */
    private static final DynamicLoaderHelper f53982b = new DynamicLoaderHelper();

    /* JADX INFO: renamed from: a */
    private boolean f53983a = false;

    private DynamicLoaderHelper() {
    }

    public static DynamicLoaderHelper getInstance() {
        return f53982b;
    }

    public synchronized boolean getDynamicStatus() {
        return this.f53983a;
    }

    public synchronized void setDynamicStatus(boolean z) {
        this.f53983a = z;
    }
}
