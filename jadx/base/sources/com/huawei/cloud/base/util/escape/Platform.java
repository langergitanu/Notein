package com.huawei.cloud.base.util.escape;

/* JADX INFO: loaded from: classes8.dex */
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() { // from class: com.huawei.cloud.base.util.escape.Platform.1
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }
}
