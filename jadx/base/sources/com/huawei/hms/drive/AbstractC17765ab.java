package com.huawei.hms.drive;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.huawei.hms.drive.ab */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17765ab {
    /* JADX INFO: renamed from: a */
    public static void m75930a(InputStream inputStream) {
        m75929a((Closeable) inputStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m75931a(OutputStream outputStream) {
        m75929a((Closeable) outputStream);
    }

    /* JADX INFO: renamed from: a */
    public static void m75929a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C17766ac.m75936d("IOUtil", "closeSecure IOException");
            }
        }
    }
}
