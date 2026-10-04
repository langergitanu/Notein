package com.huawei.cloud.base.util;

/* JADX INFO: loaded from: classes8.dex */
public interface Clock {
    public static final Clock SYSTEM = new Clock() { // from class: com.huawei.cloud.base.util.Clock.1
        @Override // com.huawei.cloud.base.util.Clock
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };

    long currentTimeMillis();
}
