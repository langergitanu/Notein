package com.alipay.android.phone.mrpc.core;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0166r {
    /* JADX INFO: renamed from: a */
    public static void m112a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
